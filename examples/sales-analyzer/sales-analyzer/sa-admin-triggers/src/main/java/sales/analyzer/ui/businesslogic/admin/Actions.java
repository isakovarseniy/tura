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

package sales.analyzer.ui.businesslogic.admin;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.command.base.CommandStackProvider;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.EventParameter;
import org.tura.platform.uuiclient.rest.client.commands.ClearForm;
import org.tura.platform.uuiclient.rest.client.commands.HidePopup;
import org.tura.platform.uuiclient.rest.client.commands.OpenPopup;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;
import org.tura.platform.uuiclient.rest.client.commands.SwitchWindow;
import org.tura.platform.uuiclient.rest.client.commands.UpdateMessage;
import org.tura.platform.uuiclient.rest.events.EventAware;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.serialized.keycloak.Role;
import org.tura.salesanalyzer.serialized.proxy.ProxyRepository;

import sales.analyzer.commons.CachedUserPreferences;

public class Actions implements EventAware {

	EventDescription event;

	private transient Logger logger = Logger.getLogger(Actions.class.getName());

	@Inject
	ELResolver elResolver;

	@Inject
	@Named("admin.administration")
	CommandStack commandStack;

	@Inject
	Repository repository;

	@Inject
	CachedUserPreferences userPref;

	@Inject
	ResponseState responseState;

	public void clearAllUserPreferences() {
		userPref.clearAll();

		addInfomessage("CACHE_UPDATE");

	}

	@SuppressWarnings("rawtypes")
	public void openRolePopup() {
		try {
			EventParameter param = event.findParameter("rowkey");
			String key = (String) param.getValue();
			String roleId = key.substring(0, key.indexOf("org.tura.salesanalyzer.serialized.keycloak.Role"));

			DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupRole}");

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			bf.setRoleId(roleId);
			dc.forceRefresh();

			dc.getCommandStack().savePoint();
			dc.islolate();

			ClearForm cmd = new ClearForm();
			cmd.setTarget("3fe24463-83f9-4b0e-ac9b-f10bc8bcd373");
			responseState.addCommand(cmd);

			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("3fe24463-83f9-4b0e-ac9b-f10bc8bcd373");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void openPermissionPopup() {
		try {
			DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.role}");
			Role role = (Role) dc.getCurrentObject();

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			if (role != null) {
				bf.setRoleId(role.getId());
			} else {
				bf.setRoleId(null);
			}
			dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.permission}");
			dc.forceRefresh();

			dc.getCommandStack().savePoint();

			OpenPopup cmd = new OpenPopup();
			cmd.setTarget("b5254916-ca6b-42d9-83bd-81a94eafc455");
			responseState.addCommand(cmd);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}


	public void applyPermissionsModification() {
		HidePopup cmd = new HidePopup();
		cmd.setTarget("b5254916-ca6b-42d9-83bd-81a94eafc455");

		responseState.addCommand(cmd);
	}

	@SuppressWarnings("rawtypes")
	public void rallbackPermissionsModification() {
		try {
			DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.permission}");
			dc.getCommandStack().rallbackSavePoint();

			HidePopup cmd = new HidePopup();
			cmd.setTarget("b5254916-ca6b-42d9-83bd-81a94eafc455");

			responseState.addCommand(cmd);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings("rawtypes")
	public void deleteRole() {
		try {
			EventParameter param = event.findParameter("rowkey");
			String key = (String) param.getValue();
			String roleId = key.substring(0, key.indexOf("org.tura.salesanalyzer.serialized.keycloak.Role"));

			DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupRole}");

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			bf.setRoleId(roleId);
			dc.forceRefresh();
			dc.removeObject();

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void createRolePopup() {
		try {

			DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupRole}");

			dc.getCommandStack().savePoint();
			dc.islolate();

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			bf.setRoleId("UNDEFINED");

			@SuppressWarnings("unused")
			Role cmp = (Role) dc.createObject();

			ClearForm cmd = new ClearForm();
			cmd.setTarget("3fe24463-83f9-4b0e-ac9b-f10bc8bcd373");
			responseState.addCommand(cmd);

			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("3fe24463-83f9-4b0e-ac9b-f10bc8bcd373");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings("rawtypes")
	public void applyChanges() {
		DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupRole}");
		try {
			dc.flush();

			HidePopup cmd = new HidePopup();
			cmd.setTarget("3fe24463-83f9-4b0e-ac9b-f10bc8bcd373");
			responseState.addCommand(cmd);

		} catch (TuraException e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void rallbackChanges() {

		try {
			DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupRole}");
			dc.getCommandStack().rallbackSavePoint();

			HidePopup cmd = new HidePopup();
			cmd.setTarget("3fe24463-83f9-4b0e-ac9b-f10bc8bcd373");
			responseState.addCommand(cmd);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void saveApplication() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");

			CommandStackProvider sp = new CommandStackProvider();
			sp.setCommandStack(commandStack);

			@SuppressWarnings("unchecked")
			HashMap<String, DataControl<?>> h = (HashMap<String, DataControl<?>>) commandStack.getListOfCommand()[1];

			ProxyRepository proxyRepository = new ProxyRepository(repository, sp);

			proxyRepository.applyChanges(null);
			commandStack.commitSavePoint();

			DataControl<?> dc = (DataControl<?>) bf.getRoleHelper();

			if (h.containsKey(dc.getId())) {
				dc = (DataControl<?>) bf.getRole();
				dc.forceRefresh();
			}

			addInfomessage("SAVE_DATA_MESSAGE");

		} catch (Exception e) {
			addErrormessage("ERROR_MESSAGE");
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void rallbackApplication() {
		try {
			commandStack.rallbackCommand();
			addInfomessage("ROLLBACK_MESSAGE");
		} catch (Exception e) {
			addErrormessage("ERROR_MESSAGE");
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	private void addInfomessage(String key) {
		UpdateMessage cmd = new UpdateMessage();
		cmd.setTarget(IBeanFactory.MESSAGE.replaceAll("tura", "").replaceAll("_", "\\-"));
		cmd.setSeverity("info");
		cmd.setMessage("Info");
		cmd.setDetails((String) elResolver.getValue("#{Admin['" + key + "']}"));
		responseState.addCommand(cmd);
	}

	private void addErrormessage(String key) {
		UpdateMessage cmd = new UpdateMessage();
		cmd.setTarget(IBeanFactory.MESSAGE.replaceAll("tura", "").replaceAll("_", "\\-"));
		cmd.setSeverity("error");
		cmd.setMessage("Erroe");
		cmd.setDetails((String) elResolver.getValue("#{Admin['" + key + "']}"));
		responseState.addCommand(cmd);
	}

	public void logout() {
		SwitchWindow cmd = new SwitchWindow();
		cmd.setTarget("http://kc:8080/auth/realms/sales-analyzer/protocol/openid-connect/logout?redirect_uri=http://wf:8081/sa-admin-react-client/admin/administration/adminWindow");
		responseState.addCommand(cmd);

	}

	@Override
	public void setEvent(EventDescription event) {
		this.event = event;

	}

}
