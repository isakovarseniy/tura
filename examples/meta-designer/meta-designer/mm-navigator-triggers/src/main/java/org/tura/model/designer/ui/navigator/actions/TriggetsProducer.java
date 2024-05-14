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

package org.tura.model.designer.ui.navigator.actions;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import org.tura.model.designer.ui.tree.adapters.ApplicationGroupTrigger;
import org.tura.model.designer.ui.tree.adapters.ApplicationMapperTriggers;
import org.tura.model.designer.ui.tree.adapters.ApplicationMappersTriggers;
import org.tura.model.designer.ui.tree.adapters.ApplicationMessageLibrariesTriggers;
import org.tura.model.designer.ui.tree.adapters.ApplicationMessageLibraryTriggers;
import org.tura.model.designer.ui.tree.adapters.ApplicationRealmTriggers;
import org.tura.model.designer.ui.tree.adapters.ApplicationRealmsTriggers;
import org.tura.model.designer.ui.tree.adapters.ApplicationRecipeTriggers;
import org.tura.model.designer.ui.tree.adapters.ApplicationRecipesTriggers;
import org.tura.model.designer.ui.tree.adapters.ApplicationStyleLibrariesTriggers;
import org.tura.model.designer.ui.tree.adapters.ApplicationStyleTriggers;
import org.tura.model.designer.ui.tree.adapters.ApplicationTrigger;
import org.tura.model.designer.ui.tree.adapters.ApplicationUILayerTriggers;
import org.tura.model.designer.ui.tree.adapters.ApplicationUIPackageTriggers;
import org.tura.model.designer.ui.tree.adapters.ArtifactGroupTrigger;
import org.tura.model.designer.ui.tree.adapters.ControlsTriggers;
import org.tura.model.designer.ui.tree.adapters.DomainApplicationTriggers;
import org.tura.model.designer.ui.tree.adapters.DomainApplicationsTriggers;
import org.tura.model.designer.ui.tree.adapters.DomainArtifactTriggers;
import org.tura.model.designer.ui.tree.adapters.DomainArtifactsTriggers;
import org.tura.model.designer.ui.tree.adapters.DomainMapperTriggers;
import org.tura.model.designer.ui.tree.adapters.DomainMappersTriggers;
import org.tura.model.designer.ui.tree.adapters.DomainTypesRepositoryTriggers;
import org.tura.model.designer.ui.tree.adapters.DomainTypesTrigger;
import org.tura.model.designer.ui.tree.adapters.FormTriggers;
import org.tura.model.designer.ui.tree.adapters.MessageLibraryTriggers;
import org.tura.model.designer.ui.tree.adapters.ObjectMapperGroupTriggers;
import org.tura.model.designer.ui.tree.adapters.PrimitivesGroupTriggers;
import org.tura.model.designer.ui.tree.adapters.RecipesTriggers;
import org.tura.model.designer.ui.tree.adapters.TypeGroupTriggers;
import org.tura.model.designer.ui.tree.adapters.ViewsTriggers;
import org.tura.platform.datacontrol.annotations.ArtificialFieldInterceptor;
import org.tura.platform.datacontrol.annotations.PostCreate;
import org.tura.platform.datacontrol.annotations.Selector;

@Alternative
@Priority(10)
public class TriggetsProducer {

