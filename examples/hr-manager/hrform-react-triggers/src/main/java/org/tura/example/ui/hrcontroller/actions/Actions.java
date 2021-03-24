/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.example.ui.hrcontroller.actions;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.command.base.CommandStackProvider;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.hr.objects.serialization.Company;
import org.tura.platform.hr.objects.serialization.ProxyRepository;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.EventParameter;
import org.tura.platform.uuiclient.rest.client.commands.HidePopup;
import org.tura.platform.uuiclient.rest.client.commands.OpenPopup;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;
import org.tura.platform.uuiclient.rest.client.commands.UpdateMessage;
import org.tura.platform.uuiclient.rest.events.EventAware;

public class Actions  implements EventAware {
	EventDescription event;

	private transient Logger logger = Logger.getLogger(Actions.class.getName());

	@Inject
	ELResolver elResolver;

	@Inject
	@Named("hrmanager.hrcontroller")
	CommandStack commandStack;

	@Inject
	Repository repository;

	@Inject
	ResponseState responseState;


	
	@SuppressWarnings("rawtypes")
	public void openCompanyDetailsPopup() {
		try {
			EventParameter param = event.findParameter("rowkey");
			String key = (String) param.getValue();
			String id = key.substring(0,key.indexOf("org.tura.platform.hr.objects.serialization.Company"));
			Long cmpId =  Long.parseLong (id);
			
			DataControl dc = (DataControl) elResolver
					.getValue("#{beanFactoryHrManagerHRController.popupCompanyDCProvider}");

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryHrManagerHRController}");
			bf.setCmpId(cmpId);
			dc.forceRefresh();

			dc.getCommandStack().savePoint();

			OpenPopup cmd = new OpenPopup();
			cmd.setTarget("a6e67023-511b-4630-8a98-6de2246eaea0");
			responseState.addCommand(cmd);

			
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void createCompanyPopup() {
		try {

			DataControl dc = (DataControl) elResolver
					.getValue("#{beanFactoryHrManagerHRController.popupCompanyDCProvider}");

			dc.getCommandStack().savePoint();
			dc.islolate();

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryHrManagerHRController}");

			Company cmp = (Company) dc.createObject();

			bf.setCmpId(cmp.getObjId());

			OpenPopup cmd = new OpenPopup();
			cmd.setTarget("a6e67023-511b-4630-8a98-6de2246eaea0");
			responseState.addCommand(cmd);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void saveApplication() {
		try {
			CommandStackProvider sp = new CommandStackProvider();
			sp.setCommandStack(commandStack);

			ProxyRepository proxyRepository = new ProxyRepository(repository, sp);

			proxyRepository.applyChanges(null);
			commandStack.commitSavePoint();
			
			addInfomessage("DATA_PERSISTED");
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void rallbackApplication() {
		try {
			commandStack.rallbackCommand();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void createRow(IDataControl datacontrol) {
	}

	public void createChildRow(IDataControl datacontrol) {
		try {
			TreeDataControl tdc = (TreeDataControl) datacontrol;
			ObjectControl w = (ObjectControl) tdc.getCurrentObject();
			DataControl<?> dc = (DataControl<?>) w.getAttributes().get(Constants.DATA_CONTROL);
			String rel = dc.getRelationsName().iterator().next();
			if (rel != null)
				tdc.createChildObject(rel);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void applyChanges() {
		DataControl dc = (DataControl) elResolver
				.getValue("#{beanFactoryHrManagerHRController.popupCompanyDCProvider}");
		try {
			dc.flush();
			
			HidePopup cmd = new HidePopup();
			cmd.setTarget("a6e67023-511b-4630-8a98-6de2246eaea0");

			responseState.addCommand(cmd);

			
		} catch (TuraException e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		
	}

	@SuppressWarnings("rawtypes")
	public void rallbackChanges() {

		try {
			DataControl dc = (DataControl) elResolver
					.getValue("#{beanFactoryHrManagerHRController.popupCompanyDCProvider}");
			dc.getCommandStack().rallbackSavePoint();

			HidePopup cmd = new HidePopup();
			cmd.setTarget("a6e67023-511b-4630-8a98-6de2246eaea0");

			responseState.addCommand(cmd);

			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}


	@SuppressWarnings("rawtypes")
	public boolean empDetailsEnable() {
		try {
			DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryHrManagerHRController.employee}");

			dc.getCurrentObject();
			if (dc.getScroller().size() != 0)
				return false;

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		return true;

	}

	@Override
	public void setEvent(EventDescription event) {
		this.event = event;
		
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

	
	public void nop() {
		
	}
}