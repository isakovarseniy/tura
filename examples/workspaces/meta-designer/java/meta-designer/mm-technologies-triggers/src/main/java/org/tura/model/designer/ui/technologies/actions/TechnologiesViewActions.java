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

package org.tura.model.designer.ui.technologies.actions;

import java.util.logging.Level;
import java.util.logging.Logger;

import jakarta.inject.Inject;
import jakarta.inject.Named;

import org.tura.model.designer.ui.technologies.mmdesigner.technologies.datacontrol.IBeanFactory;
import org.tura.model.designer.ui.tree.actions.CommonFunctions;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.repository.cdi.ClientProxyRepo;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.model.ViewModel;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;

public class TechnologiesViewActions extends CommonFunctions {

	@Inject
	@Named("beanFactoryMmdesignerTechnologies")
	IBeanFactory bf;

	@Inject
	ResponseState responseState;

	@Inject
	@Named("viewmodelTechnologies")
	ViewModel viewModel;

	@Inject
	@ClientProxyRepo("mmdesigner.shared")
	private CpaRepository repository;

	@Inject
	ELResolver elResolver;

	private transient Logger logger = Logger.getLogger(TechnologiesViewActions.class.getName());

	public void enableTreeEdit() {
		enableTreeEdit(responseState, IBeanFactory.TECHNOLOGIESTREE);
	}

	public boolean enableEditButton() {
		try {
			return enableEditButton(IBeanFactory.TECHNOLOGIESTREE, viewModel);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		return false;
	}

	public boolean enableCreateChildrenButton() {
		try {
			return enableCreateChildrenButton(IBeanFactory.TECHNOLOGIESTREE, viewModel);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		return false;
	}

	public boolean enableDeleteButton() {
		try {
			return enableDeleteButton(IBeanFactory.TECHNOLOGIESTREE, viewModel);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		return false;
	}

	public void createChildren() {
		try {
			createChildren(IBeanFactory.TECHNOLOGIESTREE, viewModel, null);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void delete() {
		try {
			delete(IBeanFactory.TECHNOLOGIESTREE, viewModel);
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

}
