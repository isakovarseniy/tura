/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.repository.jpa.operation;

import static com.octo.java.sql.query.Query.c;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.tura.platform.datacontrol.commons.DefaulQueryFactory;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.RepositoryObjectLoader;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.triggers.PreQueryTrigger;

import com.octo.java.sql.query.SelectQuery;

public class JpaSearchService implements SearchProvider {

	private String registryName;
	private SpaObjectRegistry spaRegistry;
	private Registry registry;

	public JpaSearchService(SpaObjectRegistry spaRegistry,String registryName,Registry registry) {
		this.registryName = registryName;
		this.spaRegistry = spaRegistry;
		this.registry = registry;
	}

	public EntityManager getEm() {
		return spaRegistry.getRegistry(registryName).getEntityManagerProvider().getEntityManager();
	}

	public String getRegistry() {
		return registryName;
	}

	public void setRegistry(String registry) {
		this.registryName = registry;
	}

	private PreQueryTrigger findPreQueryTrigger(String repositoryClass) throws RepositoryException {
		try {
			return spaRegistry.getRegistry(registryName).findPreQueryTrigger(repositoryClass);
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	protected List<?> findObjectsQuery(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, Object... args) throws Exception {

		String objectClass = (String) args[0];

		Class<?> clazz = (Class<?>) this.getClass().getClassLoader().loadClass(objectClass);

		SelectQuery dslQuery = DefaulQueryFactory.builder(searchCriteria, orderCriteria, Class.forName(objectClass));
		Query query = getEm().createQuery(dslQuery.toSql(), clazz);
		query.setFirstResult(startIndex);
		if (endIndex > 0) {
			query.setMaxResults(endIndex - startIndex);
		}
		for (String param : dslQuery.getParams().keySet()) {
			query.setParameter(param, dslQuery.getParams().get(param));
		}

		return query.getResultList();
	}

	protected long findNumberOfRowsQuery(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Object... args) throws Exception {

		String objectClass = (String) args[0];

		SelectQuery dslQuery = DefaulQueryFactory.builder(searchCriteria, orderCriteria, Class.forName(objectClass));
		dslQuery.getColumns()[0] = c("count(*)");
		dslQuery.getOrderBy().clear();

		Query query = getEm().createQuery(dslQuery.toSql());
		for (String param : dslQuery.getParams().keySet()) {
			query.setParameter(param, dslQuery.getParams().get(param));
		}
		return (long) query.getSingleResult();
	}

	@Override
	public SearchResult find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String objectClass) throws RepositoryException {
		RepositoryHelper helper = new RepositoryHelper(registry);

		try {
			SearchCriteria parentPersistenceObject = helper.checkSearchParam(RepositoryObjectLoader.PARENT_PERSISTANCE_OBJECT, searchCriteria);
			SearchCriteria parentChildRelation = helper.checkSearchParam(RepositoryObjectLoader.PARENT_CHIELD_RELATION,searchCriteria);
			SearchCriteria parentChildRelationType = helper.checkSearchParam(RepositoryObjectLoader.PARENT_CHIELD_RELATION_TYPE, searchCriteria);

			String repositoryClass = registry.findRepositoryClass(objectClass);
			PersistanceMapper mapper = spaRegistry.getRegistry(registryName).findMapper(objectClass,repositoryClass);

			if (
					      parentPersistenceObject != null
					&& parentPersistenceObject.getValue() != null
					&& parentPersistenceObject.getValue().getClass().isAnnotationPresent(Entity.class)
					&& mapper != null
			) {
				String relationType = (String) parentChildRelationType.getValue();
				String property = (String) parentChildRelation.getValue();
				Object persistenceObject = parentPersistenceObject.getValue();

				List<?> list = new RepositoryHelper(registry).findChildren(persistenceObject, relationType, property);
				return new SearchResult(list, list.size());
			}

			PreQueryTrigger preQueryTrigger = findPreQueryTrigger(objectClass);
			if (preQueryTrigger != null) {
				preQueryTrigger.preQueryTrigger(searchCriteria, orderCriteria);
			}
			helper.extractAndRemove(RepositoryObjectLoader.PARENT_PERSISTANCE_OBJECT, searchCriteria);
			helper.extractAndRemove(RepositoryObjectLoader.PARENT_REPOSITORY_OBJECT, searchCriteria);
			helper.extractAndRemove(RepositoryObjectLoader.PARENT_CHIELD_RELATION,searchCriteria);
			helper.extractAndRemove(RepositoryObjectLoader.PARENT_CHIELD_RELATION_TYPE, searchCriteria);

			List<?> searchResult = findObjectsQuery(searchCriteria, orderCriteria, startIndex, endIndex, objectClass);
			long numberOfRows = findNumberOfRowsQuery(searchCriteria, orderCriteria, objectClass);

			return new SearchResult(searchResult, numberOfRows);

		} catch (Exception e) {
			throw new RepositoryException(e);
		}

	}

	@Override
	public Object find(Object pk, String objectClass) throws RepositoryException {
		try {
			return getEm().find(Class.forName(objectClass), pk);
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	public void setAdapterLoader(AdapterLoader loader) {
	}

}
