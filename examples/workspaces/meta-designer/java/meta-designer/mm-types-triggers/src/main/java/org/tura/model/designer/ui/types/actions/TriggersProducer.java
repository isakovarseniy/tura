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
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;

import org.tura.model.designer.ui.tree.adapters.AssosiationTriggers;
import org.tura.model.designer.ui.tree.adapters.GeneralizationTriggers;
import org.tura.model.designer.ui.tree.adapters.TypeElementTriggers;
import org.tura.platform.datacontrol.annotations.ArtificialFieldInterceptor;
import org.tura.platform.datacontrol.annotations.Selector;

@Alternative
@Priority(10)
public class TriggersProducer {

	@Inject
	TypeElementTriggers typeElementTriggers;
	
	@Inject
	GeneralizationTriggers generalizationTriggers;
	
	@Inject
	AssosiationTriggers assosiationTriggers;
	
	@Produces
    @Selector("mmdesigner.types") 
	@ArtificialFieldInterceptor("typeElement")
	public TypeElementTriggers typeElementTriggersProducer() {
		return typeElementTriggers;
	}
	
	
	@Produces
    @Selector("mmdesigner.types") 
	@ArtificialFieldInterceptor("generalization")
	public GeneralizationTriggers generalizationTriggersProducer() {
		return generalizationTriggers;
	}	
	
	
	@Produces
    @Selector("mmdesigner.types") 
	@ArtificialFieldInterceptor("assosiation")
	public AssosiationTriggers assosiationTriggersProducer() {
		return assosiationTriggers;
	}		
	
}
