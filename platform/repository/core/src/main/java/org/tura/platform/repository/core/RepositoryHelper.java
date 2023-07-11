/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
 */

package org.tura.platform.repository.core;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.jxpath.JXPathNotFoundException;
import org.apache.commons.lang.WordUtils;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Connection;
import org.tura.platform.repository.core.annotation.Internal;
import org.tura.platform.repository.core.relatioin.RelationBuilder;
import org.tura.platform.repository.data.CloneableCommand;
import org.tura.platform.repository.persistence.PersistanceRelationBuilder;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.repository.spa.SpaRepositoryData;
import org.tura.platform.repository.triggers.PostCreateTrigger;
import org.tura.platform.repository.triggers.PostQueryTrigger;
import org.tura.platform.repository.triggers.PreQueryTrigger;

import com.octo.java.sql.exp.Operator;

public class RepositoryHelper implements Serializable {

	private static final long serialVersionUID = -8075610575839199524L;
	protected Registry registry;

	public RepositoryHelper() {

	}

	public RepositoryHelper(Registry registry) {
		this.registry = registry;
	}

	public CommandLifecycle getCommandLifecycle() {
		return registry.getCommandLifecycle();
	}

	public Rule findRule(String ruleType, Object... args) throws Exception {
		List<Class<? extends Rule>> array = registry.getRules().get(ruleType);
		if (array == null) {
			return null;
		}
		Rule defaultRule = null;
		for (Class<? extends Rule> clazz : array) {
			Constructor<?> c = clazz.getConstructor();
			Rule rule = (Rule) c.newInstance();
			if (rule.isDefault()) {
				defaultRule = rule;
			} else {
				if (rule.check(ruleType, args)) {
					return rule;
				}
			}
		}
		return defaultRule;
	}

