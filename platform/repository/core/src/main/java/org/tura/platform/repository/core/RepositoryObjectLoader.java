package org.tura.platform.repository.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.RepositoryException;
import org.tura.platform.repository.SearchResult;
import org.tura.platform.repository.core.annotation.Assosiation;
import org.tura.platform.repository.core.annotation.Internal;
import org.tura.platform.repository.triggers.PostQueryTrigger;
import org.tura.platform.repository.triggers.PreQueryTrigger;
import org.tura.platform.repository.Repository;

import com.octo.java.sql.exp.Operator;

public class RepositoryObjectLoader  extends RepositoryHelper{

	static int MAX_ROW_NUMBER = 50;
	static String PARENT_PERSISTANCE_OBJECT = "parentPersistanceObject";
	static String PARENT_REPOSITORY_OBJECT = "parentRepositoryObject";
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

	public void populate(Object persistenceObject, Object repositoryObject) throws RepositoryException {
		Mapper mapper = Registry.getInstance().findMapper(persistenceObject.getClass().getName(),
				repositoryObject.getClass().getName());
		if (mapper == null) {
			throw new RepositoryException("Cannot find mapper from " + persistenceObject.getClass().getName() + " to "
					+ repositoryObject.getClass().getName());
		}
		mapper.copyFromPersistence2Repository(persistenceObject, repositoryObject);
	}


	public Object instantiateObject(Class<?> repositoryClass) throws Exception {
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

	public void internalLoader(Object repositoryObject, boolean fromInternalClass) throws Exception {
		List<Method> internalAssosiations = getMethodsAnnotatedWith(repositoryObject.getClass(), Internal.class);
		for (Method method : internalAssosiations) {
			RelationAdapter processor = getRelationProcessor(repositoryObject.getClass(),method,context);
			RepositoryObjectLoader loader = new RepositoryObjectLoader(search, order,context);

			for (Object object : processor.getListOfRepositoryObjects(repositoryObject)) {
				loader.internalLoader(object, true);
			}
			if (!fromInternalClass) {
				query(repositoryObject, null);
			}
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
            	return loader(persistenceObject,repositoryClass);
            }
	}	
	
	
	private  Object loader(Object persistenceObject, Class<?> repositoryClass) throws RepositoryException {
		try {
			Object repositoryObject = instantiateObject(repositoryClass);
			populate(repositoryObject, persistenceObject);
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

		List<Method> assosiations = getMethodsAnnotatedWith(repositoryObject.getClass(), Assosiation.class);

		for (Method method : assosiations) {
			if (skipRelation(repositoryObject, method)) {
				continue;
			}
			Assosiation assosiation = method.getAnnotation(Assosiation.class);
			RelationAdapter processor = getRelationProcessor(repositoryObject.getClass(),method,context);

			Repository provider = findProvider(assosiation.mappedBy().getName());
			Class<?> persistanceClass = findPersistanceClass(assosiation.mappedBy().getName());

			List<SearchCriteria> newSearch = prepareSearchCriteria(persistenceObject, repositoryObject);
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


	private List<SearchCriteria> prepareSearchCriteria(Object persistenceObject, Object repositoryObject) {

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

		return newSearch;

	}


	private Class<?> findPersistanceClass(String repositoryClass) throws RepositoryException {
		try {
			return Class.forName(Registry.getInstance().findPersistanceClass(repositoryClass));
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public static List<Method> getMethodsAnnotatedWith(final Class<?> type,
			final Class<? extends Annotation> annotation) {
		final List<Method> methods = new ArrayList<Method>();
		Class<?> klass = type;
		while (klass != Object.class) {
			final List<Method> allMethods = new ArrayList<Method>(Arrays.asList(klass.getDeclaredMethods()));
			for (final Method method : allMethods) {
				if (method.isAnnotationPresent(annotation)) {
					methods.add(method);
				}
			}
			klass = klass.getSuperclass();
		}
		return methods;
	}

}
