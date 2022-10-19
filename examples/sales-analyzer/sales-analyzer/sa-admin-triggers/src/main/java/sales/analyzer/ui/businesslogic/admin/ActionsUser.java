/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.repository.cdi.ClientProxyRepo;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.EventParameter;
import org.tura.platform.uuiclient.rest.client.commands.ClearForm;
import org.tura.platform.uuiclient.rest.client.commands.HidePopup;
import org.tura.platform.uuiclient.rest.client.commands.OpenPopup;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;
import org.tura.platform.uuiclient.rest.events.EventAware;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.serialized.keycloak.RoleReference;
import org.tura.salesanalyzer.serialized.keycloak.User;

public class ActionsUser implements EventAware {

	EventDescription event;
	private transient Logger logger = Logger.getLogger(Actions.class.getName());

	@Inject
	ELResolver elResolver;

	@Inject
	@ClientProxyRepo("admin.administration")
	private CpaRepository repository;

	@Inject
	ResponseState responseState;
	
	
	@Inject
	@Named("beanFactoryAdminAdministration")
	IBeanFactory bf;

	@SuppressWarnings("rawtypes")
	public void openUserPopup() {
		try {

			EventParameter param = event.findParameter("rowkey");
			String username = (String) param.getValue();

			DataControl dc = (DataControl) bf.getPopupUser();

			bf.setUserId(username);
			dc.forceRefresh();

			repository.getStackProvider().get().savePoint();

			ClearForm cmd = new ClearForm();
			cmd.setTarget("7488ec14-1cff-4352-98de-0612597e7ccc");
			responseState.addCommand(cmd);

			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("7488ec14-1cff-4352-98de-0612597e7ccc");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void openUserSelectorPopup() {
		try {
			DataControl dc = (DataControl) bf.getUser();
			
			User user = (User) dc.getCurrentObject();

			if (user != null) {
				bf.setUserId(user.getUsername());
			} else {
				bf.setUserId(null);
			}
			dc = (DataControl) bf.getPopupUser();
			dc.forceRefresh();

			repository.getStackProvider().get().savePoint();

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings("rawtypes")
	public void createUserPopup() {
		try {

			DataControl dc  =  (DataControl) bf.getPopupUser();

			repository.getStackProvider().get().savePoint();
			
			dc.createObject();

			ClearForm cmd = new ClearForm();
			cmd.setTarget("7488ec14-1cff-4352-98de-0612597e7ccc");
			responseState.addCommand(cmd);

			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("7488ec14-1cff-4352-98de-0612597e7ccc");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void applyUserChanges() {
		try {
			HidePopup cmd = new HidePopup();
			cmd.setTarget("7488ec14-1cff-4352-98de-0612597e7ccc");

			bf.setUserGridUpdated(true);

			responseState.addCommand(cmd);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void rallbackUserChanges() {

		try {
			repository.getStackProvider().get().rallbackSavePoint();
			HidePopup cmd = new HidePopup();
			cmd.setTarget("7488ec14-1cff-4352-98de-0612597e7ccc");

			responseState.addCommand(cmd);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void applyRolesModification() {

		HidePopup cmd = new HidePopup();
		cmd.setTarget("c31bf961-55f2-4daf-80be-a5cb69b0abee");
		responseState.addCommand(cmd);

	}

	public void rallbackRolessModification() {
		try {
			repository.getStackProvider().get().rallbackSavePoint();

			HidePopup cmd = new HidePopup();
			cmd.setTarget("c31bf961-55f2-4daf-80be-a5cb69b0abee");
			responseState.addCommand(cmd);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings("rawtypes")
	public void deleteUser() {
		try {

			EventParameter param = event.findParameter("rowkey");
			String username = (String) param.getValue();

			DataControl dc = (DataControl) bf.getPopupUser();
			bf.setUserId(username);
			dc.forceRefresh();
			dc.removeObject();

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void openRoleSelectorPopup() {
		try {

			DataControl dc = (DataControl) bf.getRoleSelector();
			dc.forceRefresh();

			repository.getStackProvider().get().savePoint();

			OpenPopup cmd = new OpenPopup();
			cmd.setTarget("c31bf961-55f2-4daf-80be-a5cb69b0abee");
			responseState.addCommand(cmd);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void deleteRoleRef() {
		try {
			EventParameter param = event.findParameter("rowkey");
			String rolename = (String) param.getValue();

			User user = (User) bf.getUser().getCurrentObject();

			int i = 0;
			boolean found = false;
			for (RoleReference roleRef : user.getRoleReference()) {
				if (roleRef.getRole().getName(). equals(rolename)) {
					found = true;
					break;
				}
				i++;
			}
			if (found) {
				user.getRoleReference().remove(i);
			}
			DataControl dc =    (DataControl) bf.getRoleReference();
			dc.forceRefresh();
			

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@Override
	public void setEvent(EventDescription event) {
		this.event = event;

	}

}