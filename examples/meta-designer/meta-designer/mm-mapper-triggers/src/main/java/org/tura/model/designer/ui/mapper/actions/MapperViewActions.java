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

package org.tura.model.designer.ui.mapper.actions;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import org.tura.model.designer.Constants;
import org.tura.model.designer.exchange.CdiAppExchange;
import org.tura.model.designer.repository.serialized.application.ApplicationMapperProxy;
import org.tura.model.designer.repository.serialized.application.ApplicationMappersProxy;
import org.tura.model.designer.repository.serialized.application.ApplicationProxy;
import org.tura.model.designer.repository.serialized.mapper.CSSMapper;
import org.tura.model.designer.repository.serialized.mapper.Version;
import org.tura.model.designer.repository.serialized.mapper.VersionRef;
import org.tura.model.designer.repository.serialized.style.StyleLibrary;
import org.tura.model.designer.repository.serialized.type.PackagePointer;
import org.tura.model.designer.repository.serialized.type.Type;
import org.tura.model.designer.repository.serialized.type.TypeGroup;
import org.tura.model.designer.repository.serialized.type.TypePointer;
import org.tura.model.designer.ui.mapper.mmdesigner.mapper.datacontrol.IBeanFactory;
import org.tura.model.designer.ui.mapper.mmdesigner.mapper.viewmodel.IViewPortHolder;
import org.tura.model.designer.ui.tree.actions.CommonFunctions;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.FormPrm;
import org.tura.platform.repository.cdi.ClientProxyRepo;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.model.FormParameters;
import org.tura.platform.uuiclient.model.ViewModel;
import org.tura.platform.uuiclient.model.WindowsPluginModel;
import org.tura.platform.uuiclient.rest.client.commands.HidePopup;
import org.tura.platform.uuiclient.rest.client.commands.OpenPopup;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;

public class MapperViewActions extends CommonFunctions{

	@Inject
	ResponseState responseState;

	@Inject
	@ClientProxyRepo("mmdesigner.shared")
	private CpaRepository repository;

	@Inject
	ELResolver elResolver;

	@Inject
	IViewPortHolder viewPortHolder;

	@Inject
	IBeanFactory bf;

	@Inject
	@Named("viewmodelMapper")
	private ViewModel viewModel;

	@Inject
	private CdiAppExchange exchange;
	
	@Inject
	@FormPrm
	FormParameters formParameters;

	private transient Logger logger = Logger.getLogger(MapperViewActions.class.getName());

