/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
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
 ******************************************************************************/
package org.elsoft.platform.datacontrol;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.elsoft.platform.OrderCriteria;
import org.elsoft.platform.OrderType;
import org.elsoft.platform.Reflection;
import org.elsoft.platform.datacontrol.DCMetaInfo;
import org.elsoft.platform.datacontrol.DCMetaInfoLevel;
import org.elsoft.platform.datacontrol.ELResolver;
import org.elsoft.platform.datacontrol.annotations.ArtificialProperties;
import org.elsoft.platform.datacontrol.annotations.Base;
import org.elsoft.platform.datacontrol.annotations.CreateTrigger;
import org.elsoft.platform.datacontrol.annotations.DefaultOrderBys;
import org.elsoft.platform.datacontrol.annotations.DefaultSearchCriterias;
import org.elsoft.platform.datacontrol.annotations.Dependencies;
import org.elsoft.platform.datacontrol.annotations.IdField;
import org.elsoft.platform.datacontrol.annotations.InsertTrigger;
import org.elsoft.platform.datacontrol.annotations.POSTCreateTrigger;
import org.elsoft.platform.datacontrol.annotations.POSTQueryTrigger;
import org.elsoft.platform.datacontrol.annotations.PREInsertTrigger;
import org.elsoft.platform.datacontrol.annotations.PREQueryTrigger;
import org.elsoft.platform.datacontrol.annotations.Proxy;
import org.elsoft.platform.datacontrol.annotations.RemoveTrigger;
import org.elsoft.platform.datacontrol.annotations.SearchTrigger;
import org.elsoft.platform.datacontrol.annotations.TriggerOutput;
import org.elsoft.platform.datacontrol.annotations.UpdateTrigger;
import org.elsoft.platform.datacontrol.annotations.VersionField;
import org.elsoft.platform.datacontrol.extender.ModeExtender;
import org.elsoft.platform.datacontrol.ins.InsModeDataControl;
import org.elsoft.platform.datacontrol.metainfo.FunctionResult;
import org.elsoft.platform.datacontrol.metainfo.RemoteMethod;
import org.elsoft.platform.datacontrol.metainfo.Trigger;
import org.elsoft.platform.datacontrol.qry.QryModeDataControl;

public class FactoryDataControl {
	private static String VERSION = "VERSION@ARSENIY@EMMANUEL@VERSION";
	private static String ID = "ID@ARSENIY@EMMANUEL@ID";
	private static String FUNCTIONRESULT = "FUNCTIONRESULT@ARSENIY@EMMANUEL@FUNCTIONRESULT";
	private static String ROOTOBJECTRESULT = "ROOTOBJECTRESULT@ARSENIY@EMMANUEL@ROOTOBJECTRESULT";
	private static String CREATETRIGGER = "CREATETRIGGER@ARSENIY@EMMANUEL@CREATETRIGGER";
	private static String UPDATETRIGGER = "UPDATETRIGGER@ARSENIY@EMMANUEL@UPDATETRIGGER";
	private static String INSERTTRIGGER = "INSERTTRIGGER@ARSENIY@EMMANUEL@INSERTTRIGGER";
	private static String REMOVETRIGGER = "REMOVETRIGGER@ARSENIY@EMMANUEL@REMOVETRIGGER";
	private static String SEARCHTRIGGER = "SEARCHTRIGGER@ARSENIY@EMMANUEL@SEARCHTRIGGER";
	private static String POSTCREATETRIGGER = "POSTCREATETRIGGER@ARSENIY@EMMANUEL@POSTCREATETRIGGER";
	private static String POSTQUERYTRIGGER = "POSTQUERYTRIGGER@ARSENIY@EMMANUEL@POSTCREATETRIGGER";
	private static String PREQUERYTRIGGER = "PREQUERYTRIGGER@ARSENIY@EMMANUEL@POSTCREATETRIGGER";
	private static String PREINSERTTRIGGER = "PREINSERTTRIGGER@ARSENIY@EMMANUEL@POSTCREATETRIGGER";

	private ELResolver elResolver;
	private StructureControl structureControl;
	private RootModeSwitch root;

	public Object instantiateClass(Class<?> clazz) throws Exception {
		return clazz.newInstance();
	}

