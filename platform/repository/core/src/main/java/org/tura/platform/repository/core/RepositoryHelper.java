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

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Internal;
import org.tura.platform.repository.core.relatioin.RelationBuilder;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

public class RepositoryHelper {

	
	protected  Class<?> findPersistanceClass(String repositoryClass) throws RepositoryException {
		try {
			return Class.forName(Registry.getInstance().findPersistanceClass(repositoryClass));
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}
	
	
	
	protected Annotation getMasterAnnotation(RepoKeyPath masterPk, String masterProperty)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, Exception {
		int sizepk = masterPk.getPath().size();
		RepoObjectKey repoObjectKey = masterPk.getPath().get(sizepk - 1);
		Class<?> clazz = Class.forName(repoObjectKey.getType());
		Method method = clazz.getMethod("get" + WordUtils.capitalize(masterProperty));
		Annotation annotation = method.getAnnotation(Association.class);
		if (annotation == null) {
			annotation = method.getAnnotation(Internal.class);
		}
		if (annotation == null){
			throw new RepositoryException("No annotation class "+clazz.getName() +" method "+ method.getName());
		}
		return annotation;
	}
	

	protected RelationAdapter getRelationProcessor(Class<?> clazz, Method method,Map <String,Object> context ) {
		return RelationBuilder.build(clazz,method,context);
	}
	
	
	protected Repository findProvider(String repositoryClass) throws RepositoryException {
		return Registry.getInstance().findProvider(repositoryClass);
	}
	
	protected Mapper findMapper(String repositoryClass) throws RepositoryException{
		String persistanceClass = Registry.getInstance().findPersistanceClass(repositoryClass);
		return Registry.getInstance().findMapper(persistanceClass, repositoryClass);
		
	}
	
   protected CommandProducer findCommandProducer(String repositoryClass) throws RepositoryException{
	   return Registry.getInstance().findCommandProduce(repositoryClass) ;
   }
	
	
	protected RepoKeyPath findPk(Object object) throws Exception {
		Class<?> repositoryClass = object.getClass();
		Class<?> proxyClass = Class.forName( repositoryClass.getName()+"Proxy");
		
		Constructor<?> c = proxyClass.getConstructor(repositoryClass,ProxyCommadStackProvider.class);
		ObjectControl control = (ObjectControl) c.newInstance(object,null);
		return control.getPath();
	}

	protected List<Object> getDisconnectedChildren(Method m, Object repositoryObject,Map<String, Object> context)throws Exception {
		RelationAdapter processor = getRelationProcessor(repositoryObject.getClass(), m, context);
		List<Object> children = new ArrayList<>();
		children.addAll( processor.getListOfRepositoryObjects(repositoryObject));
		for (Object obj : children) {
			processor.disconnectRepositoryObject(repositoryObject, obj);
		}
		return children;
	}
	
	protected Object getPersistancePrimaryKey(Object persistanceObject) throws RepositoryException {
		String repositoryClass = Registry.getInstance().findRepositoryClass(persistanceObject.getClass().getName());
		return Registry.getInstance().findMapper(persistanceObject.getClass().getName(), repositoryClass).getPrimaryKey(persistanceObject);
	}
	
	
	
}

