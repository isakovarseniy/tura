/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
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
package org.tura.platform.services;

import static com.octo.java.sql.query.Query.c;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.tura.platform.datacontrol.commons.DefaulQueryFactory;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.object.TuraObject;
import org.tura.platform.object.persistence.ObjectsID;

import com.octo.java.sql.query.SelectQuery;

public class JPAService implements Serializable {

	private static final long serialVersionUID = 1L;

	private EntityManager em;

	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	public EntityManager getEntityManager() {
		return this.em;
	}

	public TuraObject create(String objectClass) throws Exception {
		Class<?> clazz = (Class<?>) this.getClass().getClassLoader().loadClass(objectClass);
		TuraObject obj = (TuraObject) clazz.newInstance();
		obj.setObjId(this.getObjectID());
		return obj;

	}

	public Object findByPk(String objectClass, Object request) throws Exception {
		Class<?> clazz = (Class<?>) this.getClass().getClassLoader().loadClass(objectClass);
		return getEntityManager().find(clazz, ((TuraObject) request).getObjId());
	}

	public Object findByPk(String objectClass, Long id) throws Exception {
		Class<?> clazz = (Class<?>) this.getClass().getClassLoader().loadClass(objectClass);
		return getEntityManager().find(clazz, id);
	}
	
	
	
	public List<?> find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String objectClass) throws Exception {

		Class<?> clazz = (Class<?>) this.getClass().getClassLoader().loadClass(objectClass);

		SelectQuery dslQuery = DefaulQueryFactory.builder(searchCriteria, orderCriteria, Class.forName(objectClass));
		Query query = getEntityManager().createQuery(dslQuery.toSql(), clazz);
		query.setFirstResult(startIndex);
		query.setMaxResults(endIndex - startIndex);
		for (String param : dslQuery.getParams().keySet()) {
			query.setParameter(param, dslQuery.getParams().get(param));
		}

		return query.getResultList();
	}

	public long findNumberOfRows(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,String objectClass) throws Exception {

		SelectQuery dslQuery = DefaulQueryFactory.builder(searchCriteria, orderCriteria, Class.forName(objectClass));
		dslQuery.getColumns()[0] = c("count(*)");
		dslQuery.getOrderBy().clear();

		Query query = getEntityManager().createQuery(dslQuery.toSql());
		for (String param : dslQuery.getParams().keySet()) {
			query.setParameter(param, dslQuery.getParams().get(param));
		}
		return (long) query.getSingleResult();
	}

	public void update(TuraObject entity) {
		getEntityManager().merge(entity);

	}

	public void insert(TuraObject entity) {
		getEntityManager().persist(entity);
	}

	public void remove(TuraObject entity) throws ClassNotFoundException {
		Object obj = getEntityManager().find(entity.getClass(), entity.getObjId());
		getEntityManager().remove(obj);
	}

	protected Long getObjectID() {
		ObjectsID obj = new ObjectsID();
		getEntityManager().persist(obj);
		getEntityManager().remove(obj);
		getEntityManager().flush();

		return obj.getObjId();
	}

}
