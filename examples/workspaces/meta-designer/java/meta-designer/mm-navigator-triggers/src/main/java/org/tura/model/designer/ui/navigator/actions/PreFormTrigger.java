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

package org.tura.model.designer.ui.navigator.actions;

import jakarta.annotation.Priority;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import org.tura.model.designer.ui.navigator.mmdesigner.navigator.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.FactoryInitializeTrigger;
import org.tura.platform.datacontrol.commons.TuraException;


@Alternative
@Priority(10)
@Selector("mmdesigner.navigator")
public class PreFormTrigger implements FactoryInitializeTrigger{

	private static final long serialVersionUID = 1L;
	
	@Inject
	@Named("beanFactoryMmdesignerNavigator")
	IBeanFactory bf;


	@Override
	public void execute(Object obj) throws TuraException {
		bf.setActiveTree(IBeanFactory.APPLICATIONTREE);
	}

}
