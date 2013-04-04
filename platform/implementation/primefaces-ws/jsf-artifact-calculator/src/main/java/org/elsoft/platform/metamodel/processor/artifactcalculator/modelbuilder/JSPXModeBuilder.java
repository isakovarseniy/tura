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
package org.elsoft.platform.metamodel.processor.artifactcalculator.modelbuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.commons.lang.StringUtils;
import org.elsoft.platform.metamodel.MetamodelPlatformLevel;
import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateSecurityTriggerDAO;
import org.elsoft.platform.metamodel.objects.type.MethodDAO;
import org.elsoft.platform.metamodel.processor.Helper;
import org.elsoft.platform.metamodel.processor.datasource.model.Parameter;
import org.elsoft.platform.metamodel.processor.datasource.model.RemoteMethod;
import org.elsoft.platform.metamodel.processor.uicontainer.model.ActionElement;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Button;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Canvas;
import org.elsoft.platform.metamodel.processor.uicontainer.model.ChildrenOwner;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DataLink;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DropDownList;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DrugAndDrop;
import org.elsoft.platform.metamodel.processor.uicontainer.model.ExternalIterator;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Form;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Grid;
import org.elsoft.platform.metamodel.processor.uicontainer.model.InputElement;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Lov;
import org.elsoft.platform.metamodel.processor.uicontainer.model.OptionsInputElement;
import org.elsoft.platform.metamodel.processor.uicontainer.model.PointerElement;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Tree;
import org.elsoft.platform.metamodel.processor.uicontainer.model.UIElement;
import org.elsoft.platform.metamodel.processor.uicontainer.model.ViewPort;

import com.rits.cloning.Cloner;

public class JSPXModeBuilder {
	private JspxModel model = new JspxModel();
	private String domain;
	private String functionalDomain;
	private String application;
	private MetamodelPlatformLevel level;
	private RepositoryFactory rf;
	private Form frm;
	private HashMap<String, Object> context;

	public Object builder(UIElement element, String domain,
			String functionalDomain, String application,
			MetamodelPlatformLevel level, Form frm, RepositoryFactory rf,
			HashMap<String, String> keyMap,HashMap<String, Object> context) throws Exception {

		this.domain = domain;
		this.functionalDomain = functionalDomain;
		this.application = application;
		this.level = level;
		this.rf = rf;
		this.frm=frm;
		this.context = context;

		Cloner cloner = new Cloner();
		cloner.setDumpClonedClasses(false);
		cloner.dontClone(org.elsoft.platform.datacontrol.ins.InsModeDataControl.class);
		cloner.dontClone(org.elsoft.platform.datacontrol.ins.InsModeBeanWrapper.class);

		UIElement el = cloner.deepClone(element);

		model.setElement(el);
		model.setUicontainer(frm.getName());

		if (el instanceof Canvas) {
			String path = keyMap.get(((Canvas) el).getCanvasName());
			int i = path.lastIndexOf(":");
			lovFinder(el, path.substring(0, i));
		}
		viewPortFinder(el, keyMap);

		return model;
	}