	private HashMap<String, Object> scanClass(Object obj) throws Exception {
		Field[] fields = obj.getClass().getDeclaredFields();
		HashMap<String, Object> map = new HashMap<String, Object>();

		for (int i = 0; i < fields.length; i++) {
			if (fields[i].isAnnotationPresent(Proxy.class)) {
				Proxy proxyAnnotation = fields[i].getAnnotation(Proxy.class);
				Method method = obj.getClass().getMethod(
						"get" + StringUtils.capitalize(fields[i].getName()));
				Object proxyObject = method.invoke(obj);
				map.put(proxyAnnotation.name(), proxyObject);
			}
			if (fields[i].isAnnotationPresent(CreateTrigger.class)) {
				CreateTrigger rootResult = fields[i]
						.getAnnotation(CreateTrigger.class);
				map.put(CREATETRIGGER, rootResult);
			}

			if (fields[i].isAnnotationPresent(UpdateTrigger.class)) {
				UpdateTrigger rootResult = fields[i]
						.getAnnotation(UpdateTrigger.class);
				map.put(UPDATETRIGGER, rootResult);
			}

			if (fields[i].isAnnotationPresent(RemoveTrigger.class)) {
				RemoveTrigger rootResult = fields[i]
						.getAnnotation(RemoveTrigger.class);
				map.put(REMOVETRIGGER, rootResult);
			}

			if (fields[i].isAnnotationPresent(SearchTrigger.class)) {
				SearchTrigger rootResult = fields[i]
						.getAnnotation(SearchTrigger.class);
				map.put(SEARCHTRIGGER, rootResult);
			}

			if (fields[i].isAnnotationPresent(InsertTrigger.class)) {
				InsertTrigger rootResult = fields[i]
						.getAnnotation(InsertTrigger.class);
				map.put(INSERTTRIGGER, rootResult);
			}

			if (fields[i].isAnnotationPresent(POSTCreateTrigger.class)) {
				POSTCreateTrigger rootResult = fields[i]
						.getAnnotation(POSTCreateTrigger.class);
				map.put(POSTCREATETRIGGER, rootResult);
			}

			if (fields[i].isAnnotationPresent(POSTQueryTrigger.class)) {
				POSTQueryTrigger rootResult = fields[i]
						.getAnnotation(POSTQueryTrigger.class);
				map.put(POSTQUERYTRIGGER, rootResult);
			}

			if (fields[i].isAnnotationPresent(PREQueryTrigger.class)) {
				PREQueryTrigger rootResult = fields[i]
						.getAnnotation(PREQueryTrigger.class);
				map.put(PREQUERYTRIGGER, rootResult);
			}

			if (fields[i].isAnnotationPresent(PREInsertTrigger.class)) {
				PREInsertTrigger rootResult = fields[i]
						.getAnnotation(PREInsertTrigger.class);
				map.put(PREINSERTTRIGGER, rootResult);
			}
		}

		Annotation[] annotations = obj.getClass().getAnnotations();
		for (int i = 0; i < annotations.length; i++) {
			if (annotations[i] instanceof VersionField) {
				VersionField versionAnnotation = (VersionField) annotations[i];
				map.put(VERSION, versionAnnotation.field());
			}
			if (annotations[i] instanceof IdField) {
				IdField idAnnotation = (IdField) annotations[i];
				map.put(ID, idAnnotation.field());
			}
			if (annotations[i] instanceof TriggerOutput) {
				TriggerOutput functionResult = (TriggerOutput) annotations[i];
				map.put(FUNCTIONRESULT, functionResult.expression());
			}

			if (annotations[i] instanceof Base) {
				Base rootResult = (Base) annotations[i];
				map.put(ROOTOBJECTRESULT, rootResult.clazz());
			}

		}

		return map;
	}

