package org.tura.platform.repository.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.repository.RepositoryException;
import org.tura.platform.repository.Rule;
import org.tura.platform.repository.core.annotation.Assosiation;
import org.tura.platform.repository.core.relatioin.RemoveObjectRule;
import org.tura.platform.repository.data.RemoveContainmentObjectData;
import org.tura.platform.repository.data.RemoveObjectData;
import org.tura.platform.repository.data.RemoveTopObjectData;
import org.tura.platform.repository.Repository;

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
	private void removeObject(Object repositoryObject) throws Exception {
		
		Repository pr = findProvider(repositoryObject.getClass().getName());
		Mapper mapper = findMapper(repositoryObject.getClass().getName());
		List<Object> commands = mapper.addObject(repositoryObject);
		
		RemoveObjectRule rule = new RemoveObjectRule();
		rule.setProvider(pr);
		rule.setChanges(commands);
		
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
			List<Object> children = getDisconnectedChildren(m, repositoryObject,context);
			Assosiation assosiaton = m.getAnnotation(Assosiation.class);
			if (assosiaton.containment()) {
				goDeeper(repositoryObject, children);
				disconnect(m, repositoryObject,children);
				removeChildren(m, repositoryObject);
			} else {
				disconnect(m, repositoryObject,children);
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

	private void goDeeper(Object repositoryObject,List<Object> children) throws Exception {
		for (Object obj : children) {
			walker(obj);
		}

	}

	private void disconnect(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk, String detailProperty)
			throws Exception {
		
		String masterClassName = masterPk.getPath().get(masterPk.getPath().size() - 1).getType();
		Repository masterProvider = findProvider(masterClassName);
		Mapper mapperMaster = findMapper(masterClassName);
		List<Object> masterChanges = mapperMaster.disconnectMasterFromDetail(masterPk, masterProperty, detailPk, detailProperty);
		
		String detailClassName = detailPk.getPath().get(detailPk.getPath().size() - 1).getType();
		Repository detailProvider = findProvider(detailClassName);
		Mapper mapperDetail = findMapper(detailClassName);
		List<Object> detailChanges = mapperDetail.disconnectDetailFromMaster(masterPk, masterProperty, detailPk, detailProperty);
		
		
		masterProvider.applyChanges(masterChanges);
		detailProvider.applyChanges(detailChanges);

	}

	private void updateInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject, String detailProperty)
			throws Exception {
		String masterClassName = masterPk.getPath().get(masterPk.getPath().size() - 1).getType();
		Repository pr = findProvider(masterClassName);
		Mapper mapper = findMapper(masterClassName);
		List<Object> commands = mapper.removeInternal(masterPk, masterProperty, detailObject, detailProperty);
		pr.applyChanges(commands);

	}

	private void disconnect(Method m, Object repositoryObject,List<Object> children) throws Exception {
		RepoKeyPath masterPk = findPk(repositoryObject);
		RelationAdapter processor = getRelationProcessor(repositoryObject.getClass(), m, context);
		for (Object obj : children) {
			processor.disconnectRepositoryObject(repositoryObject, obj);
			RepoKeyPath detailPk = findPk(obj);
			disconnect(masterPk, processor.getMasterProperty(repositoryObject, obj), detailPk, processor.getDetailProperty(repositoryObject, obj));
		}
	}

}

