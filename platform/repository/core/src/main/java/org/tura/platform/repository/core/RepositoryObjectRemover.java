package org.tura.platform.repository.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.repository.core.annotation.Assosiation;
import org.tura.platform.repository.core.relatioin.RemoveObjectRule;
import org.tura.platform.repository.data.RemoveContainmentObjectData;
import org.tura.platform.repository.data.RemoveObjectData;
import org.tura.platform.repository.data.RemoveTopObjectData;

public class RepositoryObjectRemover extends RepositoryHelper {

	Map<String, Object> context = new HashMap<>();
	static String REMOVE_OBJECTS = "REMOVE_OBJECTS";

	public void remove(RemoveTopObjectData data) throws RepositoryException {
		try {
			Object repositoryObject = data.getObject();
			walker(repositoryObject);
			removeObject(repositoryObject);
			processRules();

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public void remove(RemoveContainmentObjectData data) throws RepositoryException {
		try {
			Object repositoryObject = data.getObject();
			walker(repositoryObject);

			Annotation annotation = getMasterAnnotation(data.getMasterPk(), data.getMasterProperty());
			if (annotation instanceof Assosiation) {
				RepoKeyPath detailPk = findPk(data.getObject());
				disconnect(data.getMasterPk(), data.getMasterProperty(), detailPk, data.getDetailProperty());
				removeObject(repositoryObject);
			} else {
				updateInternal(data.getMasterPk(), data.getMasterProperty(), repositoryObject,
						data.getDetailProperty());
			}

			processRules();

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public void remove(RemoveObjectData data) throws RepositoryException {
		try {
			disconnect(data.getMasterPk(), data.getMasterProperty(), data.getDetailPk(), data.getDetailProperty());
			processRules();
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@SuppressWarnings("unchecked")
	private void removeObject(Object repositoryObject) throws RepositoryException {
		RemoveObjectRule rule = new RemoveObjectRule();
		rule.setObject(repositoryObject);
		List<Object> removeObjects = (List<Object>) context.get(REMOVE_OBJECTS);
		if (removeObjects == null) {
			removeObjects = new ArrayList<>();
			context.put(REMOVE_OBJECTS, removeObjects);
		}
		removeObjects.add(rule);
	}

	private void walker(Object repositoryObject) throws Exception {
		Class<?> repositoryClass = repositoryObject.getClass();
		List<Method> methods = RepositoryObjectLoader.getMethodsAnnotatedWith(repositoryClass, Assosiation.class);
		for (Method m : methods) {
			Assosiation assosiaton = m.getAnnotation(Assosiation.class);
			if (assosiaton.containment()) {
				goDeeper(m, repositoryObject);
				disconnect(m, repositoryObject);
				removeChildren(m, repositoryObject);
			} else {
				disconnect(m, repositoryObject);
			}
		}

	}

	private void removeChildren(Method m, Object repositoryObject) throws Exception {
		RelationAdapter processor = getRelationProcessor(repositoryObject.getClass(), m, context);
		List<Object> children = processor.getListOfRepositoryObjects(repositoryObject);
		for (Object obj : children) {
			removeObject(obj);
		}
	}

	private void processRules() throws Exception {
		@SuppressWarnings("unchecked")
		List<Rule> rules = (List<Rule>) context.get(REMOVE_OBJECTS);
		for (Rule rule : rules) {
			rule.execute();
		}
	}

	private void goDeeper(Method m, Object repositoryObject) throws Exception {
		RelationAdapter processor = getRelationProcessor(repositoryObject.getClass(), m,context);
		List<Object> children = processor.getListOfRepositoryObjects(repositoryObject);
		for (Object obj : children) {
			walker(obj);
		}

	}

	private void disconnect(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk, String detailProperty)
			throws Exception {
		String masterClassName = masterPk.getPath().get(masterPk.getPath().size() - 1).getType();
		String detailClassName = detailPk.getPath().get(0).getType();

		PersistenceProvider pr = findProvider(masterClassName);
		pr.disconnectMasterFromDetail(masterPk, masterProperty, detailPk, detailProperty);

		pr = findProvider(detailClassName);
		pr.disconnectDetailFromMaster(masterPk, masterProperty, detailPk, detailProperty);

	}

	private void updateInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject, String detailProperty)
			throws Exception {
		String masterClassName = masterPk.getPath().get(masterPk.getPath().size() - 1).getType();
		PersistenceProvider pr = findProvider(masterClassName);
		pr.removeInternal(masterPk, masterProperty, detailObject, detailProperty);

	}

	private void disconnect(Method m, Object repositoryObject) throws Exception {
		RepoKeyPath masterPk = findPk(repositoryObject);

		RelationAdapter processor = getRelationProcessor(repositoryObject.getClass(), m, context);
		List<Object> children = processor.getListOfRepositoryObjects(repositoryObject);
		for (Object obj : children) {
			processor.disconnectRepositoryObject(repositoryObject, obj);
			RepoKeyPath detailPk = findPk(obj);
			disconnect(masterPk, processor.getMasterProperty(), detailPk, processor.getDetailProperty());
		}
	}

}
