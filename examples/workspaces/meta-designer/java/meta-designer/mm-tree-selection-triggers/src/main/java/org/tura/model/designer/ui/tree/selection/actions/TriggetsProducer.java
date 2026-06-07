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

package org.tura.model.designer.ui.tree.selection.actions;

import jakarta.annotation.Priority;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;

import org.tura.model.designer.ui.tree.adapters.ApplicationMappersTriggers;
import org.tura.model.designer.ui.tree.adapters.AttributeTriggers;
import org.tura.model.designer.ui.tree.adapters.DomainTypesRepositoryTriggers;
import org.tura.model.designer.ui.tree.adapters.EnumeratorTriggers;
import org.tura.model.designer.ui.tree.adapters.MapperTriggers;
import org.tura.model.designer.ui.tree.adapters.OperationTriggers;
import org.tura.model.designer.ui.tree.adapters.PrimitiveTriggers;
import org.tura.model.designer.ui.tree.adapters.PrimitivesGroupTriggers;
import org.tura.model.designer.ui.tree.adapters.RootSTTriggers;
import org.tura.model.designer.ui.tree.adapters.TypeGroupTriggers;
import org.tura.model.designer.ui.tree.adapters.TypeTriggers;
import org.tura.model.designer.ui.tree.adapters.TypesAggregatorTriggers;
import org.tura.platform.datacontrol.annotations.ArtificialFieldInterceptor;
import org.tura.platform.datacontrol.annotations.Selector;

@Alternative
@Priority(10)
public class TriggetsProducer {

	@Inject
	RootSTTriggers rootSTTriggers;
	@Inject 
	DomainTypesRepositoryTriggers domainTypesRepositoryTriggers;
	@Inject
	TypesAggregatorTriggers typesAggregatorTriggers;
	@Inject
	TypeGroupTriggers typeGroupTriggers;
	@Inject
	TypeTriggers typeTriggers;
	@Inject
	EnumeratorTriggers enumeratorTriggers;
	@Inject
	OperationTriggers operationTriggers;
	@Inject
	AttributeTriggers attributeTriggers;
	@Inject
	PrimitivesGroupTriggers primitivesGroupTriggers;
	@Inject
	PrimitiveTriggers primitiveTriggers;
	@Inject
	ApplicationMappersTriggers applicationMappersTriggers;
	@Inject
	MapperTriggers mapperTriggers;

	@Produces
	@Selector("mmdesigner.treeselection")
	@ArtificialFieldInterceptor("rootST")
	public RootSTTriggers rootSTTriggersProducer() {
		return rootSTTriggers;
	}


	@Produces
	@Selector("mmdesigner.treeselection")
	@ArtificialFieldInterceptor("domainTypesRepository")
	public DomainTypesRepositoryTriggers domainTypesRepositoryTriggersProducer() {
		return domainTypesRepositoryTriggers;
	}
	
	@Produces
	@Selector("mmdesigner.treeselection")
	@ArtificialFieldInterceptor("typesAggregator")
	public TypesAggregatorTriggers typesAggregatorTriggersProducer() {
		return typesAggregatorTriggers;
	}	
	
	@Produces
	@Selector("mmdesigner.treeselection")
	@ArtificialFieldInterceptor("typeGroup")
	public TypeGroupTriggers typeGroupTriggersProducer() {
		return typeGroupTriggers;
	}		

	@Produces
	@Selector("mmdesigner.treeselection")
	@ArtificialFieldInterceptor("type")
	public TypeTriggers typeTriggersProducer() {
		return typeTriggers;
	}		
	
	@Produces
	@Selector("mmdesigner.treeselection")
	@ArtificialFieldInterceptor("enumerator")
	public EnumeratorTriggers enumeratorTriggersProducer() {
		return enumeratorTriggers;
	}		

	@Produces
	@Selector("mmdesigner.treeselection")
	@ArtificialFieldInterceptor("operation")
	public OperationTriggers operationTriggersProducer() {
		return operationTriggers;
	}		

	@Produces
	@Selector("mmdesigner.treeselection")
	@ArtificialFieldInterceptor("attribute")
	public AttributeTriggers attributeTriggersProducer() {
		return attributeTriggers;
	}		

	@Produces
	@Selector("mmdesigner.treeselection")
	@ArtificialFieldInterceptor("primitivesGroup")
	public PrimitivesGroupTriggers primitivesGroupTriggersProducer() {
		return primitivesGroupTriggers;
	}		

	
	@Produces
	@Selector("mmdesigner.treeselection")
	@ArtificialFieldInterceptor("primitive")
	public PrimitiveTriggers primitiveTriggersProducer() {
		return primitiveTriggers;
	}		
	

	@Produces
	@Selector("mmdesigner.treeselection")
	@ArtificialFieldInterceptor("applicationMappers")
	public ApplicationMappersTriggers applicationMappersTriggersProducer() {
		return applicationMappersTriggers;
	}		
	
	
	@Produces
	@Selector("mmdesigner.treeselection")
	@ArtificialFieldInterceptor("mapper")
	public MapperTriggers mapperTriggersProducer() {
		return mapperTriggers;
	}		
	
}
