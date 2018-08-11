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
package org.tura.platform.repository.core;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Internal;
import org.tura.platform.repository.core.annotation.InternalClass;
import org.tura.platform.repository.triggers.PostQueryTrigger;
import org.tura.platform.repository.triggers.PreQueryTrigger;

import com.octo.java.sql.exp.Operator;

public class RepositoryObjectLoader  extends RepositoryHelper{

	static int MAX_ROW_NUMBER = 50;
	public static String PARENT_PERSISTANCE_OBJECT = "parentPersistanceObject";
	public static String PARENT_REPOSITORY_OBJECT = "parentRepositoryObject";
	public static String PARENT_CHIELD_RELATION = "parentChildRelatioin";
	public static String PARENT_CHIELD_RELATION_TYPE = "parentChildRelatioinType";
	public static String SKIP_QUERY = "skipQuery";
	
	
	static String LOADED_OBJECTS = "LOADED_OBJECTS";
	public static String RULES_LIST = "RULES_LIST";

	private List<SearchCriteria> search;
	private List<OrderCriteria> order;
	private Map<String, Object> context;

	public RepositoryObjectLoader(List<SearchCriteria> search, List<OrderCriteria> order, Map<String, Object> context,Registry registry) {
		super(registry);
		this.search = search;
		this.order = order;
		this.context = context;
	}

	private void populate(Object persistenceObject, Object repositoryObject) throws RepositoryException {
		String persistanceType = persistenceObject.getClass().getName();
		if (persistenceObject instanceof Adapter){
			persistanceType = ((Adapter)persistenceObject).getObjectType();
		}

		Mapper mapper = registry.findMapper(persistanceType,repositoryObject.getClass().getName());
		if (mapper == null) {
			throw new RepositoryException("Cannot find mapper from " + persistenceObject.getClass().getName() + " to "
					+ repositoryObject.getClass().getName());
		}
		mapper.copyFromPersistence2Repository(persistenceObject, repositoryObject);
	}


	private Object instantiateObject(Class<?> repositoryClass) throws Exception {
		return repositoryClass.newInstance();
	}


	private boolean skipRelation(Object repositoryObject, Method method) {
		return registry.skipRelation(repositoryObject.getClass(), method);
	}

	private void internalLoader(Object repositoryObject, boolean fromInternalClass,ObjectGraph graph) throws Exception {
		List<Method> internalAssosiations = getMethodsAnnotatedWith(repositoryObject.getClass(), Internal.class);
		for (Method method : internalAssosiations) {
			Internal internal = method.getAnnotation(Internal.class);
			String id = internal.id();
			if( !graph.addBranch(id) ){
				continue;
			}
			
			RelationAdapter processor = getRelationProcessor(repositoryObject.getClass(),method,context);
			RepositoryObjectLoader loader = new RepositoryObjectLoader(search, order,context,registry);

			for (Object object : processor.getListOfRepositoryObjects(repositoryObject)) {
				loader.internalLoader(object,  getPersistancePrimaryKeyFromRepositoryObject(object), true,graph);
			}
			graph.removeLastBranch(id);
		}
		if (fromInternalClass) {
			query(repositoryObject, null,graph);
		}
	}

	
	public void  internalLoader(Object repositoryObject,Object persistenceObjectPK , boolean fromInternalClass , ObjectGraph graph) throws Exception {
        String key = LOADED_OBJECTS+repositoryObject.getClass().getName();
        
		@SuppressWarnings("unchecked")
		List<Object> loadedObjects = (List<Object>) context.get(key);
        if(loadedObjects == null){
        	loadedObjects = new ArrayList<>();
        	context.put(key, loadedObjects);
        }
        if (loadedObjects.contains(persistenceObjectPK)){
        	return ;
        }else{
        	loadedObjects.add(persistenceObjectPK);
        	internalLoader(repositoryObject,fromInternalClass,graph);
        }
	}
	
	
	public Object loader(Object persistenceObject,  Object persistenceObjectPK , Class<?> repositoryClass,ObjectGraph graph) throws RepositoryException {
        String key = LOADED_OBJECTS+repositoryClass.getName();

		@SuppressWarnings("unchecked")
			List<Object> loadedObjects = (List<Object>) context.get(key);
            if(loadedObjects == null){
            	loadedObjects = new ArrayList<>();
            	context.put(key, loadedObjects);
            }
            if (loadedObjects.contains(persistenceObjectPK)){
            	return null;
            }else{
            	loadedObjects.add(persistenceObjectPK);
            	return loader(persistenceObject,repositoryClass,graph);
            }
	}	
	
	
	private  Object loader(Object persistenceObject, Class<?> repositoryClass,ObjectGraph graph) throws RepositoryException {
		try {
			Object repositoryObject = instantiateObject(repositoryClass);
			populate(persistenceObject,repositoryObject);
			internalLoader(repositoryObject, false,graph);
			query(repositoryObject, persistenceObject,graph);

			PostQueryTrigger postQueryTrigger = findPostQueryTrigger(repositoryClass);
			if (postQueryTrigger != null) {
				postQueryTrigger.postQueryTrigger(repositoryObject);
			}
			return repositoryObject;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	private void query(Object repositoryObject, Object persistenceObject,ObjectGraph graph) throws Exception {

		List<Method> assosiations = getMethodsAnnotatedWith(repositoryObject.getClass(), Association.class);

		for (Method method : assosiations) {
			if (skipRelation(repositoryObject, method)) {
				continue;
			}
			
			Association assosiation = method.getAnnotation(Association.class);
			String id = assosiation.id();
			if( !graph.addBranch(id) ){
				continue;
			}
			
			InternalClass ic = assosiation.mappedBy().getAnnotation(InternalClass.class);
			if (ic != null ){
				continue;
			}
			
			RelationAdapter processor = getRelationProcessor(repositoryObject.getClass(),method,context);

			Repository provider = findProvider(assosiation.mappedBy().getName());
			Class<?> persistanceClass = findPersistanceClass(assosiation.mappedBy().getName());

			List<SearchCriteria> newSearch = prepareSearchCriteria(persistenceObject, repositoryObject,assosiation, method.getName().substring(3));
			PreQueryTrigger preQueryTrigger = findPreQueryTrigger(repositoryObject.getClass(), assosiation.mappedBy());
			if (preQueryTrigger != null) {
				preQueryTrigger.preQueryTrigger(newSearch, order);
			}
			SearchCriteria sc = extractAndRemove(RepositoryObjectLoader.SKIP_QUERY, newSearch);
			if (sc != null){
				continue;
			}
			
			SearchResult result = provider.find(newSearch, order, 0, MAX_ROW_NUMBER, persistanceClass.getName());

			for (Object object : result.getSearchResult()) {
				RepositoryObjectLoader loader = new RepositoryObjectLoader(search, order,context,registry );
				Object loadedObject = loader.loader(object, getPersistancePrimaryKey(object) , assosiation.mappedBy(),graph);
				if (loadedObject != null){
				   processor.connectRepositoryObjects(repositoryObject, loadedObject);
				}
			}
			
			graph.removeLastBranch(id);
			
		}
	}


	private List<SearchCriteria> prepareSearchCriteria(Object persistenceObject, Object repositoryObject,Association assosiation, String property) {

		List<SearchCriteria> newSearch = new ArrayList<>();
		for (SearchCriteria sc : search) {
			if (!PARENT_PERSISTANCE_OBJECT.equals(sc.getName())) {
				if ( 
						sc.getParentClass() != null && sc.getProperty() != null
						&& sc.getParentClass().equals(repositoryObject.getClass().getName()) && sc.getProperty().equals(property)
                   )	
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
