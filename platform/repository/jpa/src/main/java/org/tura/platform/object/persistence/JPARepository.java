/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
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
package org.tura.platform.object.persistence;

import static com.octo.java.sql.query.Query.c;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.tura.platform.datacontrol.commons.DefaulQueryFactory;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.object.persistence.operation.JPAOperation;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.RepositoryObjectLoader;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.triggers.PostCreateTrigger;
import org.tura.platform.repository.triggers.PreQueryTrigger;

import com.octo.java.sql.query.SelectQuery;

public class JPARepository implements Repository {

	private EntityManager em;
	private String registry;

	public JPARepository(EntityManager em) {
		this.em = em;
	}

	public String getRegistry() {
		return registry;
	}

	public void setRegistry(String registry) {
		this.registry = registry;
	}
	
	private PostCreateTrigger findPostCreateTrigger(String repositoryClass) throws RepositoryException {
		return JPAObjectRegistry.getInstance().getRegistry(registry).findPostCreateTrigger(repositoryClass);
	}

	private PreQueryTrigger findPreQueryTrigger(String repositoryClass) throws RepositoryException {
		return JPAObjectRegistry.getInstance().getRegistry(registry).findPreQueryTrigger(repositoryClass);
	}

	protected List<?> findObjectsQuery(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, Object... args) throws Exception {

		String objectClass = (String) args[0];

		Class<?> clazz = (Class<?>) this.getClass().getClassLoader().loadClass(objectClass);

		SelectQuery dslQuery = DefaulQueryFactory.builder(searchCriteria, orderCriteria, Class.forName(objectClass));
		Query query = em.createQuery(dslQuery.toSql(), clazz);
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

		Query query = em.createQuery(dslQuery.toSql());
		for (String param : dslQuery.getParams().keySet()) {
			query.setParameter(param, dslQuery.getParams().get(param));
		}
		return (long) query.getSingleResult();
	}

	@Override
	public Object create(String objectClass) throws RepositoryException {
		try {
			Object obj = Class.forName(objectClass).newInstance();
			PostCreateTrigger trigger = findPostCreateTrigger(objectClass);
			if (trigger != null){
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
		RepositoryHelper helper = new RepositoryHelper();
		
		try {
			SearchCriteria parentPersistenceObject =   helper.extractAndRemove(RepositoryObjectLoader.PARENT_PERSISTANCE_OBJECT,searchCriteria);
			helper.extractAndRemove(RepositoryObjectLoader.PARENT_REPOSITORY_OBJECT,searchCriteria);
			SearchCriteria parentChildRelation = helper.extractAndRemove(RepositoryObjectLoader.PARENT_CHIELD_RELATION,searchCriteria);
			SearchCriteria parentChildRelationType = helper.extractAndRemove(RepositoryObjectLoader.PARENT_CHIELD_RELATION_TYPE,searchCriteria);

			if (parentPersistenceObject != null && parentPersistenceObject.getValue().getClass().isAnnotationPresent(Entity.class) ){
				String relationType = (String) parentChildRelationType.getValue();
				String property = (String) parentChildRelation.getValue();
				Object persistenceObject = parentPersistenceObject.getValue();
               
				List<?> list = new  RepositoryHelper().findChildren(persistenceObject, relationType, property);
				return new SearchResult(list, list.size());
			}
			
			PreQueryTrigger preQueryTrigger = findPreQueryTrigger(objectClass);
			if (preQueryTrigger != null) {
				preQueryTrigger.preQueryTrigger(searchCriteria, orderCriteria);
			}

			List<?> searchResult = findObjectsQuery (searchCriteria, orderCriteria, startIndex, endIndex, objectClass);
			long numberOfRows = findNumberOfRowsQuery(searchCriteria, orderCriteria ,objectClass);

			return new SearchResult(searchResult, numberOfRows);

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
				
				JPAOperation operation = (JPAOperation) change;
				operation.setEntityManager(em);
				operation.execute();
			}
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

}
