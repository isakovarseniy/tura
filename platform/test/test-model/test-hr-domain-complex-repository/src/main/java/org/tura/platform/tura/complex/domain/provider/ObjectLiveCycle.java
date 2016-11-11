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
package org.tura.platform.tura.complex.domain.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.josql.Query;
import org.josql.QueryResults;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.object.model.DomainObject;
import org.tura.platform.object.model.RepositoryException;
import org.tura.platform.object.persistence.PersistenceObject;
import org.tura.platform.repository.DataProvider;
import org.tura.platform.services.JPAService;

import com.octo.java.sql.exp.Operator;
import com.octo.java.sql.query.SelectQuery;

public abstract class ObjectLiveCycle {

	public abstract Object load(Object persistedObject) throws Exception;
	public abstract void save(Object domainObject) throws Exception;
	public abstract void remove(Object persistedObject) throws Exception;
	
	private JPAService service;
	private DataProvider provider;
	
	
	public ObjectLiveCycle(JPAService service){
		this.service=service;
	}
	
	public DataProvider getProvider() {
		return provider;
	}
	public void setProvider(DataProvider provider) {
		this.provider = provider;
	}
	
	protected DomainObject loadObject(Object persistedObject, Class<?>  domainClass) throws Exception {
		DomainObject domainObject = (DomainObject) domainClass.newInstance();
		BeanUtils.copyProperties(domainObject,persistedObject);
		return domainObject;
	}	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected void loadChildren(DomainObject domainObject,ObjectLiveCycle liveCycle, String childrenProperty, Class<?>childrenType) throws Exception {

		List list = findChildren(domainObject, childrenType);
		
		for (int i = 0; i < list.size(); i++) {
			Object obj = liveCycle.load(list.get(i));
			list.set(i, obj);
		}
		Reflection.callTyped(domainObject, "set"+StringUtils.capitalize(childrenProperty) , Collection.class,list);
	}	

	protected void saveObject(DomainObject domainObject, Class<?> type) throws Exception {

		PersistenceObject persistedObject =  findObjectByDomainObject(domainObject, type);		

		if (persistedObject == null){
			persistedObject = (PersistenceObject) type.newInstance();
			BeanUtils.copyProperties(persistedObject,domainObject);
			getService().insert(persistedObject);
		}else{
			BeanUtils.copyProperties(persistedObject,domainObject);
			getService().update(persistedObject);
		}
	}	
	
	@SuppressWarnings("rawtypes")
	protected void saveChildren(DomainObject domainObject,ObjectLiveCycle liveCycle, Collection children, Class<?>childrenJPAType, Class<?>childrenDomainType) throws Exception {
	    if (children != null ){
	    	
			List list = findChildren(domainObject, childrenJPAType);
			
			for (int i = 0; i < list.size(); i++) {
				PersistenceObject obj = (PersistenceObject) list.get(i);
				if (!findObject(obj, children)){
					DomainObject dObject =   (DomainObject) childrenDomainType.newInstance();
					dObject.setObjId(obj.getObjId());
					liveCycle.remove(dObject);
				}
			}
			for (Object obj : children){
				liveCycle.save(obj);
			}
	    }
	}	
	
	
	@SuppressWarnings("rawtypes")
	protected List findChildren(DomainObject domainObject ,Class<?> type) throws Exception{
		
		List<SearchCriteria> searchCriteria = new ArrayList<>();
		SearchCriteria criteria = new SearchCriteria();
		criteria.setName("parentId");
		criteria.setValue(domainObject.getObjId());
		criteria.setComparator(Operator.EQ.name());
		searchCriteria.add(criteria);
		
		List<OrderCriteria> orderCriteria = new ArrayList<>();	
		OrderCriteria order = new OrderCriteria();
		order.setName("objId");
		order.setOrder(SelectQuery.Order.ASC.name());
		
		long numberOfRows = getService().findNumberOfRows(searchCriteria, orderCriteria, type.getName());
		
		return  getService().find(searchCriteria, orderCriteria, 0, new Long(numberOfRows).intValue(),
				type.getName());
		
	}
	
	protected PersistenceObject findObjectByDomainObject(DomainObject domainObject,Class<?> type) throws Exception{
		return (PersistenceObject) getService().findByPk(type.getName(), domainObject.getObjId());
	}
	
	@SuppressWarnings("rawtypes")
	protected boolean findObject(PersistenceObject persistedObject , Collection array) throws Exception{
		Query query = new Query();
		query.parse("SELECT * FROM org.tura.platform.object.model.DomainObject WHERE  objId = :objId");
		query.setVariable("objId", persistedObject.getObjId());
		QueryResults result = query.execute(array);
		
		if (result.getResults().size() > 1)
			throw new RepositoryException("Object is not unique "+persistedObject.getClass().getName());

		 return result.getResults().size() == 1; 
		
	}

	protected void check(Object obj, Class<?> type) throws RepositoryException{
		if (obj == null){
			throw new RepositoryException("Domain object is empty ");
		}
		if (   !(obj.getClass().isAssignableFrom(type) )  )   {
			throw new RepositoryException("Wrong Type ");
		}
		
	}
	
	public JPAService getService() {
		return service;
	}

	public void setService(JPAService service) {
		this.service = service;
	}

	
}
