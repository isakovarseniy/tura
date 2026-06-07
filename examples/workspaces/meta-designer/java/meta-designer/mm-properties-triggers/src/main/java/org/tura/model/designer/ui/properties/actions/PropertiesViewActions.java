/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.model.designer.ui.properties.actions;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.tura.model.designer.Constants;
import org.tura.model.designer.exchange.CdiAppExchange;
import org.tura.model.designer.repository.serialized.artifact.Categorized;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
import org.tura.model.designer.repository.serialized.artifact.GenerationHint;
import org.tura.model.designer.ui.properties.mmdesigner.properties.datacontrol.IBeanFactory;
import org.tura.model.designer.ui.properties.mmdesigner.properties.viewmodel.IViewPortHolder;
import org.tura.model.designer.ui.tree.actions.CommonFunctions;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.FormPrm;
import org.tura.platform.repository.cdi.ClientProxyRepo;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.menu.DefaultMenuItem;
import org.tura.platform.uuiclient.menu.DefaultMenuModel;
import org.tura.platform.uuiclient.menu.IMenuProvider;
import org.tura.platform.uuiclient.model.FormParameters;
import org.tura.platform.uuiclient.model.ViewModel;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.client.commands.HidePopup;
import org.tura.platform.uuiclient.rest.client.commands.OpenPopup;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;
import org.tura.platform.uuiclient.rest.events.EventAware;

import jakarta.inject.Inject;
import jakarta.inject.Named;

public class PropertiesViewActions extends CommonFunctions implements EventAware {

	EventDescription event;

	@Inject
	@Named("beanFactoryMmdesignerProperties")
	IBeanFactory bf;

	@Inject
	ResponseState responseState;

	@Inject
	@Named("viewmodelProperties")
	ViewModel viewModel;

	@Inject
	@ClientProxyRepo("mmdesigner.shared")
	private CpaRepository repository;

	@Inject
	@Named("viewPortHolderMmdesignerProperties")
	private IViewPortHolder vh;

	@Inject
	ELResolver elResolver;

	@Inject
	@FormPrm
	FormParameters formParameters;

	@Inject
	private CdiAppExchange exchange;
	
	
	@Inject
	@Named("menuProviderMmdesignerProperties")
	IMenuProvider menuProvider;

	private transient Logger logger = Logger.getLogger(PropertiesViewActions.class.getName());

	public void switchToCatezorized() {
		vh.setPropertyAria(IViewPortHolder.PROPERTYARIA_NOPROPERTY);
	}

	public void externalApiRequest() {
		try {
			DataControl<?> dc = (DataControl<?>) bf.getCategorized();
			dc.forceRefresh();

			formParameters.getRequest().getTopUpdateElementIds().add(toId(IBeanFactory.PROPERTYARIA));
			formParameters.getRequest().getTopUpdateElementIds().add(toId(IBeanFactory.PROPERTYHEADER));

			DefaultMenuModel  menuModel = menuProvider.getModel(fromd("42cf251d-a65e-449b-9e2a-6f167e4df203"));
			if (menuModel.getItems().size()  == 0 ) {
				vh.setPropertyAria(IViewPortHolder.PROPERTYARIA_NOPROPERTY);
			}else {
				DefaultMenuItem  item  = (DefaultMenuItem) menuModel.getItems().get(0);
				vh.setPropertyAria(IViewPortHolder.PROPERTYARIA_NOPROPERTY);
				if ( item.getUid().equals(Constants.PROPERTY_MENU_CATEGORIZED_ITEM)) {
					vh.setPropertyAria(IViewPortHolder.PROPERTYARIA_CATEGORIZEDCANVAS);
				}
			}

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("unchecked")
	public String dynamicPropertyLabel() {
		try {
			Map<String, Object> selected = (Map<String, Object>) exchange.getObject("objectForProperty");
			if (selected != null) {
				String className = (String) selected.get("class");
				Class<?> calzz = Class.forName(className);
				return calzz.getSimpleName();
			}
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		return "N/A";
	}

	public void openCategorizedSelector() {
		try {

			vh.setPopUpPort(IViewPortHolder.POPUPPORT_TECHNOLOGIESSELECTOR);
			repository.getStackProvider().get().savePoint();

			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("57a970ae-0327-4c58-a0de-c219bf42afc4");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("unchecked")
	public void acceptCategorizedSelector() {
		try {
			
			Map<String, Object> selected = (Map<String, Object>) exchange.getObject("selectedTechnologies");

			if (selected != null) {
				String className = (String) selected.get("class");
				RepoKeyPath path = (RepoKeyPath) selected.get("path");
				if (className != null && path != null && GenerationHint.class.getName().equals(className)) {
					GenerationHint hint = (GenerationHint) repository.find(path, GenerationHint.class);
					Classifier classifier = repository.create(Classifier.class);
					Categorized  categorized = (Categorized) bf.getCategorized().getCurrentObject();
					categorized.getClassifiers().add(classifier);
					classifier.setHint(hint);
				}
			}
//			DataControl<Classifier> dc =(DataControl<Classifier>) bf.getCategorized();
//			dc.forceRefresh();
			
			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("57a970ae-0327-4c58-a0de-c219bf42afc4");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void rejectCategorizedSelector() {
		try {

			repository.getStackProvider().get().rallbackSavePoint();

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("57a970ae-0327-4c58-a0de-c219bf42afc4");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public boolean renderedCategorized() {
		try {
			Map<String, Object> selected = (Map<String, Object>) exchange.getObject("objectForProperty");
			if (selected != null) {
				String className = (String) selected.get("class");
				Class<?> clazz = Class.forName(className);
				if (Categorized.class.isAssignableFrom(clazz)) {
					return true;
				}
				return false;
			}
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		return false;
	}

	@Override
	public void setEvent(EventDescription event) {
		this.event = event;
	}

}
