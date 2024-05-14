/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.model.designer.ui.recipe.actions;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import org.tura.model.designer.Constants;
import org.tura.model.designer.exchange.CdiAppExchange;
import org.tura.model.designer.repository.serialized.application.ApplicationMappers;
import org.tura.model.designer.repository.serialized.application.ApplicationProxy;
import org.tura.model.designer.repository.serialized.application.ApplicationRecipeProxy;
import org.tura.model.designer.repository.serialized.application.ApplicationRecipesProxy;
import org.tura.model.designer.repository.serialized.mapper.Mapper;
import org.tura.model.designer.repository.serialized.mapper.MappingLayer;
import org.tura.model.designer.repository.serialized.mapper.Version;
import org.tura.model.designer.repository.serialized.mapper.VersionRef;
import org.tura.model.designer.repository.serialized.recipe.Component;
import org.tura.model.designer.repository.serialized.recipe.Configuration;
import org.tura.model.designer.repository.serialized.recipe.Infrastructure;
import org.tura.model.designer.repository.serialized.recipe.Infrastructure2Configuration;
import org.tura.model.designer.repository.serialized.recipe.Ingredient;
import org.tura.model.designer.repository.serialized.recipe.JavaComponent;
import org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent;
import org.tura.model.designer.repository.serialized.recipe.Recipe;
import org.tura.model.designer.repository.serialized.recipe.Recipes;
import org.tura.model.designer.repository.serialized.recipe.RecipesProxy;
import org.tura.model.designer.ui.recipe.mmdesigner.recipe.datacontrol.IBeanFactory;
import org.tura.model.designer.ui.recipe.mmdesigner.recipe.viewmodel.IViewPortHolder;
import org.tura.model.designer.ui.tree.actions.CommonFunctions;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.annotations.FormPrm;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.cdi.ClientProxyRepo;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.model.FormParameters;
import org.tura.platform.uuiclient.model.ViewModel;
import org.tura.platform.uuiclient.model.WindowsPluginModel;
import org.tura.platform.uuiclient.rest.client.commands.HidePopup;
import org.tura.platform.uuiclient.rest.client.commands.OpenPopup;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;

public class RecipeViewActions extends CommonFunctions {

	@Inject
	@Named("beanFactoryMmdesignerRecipe")
	IBeanFactory bf;

	@Inject
	ResponseState responseState;

	@Inject
	@Named("viewmodelRecipe")
	ViewModel viewModel;

	@Inject
	@ClientProxyRepo("mmdesigner.shared")
	private CpaRepository repository;

	@Inject
	ELResolver elResolver;

	@Inject
	IViewPortHolder vh;

	@Inject
	@FormPrm
	FormParameters formParameters;

	@Inject
	private CdiAppExchange exchange;

	private transient Logger logger = Logger.getLogger(RecipeViewActions.class.getName());

	public void enableTreeEdit() {
		enableTreeEdit(responseState, IBeanFactory.RECIPETREE);
	}

