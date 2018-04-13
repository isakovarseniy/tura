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
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.tura.platform.datacontrol.commons.DefaulQueryFactory;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.PersistenceProvider;

import com.octo.java.sql.query.SelectQuery;

public class JPAPersistenceProvider implements PersistenceProvider {

	private EntityManager em;

	public JPAPersistenceProvider(EntityManager em) {
		this.em = em;
	}

	@Override
	public void insert(Object entity,Object pk, Class<?> clazz) {
		em.persist(entity);
	}

	@Override
	public void remove(Object entity,Object pk, Class<?> clazz) {
		em.remove(entity);

	}

	@Override
	public <T> T find(Class<T> clazz, Object pk) {
		return em.find(clazz, pk);
	}

	@Override
	public List<?> findObjectsQuery(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
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

	@Override
	public long findNumberOfRowsQuery(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
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
	public void update(Object pk, Map<String, Object> fields, Class<?> clazz) {
		throw new UnsupportedOperationException();		
	}

	@Override
	public void connect(Object srcPk, String srcMethod, Class<?> srcType, Object trgPk, String trgMethod,
			Class<?> trgType, String relation) {
		throw new UnsupportedOperationException();		
		
	}

	@Override
	public void disconnect(Object srcPk, String srcMethod, Class<?> srcType, Object trgPk, String trgMethod,
			Class<?> trgType, String relation) {
		throw new UnsupportedOperationException();		
		
	}

}