	@Inject
	ApplicationGroupTrigger applicationGroupTrigger;
	@Inject
	ApplicationMappersTriggers applicationMappersTriggers;
	@Inject
	ApplicationMapperTriggers applicationMapperTriggers;
	@Inject
	ApplicationMessageLibrariesTriggers applicationMessageLibrariesTriggers;
	@Inject
	ApplicationMessageLibraryTriggers applicationMessageLibraryTriggers;
	@Inject
	ApplicationRealmsTriggers applicationRealmsTriggers;
	@Inject
	ApplicationRealmTriggers applicationRealmTriggers;
	@Inject
	ApplicationRecipesTriggers applicationRecipesTriggers;
	@Inject
	ApplicationRecipeTriggers applicationRecipeTriggers;
	@Inject
	ApplicationStyleLibrariesTriggers applicationStyleLibrariesTriggers;
	@Inject
	ApplicationStyleTriggers applicationStyleTriggers;
	@Inject
	ApplicationTrigger applicationTrigger;
	@Inject
	ApplicationUILayerTriggers applicationUILayerTriggers;
	@Inject
	ApplicationUIPackageTriggers applicationUIPackageTriggers;
	@Inject
	ArtifactGroupTrigger artifactGroupTrigger;
	@Inject
	ControlsTriggers controlsTriggers;
	@Inject
	DomainApplicationsTriggers domainApplicationsTriggers;
	@Inject
	DomainApplicationTriggers domainApplicationTriggers;
	@Inject
	DomainArtifactsTriggers domainArtifactsTriggers;;
	@Inject
	DomainArtifactTriggers domainArtifactTriggers;
	@Inject
	DomainMappersTriggers domainMappersTriggers;
	@Inject
	DomainMapperTriggers domainMapperTriggers;
	@Inject
	DomainTypesRepositoryTriggers domainTypesRepositoryTriggers;
	@Inject
	DomainTypesTrigger domainTypesTrigger;
	@Inject
	FormTriggers formTriggers;
	@Inject
	MessageLibraryTriggers messageLibraryTriggers;
	@Inject
	ObjectMapperGroupTriggers objectMapperGroupTriggers;
	@Inject
	PrimitivesGroupTriggers primitivesGroupTriggers;
	@Inject
	RecipesTriggers recipesTriggers;
	@Inject
	TypeGroupTriggers typeGroupTriggers;
	@Inject
	ViewsTriggers viewsTriggers;

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("domainApplications")
	public DomainApplicationsTriggers domainApplicationsTriggersProducer() {
		return domainApplicationsTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("applicationGroup")
	public ApplicationGroupTrigger applicationGroupTriggerProducer() {
		return applicationGroupTrigger;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("applicationMappers")
	public ApplicationMappersTriggers applicationMappersTriggersProducer() {
		return applicationMappersTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("applicationMapper")
	public ApplicationMapperTriggers applicationMapperTriggersProducer() {
		return applicationMapperTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("applicationMessageLibraries")
	public ApplicationMessageLibrariesTriggers applicationMessageLibrariesTriggersProducer() {
		return applicationMessageLibrariesTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("applicationMessageLibrary")
	public ApplicationMessageLibraryTriggers applicationMessageLibraryTriggersProducer() {
		return applicationMessageLibraryTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("applicationRealms")
	public ApplicationRealmsTriggers applicationRealmsTriggersProducer() {
		return applicationRealmsTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("applicationRealm")
	public ApplicationRealmTriggers applicationRealmTriggersProducer() {
		return applicationRealmTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("applicationRecipes")
	public ApplicationRecipesTriggers applicationRecipesTriggersProducer() {
		return applicationRecipesTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("applicationRecipe")
	public ApplicationRecipeTriggers applicationRecipeTriggersProducer() {
		return applicationRecipeTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("applicationStyleLibraries")
	public ApplicationStyleLibrariesTriggers applicationStyleLibrariesTriggersProducer() {
		return applicationStyleLibrariesTriggers;

	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("applicationStyle")
	public ApplicationStyleTriggers applicationStyleTriggersProducer() {
		return applicationStyleTriggers;

	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("application")
	@PostCreate("application")
	public ApplicationTrigger applicationTriggerProducer() {
		return applicationTrigger;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("applicationUILayer")
	public ApplicationUILayerTriggers applicationUILayerTriggersProducer() {
		return applicationUILayerTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("controls")
	public ControlsTriggers controlsTriggersProducer() {
		return controlsTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("domainApplication")
	public DomainApplicationTriggers domainApplicationTriggersProducer() {
		return domainApplicationTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("domainArtifacts")
	public DomainArtifactsTriggers domainArtifactsTriggersProducer() {
		return domainArtifactsTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("domainArtifact")
	public DomainArtifactTriggers domainArtifactTriggersProducer() {
		return domainArtifactTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("artifactGroup")
	public ArtifactGroupTrigger artifactGroupTriggerProducer() {
		return artifactGroupTrigger;
	}
	
	
	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("domainMappers")
	public DomainMappersTriggers domainMappersTriggersProducer() {
		return domainMappersTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("domainMapper")
	public DomainMapperTriggers domainMapperTriggersProducer() {
		return domainMapperTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("domainTypesRepository")
	public DomainTypesRepositoryTriggers domainTypesRepositoryTriggersProducer() {
		return domainTypesRepositoryTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("domainTypes")
	public DomainTypesTrigger domainTypesTriggerProducer() {
		return domainTypesTrigger;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("form")
	public FormTriggers formTriggersProducer() {
		return formTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("messageLibrary")
	public MessageLibraryTriggers messageLibraryTriggersProducer() {
		return messageLibraryTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("objectMapperGroup")
	public ObjectMapperGroupTriggers objectMapperGroupTriggersProducer() {
		return objectMapperGroupTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("primitivesGroup")
	public PrimitivesGroupTriggers primitivesGroupTriggersProducer() {
		return primitivesGroupTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("recipes")
	public RecipesTriggers recipesTriggersProducer() {
		return recipesTriggers;
	}

	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("typeGroup")
	public TypeGroupTriggers typeGroupTriggersProducer()  {
		return typeGroupTriggers;
	}
	
	
	@Produces
	@Selector("mmdesigner.navigator")
	@ArtificialFieldInterceptor("views")
	public  ViewsTriggers  viewsTriggersProducer() {
		return viewsTriggers;
	}	
	
	
}
