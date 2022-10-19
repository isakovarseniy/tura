/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Internal;
import org.tura.platform.repository.core.navigation.NavigationRuleTypes;
import org.tura.platform.repository.core.relatioin.ConnectObjectRule;
import org.tura.platform.repository.data.AddContainmentObjectData;
import org.tura.platform.repository.data.AddObjectData;
import org.tura.platform.repository.data.AddTopObjectData;
import org.tura.platform.repository.spa.SpaRepositoryData;

public class RepositoryObjectInstaller extends RepositoryHelper  {

	private static final long serialVersionUID = 8975647016005674754L;
	Map<String, Object> context = new HashMap<>();
	static String ADDED_OBJECTS = "ADDED_OBJECTS";
	private SpaRepositoryData spaRepositoryData;

	
	public RepositoryObjectInstaller(Registry registry,SpaRepositoryData spaRepositoryData){
		super(registry);
		this.spaRepositoryData = spaRepositoryData;
	}
	
	public void add(AddTopObjectData data) throws RepositoryException {
		try {
			Object repositoryObject = data.getObject();
			walker(repositoryObject,null,data.getParams(), findPk(repositoryObject));
			addObject(repositoryObject,data.getParams());
			processRules();

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public void add(AddContainmentObjectData data) throws RepositoryException {

		try {
			Object repositoryObject = data.getObject();
			RepoKeyPath clonedPath = walkerPath(data.getMasterPk(), repositoryObject, data.getDetailProperty(), data.getMasterProperty());
			walker(repositoryObject,data.getDetailProperty(),data.getParams(), clonedPath);

			Annotation annotation = getMasterAnnotation(data.getMasterPk(), data.getMasterProperty());
			if (annotation instanceof Association) {
				RepoKeyPath detailPk = findPk(data.getObject());
				addObject(repositoryObject, data.getParams());
				connect(data.getMasterPk(), data.getMasterProperty(), detailPk, data.getDetailProperty(),data.getParams());
			} else {
				updateInternal(data.getMasterPk(), data.getMasterProperty(), repositoryObject,
						data.getDetailProperty(),data.getParams());
			}

			processRules();

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public void add(AddObjectData data) throws RepositoryException {
		try {
			connect(data.getMasterPk(), data.getMasterProperty(), data.getDetailPk(), data.getDetailProperty(),data.getParams());
			processRules();
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	private void addObject(Object repositoryObject, Map<String,Object> params) throws Exception {
		Repository pr = findProvider(repositoryObject.getClass().getName(),spaRepositoryData);
		CommandProducer cmp = findCommandProducer(repositoryObject.getClass().getName(),params,spaRepositoryData);
		List<Object> commands = cmp.addObject(repositoryObject);
		pr.applyChanges(commands);
	}

	private void walker(Object repositoryObject, String toParentProperty, Map<String,Object> params, RepoKeyPath currentPath) throws Exception {
		Class<?> repositoryClass = repositoryObject.getClass();
		List<Method> methods = getMethodsAnnotatedWith(repositoryClass, Association.class);
		for (Method m : methods) {
			if (toParentProperty != null){
				String methodName= "get"+WordUtils.capitalize(toParentProperty);
				if (methodName.equals(m.getName())){
					continue;
				}
			}
			Association assosiaton = m.getAnnotation(Association.class);
			List<Object> children = getDisconnectedChildren(m, repositoryObject, context);
			if (children !=null && children.size() != 0 ){
				Rule rule = findRule(NavigationRuleTypes.AddObject_ValidateIsObjectContainment.name(), assosiaton, params);
				if (rule.validate(assosiaton, params)) {
					String property = assosiaton.property();
					String toMasterProperty =  WordUtils.uncapitalize( m.getName().substring(3));
					goDeeper(repositoryObject, children,property, toMasterProperty ,params,currentPath);
					addChildren(children,params);
					connect(m, repositoryObject, children,params,currentPath);
				} else {
					connect(m, repositoryObject, children,params,currentPath);
				}
			}
		}
		methods = getMethodsAnnotatedWith(repositoryClass, Internal.class);
		for (Method m : methods) {
			if (toParentProperty != null){
				String methodName= "get"+WordUtils.capitalize(toParentProperty);
				if (methodName.equals(m.getName())){
					continue;
				}
			}
			Internal assosiaton = m.getAnnotation(Internal.class);
			RelationAdapter processor = getRelationProcessor(repositoryObject.getClass(), m, context);
			List<Object> children = processor.getListOfRepositoryObjects(repositoryObject);
			if (children !=null && children.size() != 0 ){
				String property = assosiaton.property();
				String toMasterProperty =  WordUtils.uncapitalize( m.getName().substring(3));
				goDeeper(repositoryObject, children,property, toMasterProperty ,params,currentPath);
			}
		}
	}

	private void addChildren(List<Object> children, Map<String,Object> params) throws Exception {
		for (Object obj : children) {
			addObject(obj,params);
		}
	}

	private void goDeeper(Object repositoryObject, List<Object> children, String toParentProperty, String toMasterProperty , Map<String,Object> params,RepoKeyPath masterPath) throws Exception {
	for (Object obj : children) {
		RepoKeyPath nKeyPath = walkerPath(masterPath, obj, toParentProperty,  toMasterProperty );
		walker(obj,toParentProperty,params,nKeyPath);
		}
	}

	private void updateInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject, String detailProperty, Map<String,Object> params)
			throws Exception {
		String masterClassName = masterPk.getPath().get(masterPk.getPath().size() - 1).getType();
		Repository pr = findProvider(masterClassName,spaRepositoryData);
		CommandProducer cmp = findCommandProducer(masterClassName,params,spaRepositoryData);
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
	private void connect(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk, String detailProperty, Map<String,Object> params)
			throws Exception {

		String masterClassName = masterPk.getPath().get(masterPk.getPath().size() - 1).getType();
		Repository masterProvider = findProvider(masterClassName,spaRepositoryData);
		CommandProducer cmpMaster = findCommandProducer(masterClassName,params,spaRepositoryData);
		
		List<Object> masterChanges = cmpMaster.connectMasterToDetail(masterPk, masterProperty, detailPk,
				detailProperty);

		String detailClassName = detailPk.getPath().get(detailPk.getPath().size() - 1).getType();
		Repository detailProvider = findProvider(detailClassName,spaRepositoryData);
		CommandProducer cmpDetail = findCommandProducer(detailClassName,params,spaRepositoryData);
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

	private void connect(Method m, Object repositoryObject, List<Object> children, Map<String,Object> params, RepoKeyPath masterPk) throws Exception {
		RelationAdapter processor = getRelationProcessor(repositoryObject.getClass(), m, context);
		for (Object obj : children) {
			RepoKeyPath detailPk = findPk(obj);
			connect(masterPk, processor.getMasterProperty(repositoryObject, obj), detailPk,
					processor.getDetailProperty(repositoryObject, obj),params);
		}
	}

}
