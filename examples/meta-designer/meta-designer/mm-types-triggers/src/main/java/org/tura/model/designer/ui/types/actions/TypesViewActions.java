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

package org.tura.model.designer.ui.types.actions;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import org.tura.model.designer.exchange.CdiAppExchange;
import org.tura.model.designer.ui.types.mmdesigner.types.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.FormPrm;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.cdi.ClientProxyRepo;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.model.FormParameters;
import org.tura.platform.uuiclient.model.ViewModel;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;

public class TypesViewActions {

	@Inject
	@Named("beanFactoryMmdesignerTypes")
	IBeanFactory bf;

	@Inject
	ResponseState responseState;

	@Inject
	@Named("viewmodelTypes")
	ViewModel viewModel;

	@Inject
	@ClientProxyRepo("mmdesigner.shared")
	private CpaRepository repository;

	@Inject
	ELResolver elResolver;

	@Inject
	@FormPrm
	FormParameters formParameters;

	private transient Logger logger = Logger.getLogger(TypesViewActions.class.getName());

	@SuppressWarnings("rawtypes")
	public void createPrimitive() throws TuraException {
		try {
			DataControl dc = (DataControl) bf.getPrimitive();
			dc.createObject();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

}
