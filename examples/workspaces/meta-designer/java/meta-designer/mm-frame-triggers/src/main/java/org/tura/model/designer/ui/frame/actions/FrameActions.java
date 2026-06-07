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

package org.tura.model.designer.ui.frame.actions;

import java.util.logging.Level;
import java.util.logging.Logger;

import jakarta.inject.Inject;

import org.tura.model.designer.ui.frame.mmdesigner.frame.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.repository.cdi.ClientProxyRepo;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;
import org.tura.platform.uuiclient.rest.client.commands.UpdateMessage;
import org.tura.platform.uuiclient.rest.events.EventAware;

public class FrameActions implements EventAware {

	EventDescription event;

	private transient Logger logger = Logger.getLogger(FrameActions.class.getName());

	@Inject
	@ClientProxyRepo("mmdesigner.shared")
	private CpaRepository repository;
	
	@Inject
	ELResolver elResolver;
	
	@Inject
	ResponseState responseState;
	

	public void applyChanges() {
		try {
			repository.getStackProvider().get().commit();

			addInfomessage("DATA_PERSISTED");
		} catch (Exception e) {
			addInfomessage("ERROR_DURING_PERSISTING");
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}
	public void rollBack() {

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
		cmd.setDetails((String) elResolver.getValue("#{Frame['" + key + "']}"));
		responseState.addCommand(cmd);
	}

	@SuppressWarnings("unused")
	private void addErrormessage(String key) {
		UpdateMessage cmd = new UpdateMessage();
		cmd.setTarget(IBeanFactory.MESSAGES.replaceAll("tura", "").replaceAll("_", "\\-"));
		cmd.setSeverity("error");
		cmd.setMessage("Erroe");
		cmd.setDetails((String) elResolver.getValue("#{Frame['" + key + "']}"));
		responseState.addCommand(cmd);
	}
	
}