	public Class<?> findPersistanceClass(String repositoryClass) throws RepositoryException {
		try {
			return Class.forName(registry.findPersistanceClass(repositoryClass));
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	
	public Class<?> findRepositoryClassByPersistanceObject(Object persistanceObject) throws RepositoryException {
      String persistanceType = persistanceObject.getClass().getName();
		if (persistanceObject instanceof Adapter) {
			persistanceType = ((Adapter) persistanceObject).getObjectType();
		}else {
			if (  persistanceObject instanceof TypeAware) {
				persistanceType = ((TypeAware) persistanceObject).getTypeClazz().getName();
			}
		}
		return findRepositoryClass(persistanceType);
		
	}
	
	
	public Class<?> findRepositoryClass(String persistanceClass) throws RepositoryException {
		try {
			return Class.forName(registry.findRepositoryClass(persistanceClass));
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public Class<?> findRepositoryClassNoException(String persistanceClass) throws RepositoryException {
		try {
			return Class.forName(registry.findRepositoryClass(persistanceClass));
		} catch (Exception e) {
			return null;
		}
	}

	public Annotation getMasterAnnotation(RepoKeyPath masterPk, String masterProperty)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, Exception {
		int sizepk = masterPk.getPath().size();
		RepoObjectKey repoObjectKey = masterPk.getPath().get(sizepk - 1);
		Class<?> clazz = Class.forName(repoObjectKey.getType());
		Method method = clazz.getMethod("get" + WordUtils.capitalize(masterProperty));
		Annotation annotation = method.getAnnotation(Association.class);
		if (annotation == null) {
			annotation = method.getAnnotation(Internal.class);
		}
		if (annotation == null) {
			throw new RepositoryException("No annotation class " + clazz.getName() + " method " + method.getName());
		}
		return annotation;
	}

	public RelationAdapter getRelationProcessor(Class<?> clazz, Method method, Map<String, Object> context) {
		return RelationBuilder.build(clazz, method, context);
	}

	public Repository findProvider(String repositoryClass, SpaRepositoryData spaRepositoryData)
			throws RepositoryException {
		Repository repository = registry.findProvider(repositoryClass);
		if (repository instanceof SpaRepositoryDataAware) {
			((SpaRepositoryDataAware) repository).setSpaRepositoryData(spaRepositoryData);
		}
		return repository;
	}

	public Mapper findMapper(String repositoryClass) throws RepositoryException {
		String persistanceClass = registry.findPersistanceClass(repositoryClass);
		return registry.findMapper(persistanceClass, repositoryClass);
	}

	public Mapper findMapper(Class<?> repositoryClass) throws RepositoryException {
		String persistanceClassName = registry.findPersistanceClass(repositoryClass.getName());
		Mapper mapper = registry.findMapper(persistanceClassName, repositoryClass.getName());
		if (mapper == null) {
			throw new RepositoryException(
					"Mapper not found from " + persistanceClassName + " to " + repositoryClass.getName());
		}
		return mapper;
	}
	public Mapper findMapperWithoutException(Class<?> repositoryClass) throws RepositoryException {
		Mapper mapper = null;
		try {
			String persistanceClassName = registry.findPersistanceClass(repositoryClass.getName());
			mapper = registry.findMapper(persistanceClassName, repositoryClass.getName());
		}catch(Exception e) {
			
		}
		return mapper;
	}
	
	
	public Mapper findMapperByPersistanceClass(Class<?> persistanceClass) throws RepositoryException {
		  return findMapperByPersistanceClass(persistanceClass.getName());
	}
	
	
	public Mapper findMapperByPersistanceClass(String persistanceClassName) throws RepositoryException {
		String repositoryClassName = registry.findRepositoryClass(persistanceClassName);
		Mapper mapper = registry.findMapper(persistanceClassName, repositoryClassName);
		if (mapper == null) {
			throw new RepositoryException(
					"Mapper not found from " + persistanceClassName + " to " + repositoryClassName);
		}
		return mapper;
	}
	
	
	public CommandProducer findCommandProducer(String repositoryClass, Map<String, Object> params,
			SpaRepositoryData spaRepositoryData) throws RepositoryException {
		CommandProducer cp = registry.findCommandProduce(repositoryClass, params);
		cp.setSpaRepositoryData(spaRepositoryData);
		return cp;
	}

	public RepoKeyPath findPk(Object object) throws Exception {
		Class<?> repositoryClass = object.getClass();
		Mapper mapper = findMapper(repositoryClass);
		return mapper.getPath(object);
	}

	public RepoObjectKey findRepoObjectKey(Object object) throws Exception {
		Class<?> repositoryClass = object.getClass();
		Mapper mapper = findMapper(repositoryClass);
		return mapper.getRepoObjectKey(object);
	}

	public List<Object> getDisconnectedChildren(Method m, Object repositoryObject, Map<String, Object> context)
			throws Exception {
		RelationAdapter processor = getRelationProcessor(repositoryObject.getClass(), m, context);
		List<Object> children = new ArrayList<>();
		children.addAll(processor.getListOfRepositoryObjects(repositoryObject));
		for (Object obj : children) {
			processor.disconnectRepositoryObject(repositoryObject, obj);
		}
		return children;
	}

	public Object getPersistancePrimaryKeyFromRepositoryObject(Object repositoryObject) throws RepositoryException {
		String persistanceClass = registry.findRepositoryClass(repositoryObject.getClass().getName());
		return registry.findMapper(persistanceClass, repositoryObject.getClass().getName())
				.getPrimaryKeyFromRepositoryObject(repositoryObject);
	}

	public Object getPersistancePrimaryKey(Object persistanceObject) throws RepositoryException {
		String persistanceType = persistanceObject.getClass().getName();
		if (persistanceObject instanceof Adapter) {
			persistanceType = ((Adapter) persistanceObject).getObjectType();
		}else {
			if (persistanceObject instanceof TypeAware ) {
				persistanceType = ((TypeAware)persistanceObject).getTypeClazz().getName();
			}
		}
		
		String repositoryClass = registry.findRepositoryClass(persistanceType);
		return registry.findMapper(persistanceType, repositoryClass).getPrimaryKey(persistanceObject);
	}

	public List<Method> getMethodsAnnotatedWith(final Class<?> type, final Class<? extends Annotation> annotation) {
		final List<Method> methods = new ArrayList<Method>();
		Class<?> klass = type;
		while (klass != Object.class) {
			final List<Method> allMethods = new ArrayList<Method>(Arrays.asList(klass.getMethods()));
			for (final Method method : allMethods) {
				if (method.isAnnotationPresent(annotation)) {
					methods.add(method);
				}
			}
			klass = klass.getSuperclass();
		}
		return methods;
	}

	public Method getMethodsToSetNull(final Class<?> type, String signature) {
		Class<?> klass = type;
		while (klass != Object.class) {
			final List<Method> allMethods = new ArrayList<Method>(Arrays.asList(klass.getMethods()));
			for (final Method method : allMethods) {
				if (method.getName().equals(signature)) {
					return method;
				}
			}
			klass = klass.getSuperclass();
		}
		return null;
	}

	public Object getExtendedObject(RepoKeyPath extendedPk, Object persistanceObject) throws Exception {
		try {
			return PathHelper.getPathValue(extendedPk, 1, persistanceObject);
		} catch (JXPathNotFoundException e) {
			return null;
		}
	}

	public List<SearchCriteria> buildSearchCriteria(List<FieldValue> primaryKeyFields) throws Exception {
		ArrayList<SearchCriteria> search = new ArrayList<SearchCriteria>();
		if (primaryKeyFields != null) {
			for (FieldValue field : primaryKeyFields) {
				SearchCriteria sc = new SearchCriteria();
				sc.setComparator(Operator.EQ.name());
				sc.setName(field.getName());
				sc.setClassName(field.getType());
				sc.setValue(find(field.getName(), primaryKeyFields));
				search.add(sc);
			}
		}
		return search;
	}

	private Object find(String field, java.util.List<FieldValue> list) throws Exception {
		for (FieldValue f : list) {
			if (f.getName().equals(field)) {
				Class<?> clazz = Class.forName(f.getType());
				try {
					Constructor<?> c = clazz.getConstructor(String.class);
					return c.newInstance(f.getValue());
				} catch (NoSuchMethodException e) {
					return org.tura.platform.datacontrol.commons.Parser.parse(f.getValue(), clazz);
				}
			}
		}
		throw new RepositoryException("Could not find a field " + field);
	}

	public SearchCriteria extractAndRemove(String parameter, List<SearchCriteria> search) {
		SearchCriteria result = null;
		for (SearchCriteria sc : search) {
			if (sc.getName().equals(parameter)) {
				search.remove(sc);
				result = sc;
				break;
			}
		}
		return result;
	}

	public SearchCriteria checkSearchParam(String parameter, List<SearchCriteria> search) {
		SearchCriteria result = null;
		for (SearchCriteria sc : search) {
			if (sc.getName().equals(parameter)) {
				result = sc;
				break;
			}
		}
		return result;
	}

	public SearchCriteria checkRelationSearchParam(String parentClass, String property, List<SearchCriteria> search) {
		SearchCriteria result = null;
		for (SearchCriteria sc : search) {
			if (sc.getParentClass() != null && sc.getProperty() != null && sc.getParentClass().equals(parentClass)
					&& sc.getProperty().equals(property)) {
				result = sc;
				break;
			}
		}
		return result;
	}

	public List<?> findChildren(Object persistenceObject, String relationType, String property) throws Exception {

		if ("One2Many".equals(relationType)) {
			String methodName = "get" + WordUtils.capitalize((String) property);
			Method m = persistenceObject.getClass().getMethod(methodName);
			if (findAnnotationType(m)) {
				relationType = "One2Many";
			} else {
				relationType = "Many2One";
			}
		}
		return PersistanceRelationBuilder.build(relationType).getChildren(persistenceObject, property);
	}

	private boolean findAnnotationType(Method method) {
		boolean one2many = true;
		Type returnType = method.getGenericReturnType();
		if (returnType instanceof ParameterizedType) {
			ParameterizedType type = (ParameterizedType) returnType;
			if (((Class<?>) type.getRawType()).getName().equals(Collection.class.getName())
					|| ((Class<?>) type.getRawType()).getName().equals(List.class.getName())) {
				one2many = true;
			} else {
				one2many = false;
			}
		} else {
			one2many = false;
		}
		return one2many;

	}

	public static Class<?> getObjectType(Type type) throws RepositoryException {
		if ( type instanceof ParameterizedType) {
			ParameterizedType prmT = (ParameterizedType) type;
			if ( prmT.getActualTypeArguments().length != 1) {
				throw new RepositoryException("Wrong number of parameters");
			}
			return (Class<?>) prmT.getActualTypeArguments()[0];
		}
		return (Class<?>) type;
	}
	
	
	public boolean beckwardProperty(Object persistanceDetailObject, String detailProperty) {
		try {
			Class<?> clazz = persistanceDetailObject.getClass();
			String methodName = "get" + WordUtils.capitalize(detailProperty);
			clazz.getMethod(methodName);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public PostCreateTrigger findPostCreateTrigger(String repositoryClass) throws RepositoryException {
		return registry.findPostCreateTrigger(repositoryClass);
	}

	public PreQueryTrigger findPreQueryTrigger(Class<?> repositoryClass) throws RepositoryException {
		return findPreQueryTrigger(repositoryClass.getName());
	}

	public PreQueryTrigger findPreQueryTrigger(String parentClass, String childClass) throws RepositoryException {
		return registry.findPreQueryTrigger(parentClass, childClass);
	}

	public PreQueryTrigger findPreQueryTrigger(Class<?> parentClass, Class<?> childClass) throws RepositoryException {
		return findPreQueryTrigger(parentClass.getName(), childClass.getName());
	}

	public PreQueryTrigger findPreQueryTrigger(String repositoryClass) throws RepositoryException {
		return registry.findPreQueryTrigger(repositoryClass);
	}

	public PostQueryTrigger findPostQueryTrigger(Class<?> repositoryClass) throws RepositoryException {
		return registry.findPostQueryTrigger(repositoryClass.getName());
	}

	public ObjectGraphProfile findProfileImplementation(String profile) {
		return this.registry.findProfile(profile);
	}

	public boolean isInternal(Class<?> clazz, String property) throws Exception {
		String methodName = "get" + WordUtils.capitalize(property);
		Method masterMethod = clazz.getMethod(methodName, new Class<?>[] {});

		Association association = masterMethod.getAnnotation(Association.class);
		if (association != null) {
			return false;
		}
		return true;
	}

	public boolean isHiddenJpaAssociation(Class<?> clazz, String property) throws Exception {
		String methodName = "get" + WordUtils.capitalize(property);
		Method masterMethod = clazz.getMethod(methodName, new Class<?>[] {});

		Connection association = masterMethod.getAnnotation(Connection.class);
		if (association == null) {
			return false;
		}
		return association.hiddenJpa();
	}
	
	
	public void updatePath(RepoKeyPath path, String parentProperty, Object childObject) throws Exception {
		Mapper maper = findMapper(childObject.getClass());
		path.addRepoObjectKey(parentProperty, maper.getRepoObjectKey(childObject));
	}

	public RepoKeyPath walkerPath(RepoKeyPath masterPath, Object childObject, String detailProperty,
			String masterProperty) throws Exception {
		RepoKeyPath clonedPath = null;
		if (isInternal(childObject.getClass(), detailProperty)) {
			clonedPath = masterPath.clone();
			updatePath(clonedPath, masterProperty, childObject);
		} else {
			clonedPath = findPk(childObject);
		}
		return clonedPath;
	}

	public Map<RelationType, String> findRelationByIdAndType(RepoKeyPath pk, String id, RelationType cpaRelationType)
			throws Exception {
		int idx = pk.getPath().size() - 1;
		String className = pk.getPath().get(idx).getType();
		Class<?> clazz = Class.forName(className);
		return findRelationByIdAndType(clazz,id,cpaRelationType);
	}

	public Map<RelationType, String> findRelationByIdAndType(Class<?> clazz, String id, RelationType cpaRelationType)
			throws Exception {
		Map<RelationType, String> result = new HashMap<>();

		List<Method> methods = getMethodsAnnotatedWith(clazz, Association.class);
		for (Method method : methods) {
			Association assosiation = method.getAnnotation(Association.class);
			if (assosiation.id().equals(id) && assosiation.direction().equals(cpaRelationType)) {
				String prop = WordUtils.uncapitalize(method.getName().substring(3));
				result.put(cpaRelationType, prop);
				prop = assosiation.property();
				result.put(cpaRelationType.revert(), prop);
				
			}
		}
		return result;
	}	

	
	public Method findMethodByIdAndType(Class<?> clazz, String id, RelationType cpaRelationType)
			throws Exception {
		List<Method> methods = getMethodsAnnotatedWith(clazz, Association.class);
		for (Method method : methods) {
			Association assosiation = method.getAnnotation(Association.class);
			if (assosiation.id().equals(id) && assosiation.direction().equals(cpaRelationType)) {
				return method;
			}
		}
		return null;
	}	
	
	
	public Mapper findMapperByRepoObject(Object repositoryObject)  throws RepositoryException{
		return findMapper(getRealClass(repositoryObject));
	}
	
	public Mapper findMapperByPersistenceObject(Object persistenceObject) throws RepositoryException{
		String persistenceType = persistenceObject.getClass().getName();
		if (persistenceObject instanceof  Adapter ) {
			persistenceType = ((Adapter)persistenceObject).getObjectType();
		}else {
			if (  persistenceObject instanceof TypeAware) {
				persistenceType = ((TypeAware) persistenceObject).getTypeClazz().getName();
			}
		}
		String repositoryClass = registry.findRepositoryClass(persistenceType);
		return registry.findMapper(persistenceType, repositoryClass);
	}	
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Object newRepoObject( Object persistenceObject) throws RepositoryException {
		String persistenceType = persistenceObject.getClass().getName();
		if (persistenceObject instanceof  Adapter ) {
			persistenceType = ((Adapter)persistenceObject).getObjectType();
		}else {
			if (  persistenceObject instanceof TypeAware) {
				persistenceType = ((TypeAware) persistenceObject).getTypeClazz().getName();
			}
		}
		Class repoClass = findRepositoryClass(persistenceType);
		try {
			return repoClass.getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			throw new RepositoryException(e);
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Object newPersistenceObject( Object repositoryObject) throws RepositoryException {
		Class persistenceClass = findPersistanceClass(getRealClass(repositoryObject).getName());
		try {
			return persistenceClass.getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			throw new RepositoryException(e);
		}
	}
	
	protected Class<?> getRealClass(Object repositoryObject){
		if ( repositoryObject instanceof ObjectControl) {
			return ((ObjectControl)repositoryObject).getProxyClazz();
		}
		return repositoryObject.getClass();
	}
	
	public  void cleanCommand(List<Object> response) {
		if ( response == null  || response.size() == 0 ) {
			return;
		}
		for ( Object o : response) {
			CloneableCommand cmd  = (CloneableCommand) o;
			cmd.cleanRegistry();
		}
	}
}
