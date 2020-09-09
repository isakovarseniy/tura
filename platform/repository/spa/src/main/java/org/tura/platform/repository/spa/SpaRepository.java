/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.spa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.core.StorageCommandProcessor;

public class SpaRepository implements Repository, StorageCommandProcessor {

	public transient static final ThreadLocal<AtomicReference<SpaRepositoryData>> SPA_REPOSITORY_DATA_THREAD_LOCAL = ThreadLocal
			.withInitial(AtomicReference::new);

	private static final long serialVersionUID = 1615677329324930020L;
	private String registryName;
	private SpaObjectRegistry spaRegistry;
	private Registry registry;

	private Map<String, Map<Object, SpaControl>> getCache() {
		SpaRepositoryData data = getTheadData();
		return data.getCache();

	}

	private List<SpaControl> getNomergeRules() {
		SpaRepositoryData data = getTheadData();
		return data.getNomergeRules();
	}

	private int getSequence() {
		SpaRepositoryData data = getTheadData();
		int i = data.getSequence();
		data.setSequence(i + 1);
		return i;
	}

	private void setSequence(int i) {
		SpaRepositoryData data = getTheadData();
		data.setSequence(i);
	}

	private SpaRepositoryData getTheadData() {
		if (SPA_REPOSITORY_DATA_THREAD_LOCAL.get().get() == null) {
			SPA_REPOSITORY_DATA_THREAD_LOCAL.get().set(new SpaRepositoryData());
		}
		return SPA_REPOSITORY_DATA_THREAD_LOCAL.get().get();
	}

	public void setRegistry(SpaObjectRegistry spaRegistry, String registryName, Registry registry) {
		this.registryName = registryName;
		this.spaRegistry = spaRegistry;
		this.registry = registry;
	}

	public String getRegistryName() {
		return registryName;
	}

	public Map<Object, SpaControl> getCache(String objectName) {
		return getCache().get(objectName);
	}

	@Override
	public Object create(String objectClass) throws RepositoryException {
		try {
			Object obj = Class.forName(objectClass).getDeclaredConstructor().newInstance();
			return obj;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	public SearchResult find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String objectClass) throws RepositoryException {
		try {
			SearchProvider provider = findSearchProvider(objectClass, this.registryName);
			return provider.find(searchCriteria, orderCriteria, startIndex, endIndex, objectClass);
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	public Object find(Object pk, String objectClass) throws RepositoryException {
		try {
			SearchProvider provider = findSearchProvider(objectClass, this.registryName);
			return provider.find(pk, objectClass);
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
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
	public void process() throws Exception {
		persistCachedObjects();
		cleanupCache();
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
		CRUDProvider provider = spaRegistry.getRegistry(obj.getRegistryName()).findCRUDProvider(clazz);
		if (provider == null) {
			throw new RepositoryException("Cannot find CRUDProvider for class " + clazz);
		}
		return provider;
	}

	private void populateCache(List<SpaControl> list) throws RepositoryException {
		if (list == null) {
			return;
		}
		for (SpaControl control : list) {
			control.setSequence(getSequence());

			if (control.getLevel().getRule() == null) {
				getNomergeRules().add(control);
				return;
			}

			Map<Object, SpaControl> listOfObjectsPerType = (Map<Object, SpaControl>) getCache().get(control.getType());
			if (listOfObjectsPerType == null) {
				listOfObjectsPerType = new HashMap<>();
				getCache().put(control.getType(), listOfObjectsPerType);
			}
			SpaControl preparedObject = (SpaControl) listOfObjectsPerType.get(control.getKey());
			if (preparedObject == null) {
				listOfObjectsPerType.put(control.getKey(), control);
			} else {
				merge(listOfObjectsPerType, preparedObject, control);
			}
		}
	}

	private void injectSearchProviders(SpaRepositoryCommand cmd, List<String> listOfKnownObjects) throws Exception {
		for (String className : listOfKnownObjects) {
			SearchProvider provider = findSearchProvider(className, cmd.getRegistryName());
			cmd.addSearchProvider(className, provider);
		}
	}

	private void cleanupCache() {
		getCache().clear();
		getNomergeRules().clear();
		setSequence(0);
	}

	private SearchProvider findSearchProvider(String className, String registryName) throws Exception {
		SearchProvider provider = spaRegistry.getRegistry(registryName).findSearchProvider(className);
		if (provider == null) {
			String repositoryClass = registry.findRepositoryClass(className);
			Repository repository = registry.findProvider(repositoryClass);
			if (repository != null) {
				return new SearchProviderRepositoryWrapper(repository, spaRegistry);
			}
			throw new RepositoryException("Cannot find  SearchProvider for class " + className);
		}
		if (provider instanceof AbstaractSearchService) {
			((AbstaractSearchService) provider).setMapper(findMapper(className));
			((AbstaractSearchService) provider).setCache(getCache().get(className));
		}
		return provider;

	}

	protected Mapper findMapper(String persistanceClassName) throws RepositoryException {

		String repositoryClassName = registry.findRepositoryClass(persistanceClassName);
		Mapper mapper = registry.findMapper(persistanceClassName, repositoryClassName);
		if (mapper == null) {
			throw new RepositoryException(
					"Mapper not found from " + persistanceClassName + " to " + repositoryClassName);
		}
		return mapper;
	}

	private List<SpaControl> getListOfPreparedObjects() {
		ArrayList<SpaControl> list = new ArrayList<>();

		for (String h : getCache().keySet()) {
			Map<Object, SpaControl> typedList = getCache().get(h);
			list.addAll(typedList.values());
		}
		list.addAll(getNomergeRules());

		Collections.sort(list, new Comparator<SpaControl>() {

			@Override
			public int compare(SpaControl o1, SpaControl o2) {
				return o1.compareTo(o2);
			}
		});
		return list;
	}

	private void merge(Map<Object, SpaControl> listOfObjectsPerType, SpaControl preparedObject, SpaControl control)
			throws RepositoryException {
		preparedObject.getLevel().getRule().merge(listOfObjectsPerType, preparedObject, control);
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof SpaRepository) {
			SpaRepository r = (SpaRepository) o;
			return r.registryName.equals(this.registryName);
		} else {
			return false;
		}
	}
}
