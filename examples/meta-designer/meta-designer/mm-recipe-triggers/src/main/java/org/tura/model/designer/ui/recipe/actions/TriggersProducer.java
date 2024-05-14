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

package org.tura.model.designer.ui.recipe.actions;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import org.tura.model.designer.actions.OptionTriggers;
import org.tura.model.designer.ui.tree.adapters.ClassifierTriggers;
import org.tura.model.designer.ui.tree.adapters.ComponentTriggers;
import org.tura.model.designer.ui.tree.adapters.ConfigExtensionTriggers;
import org.tura.model.designer.ui.tree.adapters.ConfigurationTriggers;
import org.tura.model.designer.ui.tree.adapters.HashPropertyTriggers;
import org.tura.model.designer.ui.tree.adapters.Infrastructure2ConfigurationTriggers;
import org.tura.model.designer.ui.tree.adapters.InfrastructureTriggers;
import org.tura.model.designer.ui.tree.adapters.IngredientTriggers;
import org.tura.model.designer.ui.tree.adapters.MappingTecnologiyTriggers;
import org.tura.model.designer.ui.tree.adapters.ModelMapperTriggers;
import org.tura.model.designer.ui.tree.adapters.PropertyTriggers;
import org.tura.model.designer.ui.tree.adapters.QueryTriggers;
import org.tura.model.designer.ui.tree.adapters.QueryVariableTriggers;
import org.tura.model.designer.ui.tree.adapters.RecipeTriggers;
import org.tura.platform.datacontrol.annotations.ArtificialFieldInterceptor;
import org.tura.platform.datacontrol.annotations.Selector;

@Alternative
@Priority(10)
public class TriggersProducer {

	@Inject
	RecipesTriggers recipesTriggers;
	
	@Inject
	RecipeTriggers recipeTriggers;
	
	@Inject
	IngredientTriggers ingredientTriggers;
	
	@Inject
	ComponentTriggers componentTriggers;
	
	@Inject
	ModelMapperTriggers modelMapperTriggers;
	
	@Inject
	InfrastructureTriggers infrastructureTriggers;
	
	@Inject
	Infrastructure2ConfigurationTriggers infrastructure2ConfigurationTriggers;
	
	@Inject
	ConfigurationTriggers configurationTriggers;
	
	@Inject
	ConfigExtensionTriggers configExtensionTriggers;
	
	@Inject
	RecipeMappersTriggers recipeMappersTriggers;
	
	@Inject
	MappingTecnologiyTriggers mappingTecnologiyTriggers;
	
	@Inject
	ClassifierTriggers classifierTriggers;

	@Inject
	QueryTriggers queryTriggers;
	
	@Inject
	QueryVariableTriggers queryVariableTriggers;
	
	@Inject
	PropertyTriggers propertyTriggers;
	
	@Inject
	HashPropertyTriggers hashPropertyTriggers;
	
	@Inject
	OptionTriggers optionTriggers;

	
	
	@Produces
    @Selector("mmdesigner.recipe") 
	@ArtificialFieldInterceptor("option")
	public OptionTriggers optionTriggersProducer() {
		return optionTriggers;
	}
	
	@Produces
    @Selector("mmdesigner.recipe") 
	@ArtificialFieldInterceptor("hashProperty")
	public HashPropertyTriggers hashPropertyTriggersProducer() {
		return hashPropertyTriggers;
	}
	
	
	@Produces
    @Selector("mmdesigner.recipe") 
	@ArtificialFieldInterceptor("property")
	public PropertyTriggers propertyTriggersProducer() {
		return propertyTriggers;
	}

	@Produces
    @Selector("mmdesigner.recipe") 
	@ArtificialFieldInterceptor("queryVariable")
	public QueryVariableTriggers queryVariableTriggersProducer() {
		return queryVariableTriggers;
	}
	
	
	@Produces
    @Selector("mmdesigner.recipe") 
	@ArtificialFieldInterceptor("query")
	public QueryTriggers queryTriggersProducer() {
		return queryTriggers;
	}
	
	
	@Produces
    @Selector("mmdesigner.recipe") 
	@ArtificialFieldInterceptor("modelMapperClassifier")
	public ClassifierTriggers modelMapperClassifierTriggersProducer() {
		return classifierTriggers;
	}
	
	
	@Produces
    @Selector("mmdesigner.recipe") 
	@ArtificialFieldInterceptor("mappingTecnologiy")
	public MappingTecnologiyTriggers mappingTecnologiyTriggersProducer() {
		return mappingTecnologiyTriggers;
	}
	
	
	@Produces
    @Selector("mmdesigner.recipe") 
	@ArtificialFieldInterceptor("configExtension")
	public ConfigExtensionTriggers configExtensionTriggersProducer() {
		return configExtensionTriggers;
	}
	
	@Produces
    @Selector("mmdesigner.recipe") 
	@ArtificialFieldInterceptor("configuration")
	public ConfigurationTriggers configurationTriggersProducer() {
		return configurationTriggers;
	}
	
	
	@Produces
    @Selector("mmdesigner.recipe") 
	@ArtificialFieldInterceptor("infrastructure2Configuration")
	public Infrastructure2ConfigurationTriggers infrastructure2ConfigurationTriggersProducer() {
		return infrastructure2ConfigurationTriggers;
	}
	
	
	@Produces
    @Selector("mmdesigner.recipe") 
	@ArtificialFieldInterceptor("infrastructure")
	public InfrastructureTriggers infrastructureTriggersProducer() {
		return infrastructureTriggers;
	}
	
	
	@Produces
    @Selector("mmdesigner.recipe") 
	@ArtificialFieldInterceptor("recipes")
	public RecipesTriggers recipesTriggersProducer() {
		return recipesTriggers;
	}

	
	@Produces
	@Selector("mmdesigner.recipe")
	@ArtificialFieldInterceptor("recipe")
	public RecipeTriggers recipeTriggersProducer() {
		return recipeTriggers;
	}
	
	@Produces
	@Selector("mmdesigner.recipe")
	@ArtificialFieldInterceptor("component")
	public ComponentTriggers componentTriggersProducer() {
		return componentTriggers;
	}

	@Produces
	@Selector("mmdesigner.recipe")
	@ArtificialFieldInterceptor("modelMapper")
	public ModelMapperTriggers modelMapperTriggersProducer() {
		return modelMapperTriggers;
	}
	
	
	@Produces
	@Selector("mmdesigner.recipe")
	@ArtificialFieldInterceptor("ingredient")
	public IngredientTriggers ingredientTriggersProducer() {
		return ingredientTriggers;
	}

	@Produces
	@Selector("mmdesigner.recipe")
	@ArtificialFieldInterceptor("recipeMappers")
	public RecipeMappersTriggers recipeMappersTriggersProducer() {
		return recipeMappersTriggers;
	}
	
}
