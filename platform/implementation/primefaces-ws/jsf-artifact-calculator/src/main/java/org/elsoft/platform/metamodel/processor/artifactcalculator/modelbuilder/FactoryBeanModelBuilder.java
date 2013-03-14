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
import org.elsoft.platform.datacontrol.DCMetaInfo;
import org.elsoft.platform.metamodel.MetamodelPlatformLevel;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.processor.datasource.model.Parameter;
import org.elsoft.platform.metamodel.processor.datasource.model.RemoteMethod;
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

	public Object builder(RepositoryFactory rf, String domain,
			String functionalDomain, String application,
			MetamodelPlatformLevel level, Form frm) {
		
		Iterator<RemoteMethod> itrRmi = frm.getTriggers().values().iterator();
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
	
		
		model.setUicontainer(frm.getName());
		
		model.setPreFormTrigger(frm.getTriggers().get(DCMetaInfo.PREFormTrigger.name()));

		Iterator<Window> itrWin = frm.getWindows().iterator();
		while (itrWin.hasNext())
			viewPortsFinder(itrWin.next(),rf,domain,functionalDomain,application,level);

		Iterator<Canvas> itrCanvas = frm.getCanvases().iterator();
		while (itrCanvas.hasNext())
			viewPortsFinder(itrCanvas.next(),rf,domain,functionalDomain,application,level);

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
		private RemoteMethod preFormTrigger;

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

		public RemoteMethod getPreFormTrigger() {
			return preFormTrigger;
		}

		public void setPreFormTrigger(RemoteMethod preFormTrigger) {
			this.preFormTrigger = preFormTrigger;
		}

	}

	public class ViewPortDescriptor {
		private String viewPortName;
		private String capViewPortName;
		private String canvasName;
		private RemoteMethod rmi;

		public String getCanvasName() {
			return canvasName;
		}

		public void setCanvasName(String canvasName) {
			this.canvasName = canvasName;
		}

		public ViewPortDescriptor(ViewPort port,RepositoryFactory rf, String domain,
				String functionalDomain, String application,
				MetamodelPlatformLevel level ) {
			canvasName = ((Canvas) port.getCanvas()).getCanvasName();
			viewPortName = port.getViewPortName();
			capViewPortName = WordUtils.capitalize(viewPortName);

			if (port.getRmi() != null) {
				if (port.getRmi().getReturnType() != null) {
					port.getRmi().setReturnType(
							new MappedType(port.getRmi().getReturnType()
									.getTypedao(), domain, functionalDomain,
									application, level, rf));
				}
				port.getRmi().setProxy(
						new MappedType(port.getRmi().getProxy().getTypedao(),
								domain, functionalDomain, application, level,
								rf));
			   setRmi(port.getRmi());
			      
			}

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

		public RemoteMethod getRmi() {
			return rmi;
		}

		public void setRmi(RemoteMethod rmi) {
			this.rmi = rmi;
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

	private void viewPortsFinder(UIElement element,RepositoryFactory rf, String domain,
			String functionalDomain, String application,
			MetamodelPlatformLevel level) {

		if (element instanceof ViewPort)
			model.getPorts().add(new ViewPortDescriptor((ViewPort) element,rf,domain,functionalDomain,application,level));

		if (element instanceof ChildrenOwner) {
			Iterator<UIElement> itr = ((ChildrenOwner) element).getChildrens()
					.iterator();
			while (itr.hasNext()) {
				viewPortsFinder(itr.next(),rf,domain,functionalDomain,application,level);
			}
		}
	}

}