	public Object newRootInstance(Class<?> clazz) throws Exception {
		Object bean = newInstance(clazz);
		ModeExtender w = (ModeExtender) Reflection.call(bean, "getWrapper");
		w.getMode().setRoot(root);
		w.getMode().setExtender(bean);
		return bean;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Object newInstance(final Class<?> clazz) throws Exception {
		Mode<?> mode = null;

		Object obj = instantiateClass(clazz);
		HashMap<String, Object> map = scanClass(obj);

		mode = new Mode();
		mode.setAnnotatedObject(clazz.getCanonicalName());
		mode.setElResolver(this.elResolver);
		mode.setStControl(this.structureControl);
		mode.setRootClass((Class<?>) map.get(ROOTOBJECTRESULT));

		FunctionResult fr = new FunctionResult();
		fr.setResultExpression((String) map.get(FUNCTIONRESULT));
		this.structureControl.setAnnotation(clazz.getCanonicalName(),
				DCMetaInfoLevel.Class, clazz.getCanonicalName(),
				DCMetaInfo.FunctionResult, fr);

		// CreateTrigger
		CreateTrigger createTrigger = (CreateTrigger) map.get(CREATETRIGGER);
		RemoteMethod createMethod = new RemoteMethod();
		createMethod.setMethod(createTrigger.objectAction());
		createMethod.setProxyObject(map.get(createTrigger.object()));
		for (int j = 0; j < createTrigger.parameters().value().length; j++) {

			createMethod.addParamClass(createTrigger.parameters().value()[j]
					.type());
			createMethod.addExpression(createTrigger.parameters().value()[j]
					.expression());
			createMethod
					.addValue(createTrigger.parameters().value()[j].value());
		}
		this.structureControl.setAnnotation(clazz.getCanonicalName(),
				DCMetaInfoLevel.Class, clazz.getCanonicalName(),
				DCMetaInfo.CreateTrigger, createMethod);

		// InsertTrigger
		InsertTrigger insertTrigger = (InsertTrigger) map.get(INSERTTRIGGER);
		RemoteMethod insertMethod = new RemoteMethod();
		insertMethod.setMethod(insertTrigger.objectAction());
		insertMethod.setProxyObject(map.get(insertTrigger.object()));
		for (int j = 0; j < insertTrigger.parameters().value().length; j++) {

			insertMethod.addParamClass(insertTrigger.parameters().value()[j]
					.type());
			insertMethod.addExpression(insertTrigger.parameters().value()[j]
					.expression());
			insertMethod
					.addValue(insertTrigger.parameters().value()[j].value());
		}
		this.structureControl.setAnnotation(clazz.getCanonicalName(),
				DCMetaInfoLevel.Class, clazz.getCanonicalName(),
				DCMetaInfo.InsertTrigger, insertMethod);

		// UpdateTrigger
		UpdateTrigger updateTrigger = (UpdateTrigger) map.get(UPDATETRIGGER);
		RemoteMethod updateMethod = new RemoteMethod();
		updateMethod.setMethod(updateTrigger.objectAction());
		updateMethod.setProxyObject(map.get(updateTrigger.object()));
		for (int j = 0; j < updateTrigger.parameters().value().length; j++) {

			updateMethod.addParamClass(updateTrigger.parameters().value()[j]
					.type());
			updateMethod.addExpression(updateTrigger.parameters().value()[j]
					.expression());
			updateMethod
					.addValue(updateTrigger.parameters().value()[j].value());
		}
		this.structureControl.setAnnotation(clazz.getCanonicalName(),
				DCMetaInfoLevel.Class, clazz.getCanonicalName(),
				DCMetaInfo.UpdateTrigger, updateMethod);

		// RemoveTrigger
		RemoveTrigger removeTrigger = (RemoveTrigger) map.get(REMOVETRIGGER);
		RemoteMethod removeMethod = new RemoteMethod();
		removeMethod.setMethod(removeTrigger.objectAction());
		removeMethod.setProxyObject(map.get(removeTrigger.object()));
		for (int j = 0; j < removeTrigger.parameters().value().length; j++) {

			removeMethod.addParamClass(removeTrigger.parameters().value()[j]
					.type());
			removeMethod.addExpression(removeTrigger.parameters().value()[j]
					.expression());
			removeMethod
					.addValue(removeTrigger.parameters().value()[j].value());
		}
		this.structureControl.setAnnotation(clazz.getCanonicalName(),
				DCMetaInfoLevel.Class, clazz.getCanonicalName(),
				DCMetaInfo.RemoveTrigger, removeMethod);

		// SearchTrigger
		SearchTrigger searchTrigger = (SearchTrigger) map.get(SEARCHTRIGGER);
		RemoteMethod searchMethod = new RemoteMethod();
		searchMethod.setMethod(searchTrigger.objectAction());
		searchMethod.setProxyObject(map.get(searchTrigger.object()));
		for (int j = 0; j < searchTrigger.parameters().value().length; j++) {

			searchMethod.addParamClass(searchTrigger.parameters().value()[j]
					.type());
			searchMethod.addExpression(searchTrigger.parameters().value()[j]
					.expression());
			searchMethod
					.addValue(searchTrigger.parameters().value()[j].value());
		}
		this.structureControl.setAnnotation(clazz.getCanonicalName(),
				DCMetaInfoLevel.Class, clazz.getCanonicalName(),
				DCMetaInfo.SearchTrigger, searchMethod);

		POSTCreateTrigger postCreateTrigger = (POSTCreateTrigger) map
				.get(POSTCREATETRIGGER);
		if (postCreateTrigger != null) {
			Trigger trigger = new Trigger(postCreateTrigger.clazz(),
					postCreateTrigger.method());
			this.structureControl.setAnnotation(clazz.getCanonicalName(),
					DCMetaInfoLevel.Class, clazz.getCanonicalName(),
					DCMetaInfo.POSTCreateTrigger, trigger);
		}

		POSTQueryTrigger postQueryTrigger = (POSTQueryTrigger) map
				.get(POSTQUERYTRIGGER);
		if (postQueryTrigger != null) {
			Trigger trigger = new Trigger(postQueryTrigger.clazz(),
					postQueryTrigger.method());
			this.structureControl.setAnnotation(clazz.getCanonicalName(),
					DCMetaInfoLevel.Class, clazz.getCanonicalName(),
					DCMetaInfo.POSTQueryTrigger, trigger);
		}


		PREQueryTrigger preQueryTrigger = (PREQueryTrigger) map
				.get(PREQUERYTRIGGER);
		if (preQueryTrigger != null) {
			Trigger trigger = new Trigger(preQueryTrigger.clazz(),
					preQueryTrigger.method());
			this.structureControl.setAnnotation(clazz.getCanonicalName(),
					DCMetaInfoLevel.Class, clazz.getCanonicalName(),
					DCMetaInfo.PREQueryTrigger, trigger);
		}

		PREInsertTrigger preInsertTrigger = (PREInsertTrigger) map
				.get(PREINSERTTRIGGER);
		if (preInsertTrigger != null) {
			Trigger trigger = new Trigger(preInsertTrigger.clazz(),
					preInsertTrigger.method());
			this.structureControl.setAnnotation(clazz.getCanonicalName(),
					DCMetaInfoLevel.Class, clazz.getCanonicalName(),
					DCMetaInfo.PREInsertTrigger, trigger);
		}

		DefaultOrderBys defaultOrderBys = clazz
				.getAnnotation(DefaultOrderBys.class);

		ArrayList<OrderCriteria> ordLst = new ArrayList<OrderCriteria>();
		if ((defaultOrderBys != null) && (defaultOrderBys.orders() != null)
				&& (defaultOrderBys.orders().length != 0)) {
			for (int i = 0; i < defaultOrderBys.orders().length; i++) {
				OrderCriteria ord = new OrderCriteria();
				ord.setName(defaultOrderBys.orders()[i].field());
				ord.setOrder(defaultOrderBys.orders()[i].type().name());
				ordLst.add(ord);
			}
		} else {
			OrderCriteria ord = new OrderCriteria();
			ord.setName((String) map.get(ID));
			ord.setOrder(OrderType.ASC.name());
			ordLst.add(ord);
		}
		mode.setDefaultOrderby(ordLst);

		DefaultSearchCriterias defaultSearchCriteria = clazz
				.getAnnotation(DefaultSearchCriterias.class);

		if (defaultSearchCriteria != null) {
			ArrayList<org.elsoft.platform.datacontrol.metainfo.DefaultSearchCriteria> schLst = new ArrayList<org.elsoft.platform.datacontrol.metainfo.DefaultSearchCriteria>();
			HashMap<String, Object> dependList = new HashMap<String, Object>();
			for (int i = 0; i < defaultSearchCriteria.criterias().length; i++) {
				org.elsoft.platform.datacontrol.metainfo.DefaultSearchCriteria sch = new org.elsoft.platform.datacontrol.metainfo.DefaultSearchCriteria();
				sch.setName(defaultSearchCriteria.criterias()[i].field());
				sch.setClassName(defaultSearchCriteria.criterias()[i].type()
						.getName());
				sch.setComparator(defaultSearchCriteria.criterias()[i]
						.comparator().name());
				if ((defaultSearchCriteria.criterias()[i].expression() != null)
						&& (!defaultSearchCriteria.criterias()[i].expression()
								.equals(""))) {
					dependList.put(
							defaultSearchCriteria.criterias()[i].expression(),
							"");
				}
				sch.setExpression(defaultSearchCriteria.criterias()[i]
						.expression());
				sch.setValue(defaultSearchCriteria.criterias()[i].value());
				schLst.add(sch);
			}
			mode.setDefaultFilter(schLst);
			mode.setDependency(dependList);
		}

		Dependencies dependencies = clazz.getAnnotation(Dependencies.class);
		if (dependencies != null) {
			mode.getDependency();
			HashMap<String, Object> dependList = mode.getDependency();
			if (dependList == null) {
				dependList = new HashMap<String, Object>();
				mode.setDependency(dependList);
			}
			for (int i = 0; i < dependencies.dependency().length; i++) {
				dependList.put(dependencies.dependency()[i].expression(), "");
			}
		}

		ArtificialProperties artificialProperties = clazz
				.getAnnotation(ArtificialProperties.class);

		if (artificialProperties != null) {
			for (int i = 0; i < artificialProperties.fields().length; i++) {
				org.elsoft.platform.datacontrol.metainfo.ArtificialProperty art = new org.elsoft.platform.datacontrol.metainfo.ArtificialProperty();
				art.setProperty(artificialProperties.fields()[i].field());
				art.setType(artificialProperties.fields()[i].type());
				art.setDefaultValue(artificialProperties.fields()[i]
						.defaulValue());
				structureControl.setAnnotation(clazz.getCanonicalName(),
						DCMetaInfoLevel.Field,
						artificialProperties.fields()[i].field(),
						DCMetaInfo.ArtificialProperty, art);
			}
		}
		/*
		 * org.elsoft.platform.datacontrol.metainfo.ArtificialProperty art = new
		 * org.elsoft.platform.datacontrol.metainfo.ArtificialProperty();
		 * art.setProperty("rowIndex"); art.setType(Integer.class);
		 * art.setDefaultValue("");
		 * structureControl.setAnnotation(clazz.getCanonicalName(),
		 * DCMetaInfoLevel.Field, "rowIndex", DCMetaInfo.ArtificialProperty,
		 * art);
		 */

		this.structureControl.setAnnotation(clazz.getCanonicalName(),
				DCMetaInfoLevel.Field, (String) map.get(ID), DCMetaInfo.Id,
				null);

		this.structureControl.setAnnotation(clazz.getCanonicalName(),
				DCMetaInfoLevel.Field, (String) map.get(VERSION),
				DCMetaInfo.Version, null);

		DataControl InsDomainDC = new InsModeDataControl();
		mode.addMode(RootModeSwitch.INSERT_MODE, InsDomainDC, true);

		DataControl QryDomainDC = new QryModeDataControl();
		mode.addMode(RootModeSwitch.QUERY_MODE, QryDomainDC, false);

		mode.addTransition(RootModeSwitch.INSERT_MODE,
				RootModeSwitch.QUERY_MODE, new Ins2QryActivity());
		mode.addTransition(RootModeSwitch.QUERY_MODE,
				RootModeSwitch.INSERT_MODE, new Qry2InsActivity());

		return ModeExtender.newInstance(clazz, mode, this);

	}

	public ELResolver getElResolver() {
		return elResolver;
	}

	public void setElResolver(ELResolver elResolver) {
		this.elResolver = elResolver;
	}

	public StructureControl getStructureControl() {
		return structureControl;
	}

	public void setStructureControl(StructureControl structureControl) {
		this.structureControl = structureControl;
	}

	public void setRoot(RootModeSwitch root) {
		this.root = root;

	}

	public RootModeSwitch getRoot() {
		return root;
	}

}
