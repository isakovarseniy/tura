/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.platform.repository.cpa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.tura.platform.datacontrol.commons.ObjectProfileCriteria;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.Instantiator;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.ObjectGraph;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.storage.CpaMapper;
import org.tura.platform.repository.cpa.storage.CpaStorage;
import org.tura.platform.repository.cpa.storage.CpaStorage.LockOperation;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.cpa.storage.ObjectStatus;
import org.tura.platform.repository.cpa.storage.StorageControl;
import org.tura.platform.repository.operation.AddLinkOperation;
import org.tura.platform.repository.operation.AddTopObjectOperation;
import org.tura.platform.repository.operation.CreateObjectOperation;
import org.tura.platform.repository.operation.LoadObjectOperation;
import org.tura.platform.repository.operation.RemoveTopObjectOperation;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.proxy.ProxyCommandStackEventListener;

public abstract class CpaRepositoryImpl implements CpaRepository {

	private static final long serialVersionUID = 2086027732580973860L;

	private Repository transport;
	private ProxyCommadStackProvider stackProvider;
	private Repository localRepository;
	private CpaStorageProvider storageProvider;
	private Registry registry;
	private String profile;
	private String id = UUID.randomUUID().toString();
	private Map<String, ProxyCommadStackProvider> stackMap = new HashMap<>();
	private Map<Class<?>, RefreshRule> readOnlyRefreshRures = new HashMap<>();

	public abstract List<String> getTopObjects();

	public abstract List<String> getInstantiable();

	public abstract List<String> getNotInstantiable();

	public Repository getTransport() {
		return transport;
	}

	public void setTransport(Repository transport) {
		this.transport = transport;
	}

	public Registry getRegistry() {
		return registry;
	}

	public void setRegistry(Registry registry) {
		this.registry = registry;
	}

	public CpaStorageProvider getStorageProvider() {
		return storageProvider;
	}

