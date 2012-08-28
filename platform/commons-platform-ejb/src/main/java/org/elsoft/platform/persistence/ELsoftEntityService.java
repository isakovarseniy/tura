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
package org.elsoft.platform.persistence;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.elsoft.platform.Constants;
import org.elsoft.platform.OrderCriteria;
import org.elsoft.platform.OrderType;
import org.elsoft.platform.SearchCriteria;

public class ELsoftEntityService {

	public Long getObjsectID(EntityManager em) {
		ObjectsID obj = new ObjectsID();
		em.persist(obj);
		em.remove(obj);
		em.flush();

		return obj.getObjId();
	}

	public List<?> getObjects(Class<?> T, List<SearchCriteria> search,
			List<OrderCriteria> order, EntityManager em, int startIndex,
			int endIndex) throws Exception {

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<?> cq = cb.createQuery(T);
		Root<?> root = cq.from(T);

		if (search != null) {
			List<Predicate> predicates = new ArrayList<Predicate>();
			Iterator<SearchCriteria> sitr = search.iterator();
			while (sitr.hasNext()) {
				SearchCriteria searchCreiteria = sitr.next();
				if (!searchCreiteria.getValue().equals(
						Constants.UNDEFINED_PARAMETER)) {
					Constructor<?> cons = Class.forName(
							searchCreiteria.getClassName()).getConstructor(
							String.class);

					Object obj = cons.newInstance(searchCreiteria.getValue());

					predicates.add(RestrictionsConverter.valueOf(
							searchCreiteria.getComparator()).getRestriction(cb,
							root.get(searchCreiteria.getName()), obj));

				} else
					predicates.add(cb.isTrue(cb.literal(new Boolean("false"))));
			}
			cq.where(predicates.toArray(new Predicate[] {}));
		}

		if (order != null) {
			List<Order> orderPredicates = new ArrayList<Order>();

			Iterator<OrderCriteria> oitr = order.iterator();
			while (oitr.hasNext()) {
				OrderCriteria orderCreiteria = oitr.next();
				if (OrderType.valueOf(orderCreiteria.getOrder()).equals(
						OrderType.ASC))
					orderPredicates.add(cb.asc(root.get(orderCreiteria.getName())));
				else
					orderPredicates.add(cb.desc(root.get(orderCreiteria.getName())));
			}
			cq.orderBy(orderPredicates.toArray(new Order[] {}));
		}
		Query query = em.createQuery(cq);
		query.setFirstResult(startIndex);
		query.setMaxResults(endIndex - startIndex);

		List<?> ls = query.getResultList();

		return ls;
	}

	public void mergeObject(Object entity, EntityManager em) {
		em.merge(entity);
	}

	public void persistObject(Object entity, EntityManager em) {
		em.persist(entity);
	}

	public void removeObject(Object entity, EntityManager em) {
		/*
		 * Entity en = entity.getClass().getAnnotation(
		 * javax.persistence.Entity.class); String ejbql = "select p from " +
		 * en.name() + " p where p.objId = " + Reflection.call(entity,
		 * "getObjId"); Object obj = em.createQuery(ejbql).getSingleResult();
		 */em.remove(entity);
	}

}
