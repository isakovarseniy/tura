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
package org.tura.platform.repository;

import static com.octo.java.sql.query.Query.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.commons.beanutils.BeanUtils;
import org.tura.platform.datacontrol.commons.DefaulQueryFactory;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.PersistenceProvider;

import com.octo.java.sql.query.SelectQuery;

public class SPAPersistanceProvider implements PersistenceProvider {

	private EntityManager em;

	public SPAPersistanceProvider(EntityManager em) {
		this.em = em;
	}

	@Override
	public void connect(Object srcPk, String srcMethod, Class<?> srcType, Object trgPk, String trgMethod,
			Class<?> trgType, String relation) throws Exception {

		 Object srcObject  =  this.findInternal(srcType, srcPk);
//		 assert srcObject.getClass().isAssignableFrom(srcType);
		 assert srcObject.getClass().getMethod("get"+srcMethod, new Class<?>[]{}) != null;
		 
		 
		 Object trgObject  =  this.findInternal(trgType, trgPk);
//		 assert trgObject.getClass().isAssignableFrom(trgType);
		 assert trgObject.getClass().getMethod("get"+trgMethod, new Class<?>[]{}) != null;
		 
		 if ("One2One".equals(relation)){
			 Reflection.callTyped(srcObject, "set"+srcMethod, trgType,trgObject);
			 Reflection.callTyped(trgObject, "set"+trgMethod, srcType,srcObject);
			 return;
			 
		 }
		 if ("One2Many".equals(relation)){
			 @SuppressWarnings("unchecked")
			 List<Object> list = (List<Object>) Reflection.callTyped(srcObject, "get"+srcMethod);
			 list.add(trgObject);
			 Reflection.callTyped(trgObject, "set"+trgMethod, srcType,srcObject);
			 return;
			 
		 }
		 if ("Many2Many".equals(relation)){
			 @SuppressWarnings("unchecked")
			 List<Object> listSrc = (List<Object>) Reflection.callTyped(srcObject, "get"+srcMethod);
			 listSrc.add(trgObject);
			 @SuppressWarnings("unchecked")
			 List<Object> listTrg = (List<Object>) Reflection.callTyped(trgObject, "get"+trgMethod);
			 listTrg.add(srcObject);
			 
			 return;
		 }
		 
		 throw new RuntimeException();
		
	}

	@Override
	public void disconnect(Object srcPk, String srcMethod, Class<?> srcType, Object trgPk, String trgMethod,
			Class<?> trgType, String relation) throws Exception{
		
		 Object srcObject  =  this.findInternal(srcType, srcPk);
//		 assert srcObject.getClass().isAssignableFrom(srcType);
		 assert srcObject.getClass().getMethod("get"+srcMethod, new Class<?>[]{}) != null;
		 
		 
		 Object trgObject  =  this.findInternal(trgType, trgPk);
//		 assert trgObject.getClass().isAssignableFrom(trgType);
		 assert trgObject.getClass().getMethod("get"+trgMethod, new Class<?>[]{}) != null;

		 if ("One2One".equals(relation)){
			 Reflection.callTyped(srcObject, "set"+srcMethod, trgType,null);
			 Reflection.callTyped(trgObject, "set"+trgMethod, srcType,null);
			 return;
			 
		 }
		 if ("One2Many".equals(relation)){
			 @SuppressWarnings("unchecked")
			 List<Object> list = (List<Object>) Reflection.callTyped(srcObject, "get"+srcMethod);
			 Object  o = list.remove(trgObject);
			 assert o !=null;
			 Reflection.callTyped(trgObject, "set"+trgMethod, srcType,null);
			 return;
			 
		 }
		 if ("Many2Many".equals(relation)){
			 @SuppressWarnings("unchecked")
			 List<Object> listSrc = (List<Object>) Reflection.callTyped(srcObject, "get"+srcMethod);
			 Object o = listSrc.remove(trgObject);
			 assert o !=null;
			 @SuppressWarnings("unchecked")
			 List<Object> listTrg = (List<Object>) Reflection.callTyped(trgObject, "get"+trgMethod);
			 o = listTrg.remove(srcObject);
			 assert o !=null;
			 
			 return;
		 }
		 
		 throw new RuntimeException();
		 
		 
		 
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T find(Class<T> clazz, Object pk) throws Exception {
		
		Object jpaObject = findInternal(clazz, pk);
		
		Object object = clazz.newInstance();
		BeanUtils.copyProperties(object, jpaObject);
		
		return (T) object;
		
	}
	
	
	private Object findInternal(Class<?> clazz, Object pk) throws Exception {
		String objectName = clazz.getName();
		String jpatName = objectName.replace(".spa.", ".jpa.");
		Class<?> jpaClass = Class.forName(jpatName);
		
		return em.find(jpaClass, pk);
		
	}
	
	

	@Override
	public long findNumberOfRowsQuery(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Object... args) throws Exception {
		
		String className = (String) args[0];
		String objectClass = className.replace(".spa.", ".jpa.");

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
	public List<?> findObjectsQuery(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, Object... args) throws Exception {
		String className = (String) args[0];
		String objectClass = className.replace(".spa.", ".jpa.");

		
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

		@SuppressWarnings("unchecked")
		List<Object> list = query.getResultList();
		ArrayList<Object> result = new ArrayList<>();
		for (Object obj : list){
			Class<?> cl = Class.forName(className);
			Object o = cl.newInstance();
			BeanUtils.copyProperties(o, obj);
			result.add(o);
		}
		
		return result;
	}

	@Override
	public void insert(Object entity,Object pk, Class<?> clazz) throws Exception {
		String name = entity.getClass().getName();
		String jpaName = name.replace(".spa.", ".jpa.");
		Class<?> jpaClass = Class.forName(jpaName);
		Object jpa =   jpaClass.newInstance();
		
		BeanUtils.copyProperties(jpa, entity);
		
		em.persist(jpa);
	}

	@Override
	public void remove(Object entity,Object pk, Class<?> clazz)  throws Exception{
		 Object object  =  this.findInternal(clazz, pk);
		em.remove(object);
	}

	@Override
	public void update(Object pk, Map<String, Object> fields, Class<?> clazz) throws Exception {
		 Object object  =  this.findInternal(clazz, pk);
//		 assert object.getClass().isAssignableFrom(clazz);

		for (String field : fields.keySet()){
			Object value = fields.get(field);
			Reflection.callTyped(object, "set"+field, value.getClass(),value);
		}

	}

}