	public boolean enableEditButton() {
		try {
			return enableEditButton(IBeanFactory.RECIPETREE, viewModel);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		return false;
	}

	public boolean enableCreateChildrenButton() {
		try {
			return enableCreateChildrenButton(IBeanFactory.RECIPETREE, viewModel);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		return false;
	}

	public boolean enableDeleteButton() {
		try {
			return enableDeleteButton(IBeanFactory.RECIPETREE, viewModel);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		return false;
	}

	public void createChildren() {
		try {
			createChildren(IBeanFactory.RECIPETREE, viewModel, null);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public boolean renderMenuItem(String type) {
		try {

			if (PreFormTrigger.RECIPE_CONSTANT.equals(type)) {
				if (bf.getTreeRootRecipes().getCurrentObject() instanceof Recipes) {
					return true;
				}
			}
			if (PreFormTrigger.INGREDIENT_CONSTANT.equals(type)) {
				if (bf.getTreeRootRecipes().getCurrentObject() instanceof Recipe) {
					return true;
				}
			}
			if (PreFormTrigger.JAVA_COMPONENT_CONSTANT.equals(type)) {
				if (bf.getTreeRootRecipes().getCurrentObject() instanceof Ingredient) {
					return true;
				}
			}
			if (PreFormTrigger.JAVA_SCRIPT_COMPONENT_CONSTANT.equals(type)) {
				if (bf.getTreeRootRecipes().getCurrentObject() instanceof Ingredient) {
					return true;
				}
			}
			if (PreFormTrigger.MODELMAPPER_CONSTANT.equals(type)) {
				if (bf.getTreeRootRecipes().getCurrentObject() instanceof Component) {
					return true;
				}
			}
			if (PreFormTrigger.INFRASTRUCTURE_CONSTANT.equals(type)) {
				if (bf.getTreeRootRecipes().getCurrentObject() instanceof Recipes) {
					return true;
				}
			}
			if (PreFormTrigger.INFRASTRUCTURE2CONFIGURATION_CONSTANT.equals(type)) {
				if (bf.getTreeRootRecipes().getCurrentObject() instanceof Infrastructure) {
					return true;
				}
			}
			if (PreFormTrigger.CONFIGURATION_CONSTANT.equals(type)) {
				if (bf.getTreeRootRecipes().getCurrentObject() instanceof Infrastructure2Configuration) {
					return true;
				}
			}
			if (PreFormTrigger.CONFIGURATION_EXTENSION_CONSTANT.equals(type)) {
				if (bf.getTreeRootRecipes().getCurrentObject() instanceof Configuration) {
					return true;
				}
			}
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		return false;
	}

	public void createChildren(String type) {
		try {
			bf.setMenuSelectedItem(type);
			createChildren(IBeanFactory.RECIPETREE, viewModel, type);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	private boolean enableItem(String type) {
		try {
			if (PreFormTrigger.RECIPE_CONSTANT.equals(type)) {
				return enableCreateChildrenButton();
			}
			return true;
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		return false;
	}

	public boolean enableMenuItem(String type) {
		return !enableItem(type);
	}

	public void delete() {
		try {
			delete(IBeanFactory.RECIPETREE, viewModel);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void saveApplication() {
		try {
			repository.getStackProvider().get().commit();
//			addInfomessage(responseState, "DATA_PERSISTED",elResolver,IBeanFactory.MESSAGES);
		} catch (Exception e) {
//			addInfomessage(responseState, "ERROR_DURING_PERSISTING",elResolver,IBeanFactory.MESSAGES);
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void openMultiSelectorForMappers() {
		try {
			if (bf.getApplicationMappersId() == null) {
				findApplicationMappersId();
			}

			DataControl dc = (DataControl) bf.getApplicationMappers();
			dc.forceRefresh();
			dc = (DataControl) bf.getApplicationMapper();
			dc.forceRefresh();

			vh.setPopupPort(IViewPortHolder.POPUPPORT_MAPPERMULTISELECTOR);
			repository.getStackProvider().get().savePoint();

			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("a683f498-3404-49bf-bb42-eba35a760f94");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void acceptMultiSelectorForMappers() {
		try {
			if (IViewPortHolder.DETAILPORT_RECIPEDETAILS.equals(vh.getDetailPort())) {
				formParameters.getRequest().getTopUpdateElementIds().add(toId(IBeanFactory.MAPPERRECIPETABLE));
			}
			if (IViewPortHolder.DETAILPORT_INGREDIENTDETAILS.equals(vh.getDetailPort())) {
				formParameters.getRequest().getTopUpdateElementIds().add(toId(IBeanFactory.MAPPERINGREDIENTTABLE));
			}

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("a683f498-3404-49bf-bb42-eba35a760f94");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void rejectMultiSelectorForMappers() {
		try {
			repository.getStackProvider().get().rallbackSavePoint();

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("a683f498-3404-49bf-bb42-eba35a760f94");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void openMultiSelectorForMappingLayers(String type) {
		try {
			if (bf.getApplicationMappersId() == null) {
				findApplicationMappersId();
			}

			bf.setMappingLayerSelector(type);

			DataControl dc = (DataControl) bf.getApplicationMappers();
			dc.forceRefresh();
			dc = (DataControl) bf.getMappingLayer();
			dc.forceRefresh();

			vh.setPopupPort(IViewPortHolder.POPUPPORT_MAPPINGLAYERSELECTOR);
			repository.getStackProvider().get().savePoint();

			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("e8e73666-d038-4485-802e-ecb67f48074e");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void acceptMultiSelectorForMappingLayers() {
		try {
			if (PreFormTrigger.VIEWLAYERS_SELECTOR_CONSTANT.equals(bf.getMappingLayerSelector())) {
				formParameters.getRequest().getTopUpdateElementIds().add(toId(IBeanFactory.VIEWMAPPINGLAYERTABLE));
			}
			if (PreFormTrigger.MODELLAYERS_SELECTOR_CONSTANT.equals(bf.getMappingLayerSelector())) {
				formParameters.getRequest().getTopUpdateElementIds().add(toId(IBeanFactory.MODELMAPPINGLAYERTABLE));
			}

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("e8e73666-d038-4485-802e-ecb67f48074e");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void rejectMultiSelectorForMappingLayers() {
		try {
			repository.getStackProvider().get().rallbackSavePoint();

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("e8e73666-d038-4485-802e-ecb67f48074e");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void openSingleSelectorForMappingLayers() {
		try {

			if (bf.getApplicationMappersId() == null) {
				findApplicationMappersId();
			}

			DataControl dc = (DataControl) bf.getApplicationMappers();
			dc.forceRefresh();
			dc = (DataControl) bf.getMappingLayer();
			dc.forceRefresh();

			vh.setPopupPort(IViewPortHolder.POPUPPORT_SINGLELAYERSELECTOR);
			repository.getStackProvider().get().savePoint();

			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("9756e630-d432-4493-b277-e955784a47eb");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void acceptSingleSelectorForMappingLayers() {
		try {

			Ingredient ingredient = (Ingredient) bf.getTreeRootRecipes().getCurrentObject();
			MappingLayer layer = (MappingLayer) bf.getMappingLayer().getCurrentObject();
			ingredient.setControllerLayer(layer);

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("9756e630-d432-4493-b277-e955784a47eb");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void rejectSingleSelectorForMappingLayers() {
		try {

			repository.getStackProvider().get().rallbackSavePoint();

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("9756e630-d432-4493-b277-e955784a47eb");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void openVersionSelector() {
		try {
			if (bf.getApplicationMappersId() == null) {
				findApplicationMappersId();
			}

			WindowsPluginModel model = (WindowsPluginModel) viewModel
					.getModel(RecipesCallBackProducer.POPUP_VERSION_SELECTION_PLUGIN_WIN, "windowPlugin", null);
			if (model.getWindows().size() == 0) {
				Map<String, String> param = new HashMap<String, String>();
				param.put("appMappersId", bf.getApplicationMappersId());

				model.addWindows(Constants.VERSIONS_SELECTION_PLUGIN, param, elResolver);
			}

			vh.setPopupPort(IViewPortHolder.POPUPPORT_VERSIONSELECTOR);
			repository.getStackProvider().get().savePoint();

			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("ca7ba424-6942-492c-b7bc-97f70775b4d1");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings("unchecked")
	public void acceptVersionSelection() {
		try {
			Map<String, Object> selected = (Map<String, Object>) exchange.getObject("selectedObject");

			if (selected != null) {
				String className = (String) selected.get("class");
				RepoKeyPath path = (RepoKeyPath) selected.get("path");
				if (className != null && path != null && Version.class.getName().equals(className)) {
					VersionRef versionRef = (VersionRef) bf.getTreeRootRecipes().getCurrentObject();
					Version ver = (Version) repository.find(path, Version.class);
					versionRef.setVersionRef(ver);
				}
				if (IViewPortHolder.DETAILPORT_JAVASCRIPTCOMPONENTDETAILS.equals(vh.getDetailPort())) {
					formParameters.getRequest().getTopUpdateElementIds()
							.add(toId(IBeanFactory.VERSIONJAVASCRIPTCOMPONENT));
				}
				if (IViewPortHolder.DETAILPORT_JAVACOMPONENTDETAILS.equals(vh.getDetailPort())) {
					formParameters.getRequest().getTopUpdateElementIds().add(toId(IBeanFactory.VERSIONJAVACOMPONENT));
				}
			}

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("ca7ba424-6942-492c-b7bc-97f70775b4d1");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void rejectVersionSelection() {
		try {
			repository.getStackProvider().get().rallbackSavePoint();

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("ca7ba424-6942-492c-b7bc-97f70775b4d1");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void openMapperSelector() {

		try {
			if (bf.getApplicationMappersId() == null) {
				findApplicationMappersId();
			}

			WindowsPluginModel model = (WindowsPluginModel) viewModel
					.getModel(RecipesCallBackProducer.POPUP_MAPPER_SELECTION_PLUGIN_WIN, "windowPlugin", null);
			if (model.getWindows().size() == 0) {
				Map<String, String> param = new HashMap<String, String>();
				param.put("applicationId", bf.getApplicationId());

				model.addWindows(Constants.TREE_SELECTION_PLUGIN, param, elResolver);
			}

			vh.setPopupPort(IViewPortHolder.POPUPPORT_MAPPERSELECTOR);
			repository.getStackProvider().get().savePoint();

			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("aa862987-46a4-4f45-8b04-a0e2781f87ec");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		
		
	}

	@SuppressWarnings("unchecked")
	public void acceptMapperSelection() {
		try {
			Map<String, Object> selected = (Map<String, Object>) exchange.getObject("selectedObject");

			if (selected != null) {
				String className = (String) selected.get("class");
				Class<?> clazz = Class.forName(className);
				RepoKeyPath path = (RepoKeyPath) selected.get("path");
				if (className != null && path != null && Mapper.class.isAssignableFrom(clazz) ) {
					Mapper mapper = (Mapper) repository.find(path, Mapper.class);

					if (IViewPortHolder.DETAILPORT_JAVASCRIPTCOMPONENTDETAILS.equals(vh.getDetailPort())) {
						JavaScriptComponent jsComponent = (JavaScriptComponent) bf.getTreeRootRecipes()
								.getCurrentObject();
						jsComponent.setMapperRef(mapper);

						formParameters.getRequest().getTopUpdateElementIds()
								.add(toId(IBeanFactory.MAPPERJAVASCRIPTCOMPONENT));
					}
					if (IViewPortHolder.DETAILPORT_JAVACOMPONENTDETAILS.equals(vh.getDetailPort())) {
						JavaComponent jComponent = (JavaComponent) bf.getTreeRootRecipes().getCurrentObject();
						jComponent.setMapperRef(mapper);

						formParameters.getRequest().getTopUpdateElementIds()
								.add(toId(IBeanFactory.MAPPERJAVACOMPONENT));
					}

				}

			}
			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("aa862987-46a4-4f45-8b04-a0e2781f87ec");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void rejectMapperSelection() {
		try {
			repository.getStackProvider().get().rallbackSavePoint();

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("aa862987-46a4-4f45-8b04-a0e2781f87ec");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	private void findApplicationMappersId() throws TuraException {
		RecipesProxy recipies = (RecipesProxy) ((TreeDataControl) bf.getTreeRootRecipes()).getRoot().getCurrentObject();
		ApplicationRecipeProxy applicationRecipe = (ApplicationRecipeProxy) recipies.eContainer();
		ApplicationRecipesProxy applicationRecipes = (ApplicationRecipesProxy) applicationRecipe.eContainer();
		ApplicationProxy application = (ApplicationProxy) applicationRecipes.eContainer();
		ApplicationMappers applicationMappers = application.getApplicationMappers();
		bf.setApplicationMappersId(applicationMappers.getUid());
		bf.setApplicationId(application.getUid());
	}

}
