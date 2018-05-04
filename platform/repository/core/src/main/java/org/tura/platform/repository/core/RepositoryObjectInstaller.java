package org.tura.platform.repository.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.repository.core.annotation.Assosiation;
import org.tura.platform.repository.core.relatioin.ConnectObjectRule;
import org.tura.platform.repository.data.AddContainmentObjectData;
import org.tura.platform.repository.data.AddObjectData;
import org.tura.platform.repository.data.AddTopObjectData;

public class RepositoryObjectInstaller extends RepositoryHelper {

	Map<String, Object> context = new HashMap<>();
	static String ADDED_OBJECTS = "ADDED_OBJECTS";

	public void add(AddTopObjectData data) throws RepositoryException {
		try {
			Object repositoryObject = data.getObject();
			walker(repositoryObject);
			addObject(repositoryObject);
			processRules();

		} catch (Exception e) {
			throw new RepositoryException(e);
		}

	}

	public void add(AddContainmentObjectData data) throws RepositoryException {

		try {
			Object repositoryObject = data.getObject();
			walker(repositoryObject);

			Annotation annotation = getMasterAnnotation(data.getMasterPk(), data.getMasterProperty());
			if (annotation instanceof Assosiation) {
				RepoKeyPath detailPk = findPk(data.getObject());
				addObject(repositoryObject);
				connect(data.getMasterPk(), data.getMasterProperty(), detailPk, data.getDetailProperty());
			} else {
				updateInternal(data.getMasterPk(), data.getMasterProperty(), repositoryObject,
						data.getDetailProperty());
			}

			processRules();

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public void add(AddObjectData data) throws RepositoryException {
		try {
			connect(data.getMasterPk(), data.getMasterProperty(), data.getDetailPk(), data.getDetailProperty());
			processRules();
		} catch (Exception e) {
			throw new RepositoryException(e);
		}

	}

	private void addObject(Object repositoryObject) throws Exception {
		PersistenceProvider pr = findProvider(repositoryObject.getClass().getName());
		pr.persist(repositoryObject);
	}

	private void walker(Object repositoryObject) throws Exception {
		Class<?> repositoryClass = repositoryObject.getClass();
		List<Method> methods = RepositoryObjectLoader.getMethodsAnnotatedWith(repositoryClass, Assosiation.class);
		for (Method m : methods) {
			Assosiation assosiaton = m.getAnnotation(Assosiation.class);
			List<Object> children = getDisconnectedChildren(m, repositoryObject,context);
			if (assosiaton.containment()) {
				goDeeper(repositoryObject,children);
				addChildren(children);
				connect(m, repositoryObject,children);
			} else {
				connect(m, repositoryObject, children);
			}
		}

	}

	private void addChildren(List<Object> children) throws Exception {
		for (Object obj : children) {
			addObject(obj);
		}
	}

	private void goDeeper(Object repositoryObject,List<Object> children) throws Exception {
		for (Object obj : children) {
			walker(obj);
		}

	}

	private void updateInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject, String detailProperty)
			throws Exception {
		String masterClassName = masterPk.getPath().get(masterPk.getPath().size() - 1).getType();
		PersistenceProvider pr = findProvider(masterClassName);
		pr.addInternal(masterPk, masterProperty, detailObject, detailProperty);

	}

	private void processRules() throws Exception {
		@SuppressWarnings("unchecked")
		List<Rule> rules = (List<Rule>) context.get(ADDED_OBJECTS);
		for (Rule rule : rules) {
			rule.execute();
		}
	}

	@SuppressWarnings("unchecked")
	private void connect(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk, String detailProperty)
			throws Exception {
		ConnectObjectRule rule = new ConnectObjectRule();
		rule.setMasterPk(masterPk);
		rule.setDetailPk(detailPk);
		rule.setMasterProperty(masterProperty);
		rule.setDetailProperty(detailProperty);

		List<Object> addObjects = (List<Object>) context.get(ADDED_OBJECTS);
		if (addObjects == null) {
			addObjects = new ArrayList<>();
			context.put(ADDED_OBJECTS, addObjects);
		}
		addObjects.add(rule);

	}
	

	private void connect(Method m, Object repositoryObject, List<Object> children) throws Exception {
		RepoKeyPath masterPk = findPk(repositoryObject);
		RelationAdapter processor = getRelationProcessor(repositoryObject.getClass(), m, context);
		for (Object obj : children) {
			RepoKeyPath detailPk = findPk(obj);
			connect(masterPk, processor.getMasterProperty(repositoryObject, obj), detailPk, processor.getDetailProperty(repositoryObject, obj));
		}
	}

}

