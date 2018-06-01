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
package org.tura.platform.repository.core;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Internal;
import org.tura.platform.repository.triggers.PostQueryTrigger;
import org.tura.platform.repository.triggers.PreQueryTrigger;

import com.octo.java.sql.exp.Operator;

public class RepositoryObjectLoader  extends RepositoryHelper{

	static int MAX_ROW_NUMBER = 50;
	public static String PARENT_PERSISTANCE_OBJECT = "parentPersistanceObject";
	public static String PARENT_REPOSITORY_OBJECT = "parentRepositoryObject";
	public static String PARENT_CHIELD_RELATION = "parentChildRelatioin";
	public static String PARENT_CHIELD_RELATION_TYPE = "parentChildRelatioinType";
	
	
	static String LOADED_OBJECTS = "LOADED_OBJECTS";
	public static String RULES_LIST = "RULES_LIST";

	List<SearchCriteria> search;
	List<OrderCriteria> order;
	Map<String, Object> context;

	public RepositoryObjectLoader(List<SearchCriteria> search, List<OrderCriteria> order, Map<String, Object> context) {
		this.search = search;
		this.order = order;
		this.context = context;
	}

	private void populate(Object persistenceObject, Object repositoryObject) throws RepositoryException {
		Mapper mapper = Registry.getInstance().findMapper(persistenceObject.getClass().getName(),
				repositoryObject.getClass().getName());
		if (mapper == null) {
			throw new RepositoryException("Cannot find mapper from " + persistenceObject.getClass().getName() + " to "
					+ repositoryObject.getClass().getName());
		}
		mapper.copyFromPersistence2Repository(persistenceObject, repositoryObject);
	}


	private Object instantiateObject(Class<?> repositoryClass) throws Exception {
		return repositoryClass.newInstance();
	}

	private PreQueryTrigger findPreQueryTrigger(Class<?> repositoryClass) throws RepositoryException {
		return Registry.getInstance().findPreQueryTrigger(repositoryClass.getName());
	}

	private PostQueryTrigger findPostQueryTrigger(Class<?> repositoryClass) throws RepositoryException {
		return Registry.getInstance().findPostQueryTrigger(repositoryClass.getName());
	}

	private boolean skipRelation(Object repositoryObject, Method method) {
		return Registry.getInstance().skipRelation(repositoryObject.getClass(), method);
	}

	private void internalLoader(Object repositoryObject, boolean fromInternalClass) throws Exception {
		List<Method> internalAssosiations = getMethodsAnnotatedWith(repositoryObject.getClass(), Internal.class);
		for (Method method : internalAssosiations) {
			RelationAdapter processor = getRelationProcessor(repositoryObject.getClass(),method,context);
			RepositoryObjectLoader loader = new RepositoryObjectLoader(search, order,context);

			for (Object object : processor.getListOfRepositoryObjects(repositoryObject)) {
				loader.internalLoader(object,  getPersistancePrimaryKeyFromRepositoryObject(repositoryObject), true);
			}
			if (fromInternalClass) {
				query(repositoryObject, null);
			}
		}
	}

	
	public void  internalLoader(Object repositoryObject,Object persistenceObjectPK , boolean fromInternalClass) throws Exception {
        @SuppressWarnings("unchecked")
		List<Object> loadedObjects = (List<Object>) context.get(LOADED_OBJECTS);
        if(loadedObjects == null){
        	loadedObjects = new ArrayList<>();
        	context.put(LOADED_OBJECTS, loadedObjects);
        }
        if (loadedObjects.contains(persistenceObjectPK)){
        	return ;
        }else{
        	loadedObjects.add(persistenceObjectPK);
        	return ;
        }
	}
	
	
	public Object loader(Object persistenceObject,  Object persistenceObjectPK , Class<?> repositoryClass) throws RepositoryException {
            @SuppressWarnings("unchecked")
			List<Object> loadedObjects = (List<Object>) context.get(LOADED_OBJECTS);
            if(loadedObjects == null){
            	loadedObjects = new ArrayList<>();
            	context.put(LOADED_OBJECTS, loadedObjects);
            }
            if (loadedObjects.contains(persistenceObjectPK)){
            	return null;
            }else{
            	loadedObjects.add(persistenceObjectPK);
            	return loader(persistenceObject,repositoryClass);
            }
	}	
	
	
	private  Object loader(Object persistenceObject, Class<?> repositoryClass) throws RepositoryException {
		try {
			Object repositoryObject = instantiateObject(repositoryClass);
			populate(persistenceObject,repositoryObject);
			internalLoader(repositoryObject, false);
			query(repositoryObject, persistenceObject);

			PostQueryTrigger postQueryTrigger = findPostQueryTrigger(repositoryClass);
			if (postQueryTrigger != null) {
				postQueryTrigger.postQueryTrigger(repositoryObject);
			}
			return repositoryObject;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	private void query(Object repositoryObject, Object persistenceObject) throws Exception {

		List<Method> assosiations = getMethodsAnnotatedWith(repositoryObject.getClass(), Association.class);

		for (Method method : assosiations) {
			if (skipRelation(repositoryObject, method)) {
				continue;
			}
			Association assosiation = method.getAnnotation(Association.class);
			RelationAdapter processor = getRelationProcessor(repositoryObject.getClass(),method,context);

			Repository provider = findProvider(assosiation.mappedBy().getName());
			Class<?> persistanceClass = findPersistanceClass(assosiation.mappedBy().getName());

			List<SearchCriteria> newSearch = prepareSearchCriteria(persistenceObject, repositoryObject,assosiation, method.getName().substring(3));
			PreQueryTrigger preQueryTrigger = findPreQueryTrigger(repositoryObject.getClass());
			if (preQueryTrigger != null) {
				preQueryTrigger.preQueryTrigger(newSearch, order);
			}

			SearchResult result = provider.find(newSearch, order, 0, MAX_ROW_NUMBER, persistanceClass.getName());

			for (Object object : result.getSearchResult()) {
				RepositoryObjectLoader loader = new RepositoryObjectLoader(search, order,context );
				Object loadedObject = loader.loader(object, getPersistancePrimaryKey(object) , assosiation.mappedBy());
				if (loadedObject != null){
				   processor.connectRepositoryObjects(repositoryObject, loadedObject);
				}
			}
		}
	}


	private List<SearchCriteria> prepareSearchCriteria(Object persistenceObject, Object repositoryObject,Association assosiation, String property) {

		List<SearchCriteria> newSearch = new ArrayList<>();
		for (SearchCriteria sc : search) {
			if (!PARENT_PERSISTANCE_OBJECT.equals(sc.getName())) {
				newSearch.add(sc);
			}
		}

		SearchCriteria criteria = new SearchCriteria();
		criteria.setName(PARENT_PERSISTANCE_OBJECT);
		criteria.setComparator(Operator.EQ.name());
		criteria.setValue(persistenceObject);
		newSearch.add(criteria);

		criteria = new SearchCriteria();
		criteria.setName(PARENT_REPOSITORY_OBJECT);
		criteria.setComparator(Operator.EQ.name());
		criteria.setValue(repositoryObject);
		newSearch.add(criteria);

		criteria = new SearchCriteria();
		criteria.setName(PARENT_CHIELD_RELATION);
		criteria.setComparator(Operator.EQ.name());
		criteria.setValue(property);
		newSearch.add(criteria);
		
		criteria = new SearchCriteria();
		criteria.setName(PARENT_CHIELD_RELATION_TYPE);
		criteria.setComparator(Operator.EQ.name());
		criteria.setValue(assosiation.type());
		newSearch.add(criteria);
		
		
		return newSearch;

	}




}
