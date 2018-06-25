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
import org.tura.platform.repository.core.relatioin.ConnectObjectRule;
import org.tura.platform.repository.data.AddContainmentObjectData;
import org.tura.platform.repository.data.AddObjectData;
import org.tura.platform.repository.data.AddTopObjectData;

public class RepositoryObjectInstaller extends RepositoryHelper {

	Map<String, Object> context = new HashMap<>();
	static String ADDED_OBJECTS = "ADDED_OBJECTS";

	
	public RepositoryObjectInstaller(Registry registry){
		super(registry);
	}
	
	public void add(AddTopObjectData data) throws RepositoryException {
		try {
			Object repositoryObject = data.getObject();
			walker(repositoryObject,null);
			addObject(repositoryObject);
			processRules();

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public void add(AddContainmentObjectData data) throws RepositoryException {

		try {
			Object repositoryObject = data.getObject();
			walker(repositoryObject,null);

			Annotation annotation = getMasterAnnotation(data.getMasterPk(), data.getMasterProperty());
			if (annotation instanceof Association) {
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
		Repository pr = findProvider(repositoryObject.getClass().getName());
		CommandProducer cmp = findCommandProducer(repositoryObject.getClass().getName());
		List<Object> commands = cmp.addObject(repositoryObject);
		pr.applyChanges(commands);
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
			Association assosiaton = m.getAnnotation(Association.class);
			List<Object> children = getDisconnectedChildren(m, repositoryObject, context);
			if (children !=null && children.size() != 0 ){
				if (assosiaton.containment()) {
					String property = assosiaton.property();
					goDeeper(repositoryObject, children,property);
					addChildren(children);
					connect(m, repositoryObject, children);
				} else {
					connect(m, repositoryObject, children);
				}
			}
		}
	}

	private void addChildren(List<Object> children) throws Exception {
		for (Object obj : children) {
			addObject(obj);
		}
	}

	private void goDeeper(Object repositoryObject, List<Object> children, String parentProperty) throws Exception {
		for (Object obj : children) {
			walker(obj,parentProperty);
		}
	}

	private void updateInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject, String detailProperty)
			throws Exception {
		String masterClassName = masterPk.getPath().get(masterPk.getPath().size() - 1).getType();
		Repository pr = findProvider(masterClassName);
		CommandProducer cmp = findCommandProducer(masterClassName);
		List<Object> commands = cmp.addInternal(masterPk, masterProperty, detailObject, detailProperty);
		pr.applyChanges(commands);
	}

	private void processRules() throws Exception {
		@SuppressWarnings("unchecked")
		List<Rule> rules = (List<Rule>) context.get(ADDED_OBJECTS);
		if (rules != null) {
			for (Rule rule : rules) {
				rule.execute();
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void connect(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk, String detailProperty)
			throws Exception {

		String masterClassName = masterPk.getPath().get(masterPk.getPath().size() - 1).getType();
		Repository masterProvider = findProvider(masterClassName);
		CommandProducer cmpMaster = findCommandProducer(masterClassName);
		
		List<Object> masterChanges = cmpMaster.connectMasterToDetail(masterPk, masterProperty, detailPk,
				detailProperty);

		String detailClassName = detailPk.getPath().get(detailPk.getPath().size() - 1).getType();
		Repository detailProvider = findProvider(detailClassName);
		CommandProducer cmpDetail = findCommandProducer(detailClassName);
		List<Object> detailChanges = cmpDetail.connectDetailToMaster(masterPk, masterProperty, detailPk,
				detailProperty);

		cmpMaster.setMasterProvider(masterProvider);
		cmpMaster.setDetailProvider(detailProvider);
		
		cmpDetail.setMasterProvider(masterProvider);
		cmpDetail.setDetailProvider(detailProvider);

		
		ConnectObjectRule rule = new ConnectObjectRule(registry);
		rule.setMasterChanges(masterChanges);
		rule.setMasterProvider(masterProvider);
		rule.setDetailChanges(detailChanges);
		rule.setDetailProvider(detailProvider);

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
			connect(masterPk, processor.getMasterProperty(repositoryObject, obj), detailPk,
					processor.getDetailProperty(repositoryObject, obj));
		}
	}

}
