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

package org.tura.model.designer.ui.artifacts.actions;

import jakarta.annotation.Priority;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;

import org.tura.model.designer.actions.ConfigHashWithNickNameTriggers;
import org.tura.model.designer.actions.ConfigVariableWithNickNameTriggers;
import org.tura.model.designer.actions.GenerationHintWithNickNameTriggers;
import org.tura.model.designer.actions.OptionTriggers;
import org.tura.platform.datacontrol.annotations.ArtificialFieldInterceptor;
import org.tura.platform.datacontrol.annotations.Selector;

@Alternative
@Priority(10)
public class TriggetsProducer {

	@Inject
	OptionTriggers optionTriggers;
	@Inject 
	GenerationHintWithNickNameTriggers generationHintWithNickNameTriggers;
	@Inject
	ConfigVariableWithNickNameTriggers configVariableWithNickNameTriggers;
	@Inject
	ConfigHashWithNickNameTriggers configHashWithNickNameTriggers;
	
	

	@Produces
	@Selector("mmdesigner.artifacts")
	@ArtificialFieldInterceptor("option")
	public OptionTriggers optionTriggersProducer() {
		return optionTriggers;
	}

	@Produces
	@Selector("mmdesigner.artifacts")
	@ArtificialFieldInterceptor("generationHintWithNickName")
	public GenerationHintWithNickNameTriggers generationHintWithNickNameTriggersProducer() {
		return generationHintWithNickNameTriggers;
	}
	
	@Produces
	@Selector("mmdesigner.artifacts")
	@ArtificialFieldInterceptor("configVariableWithNickName")
	public ConfigVariableWithNickNameTriggers configVariableWithNickNameTriggersProducer() {
		return configVariableWithNickNameTriggers;
	}

	
	@Produces
	@Selector("mmdesigner.artifacts")
	@ArtificialFieldInterceptor("configHashWithNickName")
	public ConfigHashWithNickNameTriggers configHashWithNickNameTriggersProducer() {
		return configHashWithNickNameTriggers;
	}	
	
	
}
