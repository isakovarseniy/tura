package org.tura.platform.repository.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.repository.core.annotation.Assosiation;
import org.tura.platform.repository.core.annotation.Internal;
import org.tura.platform.repository.data.RemoveContainmentObjectData;
import org.tura.platform.repository.data.RemoveObjectData;
import org.tura.platform.repository.data.RemoveTopObjectData;

public class RepositoryObjectRemover {

	public void remove(RemoveTopObjectData data, Map<String,Object> context) {
		// TODO Auto-generated method stub
	}

	public void remove(RemoveContainmentObjectData data, Map<String,Object> context) throws RepositoryException {
		try {
			Object repositoryObject = data.getObject();
			walker(repositoryObject,context);
			
			Annotation annotation = getMasterAnnotation(data.getMasterPk(), data.getMasterProperty());
			if (annotation instanceof Assosiation) {
				disconnect(data.getMasterPk(),data.getMasterProperty(),repositoryObject,data.getDetailProperty());
				removeObject(data.getObject());
			} else {
				updateInternal(data.getMasterPk(),data.getMasterProperty(),repositoryObject,data.getDetailProperty());
			}

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}


	public void remove(RemoveObjectData data, Map<String,Object> context) {
		// TODO Auto-generated method stub
	}

	
	private void removeObject(Object object) {
		// TODO Auto-generated method stub
		
	}

	private void disconnect(RepoKeyPath masterPk, String masterProperty, Object repositoryObject,
			String detailProperty) {
		// TODO Auto-generated method stub
		
	}



	private void walker(Object repositoryObject, Map<String,Object> context) {
		Class<?> repositoryClass = repositoryObject.getClass();
		List<Method> methods = RepositoryObjectLoader.getMethodsAnnotatedWith(repositoryClass, Assosiation.class);
		for (Method m : methods) {
			Assosiation assosiaton = m.getAnnotation(Assosiation.class);
			if (assosiaton.containment()) {
				godeeper(m,repositoryObject,context);
				removeChildren(m,repositoryObject,context);
			}else {
				disconnect(m,repositoryObject,context);
			}
		}
		
		methods = RepositoryObjectLoader.getMethodsAnnotatedWith(repositoryClass, Internal.class);
		for (Method m : methods) {
			godeeper(m,repositoryObject,context);
		}
		
	}
	
	
	private void removeChildren(Method m, Object repositoryObject, Map<String, Object> context) {
		// TODO Auto-generated method stub
		
	}

	private void updateInternal(RepoKeyPath masterPk, String masterProperty, Object repositoryObject,
			String detailProperty) {
		// TODO Auto-generated method stub
		
	}
	
	
	private void disconnect(Method m, Object repositoryObject, Map<String,Object> context) {
		// TODO Auto-generated method stub
		
	}

	private void godeeper(Method m, Object repositoryObject, Map<String,Object> context) {
		// TODO Auto-generated method stub
		
	}

	private Annotation getMasterAnnotation(RepoKeyPath masterPk, String masterProperty)
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

}

