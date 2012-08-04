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

import org.apache.commons.lang.WordUtils;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Canvas;
import org.elsoft.platform.metamodel.processor.uicontainer.model.ChildrenOwner;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DataLink;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Form;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Relation;
import org.elsoft.platform.metamodel.processor.uicontainer.model.UIElement;
import org.elsoft.platform.metamodel.processor.uicontainer.model.ViewPort;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Window;

public class FactoryBeanModelBuilder {

	private FactoryBeanModel model = new FactoryBeanModel();

	public Object builder(Form frm) {
		model.setUicontainer(frm.getName());

		Iterator<Window> itrWin = frm.getWindows().iterator();
		while (itrWin.hasNext())
			viewPortsFinder(itrWin.next());

		Iterator<Canvas> itrCanvas = frm.getCanvases().iterator();
		while (itrCanvas.hasNext())
			viewPortsFinder(itrCanvas.next());

		Iterator<DataLink> itr = frm.getDatalinks().iterator();
		ArrayList<String> check = new ArrayList<String>();
		while (itr.hasNext()) {
			DataLink dataLink = itr.next();
			Iterator<Relation> itrRel = dataLink.getRelation().iterator();
			while (itrRel.hasNext()) {
				DataLink detail = itrRel.next().getDetail();
				// If it is reference themself
				if (detail.getName().equals(dataLink.getName()))
					continue;
				check.add(detail.getName());
				LinkDescriptor lnkDesc = new LinkDescriptor(detail.getName(),
						dataLink.getName());
				model.getDetail().add(lnkDesc);

				Iterator<Relation> itrRel1 = detail.getRelation().iterator();

				while (itrRel1.hasNext()) {
					DataLink detail1 = itrRel1.next().getDetail();
					// If it is reference themself
					if (detail1.getName().equals(detail.getName()))
						continue;
					lnkDesc.addDetail(detail1.getName(), detail.getName());
				}
			}
		}

		itr = frm.getDatalinks().iterator();
		while (itr.hasNext()) {
			DataLink dataLink = itr.next();
			LinkDescriptor lnkDesc = new LinkDescriptor(dataLink.getName(),
					null);
			if (check.contains(dataLink.getName()))
				continue;
			Iterator<Relation> itrRel = dataLink.getRelation().iterator();
			while (itrRel.hasNext()) {
				DataLink detail = itrRel.next().getDetail();
				// If it is reference themself
				if (detail.getName().equals(dataLink.getName()))
					continue;
				lnkDesc.addDetail(detail.getName(), dataLink.getName());
			}
			model.getMaster().add(lnkDesc);
		}

		return model;

	}

	public class FactoryBeanModel {
		private String uicontainer;
		private ArrayList<ViewPortDescriptor> ports = new ArrayList<ViewPortDescriptor>();
		private ArrayList<LinkDescriptor> master = new ArrayList<LinkDescriptor>();
		private ArrayList<LinkDescriptor> detail = new ArrayList<LinkDescriptor>();

		public String getUicontainer() {
			return uicontainer;
		}

		public void setUicontainer(String uicontainer) {
			this.uicontainer = uicontainer;
		}

		public ArrayList<ViewPortDescriptor> getPorts() {
			return ports;
		}

		public ArrayList<LinkDescriptor> getMaster() {
			return master;
		}

		public ArrayList<LinkDescriptor> getDetail() {
			return detail;
		}

	}

	public class ViewPortDescriptor {
		private String viewPortName;
		private String capViewPortName;
		private String canvasName;

		public String getCanvasName() {
			return canvasName;
		}

		public void setCanvasName(String canvasName) {
			this.canvasName = canvasName;
		}

		public ViewPortDescriptor(ViewPort port) {
			canvasName = ((Canvas) port.getCanvas()).getCanvasName();
			viewPortName = port.getViewPortName();
			capViewPortName = WordUtils.capitalize(viewPortName);
		}

		public String getViewPortName() {
			return viewPortName;
		}

		public void setViewPortName(String viewPortName) {
			this.viewPortName = viewPortName;
		}

		public String getCapViewPortName() {
			return capViewPortName;
		}

		public void setCapViewPortName(String capViewPortName) {
			this.capViewPortName = capViewPortName;
		}

	}

	public class LinkDescriptor {

		private String name;
		private String capName;
		private String capMasterName;
		private ArrayList<LinkDescriptor> details = new ArrayList<LinkDescriptor>();

		public LinkDescriptor(String name, String masterName) {
			this.name = name;
			capName = WordUtils.capitalize(name);
			if (masterName != null)
				setCapMasterName(WordUtils.capitalize(masterName));
		}

		public void addDetail(String name, String masterName) {
			details.add(new LinkDescriptor(name, masterName));
		}

		public List<LinkDescriptor> getDetails() {
			return details;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCapName() {
			return capName;
		}

		public void setCapName(String capName) {
			this.capName = capName;
		}

		public String getCapMasterName() {
			return capMasterName;
		}

		public void setCapMasterName(String capMasterName) {
			this.capMasterName = capMasterName;
		}
	}

	private void viewPortsFinder(UIElement element) {

		if (element instanceof ViewPort)
			model.getPorts().add(new ViewPortDescriptor((ViewPort) element));

		if (element instanceof ChildrenOwner) {
			Iterator<UIElement> itr = ((ChildrenOwner) element).getChildrens()
					.iterator();
			while (itr.hasNext()) {
				viewPortsFinder(itr.next());
			}
		}
	}

}