	public void setStorageProvider(CpaStorageProvider storageProvider) {
		this.storageProvider = storageProvider;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public void addReadOnlyRefreshRule(Class<?> clazz, RefreshRule rule) {
		this.readOnlyRefreshRures.put(clazz, rule);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T create(Class<T> objectClass) throws RepositoryException {
		T obj = transport.create(objectClass);
		String session = UUID.randomUUID().toString();
		T proxy = null;
		try {
			ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
			CreateObjectOperation cmd = new CreateObjectOperation(registry);
			cmd.setProxy(obj);
			cmd.setStackProvider(localStackProvider);
			cmd.prepare();
			localStackProvider.get().commit();

			RepositoryHelper helper = new RepositoryHelper(registry);
			CpaStorage cpaStorage = this.getStorageProvider().getStorage();
			CpaMapper cpaMapper = (CpaMapper) helper.findMapper(objectClass);
			StorageControl sc = cpaStorage.findByPrimaryKey(cpaMapper.getPrimaryKeyFromRepositoryObject(obj),
					objectClass);

			proxy = (T) factory(sc.getObject(), objectClass.getName());

		} catch (Exception e) {
			throw new RepositoryException(e);
		} finally {
			removeLocalStackProvider(session);
		}

		return proxy;

	}

	@Override
	public void setStackProvider(ProxyCommadStackProvider stackProvider) {
		this.stackProvider = stackProvider;
		this.stackProvider.get().addProxyCommandStackEventListener(id, new RemoteRepositoryCommitListener());
	}

	public ProxyCommadStackProvider getStackProvider() {
		return stackProvider;
	}

	@Override
	public <T> void insert(Object obj, Class<T> objectClass) throws RepositoryException {
		if (getTopObjects().contains(objectClass.getName())) {
			String session = UUID.randomUUID().toString();
			try {
				ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
				((ObjectControl) obj).setAttached(true);
				AddTopObjectOperation cmd = new AddTopObjectOperation();
				cmd.setProxy((ObjectControl) obj);
				cmd.setStackProvider(localStackProvider);
				cmd.prepare();
				ObjectControl oc = (ObjectControl) obj;
				if (oc.getLinkOperation() != null) {
					AddLinkOperation lo = oc.getLinkOperation();
					lo.setStackProvider(localStackProvider);
					lo.prepare();
				}
				List<Object> changes = localStackProvider.get().getListOfCommand();
				localStackProvider.get().commit();

				if (((ObjectControl) obj).getAttached() != null && ((ObjectControl) obj).getAttached()) {
					stackProvider.get().addCommands(changes);
				}

			} catch (Exception e) {
				((ObjectControl) obj).setAttached(false);
				throw new RepositoryException(e);
			} finally {
				removeLocalStackProvider(session);
			}
			return;
		} else {
			throw new RepositoryException("Class is not supported");
		}

	}

	@Override
	public <T> void remove(Object obj, Class<T> objectClass) throws RepositoryException {
		if (getTopObjects().contains(objectClass.getName())) {
			String session = UUID.randomUUID().toString();
			try {
				ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
				RemoveTopObjectOperation cmd = new RemoveTopObjectOperation();
				cmd.setProxy((ObjectControl) obj);
				cmd.setStackProvider(localStackProvider);
				cmd.prepare();
				ObjectControl oc = (ObjectControl) obj;
				if (oc.getLinkOperation() != null) {
					AddLinkOperation lo = oc.getLinkOperation();
					lo.prepare();
				}
				Boolean isAttached = ((ObjectControl) obj).getAttached();

				List<Object> changes = localStackProvider.get().getListOfCommand();
				localStackProvider.get().commit();

				if (isAttached != null && isAttached) {
					stackProvider.get().addCommands(changes);
				}

			} catch (Exception e) {
				throw new RepositoryException(e);
			} finally {
				removeLocalStackProvider(session);
			}
			return;
		} else {
			throw new RepositoryException("Class is not supported");
		}
	}

	@Override
	public List<Object> applyChanges(List<Object> changes) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> SearchResult<T> find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, Class<T> objectClass) throws RepositoryException {

		List<SearchCriteria> search = new ArrayList<SearchCriteria>();
		search.addAll(searchCriteria);

		if (profile != null) {
			ObjectProfileCriteria sc = new ObjectProfileCriteria(profile);
			search.add(sc);
		}

		SearchResult<T> result = transport.find(search, orderCriteria, startIndex, endIndex, objectClass);

		if (PlatformConfig.READ_WRITE_MODE) {
			return readWriteMode(result, objectClass);
		} else {
			return readOnlyMode(result, objectClass);
		}
	}

	private <T> SearchResult<T> readWriteMode(SearchResult<T> result, Class<T> objectClass) throws RepositoryException {

		try {
			CpaStorage cpaStorage = this.getStorageProvider().getStorage();
			try {
				cpaStorage.unloadObjects(objectClass);
			} catch (Exception e) {
				throw new RepositoryException(e);
			}
			List<T> lst = (List<T>) loadResult(result.getSearchResult());
			int diff = result.getSearchResult().size() - lst.size();
			return new SearchResult<>(lst, result.getNumberOfRows() - diff);

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	private <T> SearchResult<T> readOnlyMode(SearchResult<T> result, Class<T> objectClass) throws RepositoryException {
		List<T> lst = (List<T>) loadAndFindObjects(result.getSearchResult());
		int diff = result.getSearchResult().size() - lst.size();
		return new SearchResult<>(lst, result.getNumberOfRows() - diff);
	}

	@SuppressWarnings("unchecked")
	public <T> T load(Object obj, Class<T> objectClass) throws RepositoryException {
		try {
			Map<Object, Boolean> resultOfLockValidation = new HashMap<>();
			resultOfLockValidation.put(obj, false);
			List<T> array = new ArrayList<>();
			array.add((T) obj);
			List<T> loaded = loadResult(array);
			if (loaded.size() == 0) {
				return null;
			} else {
				return (T) loaded.get(0);
			}

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public RepoKeyPath getInternalPath(String cpaid) {
		try {
			return storageProvider.getStorage().getInternalPath(cpaid);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private <T> List<T> loadResult(List<T> result) throws Exception {
		List<Map<String, Object>> objectToRemove = new ArrayList<>();
		List<Map<String, Object>> relationToRemove = new ArrayList<>();
		Map<Object, Boolean> resultOfLockValidation = validateLock(objectToRemove, relationToRemove, result);
		Map<Object, Map<Object, String>> collected = unloadObjects(objectToRemove, relationToRemove);
		List<T> lst = (List<T>) loadObjects(resultOfLockValidation, result, collected);

		return lst;
	}

	@SuppressWarnings("unchecked")
	private <T> List<T> loadObjects(Map<Object, Boolean> resultOfLockValidation, List<T> searchResult,
			Map<Object, Map<Object, String>> collected) throws Exception {
		List<T> list = new ArrayList<>();
		CpaStorage cpaStorage = this.getStorageProvider().getStorage();
		RepositoryHelper helper = new RepositoryHelper(registry);
		cpaStorage.nextSession();

		for (T t : searchResult) {
			T proxy = null;
			Class<T> clazz = (Class<T>) t.getClass();
			boolean isLock = resultOfLockValidation.get(t);
			CpaMapper cpaMapper = (CpaMapper) helper.findMapper(clazz);
			if (!isLock) {
				proxy = loadCommand(t, clazz, collected, cpaStorage, cpaMapper);
			} else {
				StorageControl sc = cpaStorage.findByPrimaryKey(cpaMapper.getPrimaryKeyFromRepositoryObject(t), clazz);
				if (sc != null && !ObjectStatus.Removed.equals(sc.getStatus())) {
					proxy = (T) factory(sc.getObject(), clazz.getName());
				}
			}
			if (proxy != null) {
				list.add((T) proxy);
			}
		}
		return list;
	}

	private <T> Map<Object, Map<Object, String>> unloadObjects(List<Map<String, Object>> objectToRemove,
			List<Map<String, Object>> relationToRemove) throws Exception {
		CpaStorage cpaStorage = this.getStorageProvider().getStorage();
		Map<Object, Map<Object, String>> fullCollected = cpaStorage.collectCpaIds(objectToRemove);
		cpaStorage.unloadObjects(objectToRemove, relationToRemove);
		return fullCollected;
	}

	private <T> Map<Object, Boolean> validateLock(List<Map<String, Object>> objectToRemove,
			List<Map<String, Object>> relationToRemove, List<T> searchResult) throws Exception {
		Map<Object, Boolean> validationMap = new HashMap<>();
		for (T t : searchResult) {
			List<Map<String, Object>> objectTo = new ArrayList<>();
			List<Map<String, Object>> relationTo = new ArrayList<>();
			Class<?> clazz = t.getClass();
			boolean isLock = isLocked(t, clazz, objectTo, relationTo);
			if (!isLock) {
				objectToRemove.addAll(objectTo);
				relationToRemove.addAll(relationTo);
			}
			validationMap.put(t, isLock);
		}
		return validationMap;
	}

	@Override
	public <T> T find(Object pk, Class<T> objectClass) throws RepositoryException {
		if (pk instanceof RepoKeyPath) {
			return findByRepoKeyPath((RepoKeyPath) pk, objectClass);
		}

		throw new UnsupportedOperationException();
	}

	@SuppressWarnings("unchecked")
	private <T> T findByRepoKeyPath(RepoKeyPath path, Class<T> objectClass) throws RepositoryException {
		try {
			RepositoryHelper helper = new RepositoryHelper(registry);
			RepoObjectKey key = path.getPath().get(0);
			Class<?> clazz = Class.forName(key.getType());
			PersistanceMapper mapper = (PersistanceMapper) helper.findMapper(clazz);
			Object pk = mapper.getPKey(key);
			StorageControl sc = storageProvider.getStorage().findByPrimaryKey(pk, clazz);
			if (sc != null) {
				if (ObjectStatus.Removed.equals(sc.getStatus())) {
					return null;
				}
				Object proxy = factory(sc.getObject(), clazz.getName());
				return (T) helper.getExtendedObject(path, proxy);
			} else {
				List<SearchCriteria> search = helper.buildSearchCriteria(key.getKey());
				List<Object> lst = (List<Object>) find(search, new ArrayList<>(), 1, 10, clazz);
				Object proxy = lst.get(0);
				return (T) helper.getExtendedObject(path, proxy);
			}
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@SuppressWarnings("unchecked")
	private <T> T loadCommand(Object obj, Class<T> objectClass, Map<Object, Map<Object, String>> collected,
			CpaStorage cpaStorage, CpaMapper cpaMapper) throws RepositoryException {
		T proxy = null;
		String session = UUID.randomUUID().toString();
		try {
			ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
			LoadObjectOperation cmd = new LoadObjectOperation(registry);
			cmd.setProxy(obj);
			cmd.setStackProvider(localStackProvider);
			cmd.setCollected(collected);
			cmd.setLoadedBy(objectClass);
			cmd.prepare();
			localStackProvider.get().commit();
			StorageControl sc = cpaStorage.findByPrimaryKey(cpaMapper.getPrimaryKeyFromRepositoryObject(obj),
					objectClass);
			proxy = (T) factory(sc.getObject(), objectClass.getName());
		} catch (Exception e) {
			throw new RepositoryException(e);
		} finally {
			removeLocalStackProvider(session);
		}
		return proxy;
	}

//This method only used for readonly mode
	@SuppressWarnings("unchecked")
	private <T> List<T> loadAndFindObjects(List<T> searchResult) throws RepositoryException {
		List<T> list = new ArrayList<>();
		try {
			CpaStorage cpaStorage = getStorageProvider().getStorage();
			RepositoryHelper helper = new RepositoryHelper(registry);
			cpaStorage.nextSession();

			for (T t : searchResult) {
				T proxy = null;
				Class<T> clazz = (Class<T>) t.getClass();
				CpaMapper cpaMapper = (CpaMapper) helper.findMapper(clazz);

				StorageControl sc = cpaStorage.findByPrimaryKey(cpaMapper.getPrimaryKeyFromRepositoryObject(t), clazz);
//This is readonly mode do not check if ObjectStatus.Removed status
				if (sc != null) {
					RefreshRule rule = readOnlyRefreshRures.get(clazz);
					if (rule != null) {
						if (rule.shouldRefresh(this, sc)) {
							List<T> ls = new ArrayList<>();
							ls.add(t);
							ls = loadResult(ls);
							if (ls != null && ls.size() != 0) {
								proxy = ls.get(0);
							}

						}
					}
					if (proxy == null) {
						proxy = (T) factory(sc.getObject(), clazz.getName());
					}

				} else {
					proxy = loadCommand(t, clazz, new HashMap<>(), cpaStorage, cpaMapper);
				}
				if (proxy != null) {
					list.add((T) proxy);
				}

			}
			return list;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public Repository getLocalRepository() {
		if (registry == null) {
			throw new RuntimeException("Registry is not defined");
		}
		if (localRepository == null) {
			localRepository = new BasicRepository(registry);
		}
		return localRepository;
	}

	private ProxyCommadStackProvider getLocalStackProvider(String session) {
		ProxyCommadStackProvider localStackProvider = stackMap.get(session);
		if (localStackProvider == null) {
			localStackProvider = new LocalCommadStackProvider();
			stackMap.put(session, localStackProvider);
			localStackProvider.get().addProxyCommandStackEventListener(session,
					new LocalRepositoryCommitListener(session));
		}
		return localStackProvider;
	}

	private void removeLocalStackProvider(String session) {
		stackMap.remove(session);
	}

	private class LocalRepositoryCommitListener extends ProxyCommandStackEventListener {
		private static final long serialVersionUID = 1L;
		String session;

		LocalRepositoryCommitListener(String session) {
			this.session = session;
		}

		public void beforeCommit() throws Exception {
			List<Object> changes = getLocalStackProvider(session).get().getListOfCommand();
			getLocalRepository().applyChanges(changes);
		}
	}

	private class RemoteRepositoryCommitListener extends ProxyCommandStackEventListener {
		private static final long serialVersionUID = 1L;

		public void beforeCommit() throws Exception {
			List<Object> array = stackProvider.get().getListOfCommand();
			new RepositoryHelper().cleanCommand(array);
			List<Object> updates = transport.applyChanges(array);

			Instantiator instantiator = CpaRepositoryImpl.this.registry
					.findInstantiator(CommandPostTransformation.class);
			CommandPostTransformation processor = instantiator.newInstance(CommandPostTransformation.class);
			processor.setFactory(CpaRepositoryImpl.this);
			updates = processor.postProcessing(updates);

			for (Object obj : updates) {
				List<Object> commands = new ArrayList<>();
				commands.add(processor.transformation(obj));
				getLocalRepository().applyChanges(commands);
			}
		}
	}

	private <T> boolean isLocked(Object obj, Class<T> objectClass, List<Map<String, Object>> objectToRemove,
			List<Map<String, Object>> relationToRemove) throws Exception {
		RepositoryHelper helper = new RepositoryHelper(registry);
		CpaMapper cpaMapper = (CpaMapper) helper.findMapper(objectClass);
		CpaStorage cpaStorage = this.getStorageProvider().getStorage();
		StorageControl sc = cpaStorage.findByPrimaryKey(cpaMapper.getPrimaryKeyFromRepositoryObject(obj), objectClass);
		boolean isLock = false;
		if (sc != null) {
			isLock = cpaStorage.isLocked(sc, new ObjectGraph(), new ArrayList<Object>(), objectToRemove,
					relationToRemove, LockOperation.Update);
		}
		List<Object> flatArray = new ArrayList<>();
		cpaMapper.flattenObject(obj, flatArray);
		flatArray.remove(obj);
		List<Object> removedPk = cpaStorage.buldPkList(objectToRemove);
		for (Object o : flatArray) {
			cpaMapper = (CpaMapper) helper.findMapper(o.getClass());
			Object pk = cpaMapper.getPrimaryKeyFromRepositoryObject(o);
			if (!removedPk.contains(pk)) {
				sc = cpaStorage.findByPrimaryKey(cpaMapper.getPrimaryKeyFromRepositoryObject(o), o.getClass());
				if (sc != null) {
					boolean l = cpaStorage.isLocked(sc, new ObjectGraph(), new ArrayList<Object>(), objectToRemove,
							relationToRemove, LockOperation.Update);
					isLock = isLock && l;
					removedPk = cpaStorage.buldPkList(objectToRemove);
				}
			}
		}
		return isLock;
	}

}
