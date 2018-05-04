package org.tura.platform.repository.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.repository.core.annotation.Assosiation;
import org.tura.platform.repository.core.annotation.Internal;
import org.tura.platform.repository.core.relatioin.processor.RelationBuilder;

public class RepositoryHelper {

	
	protected Annotation getMasterAnnotation(RepoKeyPath masterPk, String masterProperty)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		int sizepk = masterPk.getPath().size();
		RepoObjectKey repoObjectKey = masterPk.getPath().get(sizepk - 1);
		Class<?> clazz = Class.forName(repoObjectKey.getType());
		Method method = clazz.getMethod("get" + WordUtils.capitalize(masterProperty));
		Annotation annotation = method.getAnnotation(Assosiation.class);
		if (annotation == null) {
			annotation = method.getAnnotation(Internal.class);
		}
		assert annotation == null;
		return annotation;
	}
	

	protected RelationAdapter getRelationProcessor(Class<?> clazz, Method method,Map <String,Object> context ) {
		return RelationBuilder.build(clazz,method,context);
	}
	
	
	protected PersistenceProvider findProvider(String repositoryClass) throws RepositoryException {
		return Registry.getInstance().findProvider(repositoryClass);
	}
	

	protected RepoKeyPath findPk(Object object) throws Exception {
		Class<?> repositoryClass = object.getClass();
		Class<?> proxyClass = Class.forName( repositoryClass.getName()+"Proxy");
		
		Constructor<?> c = proxyClass.getConstructor(repositoryClass);
		ObjectControl control = (ObjectControl) c.newInstance(object);
		return control.getPath();
	}

	
	
}

