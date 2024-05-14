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
import org.tura.model.designer.repository.serialized.artifact.Artifact;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
import org.tura.model.designer.repository.serialized.artifact.GenerationHint;
import org.tura.model.designer.repository.serialized.artifact.ModelQuery;
import org.tura.model.designer.repository.serialized.artifact.Option;
import org.tura.model.designer.repository.serialized.artifact.QueryParameter;
import org.tura.model.designer.repository.serialized.artifact.Technology;
import org.tura.model.designer.repository.serialized.recipe.MappingTecnologiy;
import org.tura.model.designer.repository.serialized.recipe.ModelMapper;
import org.tura.model.designer.repository.serialized.recipe.Query;
import org.tura.model.designer.repository.serialized.recipe.QueryVariable;
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
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.EventParameter;
import org.tura.platform.uuiclient.rest.client.commands.HidePopup;
import org.tura.platform.uuiclient.rest.client.commands.OpenPopup;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;
import org.tura.platform.uuiclient.rest.events.EventAware;

public class RecipeViewActions2 extends CommonFunctions implements EventAware {

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

	EventDescription event;

	private transient Logger logger = Logger.getLogger(RecipeViewActions2.class.getName());

	public void openArtifactSelector() {
		try {
			if (bf.getApplicationMappersId() == null) {
				findApplicationMappersId();
			}

			WindowsPluginModel model = (WindowsPluginModel) viewModel
					.getModel(RecipesCallBackProducer.POPUP_ARTIFACT_SELECTION_PLUGIN_WIN, "windowPlugin", null);
			if (model.getWindows().size() == 0) {
				Map<String, String> param = new HashMap<String, String>();
				param.put("applicationId", bf.getApplicationId());

				model.addWindows(Constants.TREE_SELECTION_PLUGIN, param, elResolver);
			}

			vh.setPopupPort(IViewPortHolder.POPUPPORT_ARTIFACTSELECTOR);
			repository.getStackProvider().get().savePoint();

			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("c6ef3c87-d4ac-4d62-853e-0b6d68232ca5");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings("unchecked")
	public void acceptArtifactSelection() {
		try {

			Map<String, Object> selected = (Map<String, Object>) exchange.getObject("selectedObject");

			if (selected != null) {
				String className = (String) selected.get("class");
				RepoKeyPath path = (RepoKeyPath) selected.get("path");
				if (className != null && path != null && Artifact.class.getName().equals(className)) {
					Artifact artifact = (Artifact) repository.find(path, Artifact.class);
					ModelMapper modelMapper = (ModelMapper) bf.getTreeRootRecipes().getCurrentObject();
					modelMapper.setArtifactRef(artifact);

//TODO Fix removeall

//					List<Classifier> clList = new ArrayList<>();
//					clList.addAll(modelMapper.getClassifiers());
//					modelMapper.getClassifiers().removeAll(clList);
//
//					List<MappingTecnologiy> techlList = new ArrayList<>();
//					techlList.addAll(modelMapper.getTechnologies());
//                    modelMapper.getTechnologies().removeAll(techlList);
//                    
//					List<Query> queryList = new ArrayList<>();
//					queryList.addAll(modelMapper.getQueries());
//                    modelMapper.getQueries().removeAll(queryList);

					for (Technology tech : artifact.getTechnologies()) {
						MappingTecnologiy mt = repository.create(MappingTecnologiy.class);
						mt.setTechRef(tech);
						modelMapper.getTechnologies().add(mt);
					}

				}
			}

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("c6ef3c87-d4ac-4d62-853e-0b6d68232ca5");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void rejectArtifactSelection() {
		try {
			repository.getStackProvider().get().rallbackSavePoint();

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("c6ef3c87-d4ac-4d62-853e-0b6d68232ca5");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings("rawtypes")
	public void openMappingTecnologySelector() {
		try {
			EventParameter param = event.findParameter("rowkey");
			String key = (String) param.getValue();
			String mpTechId = key.substring(0, key.indexOf(MappingTecnologiy.class.getName()));

			RepoKeyPath path = buildKey(mpTechId, MappingTecnologiy.class);
			MappingTecnologiy obj = repository.find(path, null);

			vh.setPopupPort(IViewPortHolder.POPUPPORT_TECHNOLOGYOPTIONSELECTOR);
			bf.setTechnologiesId(obj.getTechRef().getUid());
			bf.setMappingTechnologiesId(mpTechId);

			DataControl dc = (DataControl) bf.getTechnology();
			dc.forceRefresh();

			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("3670578d-3c09-4a13-a260-ad4bbd3fe412");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void acceptMappingTecnologySelection() {
		try {

			RepoKeyPath path = buildKey(bf.getMappingTechnologiesId(), MappingTecnologiy.class);
			MappingTecnologiy obj = repository.find(path, null);

			Option option = (Option) bf.getOption().getCurrentObject();
			obj.setValueRef(option);

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("3670578d-3c09-4a13-a260-ad4bbd3fe412");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void rejectMappingTecnologySelection() {
		try {

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("3670578d-3c09-4a13-a260-ad4bbd3fe412");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void openClassifierSelector() {
		try {

			WindowsPluginModel model = (WindowsPluginModel) viewModel
					.getModel(RecipesCallBackProducer.POPUP_CLASSIFIER_SELECTION_PLUGIN_WIN, "windowPlugin", null);

			if (model.getWindows().size() == 0) {
				Map<String, String> param = new HashMap<String, String>();
				model.addWindows(Constants.TECHNOLOGIES_PLUGIN, param, elResolver);
			}

			vh.setPopupPort(IViewPortHolder.POPUPPORT_CLASSIFIERSELECTOR);
			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("bde3801b-5964-4942-ba1f-29170cc3cf55");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("unchecked")
	public void acceptClassifierSelection() {
		try {

			Map<String, Object> selected = (Map<String, Object>) exchange.getObject("selectedTechnologies");

			if (selected != null) {
				String className = (String) selected.get("class");
				RepoKeyPath path = (RepoKeyPath) selected.get("path");
				if (className != null && path != null && GenerationHint.class.getName().equals(className)) {
					GenerationHint hint = repository.find(path, GenerationHint.class);
					DataControl<Classifier> dc = (DataControl<Classifier>) bf.getModelMapperClassifier();
					dc.createObject();
					Classifier classifaer = dc.getCurrentObject();
					classifaer.setHint(hint);
				}
			}
			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("bde3801b-5964-4942-ba1f-29170cc3cf55");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void rejectClassifierSelection() {
		try {
			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("bde3801b-5964-4942-ba1f-29170cc3cf55");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void openQuerySelector() {
		try {
			vh.setPopupPort(IViewPortHolder.POPUPPORT_QUERYSELECTOR);
			DataControl<?> dc = (DataControl<?>) bf.getModelQuery();
			dc.forceRefresh();

			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("a78b1d40-5611-4dcc-9b13-20551232425a");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("unchecked")
	public void acceptQuerySelection() {
		try {

			DataControl<Query> queryDc = (DataControl<Query>) bf.getQuery();
			DataControl<ModelQuery> modelqueryDc = (DataControl<ModelQuery>) bf.getModelQuery();

			ModelQuery modelquery = modelqueryDc.getCurrentObject();
			queryDc.createObject();
			Query query = queryDc.getCurrentObject();
			query.setQueryRef(modelquery);

			for (QueryParameter queryParameter : modelquery.getParameters()) {
				QueryVariable qv = repository.create(QueryVariable.class);
				query.getVariables().add(qv);
				qv.setQueryParamRef(queryParameter);
			}

			DataControl<QueryVariable> queryVariableDC = (DataControl<QueryVariable>) bf.getQueryVariable();
			queryVariableDC.forceRefresh();

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("a78b1d40-5611-4dcc-9b13-20551232425a");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void rejectQuerySelection() {
		try {
			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("a78b1d40-5611-4dcc-9b13-20551232425a");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void openConfigurationPropertySelector() {
		try {
			
			vh.setPopupPort(IViewPortHolder.POPUPPORT_CONFIGURATIONPROPERTYSELECTOR);
			repository.getStackProvider().get().savePoint();
			
			
			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("e088a00a-6375-4382-84b6-b866cef3b49b");
			responseState.addCommand(cmd1);
			

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void acceptConfigurationPropertySelection() {
		try {

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("e088a00a-6375-4382-84b6-b866cef3b49b");
			responseState.addCommand(cmd1);
			
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void rejectConfigurationPropertySelection() {
		try {
			
			repository.getStackProvider().get().rallbackSavePoint();
	
			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("e088a00a-6375-4382-84b6-b866cef3b49b");
			responseState.addCommand(cmd1);
			
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void openConfigurationHashPropertySelector() {
		try {
			
			vh.setPopupPort(IViewPortHolder.POPUPPORT_CONFIGURATIONHASHPROPERTYSELECTOR);
			repository.getStackProvider().get().savePoint();
			
			
			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("78da69c6-f056-4516-8201-87cf63ca2c3a");
			responseState.addCommand(cmd1);
			

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void acceptConfigurationHashPropertySelection() {
		try {

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("78da69c6-f056-4516-8201-87cf63ca2c3a");
			responseState.addCommand(cmd1);
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void rejectConfigurationHashPropertySelection() {
		try {

			repository.getStackProvider().get().rallbackSavePoint();
			
			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("78da69c6-f056-4516-8201-87cf63ca2c3a");
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

	@Override
	public void setEvent(EventDescription event) {
		this.event = event;

	}
}