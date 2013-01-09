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
import org.elsoft.platform.metamodel.MetamodelObjectType;
import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateSecurityTriggerDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.model.ActionElement;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Button;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Canvas;
import org.elsoft.platform.metamodel.processor.uicontainer.model.ChildrenOwner;
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
	JspxModel model = new JspxModel();

	public Object builder(UIElement element, Form frm) {

		Cloner cloner = new Cloner();
		cloner.setDumpClonedClasses(false);
		cloner.dontClone(org.elsoft.platform.datacontrol.ins.InsModeDataControl.class);
		cloner.dontClone(org.elsoft.platform.datacontrol.ins.InsModeBeanWrapper.class);

		UIElement el = cloner.deepClone(element);

		model.setElement(el);
		model.setUicontainer(frm.getName());

		HashMap<String, String> keyMap = new HashMap<String, String>();
		String path = ":window";
		pathCalulator(el, keyMap, path);

		if (el instanceof Canvas)
			lovFinder(el);

		viewPortFinder(el, keyMap);

		return model;
	}

	private void pathCalulator(UIElement element, Map<String, String> pathMap,
			String path) {

		pathMap.put(((UIElement) element).getUuid(), path + ":tura"
				+ ((UIElement) element).getUuid());

		if ((element instanceof Canvas)
				&& (((Canvas) element).getCanvasType()
						.equals(MetamodelObjectType.TabCanvas.name())))
			path = path + ":tura" + ((Canvas) element).getUuid();

		if (element instanceof ChildrenOwner) {
			Iterator<UIElement> itr = ((ChildrenOwner) element).getChildrens()
					.iterator();
			while (itr.hasNext()) {
				pathCalulator(itr.next(), pathMap, path);
			}
		}
	}

	private void viewPortFinder(UIElement element,
			HashMap<String, String> keyMap) {
		if (element instanceof ViewPort) {
			String name = ((ViewPort) element).getViewPortName();
			((ViewPort) element)
					.setViewPortName(StringUtils.uncapitalize(name));
		}

		if (element.getRendered() != null) {
			element.getPropertiesExtender().put(
					"rendered_expression", securityConverter(element.getRendered()));            
		}

		if (element.getDisable() != null) {
			element.getPropertiesExtender().put(
					"disable_expression", securityConverter(element.getDisable()));            
		}

		if ((element instanceof InputElement)&&(((InputElement)element).getReadonly() != null)) {
			element.getPropertiesExtender().put(
					"readonly_expression", securityConverter(((InputElement)element).getReadonly()));            
		}
		
		if (element instanceof ExternalIterator) {
			if (((ExternalIterator) element).getDataSrcLnk() != null) {
				String name = ((ExternalIterator) element).getDataSrcLnk()
						.getName();
				((ExternalIterator) element).getDataSrcLnk().setName(
						StringUtils.uncapitalize(name));
			}
		}

		if (element instanceof InputElement) {
			if (((InputElement) element).getDataSrcLnk() != null) {
				String name = ((InputElement) element).getDataSrcLnk()
						.getName();
				((InputElement) element).getDataSrcLnk().setName(
						StringUtils.uncapitalize(name));

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
						StringUtils.uncapitalize(name));
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
				        &&((ActionElement) element).getTriggerType()
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

	private void lovFinder(UIElement element) {

		if (element instanceof Lov)
			model.getLovArray().add((Lov) element);

		if (element instanceof ChildrenOwner) {
			Iterator<UIElement> itr = ((ChildrenOwner) element).getChildrens()
					.iterator();
			while (itr.hasNext()) {
				lovFinder(itr.next());
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
