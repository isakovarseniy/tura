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

package org.tura.model.designer.ui.types.actions;

import jakarta.annotation.Priority;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import org.tura.model.designer.Constants;
import static org.tura.model.designer.ui.tree.actions.CommonFunctions.fromd;
import org.tura.model.designer.ui.types.mmdesigner.types.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.FactoryInitializeTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.uuiclient.model.ViewModel;
import org.tura.platform.uuiclient.model.WindowsPluginModel;

@Alternative
@Priority(10)
@Selector("mmdesigner.types")
public class PreFormTrigger implements  FactoryInitializeTrigger{

	private static final long serialVersionUID = 1L;

	
	@Inject
	@Named("beanFactoryMmdesignerTypes")
	private IBeanFactory bf;

	@Inject
	@Named("viewmodelTypes")
	private ViewModel viewModel;
	
	@Inject
	private ELResolver elResolver;
	
	
	
	@Override
	public void execute(Object obj) throws TuraException {
		
		WindowsPluginModel model = (WindowsPluginModel) viewModel.getModel(fromd(Constants.TYPE_PROPERTIES_PLUGIN_WIN),"windowPlugin", null);
		model.addWindows(Constants.PROPERTIES_PLUGIN, null, elResolver);
		
		
	}

}