	@SuppressWarnings({ "rawtypes" })
	public void switchToJavaClassMapper() {
		try {
			bf.setActiveIndex(0);
			viewPortHolder.setMappersPort(IViewPortHolder.MAPPERSPORT_JAVACLASSMAPPER);
			bf.setMapperFilter(PreFormTrigger.JAVACLASS_MAPPER);
			DataControl dc = (DataControl) bf.getMapper();
			dc.forceRefresh();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings({ "rawtypes" })
	public void switchToJavaPackageMapper() {
		try {
			bf.setActiveIndex(1);
			viewPortHolder.setMappersPort(IViewPortHolder.MAPPERSPORT_JAVAPACKAGEMAPPER);
			bf.setMapperFilter(PreFormTrigger.JAVAPACKAGE_MAPPER);
			DataControl dc = (DataControl) bf.getMapper();
			dc.forceRefresh();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings({ "rawtypes" })
	public void switchToJavaScriptMapper() {
		try {
			bf.setActiveIndex(2);
			viewPortHolder.setMappersPort(IViewPortHolder.MAPPERSPORT_JAVASCRIPTMAPPER);
			bf.setMapperFilter(PreFormTrigger.JAVASCRIPT_MAPPER);
			DataControl dc = (DataControl) bf.getMapper();
			dc.forceRefresh();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings({ "rawtypes" })
	public void switchToCSSStyleMapper() {
		try {
			bf.setActiveIndex(3);
			viewPortHolder.setMappersPort(IViewPortHolder.MAPPERSPORT_CSSMAPPER);
			bf.setMapperFilter(PreFormTrigger.CSS_MAPPER);
			DataControl dc = (DataControl) bf.getMapper();
			dc.forceRefresh();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings({ "rawtypes" })
	public void switchToMetamodelMapper() {
		try {
			bf.setActiveIndex(4);
			viewPortHolder.setMappersPort(IViewPortHolder.MAPPERSPORT_METAMODELMAPPER);
			bf.setMapperFilter(PreFormTrigger.METAMODEL_MAPPER);
			DataControl dc = (DataControl) bf.getMapper();
			dc.forceRefresh();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void openConextSelection() {
		try {
			viewPortHolder.setPopUpPort(IViewPortHolder.POPUPPORT_POPUPCONTEXTSELECTIONCANVAS);
			WindowsPluginModel model = (WindowsPluginModel) viewModel
					.getModel(ConfigMapperCallbackProducer.POPUP_CONTEXT_SELECTION_PLUGIN_WIN, "windowPlugin", null);
			if (model.getWindows().size() == 0) {
				ApplicationMapperProxy applicationMapper = (ApplicationMapperProxy) bf.getApplicationMapper()
						.getCurrentObject();
				ApplicationMappersProxy applicationMappers = (ApplicationMappersProxy) applicationMapper.eContainer();
				ApplicationProxy application = (ApplicationProxy) applicationMappers.eContainer();
				Map<String, String> param = new HashMap<String, String>();
				param.put("applicationId", application.getUid());

				model.addWindows(Constants.TREE_SELECTION_PLUGIN, param, elResolver);
			}

			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("65414ce8-fb80-4a91-8f09-36d0a1402dfd");
			responseState.addCommand(cmd1);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void acceptSelectedObject() {
		try {
			if (IViewPortHolder.MAPPERSPORT_JAVACLASSMAPPER.equals(viewPortHolder.getMappersPort())) {
				formParameters.getRequest().getTopUpdateElementIds().add(toId(IBeanFactory.JAVACALSSMAPPINGTYPE));
				acceptType();
			}
			if (IViewPortHolder.MAPPERSPORT_JAVAPACKAGEMAPPER.equals(viewPortHolder.getMappersPort())) {
				formParameters.getRequest().getTopUpdateElementIds().add(toId(IBeanFactory.JAVAPACKAGEMAPPINGTYPE));
				acceptPackage();
			}
			if (IViewPortHolder.MAPPERSPORT_CSSMAPPER.equals(viewPortHolder.getMappersPort())) {
				formParameters.getRequest().getTopUpdateElementIds().add(toId(IBeanFactory.CSSMAPPINGTYPE));
				acceptCss();
			}
			if (IViewPortHolder.MAPPERSPORT_JAVASCRIPTMAPPER.equals(viewPortHolder.getMappersPort())) {
				formParameters.getRequest().getTopUpdateElementIds().add(toId(IBeanFactory.JAVASCRIPTCLASSMAPPINGTYPE));
				acceptType();
			}
			if (IViewPortHolder.MAPPERSPORT_METAMODELMAPPER.equals(viewPortHolder.getMappersPort())) {
				formParameters.getRequest().getTopUpdateElementIds().add(toId(IBeanFactory.METAMODELPACKAGEMAPPINGTYPE));
				acceptPackage();
			}

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("65414ce8-fb80-4a91-8f09-36d0a1402dfd");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("unchecked")
	private void acceptCss() throws Exception {
		Map<String, Object> selected = (Map<String, Object>) exchange.getObject("selectedObject");

		if (selected != null) {
			String className = (String) selected.get("class");
			RepoKeyPath path = (RepoKeyPath) selected.get("path");
			if (className != null && path != null && TypeGroup.class.getName().equals(className)) {
				CSSMapper mapper = (CSSMapper) bf.getMapper().getCurrentObject();
				StyleLibrary lib = (StyleLibrary) repository.find(path, StyleLibrary.class);
				mapper.setStyleLibrary(lib);
			}
		}

	}

	@SuppressWarnings("unchecked")
	private void acceptPackage() throws Exception {
		Map<String, Object> selected = (Map<String, Object>) exchange.getObject("selectedObject");

		if (selected != null) {
			String className = (String) selected.get("class");
			RepoKeyPath path = (RepoKeyPath) selected.get("path");
			if (className != null && path != null && TypeGroup.class.getName().equals(className)) {
				PackagePointer mapper = (PackagePointer) bf.getMapper().getCurrentObject();
				TypeGroup pkg = (TypeGroup) repository.find(path, TypeGroup.class);
				mapper.setPackageRef(pkg);
			}
		}

	}

	@SuppressWarnings("unchecked")
	private void acceptType() throws Exception {
		Map<String, Object> selected = (Map<String, Object>) exchange.getObject("selectedObject");
		if (selected != null) {
			String className = (String) selected.get("class");
			RepoKeyPath path = (RepoKeyPath) selected.get("path");
			if (className != null && path != null && Type.class.getName().equals(className)) {
				TypePointer mapper = (TypePointer) bf.getMapper().getCurrentObject();
				Type type = (Type) repository.find(path, Type.class);
				mapper.setTypeRef(type);
			}
		}

	}

	public void rejectSelectedObject() {
		try {
			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("65414ce8-fb80-4a91-8f09-36d0a1402dfd");
			responseState.addCommand(cmd1);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void openVersionSelection() {
		try {
			viewPortHolder.setPopUpPort(IViewPortHolder.POPUPPORT_POPUPVERSIONSELECTIONCANVAS);
			WindowsPluginModel model = (WindowsPluginModel) viewModel
					.getModel(ConfigMapperCallbackProducer.POPUP_VERSION_SELECTION_PLUGIN_WIN, "windowPlugin", null);
			if (model.getWindows().size() == 0) {
				ApplicationMapperProxy applicationMapper = (ApplicationMapperProxy) bf.getApplicationMapper()
						.getCurrentObject();
				ApplicationMappersProxy applicationMappers = (ApplicationMappersProxy) applicationMapper.eContainer();
				Map<String, String> param = new HashMap<String, String>();
				param.put("appMappersId", applicationMappers.getUid());

				model.addWindows(Constants.VERSIONS_SELECTION_PLUGIN, param, elResolver);
			}

			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("beb49cc7-1bfe-4a31-89b1-b1d4a723f6ff");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("unchecked")
	public void acceptSelectedVersion() {
		try {
			Map<String, Object> selected = (Map<String, Object>) exchange.getObject("selectedObject");

			if (selected != null) {
				String className = (String) selected.get("class");
				RepoKeyPath path = (RepoKeyPath) selected.get("path");
				if (className != null && path != null && Version.class.getName().equals(className)) {
					VersionRef mapper = (VersionRef) bf.getMapper().getCurrentObject();
					Version ver = (Version) repository.find(path, Version.class);
					mapper.setVersionRef(ver);
				}
			}

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("beb49cc7-1bfe-4a31-89b1-b1d4a723f6ff");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void rejectSelectedVersion() {
		try {
			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("beb49cc7-1bfe-4a31-89b1-b1d4a723f6ff");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void openLayerSelection() {
		try {
			repository.getStackProvider().get().savePoint();
			
			viewPortHolder.setPopUpPort(IViewPortHolder.POPUPPORT_POPUPLAYERSSELECTIONCANVAS);
			if (bf.getAppMappersId() == null) {
				ApplicationMapperProxy applicationMapper = (ApplicationMapperProxy) bf.getApplicationMapper()
						.getCurrentObject();
				ApplicationMappersProxy applicationMappers = (ApplicationMappersProxy) applicationMapper.eContainer();
				bf.setAppMappersId(applicationMappers.getUid());
			}

			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("2a789cbc-c8cb-4d67-8ad7-89a7801b0b66");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void acceptSelectedLayers() {
		try {
			DataControl dc =  (DataControl) bf.getMapped2Layer();
			dc.forceRefresh();
			
			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("2a789cbc-c8cb-4d67-8ad7-89a7801b0b66");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void rejectSelectedLayers() {
		try {
			repository.getStackProvider().get().rallbackSavePoint();
			
			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("2a789cbc-c8cb-4d67-8ad7-89a7801b0b66");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	
	public void saveApplication() {
		try {
			repository.getStackProvider().get().commit();
			addInfomessage(responseState, "DATA_PERSISTED",elResolver,IBeanFactory.MESSAGES);
		} catch (Exception e) {
			addInfomessage(responseState, "ERROR_DURING_PERSISTING",elResolver,IBeanFactory.MESSAGES);
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}
	
	public void createMapper() {
		try {
			bf.getMapper().createObject();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		
	}
	
	
	public void removeMapper() {
		try {
			
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		
	}
	
}
