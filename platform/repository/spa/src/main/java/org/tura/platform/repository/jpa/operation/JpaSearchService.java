/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.jpa.operation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.RepositoryObjectLoader;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.jpa.operation.query.DefaultQueryProcessor;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.spa.AbstaractSearchService;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaObjectRegistry.SpaRegistry;

public class JpaSearchService extends AbstaractSearchService {

	private String registryName;
	private SpaObjectRegistry spaRegistry;
	private Registry registry;
	private EntityManagerProvider entityManagerProvider;
	private Map<String, ExternalQueryProcessor<?>> queryProcessorRegistry = new HashMap<>();

	public JpaSearchService(SpaObjectRegistry spaRegistry, String registryName, Registry registry,
			EntityManagerProvider entityManagerProvider) {
		this.registryName = registryName;
		this.spaRegistry = spaRegistry;
		this.registry = registry;
		this.entityManagerProvider = entityManagerProvider;
	}

	public EntityManager getEm() {
		return entityManagerProvider.getEntityManager();
	}

	public String getRegistryName() {
		return registryName;
	}

	public void setRegistryName(String registry) {
		this.registryName = registry;
	}


	public Registry getRegistry() {
		return registry;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected <T> SearchResult<T> serviceCall(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, Class<T> objectClass) throws RepositoryException {
		RepositoryHelper helper = new RepositoryHelper(registry);

		try {

			SearchCriteria parentPersistenceObject = helper
					.extractAndRemove(RepositoryObjectLoader.PARENT_PERSISTANCE_OBJECT, searchCriteria);
			SearchCriteria parentChildRelation = helper.extractAndRemove(RepositoryObjectLoader.PARENT_CHIELD_RELATION,
					searchCriteria);
			SearchCriteria parentChildRelationType = helper
					.extractAndRemove(RepositoryObjectLoader.PARENT_CHIELD_RELATION_TYPE, searchCriteria);
			helper.extractAndRemove(RepositoryObjectLoader.PARENT_REPOSITORY_OBJECT, searchCriteria);

			String repositoryClass = registry.findRepositoryClass(objectClass.getName());
			PersistanceMapper mapper = spaRegistry.getRegistry(registryName).findMapper(objectClass.getName(),
					repositoryClass);
			

			if (parentPersistenceObject != null && parentPersistenceObject.getValue() != null
					&& parentPersistenceObject.getValue().getClass().isAnnotationPresent(Entity.class)
					&& mapper != null) {
				boolean isRegisterd  =  spaRegistry.getRegistry(registryName).isClassRegistered(parentPersistenceObject.getValue().getClass());
				if (isRegisterd ) {
					String relationType = (String) parentChildRelationType.getValue();
					String property = (String) parentChildRelation.getValue();
					Object persistenceObject = parentPersistenceObject.getValue();
	
					List<T> list = (List<T>) new RepositoryHelper(registry).findChildren(persistenceObject, relationType,
							property);
					return new SearchResult<T>(list, list.size());
				}
			}

			SearchCriteria queryName = helper
					.extractAndRemove(Constants.JPA_QUERY ,searchCriteria);
			if ( queryName != null ) {
				ExternalQueryProcessor<T> queryProcessor = (ExternalQueryProcessor<T>) queryProcessorRegistry.get(queryName.getValue());
				if ( queryProcessor != null ) {
					return queryProcessor.process(searchCriteria, orderCriteria, startIndex, endIndex, objectClass);
				}
			}
			
              ExternalQueryProcessor<T> processor = new DefaultQueryProcessor<T>();
              processor.setSearchService(this);
              return processor.process(searchCriteria, orderCriteria, startIndex, endIndex, objectClass);
			
		} catch (Exception e) {
			throw new RepositoryException(e);
		}

	}

	@Override
	public <T> T serviceCall(Object pk, Class<T> objectClass) throws RepositoryException {
		try {
			return getEm().find(objectClass, pk);
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	public void setAdapterLoader(AdapterLoader loader) {
	}

	@Override
	protected SpaRegistry getSpaRegistry() {
		return spaRegistry.getRegistry(registryName);
	}

	public <T>void addExternalQueryProcessor(String queryName, ExternalQueryProcessor<T> processor) {
		processor.setSearchService(this);
		this.queryProcessorRegistry.put(queryName, processor);
	}
	
	public <T>void addExternalQueryProcessor(Map<String, ExternalQueryProcessor<?>> queryProcessorRegistry ) {
		if ( queryProcessorRegistry == null) {
			return;
		}
		for (  String query : queryProcessorRegistry.keySet()) {
			ExternalQueryProcessor<?> p = queryProcessorRegistry.get(query);
			p.setSearchService(this);
			this.queryProcessorRegistry.put(query, p);
		}
	}
}
