/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
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
 ******************************************************************************/
package org.tura.platform.commons.jpa;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.tura.platform.datacontrol.commons.LazyList;
import org.tura.platform.persistence.ObjectsID;
import org.tura.platform.persistence.TuraObject;

import com.octo.java.sql.query.SelectQuery;
import static com.octo.java.sql.query.Query.c;

public class TuraJPAEntityService  implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private EntityManager em;

	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	public TuraObject create(String objectClass) throws Exception {
		Class<?> clazz = (Class<?>) this.getClass().getClassLoader()
				.loadClass(objectClass);
		TuraObject obj = (TuraObject) clazz.newInstance();
		obj.setObjId(this.getObjectID(em));
		return obj;

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<?> find(SelectQuery dslQuery, Integer startIndex,
			Integer endIndex, String objectClass) throws Exception {

		Class<?> clazz = (Class<?>) this.getClass().getClassLoader()
				.loadClass(objectClass);

		Query query = em.createQuery(dslQuery.toSql(), clazz);
		query.setFirstResult(startIndex);
		query.setMaxResults(endIndex - startIndex);
		for (String param : dslQuery.getParams().keySet()) {
			query.setParameter(param, dslQuery.getParams().get(param));
		}

		List<?> ls = query.getResultList();

		dslQuery.getColumns()[0] = c("count(*)");
		dslQuery.getOrderBy().clear();

		query = em.createQuery(dslQuery.toSql());
		for (String param : dslQuery.getParams().keySet()) {
			query.setParameter(param, dslQuery.getParams().get(param));
		}
		long numResults = (long) query.getSingleResult();

		for (Object obj : ls){
			em.detach(obj);
		}
		return new LazyList(ls, numResults, startIndex);

	}

	public void update(TuraObject entity) {
		em.merge(entity);

	}

	public void insert(TuraObject entity) {
		em.persist(entity);
	}

	public void remove( TuraObject entity) throws ClassNotFoundException {
		Object obj = em.find(entity.getClass(),entity.getObjId());
		em.remove(obj);
	}

	protected Long getObjectID(EntityManager em) {
		ObjectsID obj = new ObjectsID();
		em.persist(obj);
		em.remove(obj);
		em.flush();

		return obj.getObjId();
	}

}
