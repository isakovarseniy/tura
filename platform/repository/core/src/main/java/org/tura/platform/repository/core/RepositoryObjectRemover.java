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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.repository.core.annotation.Association;
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
			walker(repositoryObject,null);
			removeObject(repositoryObject);
			processRules();

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public void remove(RemoveContainmentObjectData data) throws RepositoryException {
		try {
			Object repositoryObject = data.getObject();
			walker(repositoryObject,null);

			Annotation annotation = getMasterAnnotation(data.getMasterPk(), data.getMasterProperty());
			if (annotation instanceof Association) {
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
		CommandProducer cmp = findCommandProducer(repositoryObject.getClass().getName());
		List<Object> commands = cmp.removeObject(repositoryObject);

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

	private void walker(Object repositoryObject, String parentProperty) throws Exception {
		Class<?> repositoryClass = repositoryObject.getClass();
		List<Method> methods = getMethodsAnnotatedWith(repositoryClass, Association.class);
		for (Method m : methods) {
			if (parentProperty != null){
				String methodName= "get"+WordUtils.capitalize(parentProperty);
				if (methodName.equals(m.getName())){
					continue;
				}
			}
			List<Object> children = getDisconnectedChildren(m, repositoryObject, context);
			Association assosiaton = m.getAnnotation(Association.class);
			if (assosiaton.containment()) {
				String property = assosiaton.property();
				goDeeper(repositoryObject, children, property);
				disconnect(m, repositoryObject, children);
				removeChildren(children);
			} else {
				disconnect(m, repositoryObject, children);
			}
		}

	}

	private void removeChildren(List<Object> children ) throws Exception {
		for (Object obj : children) {
			removeObject(obj);
		}
	}

	private void processRules() throws Exception {
		@SuppressWarnings("unchecked")
		List<Rule> rules = (List<Rule>) context.get(REMOVE_OBJECTS);
		if (rules != null) {
			for (Rule rule : rules) {
				rule.execute();
			}
		}
	}

	private void goDeeper(Object repositoryObject, List<Object> children, String parentProperty) throws Exception {
		for (Object obj : children) {
			walker(obj,parentProperty);
		}

	}

	private void disconnect(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk, String detailProperty)
			throws Exception {

		String masterClassName = masterPk.getPath().get(masterPk.getPath().size() - 1).getType();
		Repository masterProvider = findProvider(masterClassName);
		CommandProducer cmpMaster = findCommandProducer(masterClassName);
		List<Object> masterChanges = cmpMaster.disconnectMasterFromDetail(masterPk, masterProperty, detailPk,
				detailProperty);

		String detailClassName = detailPk.getPath().get(detailPk.getPath().size() - 1).getType();
		Repository detailProvider = findProvider(detailClassName);
		CommandProducer cmpDetail = findCommandProducer(masterClassName);
		List<Object> detailChanges = cmpDetail.disconnectDetailFromMaster(masterPk, masterProperty, detailPk,
				detailProperty);

		masterProvider.applyChanges(masterChanges);
		detailProvider.applyChanges(detailChanges);

	}

	private void updateInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject, String detailProperty)
			throws Exception {
		String masterClassName = masterPk.getPath().get(masterPk.getPath().size() - 1).getType();
		Repository pr = findProvider(masterClassName);
		CommandProducer cmp = findCommandProducer(masterClassName);

		List<Object> commands = cmp.removeInternal(masterPk, masterProperty, detailObject, detailProperty);
		pr.applyChanges(commands);

	}

	private void disconnect(Method m, Object repositoryObject, List<Object> children) throws Exception {
		RepoKeyPath masterPk = findPk(repositoryObject);
		RelationAdapter processor = getRelationProcessor(repositoryObject.getClass(), m, context);
		for (Object obj : children) {
			processor.disconnectRepositoryObject(repositoryObject, obj);
			RepoKeyPath detailPk = findPk(obj);
			disconnect(masterPk, processor.getMasterProperty(repositoryObject, obj), detailPk,
					processor.getDetailProperty(repositoryObject, obj));
		}
	}

}