	private void viewPortFinder(UIElement element,
			HashMap<String, String> keyMap) throws Exception {

		Iterator<RemoteMethod> itrRmi = element.getTriggers().values()
				.iterator();
		while (itrRmi.hasNext()) {
			RemoteMethod rmi = itrRmi.next();
			if (rmi.getReturnType() != null) {
				rmi.setReturnType(new MappedType(rmi.getReturnType()
						.getTypedao(), domain, functionalDomain, application,
						level, rf));
			}
			Iterator<Parameter> itrParams = rmi.getParamClass().iterator();
			while (itrParams.hasNext()) {
				Parameter param = itrParams.next();
				param.setType(new MappedType(param.getType().getTypedao(),
						domain, functionalDomain, application, level, rf));
			}

			rmi.setProxy(new MappedType(rmi.getProxy().getTypedao(), domain,
					functionalDomain, application, level, rf));

			rmi.setProxy(new MappedType(rmi.getProxy().getTypedao(), domain,
					functionalDomain, application, level, rf));
		}

		if (element instanceof ViewPort) {
			String name = ((ViewPort) element).getViewPortName();
			((ViewPort) element)
					.setViewPortName(StringUtils.uncapitalize(name));
		}

		if (element.getRendered() != null) {
			element.getPropertiesExtender().put("rendered_expression",
					securityConverter(element.getRendered()));
		}

		if (element.getDisable() != null) {
			element.getPropertiesExtender().put("disable_expression",
					securityConverter(element.getDisable()));
		}

		if ((element instanceof InputElement)
				&& (((InputElement) element).getReadonly() != null)) {
			element.getPropertiesExtender().put("readonly_expression",
					securityConverter(((InputElement) element).getReadonly()));
		}

		if (element instanceof ExternalIterator) {
			if (((ExternalIterator) element).getDataSrcLnk() != null) {
				String name = ((ExternalIterator) element).getDataSrcLnk()
						.getName();
				((ExternalIterator) element).getDataSrcLnk().setName(
						StringUtils.capitalize(name));

				element.getPropertiesExtender().put("lowSrcLnk", StringUtils.uncapitalize(name));
				
			}
		}

		if (element instanceof InputElement) {
			if (((InputElement) element).getDataSrcLnk() != null) {
				String name = ((InputElement) element).getDataSrcLnk()
						.getName();
				((InputElement) element).getDataSrcLnk().setName(
						StringUtils.capitalize(name));

				((InputElement) element).getPropertiesExtender().put(
						"capSrcLnk", StringUtils.capitalize(name));

			}
			if (((InputElement) element).getDataSrcField() != null) {
				String name = ((InputElement) element).getDataSrcField()
						.getName();

				((InputElement) element).getPropertiesExtender().put(
						"capSrcField", StringUtils.capitalize(name));
			}

		}

		if (element instanceof OptionsInputElement) {
			if (((OptionsInputElement) element).getOptionsSrcLnk() != null) {
				String name = ((OptionsInputElement) element)
						.getOptionsSrcLnk().getName();
				((OptionsInputElement) element).getOptionsSrcLnk().setName(
						StringUtils.capitalize(name));
			}
		}

		if (element instanceof ChildrenOwner) {
			Iterator<UIElement> itr = ((ChildrenOwner) element).getChildrens()
					.iterator();
			while (itr.hasNext()) {
				viewPortFinder(itr.next(), keyMap);
			}
		}

		if (element instanceof ActionElement) {
			if (((ActionElement) element).getDataSrcLnk() != null) {
				String name = ((ActionElement) element).getDataSrcLnk()
						.getName();
				((ActionElement) element).getDataSrcLnk().setName(
						StringUtils.capitalize(name));

				element.getPropertiesExtender().put("lowSrcLnk", StringUtils.uncapitalize(name));
			}
			if ((((ActionElement) element).getTriggerType() != null)
					&& ((((ActionElement) element).getTriggerType()
							.equals(MetamodelTriggerEventsType.CreateEventSearch
									.name()))
							|| (((ActionElement) element).getTriggerType()
									.equals(MetamodelTriggerEventsType.CreateEventQuery
											.name())) || (((ActionElement) element)
								.getTriggerType()
							.equals(MetamodelTriggerEventsType.CreateEventRallback
									.name())))
					|| (((ActionElement) element).getTriggerType() != null)
					&& ((ActionElement) element)
							.getTriggerType()
							.equals(MetamodelTriggerEventsType.CreateEventUIElement2ServiceMethod
									.name()))

				element.getPropertiesExtender().put("immediate", "true");
		}

		if (element instanceof PointerElement) {
			if (element instanceof Button) {
				element.getPropertiesExtender().put(
						"OnButtonPressed",
						dependeniesBuilder(
								((Button) element).getUpdateOnButtonPressed(),
								keyMap));
			}
			if (element instanceof Grid) {
				element.getPropertiesExtender()
						.put("OnRawSelect",
								dependeniesBuilder(
										((Grid) element).getUpdateOnRawSelect(),
										keyMap));
			}
			if (element instanceof Tree) {
				element.getPropertiesExtender()
						.put("OnRawSelect",
								dependeniesBuilder(
										((Tree) element).getUpdateOnRawSelect(),
										keyMap));
			}

			if (element instanceof DropDownList) {
				element.getPropertiesExtender().put(
						"OnValueChanged",
						dependeniesBuilder(((DropDownList) element)
								.getUpdateOnValueChanged(), keyMap));
			}

			if (element instanceof DrugAndDrop) {
				element.getPropertiesExtender().put(
						"OnItemDrop",
						dependeniesBuilder(
								((DrugAndDrop) element).getUpdateOnItemDrop(),
								keyMap));
			}

			if (element instanceof Lov) {
				element.getPropertiesExtender().put(
						"OnValueChanged",
						dependeniesBuilder(
								((Lov) element).getUpdateOnValueChanged(),
								keyMap));
			}

		}
	}

