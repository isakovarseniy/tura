/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.core.SearchResult;

public class SpaRepository implements Repository {

	private static final long serialVersionUID = 1615677329324930020L;
	private String registryName;
	private SpaObjectRegistry spaRegistry;
	private Registry registry;
	private RequestDataProducer requestDataProducer;


	public void setRegistry(SpaObjectRegistry spaRegistry, String registryName, Registry registry,RequestDataProducer requestDataProducer) {
		this.registryName = registryName;
		this.spaRegistry = spaRegistry;
		this.registry = registry;
		this.requestDataProducer = requestDataProducer;
	}

	public String getRegistryName() {
		return registryName;
	}

	public Map<Object, SpaControl> getCache(String objectName) {
		return requestDataProducer.getCache().get(objectName);
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
	public List applyChanges(List changes) throws RepositoryException {
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
			control.setSequence(requestDataProducer.getSequence());

			if (control.getLevel().getRule() == null) {
				requestDataProducer.getNomergeRules().add(control);
				return;
			}

			Map<Object, SpaControl> listOfObjectsPerType = (Map<Object, SpaControl>) requestDataProducer.getCache().get(control.getType());
			if (listOfObjectsPerType == null) {
				listOfObjectsPerType = new HashMap<>();
				requestDataProducer.getCache().put(control.getType(), listOfObjectsPerType);
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
				return new SearchProviderRepositoryWrapper(repository, spaRegistry);
			}
			throw new RepositoryException("Cannot find  SearchProvider for class " + className);
		}
		if (provider instanceof AbstaractSearchService) {
			((AbstaractSearchService) provider).setMapper(findMapper(className));
			((AbstaractSearchService) provider).setCache(requestDataProducer.getCache().get(className));
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
