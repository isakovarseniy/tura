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
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Button;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Canvas;
import org.elsoft.platform.metamodel.processor.uicontainer.model.ChildrenOwner;
import org.elsoft.platform.metamodel.processor.uicontainer.model.ExternalIterator;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Form;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Grid;
import org.elsoft.platform.metamodel.processor.uicontainer.model.InputElement;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Lov;
import org.elsoft.platform.metamodel.processor.uicontainer.model.OptionsInputElement;
import org.elsoft.platform.metamodel.processor.uicontainer.model.PointerElement;
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

		if (el instanceof Canvas)
			lovFinder(el);

		viewPortFinder(el);

		return model;
	}

	private void viewPortFinder(UIElement element) {
		if (element instanceof ViewPort) {
			String name = ((ViewPort) element).getViewPortName();
			((ViewPort) element)
					.setViewPortName(StringUtils.uncapitalize(name));
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
				viewPortFinder(itr.next());
			}
		}

		if (element instanceof PointerElement) {
			if (element instanceof Button) {
				element.getPropertiesExtender().put("OnButtonPressed",  dependeniesBuilder(((Button) element)
						.getUpdateOnButtonPressed()));
			}
			if (element instanceof Grid) {
				element.getPropertiesExtender().put("OnRawSelect",  dependeniesBuilder(((Grid) element)
						.getUpdateOnRawSelect()));
			}
		}
	}

	private String dependeniesBuilder(List<EventDAO> ls) {
		if (ls == null) return "";
		if (ls.size() == 0) return "";

		Iterator<EventDAO> itr = ls.iterator();
		String result ="";
		while(itr.hasNext()){
			EventDAO event = itr.next();
			result = result + " :window:tura"+event.getDstUUID();
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
