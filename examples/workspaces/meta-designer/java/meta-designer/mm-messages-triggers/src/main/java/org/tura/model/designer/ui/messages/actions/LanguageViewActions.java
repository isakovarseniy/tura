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

package org.tura.model.designer.ui.messages.actions;

import java.util.logging.Level;
import java.util.logging.Logger;

import jakarta.inject.Inject;

import org.tura.model.designer.repository.serialized.application.ApplicationLanguages;
import org.tura.model.designer.repository.serialized.message.Language;
import org.tura.model.designer.ui.messages.mmdesigner.messages.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.repository.cdi.ClientProxyRepo;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.client.commands.HidePopup;
import org.tura.platform.uuiclient.rest.client.commands.OpenPopup;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;
import org.tura.platform.uuiclient.rest.events.EventAware;

public class LanguageViewActions implements EventAware {
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
	public void setDafaultLang() {
		try {
			DataControl dc = (DataControl) bf.getApplicationLanguages();
			Language cuLang = (Language) bf.getLanguage().getCurrentObject();

			ApplicationLanguages appLang = (ApplicationLanguages) dc.getCurrentObject();
			for (Language lang : appLang.getLanguages()) {
				if (lang.getCode().equals(cuLang.getCode())) {
					lang.setDefaultLang(true);
				}else {
					lang.setDefaultLang(false);
				}
			}
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void updateSelectedLanguages() {
		HidePopup cmd = new HidePopup();
		cmd.setTarget("2fabe359-9e3d-42c5-a3e3-7f6353f9c565");

		responseState.addCommand(cmd);

	}

	public void rallbackSelectedLanguages() {
		try {
			repository.getStackProvider().get().rallbackSavePoint();

			HidePopup cmd = new HidePopup();
			cmd.setTarget("2fabe359-9e3d-42c5-a3e3-7f6353f9c565");

			responseState.addCommand(cmd);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void openLanguagesSelection() {
		try {
			DataControl dc = (DataControl) bf.getListOfLanguages();
			dc.forceRefresh();

			repository.getStackProvider().get().savePoint();

			OpenPopup cmd = new OpenPopup();
			cmd.setTarget("2fabe359-9e3d-42c5-a3e3-7f6353f9c565");
			responseState.addCommand(cmd);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@Override
	public void setEvent(EventDescription event) {
		this.event = event;

	}
}
