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

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.repository.cdi.ClientProxyRepo;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.client.commands.HidePopup;
import org.tura.platform.uuiclient.rest.client.commands.OpenPopup;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;
import org.tura.platform.uuiclient.rest.events.EventAware;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.IBeanFactory;

public class ActionsLocation implements EventAware {

	EventDescription event;

	private transient Logger logger = Logger.getLogger(Actions.class.getName());

	public static String STATE = "State";
	public static String CITY = "City";

	@Inject
	ELResolver elResolver;

	@Inject
	@ClientProxyRepo("admin.administration")
	private CpaRepository repository;

	@Inject
	ResponseState responseState;

	@SuppressWarnings("rawtypes")
	public void openUserStatePopup() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			bf.setUserSwitch(STATE);
			DataControl dc = (DataControl) bf.getUserSelection();
			dc.forceRefresh();

			repository.getStackProvider().get().savePoint();

			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("67701feb-9693-4915-9b74-817030f44d86");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings("rawtypes")
	public void openUserCityPopup() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			bf.setUserSwitch(CITY);
			DataControl dc = (DataControl) bf.getUserSelection();
			dc.forceRefresh();

			repository.getStackProvider().get().savePoint();

			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("67701feb-9693-4915-9b74-817030f44d86");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void applyUserModification() {
		try {
			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("67701feb-9693-4915-9b74-817030f44d86");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void rallbackUserModification() {
		try {
			repository.getStackProvider().get().rallbackSavePoint();

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("67701feb-9693-4915-9b74-817030f44d86");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void setAdmin() {

	}

	@Override
	public void setEvent(EventDescription event) {
		this.event = event;
	}

}