	private String securityConverter(CreateSecurityTriggerDAO trigger) {
		String str = "";

		if (trigger.getGranted() != null) {

			if (trigger.getGranted().equals("ifNotGranted"))
				str = "!p:ifGranted";
			else
				str = "p:" + trigger.getGranted();
			String roles = "";
			StringTokenizer token = new StringTokenizer(trigger.getRoles(), " ");
			while (token.hasMoreElements()) {
				roles = roles + ",'" + token.nextToken() + "'";
			}

			str = str + "(" + roles.substring(1) + ")";
			return str;
		}
		if (trigger.getDomain() != null) {
			Helper.findType(rf, trigger.getDomain(),
					trigger.getFunctionalDomain(), trigger.getApplication(),
					trigger.getTypeName());

			MethodDAO method = rf.getTypeDefinitionHandler().getMethodHandler()
					.cleanSearch()
					.searchString("method", trigger.getMethodName())
					.getObject();

			RemoteMethod rmi = new RemoteMethod(rf.getTypeDefinitionHandler()
					.getMethodHandler(), method, "Security");

			String name = rmi.getProxy().getDomain().toLowerCase() + "_"
					+ rmi.getProxy().getFunctionalDomain().toLowerCase() + "_"
					+ rmi.getProxy().getApplication().toLowerCase() + "_"
					+ rmi.getProxy().getTypeName().toLowerCase() + "_"
					+ rmi.getMethodName().toLowerCase();
			
			String control =StringUtils.capitalize(((DataLink)context.get(trigger.getDstUUID())).getName());
			return frm.getName()+"binding.current"+control+"."+name;
		}
		return "";
	}

	private String dependeniesBuilder(List<EventDAO> ls,
			Map<String, String> keyMap) {
		if (ls == null)
			return "";
		if (ls.size() == 0)
			return "";

		Iterator<EventDAO> itr = ls.iterator();
		String result = "";
		while (itr.hasNext()) {
			EventDAO event = itr.next();
			result = result + " " + keyMap.get(event.getDstUUID());
		}
		return result.substring(1);
	}

	private void lovFinder(UIElement element, String path) {

		if (element instanceof Lov) {
			element.getPropertiesExtender().put("canvasPath", path);
			model.getLovArray().add((Lov) element);
		}
		if (element instanceof ChildrenOwner) {
			Iterator<UIElement> itr = ((ChildrenOwner) element).getChildrens()
					.iterator();
			while (itr.hasNext()) {
				lovFinder(itr.next(), path);
			}
		}
	}

	public class JspxModel {
		private UIElement element;
		private String uicontainer;
		private ArrayList<Lov> lovArray = new ArrayList<Lov>();

		public UIElement getElement() {
			return element;
		}

		public void setElement(UIElement element) {
			this.element = element;
		}

		public String getUicontainer() {
			return uicontainer;
		}

		public void setUicontainer(String uicontainer) {
			this.uicontainer = uicontainer;
		}

		public ArrayList<Lov> getLovArray() {
			return lovArray;
		}

		public void setLovArray(ArrayList<Lov> lovArray) {
			this.lovArray = lovArray;
		}
	}
}
