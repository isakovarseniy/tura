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

package org.tura.model.designer.ui.technologies.actions;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import org.tura.model.designer.ui.tree.adapters.ConfigHashAggregatorTriggers;
import org.tura.model.designer.ui.tree.adapters.ConfigHashTriggers;
import org.tura.model.designer.ui.tree.adapters.ConfigVariableAggregatorTriggers;
import org.tura.model.designer.ui.tree.adapters.ConfigVariableTriggers;
import org.tura.model.designer.ui.tree.adapters.GenerationHintAggregatorTriggers;
import org.tura.model.designer.ui.tree.adapters.GenerationHintTriggers;
import org.tura.model.designer.ui.tree.adapters.TechLeafTriggers;
import org.tura.model.designer.ui.tree.technologies.adapters.DomainArtifactsTriggers;
import org.tura.platform.datacontrol.annotations.ArtificialFieldInterceptor;
import org.tura.platform.datacontrol.annotations.Selector;

@Alternative
@Priority(10)
public class TriggetsProducer {

	@Inject
	private TechLeafTriggers techLeafTriggers;
	@Inject
	private ConfigHashAggregatorTriggers configHashAggregatorTriggers;
	@Inject
	private ConfigVariableAggregatorTriggers configVariableAggregatorTriggers;
	@Inject
	private ConfigHashTriggers configHashTriggers;
	@Inject
	private ConfigVariableTriggers configVariableTriggers;
	@Inject
	private GenerationHintTriggers generationHintTriggers;
	@Inject
	private GenerationHintAggregatorTriggers generationHintAggregatorTriggers;
	@Inject 
	private DomainArtifactsTriggers domainArtifactsTriggers;
	
	
	@Produces
	@Selector("mmdesigner.technologies")
	@ArtificialFieldInterceptor("domainArtifacts")
	public DomainArtifactsTriggers domainArtifactsTriggersProducer() {
		return domainArtifactsTriggers;
	}
	

	@Produces
	@Selector("mmdesigner.technologies")
	@ArtificialFieldInterceptor("techLeaf")
	public TechLeafTriggers techLeafTriggersProducer() {
		return techLeafTriggers;
	}

	@Produces
	@Selector("mmdesigner.technologies")
	@ArtificialFieldInterceptor("configHash")
	public ConfigHashTriggers configHashTriggersProducer() {
		return configHashTriggers;
	}

	@Produces
	@Selector("mmdesigner.technologies")
	@ArtificialFieldInterceptor("configVariable")
	public ConfigVariableTriggers configVariableTriggersProducer() {
		return configVariableTriggers;
	}
	
	@Produces
	@Selector("mmdesigner.technologies")
	@ArtificialFieldInterceptor("configHashAggregator")
	public ConfigHashAggregatorTriggers configHashAggregatorTriggersProducer() {
		return configHashAggregatorTriggers;
	}

	@Produces
	@Selector("mmdesigner.technologies")
	@ArtificialFieldInterceptor("configVariableAggregator")
	public ConfigVariableAggregatorTriggers configVariableAggregatorTriggersProducer() {
		return configVariableAggregatorTriggers;
	}
	
	@Produces
	@Selector("mmdesigner.technologies")
	@ArtificialFieldInterceptor("generationHint")
	public GenerationHintTriggers generationHintTriggersProducer() {
		return generationHintTriggers;
	}

	
	@Produces
	@Selector("mmdesigner.technologies")
	@ArtificialFieldInterceptor("generationHintAggregator")
	public GenerationHintAggregatorTriggers generationHintAggregatorTriggersProducer() {
		return generationHintAggregatorTriggers;
	}	
	
}
