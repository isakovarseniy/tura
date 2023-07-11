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

package org.tura.platform.repository.spa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.core.SpaRepositoryDataAware;

public class SpaRepository implements Repository, SpaRepositoryDataAware {

	private static final long serialVersionUID = 1615677329324930020L;
	private String registryName;
	private SpaObjectRegistry spaRegistry;
	private Registry registry;
	private SpaRepositoryData spaRepositoryData;


	public void setRegistry(SpaObjectRegistry spaRegistry, String registryName, Registry registry) {
		this.registryName = registryName;
		this.spaRegistry = spaRegistry;
		this.registry = registry;
	}

	public String getRegistryName() {
		return registryName;
	}

	
	public SpaRepositoryData getSpaRepositoryData() {
		return spaRepositoryData;
	}

	public void setSpaRepositoryData(SpaRepositoryData spaRepositoryData) {
		this.spaRepositoryData = spaRepositoryData;
	}

	public Map<Object, SpaControl> getCache(String objectName) {
		return spaRepositoryData.getCache().get(objectName);
	}

	@Override
	public <T> T create(Class<T> objectClass) throws RepositoryException {
		try {
			T obj = objectClass.getDeclaredConstructor().newInstance();
			return obj;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	public <T> SearchResult<T> find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, Class<T> objectClass) throws RepositoryException {
		try {
			SearchProvider provider = findSearchProvider(objectClass.getName(), this.registryName);
			return provider.find(searchCriteria, orderCriteria, startIndex, endIndex, objectClass);
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	public <T> T find(Object pk, Class<T> objectClass) throws RepositoryException {
		try {
			SearchProvider provider = findSearchProvider(objectClass.getName(), this.registryName);
			return provider.find(pk, objectClass);
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	public <T> void insert(Object obj, Class<T> objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> void remove(Object obj, Class<T> objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Object> applyChanges(List<Object> changes) throws RepositoryException {
		try {
			for (Object change : changes) {
				SpaRepositoryCommand cmd = (SpaRepositoryCommand) change;
				List<String> listOfKnownObjects = cmd.getListOfKnownObjects();
				injectSearchProviders(cmd, listOfKnownObjects);
				List<SpaControl> objects = cmd.prepare();
				populateCache(objects);
			}
			return null;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}



	private void populateCache(List<SpaControl> list) throws RepositoryException {
		if (list == null) {
			return;
		}
		for (SpaControl control : list) {
			control.setSequence(spaRepositoryData.getSequence());

			if (control.getLevel().getRule() == null) {
				spaRepositoryData.getNomergeRules().add(control);
				continue;
			}

			Map<Object, SpaControl> listOfObjectsPerType = (Map<Object, SpaControl>) spaRepositoryData.getCache().get(control.getType());
			if (listOfObjectsPerType == null) {
				listOfObjectsPerType = new HashMap<>();
				spaRepositoryData.getCache().put(control.getType(), listOfObjectsPerType);
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



	private SearchProvider findSearchProvider(String className, String registryName) throws Exception {
		SearchProvider provider = spaRegistry.getRegistry(registryName).findSearchProvider(className);
		if (provider == null) {
			String repositoryClass = registry.findRepositoryClass(className);
			Repository repository = registry.findProvider(repositoryClass);
			if (repository != null) {
				SearchProviderRepositoryWrapper wrapper = new SearchProviderRepositoryWrapper(repository, spaRegistry);
				wrapper.setSpaRepositoryData(spaRepositoryData);
				return wrapper;
			}
			throw new RepositoryException("Cannot find  SearchProvider for class " + className);
		}
		if (provider instanceof AbstractSearchService) {
			((AbstractSearchService) provider).setCache(spaRepositoryData.getCache().get(className));
		}
		return provider;

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
