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

package org.tura.model.designer.ui.navigator.actions;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import org.tura.model.designer.ui.navigator.mmdesigner.navigator.datacontrol.IBeanFactory;
import org.tura.model.designer.ui.navigator.mmdesigner.navigator.viewmodel.IViewPortHolder;
import org.tura.model.designer.ui.tree.Editor;
import org.tura.model.designer.ui.tree.actions.CommonFunctions;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.command.base.OnChangeArtificialFieldTrigger;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.repository.cdi.ClientProxyRepo;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.model.TreeModel;
import org.tura.platform.uuiclient.model.ViewModel;
import org.tura.platform.uuiclient.rest.client.commands.AddWindowPluginCommand;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;

public class NavigatorViewTriggers extends CommonFunctions {

	@Inject
	@Named("viewPortHolderMmdesignerNavigator")
	IViewPortHolder viewPortHolder;

	@Inject
	@Named("beanFactoryMmdesignerNavigator")
	IBeanFactory bf;

	@Inject
	ResponseState responseState;

	@Inject
	@Named("viewmodelNavigator")
	ViewModel viewModel;

	@Inject
	@ClientProxyRepo("mmdesigner.shared")
	private CpaRepository repository;

	@Inject
	ELResolver elResolver;

	private transient Logger logger = Logger.getLogger(NavigatorViewTriggers.class.getName());

	public void switchNavigatorView(String view) {
		if ("Applications".equals(view)) {
			viewPortHolder.setNavigators("/mmdesigner/navigator/applications");
			bf.setActiveTree(IBeanFactory.APPLICATIONTREE);
			return;
		}
		if ("Types".equals(view)) {
			viewPortHolder.setNavigators("/mmdesigner/navigator/types");
			bf.setActiveTree(IBeanFactory.TYPETREE);
			return;
		}
		if ("Artifacts".equals(view)) {
			viewPortHolder.setNavigators("/mmdesigner/navigator/artifacts");
			bf.setActiveTree(IBeanFactory.ARTIFACTSTREE);
			return;
		}
		if ("DomainMappers".equals(view)) {
			viewPortHolder.setNavigators("/mmdesigner/navigator/domainMapper");
			bf.setActiveTree(IBeanFactory.DOMAINMAPPERSTREE);
			return;
		}
	}

	public void enableTreeEdit() {
		enableTreeEdit(responseState, bf.getActiveTree());
	}

	public boolean enableEditButton() {
		try {
			return enableEditButton(bf.getActiveTree(), viewModel);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		return false;
	}

	public boolean enableCreateChildrenButton() {
		try {
			return enableCreateChildrenButton(bf.getActiveTree(), viewModel);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		return false;
	}

	public boolean enableDeleteButton() {
		try {
			return enableDeleteButton(bf.getActiveTree(), viewModel);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		return false;
	}

	public void createChildren() {
		try {
			createChildren(bf.getActiveTree(), viewModel , null);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void delete() {
		try {
			delete(bf.getActiveTree(), viewModel);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void saveApplication() {
		try {
			repository.getStackProvider().get().commit();
			addInfomessage(responseState, "DATA_PERSISTED", elResolver, IBeanFactory.MESSAGES);
		} catch (Exception e) {
			addInfomessage(responseState, "ERROR_DURING_PERSISTING", elResolver, IBeanFactory.MESSAGES);
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void openEditor() {
		try {
			String id = bf.getActiveTree();
			Object m = viewModel.getModel(id);
			if (m == null) {
				return;
			} else {
			}
			TreeModel model = (TreeModel) m;
			Object obj = model.getCurrentNode().getData();
			ObjectControl w = (ObjectControl) obj;
			DataControl<?> dc = (DataControl<?>) w.getObjectControlAttributes().get(Constants.DATA_CONTROL);
			OnChangeArtificialFieldTrigger trg = dc.getOnChangeArtificialFieldTrigger();
			if (trg != null) {
				if (trg instanceof Editor) {
					AddWindowPluginCommand cmd = new AddWindowPluginCommand();
					cmd.setTrgPlugin("mmdesigner.frame");
					cmd.setTarget(org.tura.model.designer.Constants.FRAME_MAIN_VIEWPOINT);
					cmd.setParams(((Editor) trg).getEditorParameters(obj));
					cmd.setType(((Editor) trg).getEditorPluygin(obj));
					responseState.addCommand(cmd);
				} else {
					return;
				}
			} else {
				return;
			}

		} catch (Exception e) {
			addInfomessage(responseState, "ERROR_DURING_PERSISTING", elResolver, IBeanFactory.MESSAGES);
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

}
