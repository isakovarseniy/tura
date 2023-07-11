/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import org.tura.platform.repository.core.relatioin.RemoveObjectRule;
import org.tura.platform.repository.data.RemoveContainmentObjectData;
import org.tura.platform.repository.data.RemoveObjectData;
import org.tura.platform.repository.data.RemoveTopObjectData;
import org.tura.platform.repository.spa.SpaRepositoryData;

public class RepositoryObjectRemover extends RepositoryHelper {

	private static final long serialVersionUID = -59428866163188688L;
	Map<String, Object> context = new HashMap<>();
	static String REMOVE_OBJECTS = "REMOVE_OBJECTS";
	private SpaRepositoryData spaRepositoryData;
	
	public RepositoryObjectRemover(Registry registry,SpaRepositoryData spaRepositoryData){
		super(registry);
		this.spaRepositoryData = spaRepositoryData;
	}

	public void remove(RemoveTopObjectData data) throws RepositoryException {
		try {
			Object repositoryObject = data.getObject();
			walker(repositoryObject,null,data.getParams(), findPk(repositoryObject));
			removeObject(repositoryObject,data.getParams());
			processRules();

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public void remove(RemoveContainmentObjectData data) throws RepositoryException {
		try {
			Object repositoryObject = data.getObject();
			RepoKeyPath clonedPath = walkerPath(data.getMasterPk(), repositoryObject, data.getDetailProperty(), data.getMasterProperty());
			walker(repositoryObject,data.getDetailProperty(),data.getParams(), clonedPath);

			Annotation annotation = getMasterAnnotation(data.getMasterPk(), data.getMasterProperty());
			if (annotation instanceof Association) {
				RepoKeyPath detailPk = findPk(data.getObject());
				disconnect(data.getMasterPk(), data.getMasterProperty(), detailPk, data.getDetailProperty(),data.getParams());
				removeObject(repositoryObject,data.getParams());
			} else {
				updateInternal(data.getMasterPk(), data.getMasterProperty(), repositoryObject,
						data.getDetailProperty(),data.getParams());
			}

			processRules();

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public void remove(RemoveObjectData data) throws RepositoryException {
		try {
			disconnect(data.getMasterPk(), data.getMasterProperty(), data.getDetailPk(), data.getDetailProperty(),data.getParams());
			processRules();
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@SuppressWarnings("unchecked")
	private void removeObject(Object repositoryObject, Map<String,Object> params) throws Exception {

		Repository pr = findProvider(repositoryObject.getClass().getName(),spaRepositoryData);
		CommandProducer cmp = findCommandProducer(repositoryObject.getClass().getName(),params,spaRepositoryData);
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
			List<Object> children = getDisconnectedChildren(m, repositoryObject, context);
			Association assosiaton = m.getAnnotation(Association.class);
			if (children !=null && children.size() != 0 ){
				if (assosiaton.containment()) {
					String property = assosiaton.property();
					String toMasterProperty =  WordUtils.uncapitalize( m.getName().substring(3));
					goDeeper(repositoryObject, children,property, toMasterProperty ,params,currentPath);
					removeChildren(children,params);
					disconnect(m, repositoryObject, children,params,currentPath);
				} else {
					disconnect(m, repositoryObject, children,params,currentPath);
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

	private void removeChildren(List<Object> children , Map<String,Object> params) throws Exception {
		for (Object obj : children) {
			removeObject(obj,params);
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

	private void goDeeper(Object repositoryObject, List<Object> children, String toParentProperty, String toMasterProperty , Map<String,Object> params,RepoKeyPath masterPath) throws Exception {
		for (Object obj : children) {
			RepoKeyPath nKeyPath = walkerPath(masterPath, obj, toParentProperty,  toMasterProperty );
			walker(obj,toParentProperty,params,nKeyPath);
		}

	}

	private void disconnect(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk, String detailProperty, Map<String,Object> params)
			throws Exception {

		String masterClassName = masterPk.getPath().get(masterPk.getPath().size() - 1).getType();
		Repository masterProvider = findProvider(masterClassName,spaRepositoryData);
		CommandProducer cmpMaster = findCommandProducer(masterClassName,params,spaRepositoryData);

		String detailClassName = detailPk.getPath().get(detailPk.getPath().size() - 1).getType();
		Repository detailProvider = findProvider(detailClassName,spaRepositoryData);
		CommandProducer cmpDetail = findCommandProducer(detailClassName,params,spaRepositoryData);

		cmpMaster.setMasterProvider(masterProvider);
		cmpMaster.setDetailProvider(detailProvider);
		
		cmpDetail.setMasterProvider(masterProvider);
		cmpDetail.setDetailProvider(detailProvider);

		
		List<Object> masterChanges = cmpMaster.disconnectMasterFromDetail(masterPk, masterProperty, detailPk,
				detailProperty);

		List<Object> detailChanges = cmpDetail.disconnectDetailFromMaster(masterPk, masterProperty, detailPk,
				detailProperty);

		masterProvider.applyChanges(masterChanges);
		detailProvider.applyChanges(detailChanges);

	}

	private void updateInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject, String detailProperty, Map<String,Object> params)
			throws Exception {
		String masterClassName = masterPk.getPath().get(masterPk.getPath().size() - 1).getType();
		Repository pr = findProvider(masterClassName,spaRepositoryData);
		CommandProducer cmp = findCommandProducer(masterClassName,params,spaRepositoryData);

		List<Object> commands = cmp.removeInternal(masterPk, masterProperty, detailObject, detailProperty);
		pr.applyChanges(commands);

	}

	private void disconnect(Method m, Object repositoryObject, List<Object> children, Map<String,Object> params , RepoKeyPath masterPk) throws Exception {
		RelationAdapter processor = getRelationProcessor(repositoryObject.getClass(), m, context);
		for (Object obj : children) {
			processor.disconnectRepositoryObject(repositoryObject, obj);
			RepoKeyPath detailPk = findPk(obj);
			disconnect(masterPk, processor.getMasterProperty(repositoryObject, obj), detailPk,
					processor.getDetailProperty(repositoryObject, obj),params);
		}
	}
	
}
