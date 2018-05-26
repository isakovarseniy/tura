package org.tura.platform.repository.spa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.triggers.PostCreateTrigger;

public class SpaRepository implements Repository, RepositoryEventsListener {

	private static ThreadLocal<HashMap<String, Map<Object, SpaControl>>> cache = new ThreadLocal<>();
	private int sequence;
	private String registry;

	public SpaRepository(String registry) {
		this.registry = registry;
	}

	@Override
	public Object create(String objectClass) throws RepositoryException {
		try {
			Object obj = Class.forName(objectClass).newInstance();
			PostCreateTrigger trigger = findPostCreateTrigger(objectClass);
			if (trigger != null) {
				trigger.postCreate(obj);
			}
			return obj;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	public SearchResult find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String objectClass) throws RepositoryException {
		SearchProvider provider = findSearchProvider(objectClass);
		return provider.find(searchCriteria, orderCriteria, startIndex, endIndex);
	}

	@Override
	public void insert(Object obj, String objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(Object obj, String objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void applyChanges(List changes) throws RepositoryException {
		try {
			for (Object change : changes) {
				if (change instanceof SpaRepositoryCommand) {
					throw new RepositoryException(change.getClass().getName() + " is not an instance of "
							+ SpaRepositoryCommand.class.getName());
				}
				SpaRepositoryCommand cmd = (SpaRepositoryCommand) change;
				List<String> listOfKnownObjects = cmd.getListOfKnownObjects();
				injectSearchProviders(cmd, listOfKnownObjects);
				List<SpaControl> objects = cmd.prepare();
				populateCache(objects);
			}

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	public void notify(RepositoryEvent event) throws Exception {
		if (event instanceof BeginTransaction) {
			cleanupCache();
		}
		if (event instanceof RallbackTransaction) {
			cleanupCache();
			rallback();
		}
		if (event instanceof CommitTransaction) {
			persistCachedObjects();
			cleanupCache();
		}
	}

	private void persistCachedObjects() throws Exception {
		List<SpaControl> preparedObjects = getListOfPreparedObjects();
		for (SpaControl control : preparedObjects) {
			CRUDProvider provider = findCRUDProvider(control);
			provider.execute(control);
		}
	}

	private CRUDProvider findCRUDProvider(SpaControl obj) throws Exception {
		Class<?> clazz = Class.forName(obj.getType());
		CRUDProvider provider = SpaObjectRegistry.getInstance().getRegistry(registry).findCRUDProvider(clazz);
		if (provider == null) {
			throw new RepositoryException("Cannot find CRUDProvider for class " + clazz);
		}
		return provider;
	}

	private void populateCache(List<SpaControl> list) throws RepositoryException {
		Map<String, Map<Object, SpaControl>> threadCache = cache.get();
		for (SpaControl control : list) {
			control.setSequence(sequence++);

			Map<Object, SpaControl> listOfObjectsPerType = (Map<Object, SpaControl>) threadCache.get(control.getType());
			if (listOfObjectsPerType == null) {
				listOfObjectsPerType = new HashMap<>();
				threadCache.put(control.getType(), listOfObjectsPerType);
			}
			SpaControl preparedObject = (SpaControl) listOfObjectsPerType.get(control.getKey());
			if (preparedObject == null) {
				listOfObjectsPerType.put(control.getKey(), control);
			} else {
				merge(listOfObjectsPerType, preparedObject, control);
			}
		}
	}

	private void injectSearchProviders(SpaRepositoryCommand cmd, List<String> listOfKnownObjects)
			throws RepositoryException {
		for (String className : listOfKnownObjects) {
			SearchProvider provider = findSearchProvider(className);
			cmd.addSearchProvider(className, provider);
		}
	}

	private void cleanupCache() {
		cache.set(new HashMap<String, Map<Object, SpaControl>>());
		sequence = 0;
	}

	private void rallback() {
		cleanupCache();
	}

	private PostCreateTrigger findPostCreateTrigger(String objectClass) {
		return SpaObjectRegistry.getInstance().getRegistry(registry).findPostCreateTrigger(objectClass);
	}

	private SearchProvider findSearchProvider(String className) throws RepositoryException {
		SearchProvider provider = SpaObjectRegistry.getInstance().getRegistry(registry).findSearchProvider(className);
		if (provider == null) {
			throw new RepositoryException("Cannot find  SearchProvider for class " + className);
		}
		return provider;

	}

	private List<SpaControl> getListOfPreparedObjects() {
		ArrayList<SpaControl> list = new ArrayList<>();
		HashMap<String, Map<Object, SpaControl>> ch = cache.get();

		for (String h : ch.keySet()) {
			Map<Object, SpaControl> typedList = ch.get(h);
			list.addAll(typedList.values());
		}
		Collections.sort(list, new Comparator<SpaControl>() {

			@Override
			public int compare(SpaControl o1, SpaControl o2) {
				return o1.compareTo(o2);
			}
		});
		return null;
	}

	private void merge(Map<Object, SpaControl> listOfObjectsPerType, SpaControl preparedObject, SpaControl control)
			throws RepositoryException {
		preparedObject.getLevel().getRule().merge(listOfObjectsPerType, preparedObject, control);
	}

}
