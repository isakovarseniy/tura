/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.example.ui.hrmanager.testform2.triggers;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import org.tura.example.ui.hrmanager.testform2.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.TreePath;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.cdi.ClientProxyRepo;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.model.TreeModel;
import org.tura.platform.uuiclient.model.ViewModel;
import org.tura.platform.uuiclient.model.tree.TreeNode;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;
import org.tura.platform.uuiclient.rest.client.commands.UpdateMessage;
import org.tura.platform.uuiclient.rest.events.EventAware;

public class TestForm2Actions implements EventAware {
	EventDescription event;

	private transient Logger logger = Logger.getLogger(TestForm2Actions.class.getName());

	@Inject
	ELResolver elResolver;

	@Inject
	@Named("viewmodelTestForm2")
	ViewModel viewModel;

	@Inject
	@ClientProxyRepo("hrmanager.testform2")
	private CpaRepository repository;

	@Inject
	ResponseState responseState;

	public void save() {
		try {
			repository.getStackProvider().get().commit();

			addInfomessage("DATA_PERSISTED");
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void rallback() {
		try {
			repository.getStackProvider().get().rallbackCommand();
			addInfomessage("DATA_ROLLEDBACK");
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void createRow(IDataControl datacontrol) {
		try {
			TreeModel model = (TreeModel) viewModel.getModel(IBeanFactory.FULLTREE, "tree", null);
			TreeNode node = model.getContextSelectedNode();
			if (node != null && node.getData() != null) {
				TreeDataControl tdc = (TreeDataControl) datacontrol;
				TreePath[] path = node.getPath().toArray(new TreePath[node.getPath().size()] );
				tdc.setCurrentPosition(path);
				tdc.createObject();
			}
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void createChildRow(IDataControl datacontrol) {
		try {
			TreeModel model = (TreeModel) viewModel.getModel(IBeanFactory.FULLTREE, "tree", null);
			TreeNode node = model.getContextSelectedNode();
			if (node != null && node.getData() != null) {
				TreeDataControl tdc = (TreeDataControl) datacontrol;
				TreePath[] path = node.getPath().toArray(new TreePath[node.getPath().size()] );
				tdc.setCurrentPosition(path);

				ObjectControl oc = (ObjectControl) node.getData();
				DataControl<?> dc = (DataControl<?>) oc.getObjectControlAttributes().get(Constants.DATA_CONTROL);
				String rel = dc.getRelationsName().iterator().next();
				if (rel != null) {
					tdc.createChildObject(rel);
				}
			}

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}


	public void removeRow(IDataControl datacontrol) {
		try {
			TreeModel model = (TreeModel) viewModel.getModel(IBeanFactory.FULLTREE, "tree", null);
			TreeNode node = model.getContextSelectedNode();
			if (node != null && node.getData() != null) {
				TreeDataControl tdc = (TreeDataControl) datacontrol;
				TreePath[] path = node.getPath().toArray(new TreePath[node.getPath().size()] );
				if ( tdc.setCurrentPosition(path)) {
					tdc.getCurrentObject();
					tdc.removeObject();
				}else {
					throw new TuraException("Cannot set position for removing");
				}
			}
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	private void addInfomessage(String key) {
		UpdateMessage cmd = new UpdateMessage();
		cmd.setTarget(IBeanFactory.MESSAGES.replaceAll("tura", "").replaceAll("_", "\\-"));
		cmd.setSeverity("info");
		cmd.setMessage("Info");
		cmd.setDetails((String) elResolver.getValue("#{HRController['" + key + "']}"));
		responseState.addCommand(cmd);
	}

	@SuppressWarnings("unused")
	private void addErrormessage(String key) {
		UpdateMessage cmd = new UpdateMessage();
		cmd.setTarget(IBeanFactory.MESSAGES.replaceAll("tura", "").replaceAll("_", "\\-"));
		cmd.setSeverity("error");
		cmd.setMessage("Erroe");
		cmd.setDetails((String) elResolver.getValue("#{HRController['" + key + "']}"));
		responseState.addCommand(cmd);
	}

	@Override
	public void setEvent(EventDescription event) {
		this.event = event;

	}

}
