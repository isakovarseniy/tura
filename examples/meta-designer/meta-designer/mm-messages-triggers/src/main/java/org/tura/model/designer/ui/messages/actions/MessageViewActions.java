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

package org.tura.model.designer.ui.messages.actions;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.tura.model.designer.repository.serialized.message.Message;
import org.tura.model.designer.repository.serialized.message.Translation;
import org.tura.model.designer.ui.messages.mmdesigner.messages.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.repository.cdi.ClientProxyRepo;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.EventParameter;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;
import org.tura.platform.uuiclient.rest.events.EventAware;

public class MessageViewActions implements EventAware {

	EventDescription event;

	private transient Logger logger = Logger.getLogger(LanguageViewActions.class.getName());

	@Inject
	IBeanFactory bf;

	@Inject
	@ClientProxyRepo("mmdesigner.shared")
	private CpaRepository repository;

	@Inject
	ResponseState responseState;

	@SuppressWarnings("rawtypes")
	public void createKey() {
		try {
			DataControl dc = (DataControl) bf.getMessage();
			dc.createObject();
			Message message = (Message) dc.getCurrentObject();

			Translation translation = repository.create(Translation.class);
			message.getTranslatioins().add(translation);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings("rawtypes")
	public void createTranslation() {
		try {
			DataControl dc = (DataControl) bf.getMessage();
			Message message = (Message) dc.getCurrentObject();

			Translation translation = repository.create(Translation.class);
			message.getTranslatioins().add(translation);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings("rawtypes")
	public void deleteKey() {
		try {
			DataControl dc = (DataControl) bf.getMessage();
			dc.removeObject();

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void deleteTranslation() {
		try {
			EventParameter param = event.findParameter("rowkey");
			int key =(int) param.getValue();
			@SuppressWarnings("rawtypes")
			DataControl dc = (DataControl) bf.getTranslation();
			dc.setCurrentPosition(key);
			dc.removeObject();
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void saveApplication() {

	}

	@Override
	public void setEvent(EventDescription event) {
		this.event = event;

	}
}
