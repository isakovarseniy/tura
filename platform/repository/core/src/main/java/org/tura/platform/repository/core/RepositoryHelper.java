/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Internal;
import org.tura.platform.repository.core.relatioin.RelationBuilder;
import org.tura.platform.repository.persistence.PersistanceRelationBuilder;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.triggers.PostCreateTrigger;
import org.tura.platform.repository.triggers.PostQueryTrigger;
import org.tura.platform.repository.triggers.PreQueryTrigger;

public class RepositoryHelper implements Serializable{

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
    

    public Class<?> findPersistanceClass(String repositoryClass) throws RepositoryException {
        try {
            return Class.forName(registry.findPersistanceClass(repositoryClass));
        } catch (Exception e) {
            throw new RepositoryException(e);
        }
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

    public Repository findProvider(String repositoryClass) throws RepositoryException {
        return registry.findProvider(repositoryClass);
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

    public CommandProducer findCommandProducer(String repositoryClass) throws RepositoryException {
        return registry.findCommandProduce(repositoryClass);
    }

    public RepoKeyPath findPk(Object object) throws Exception {
        Class<?> repositoryClass = object.getClass();
        Class<?> proxyClass = Class.forName(repositoryClass.getName() + "Proxy");

        Constructor<?> c = proxyClass.getConstructor(repositoryClass, ProxyCommadStackProvider.class);
        ObjectControl control = (ObjectControl) c.newInstance(object, null);
        return control.getPath();
    }

    public RepoObjectKey findRepoObjectKey(Object object) throws Exception {
        Class<?> repositoryClass = object.getClass();
        Class<?> proxyClass = Class.forName(repositoryClass.getName() + "Proxy");

        Constructor<?> c = proxyClass.getConstructor(repositoryClass, ProxyCommadStackProvider.class);
        ObjectControl control = (ObjectControl) c.newInstance(object, null);
        return control.getPrimaryKey();
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
        if (persistanceObject instanceof Adapter){
            persistanceType = ((Adapter)persistanceObject).getObjectType();
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
			if (sc.getParentClass()!= null && sc.getProperty()!= null && sc.getParentClass().equals(parentClass) && sc.getProperty().equals(property)) {
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
    
    public static Class<?> getObjectType( Object obj){
        if (obj instanceof Adapter){
            try {
                return Class.forName( ((Adapter) obj).getObjectType());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }else{
            return obj.getClass();
        }
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
        return registry.findPreQueryTrigger(parentClass,childClass);
    }
    
    public PreQueryTrigger findPreQueryTrigger(Class<?> parentClass, Class<?> childClass) throws RepositoryException {
        return findPreQueryTrigger(parentClass.getName(),childClass.getName());
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
    
    
}


