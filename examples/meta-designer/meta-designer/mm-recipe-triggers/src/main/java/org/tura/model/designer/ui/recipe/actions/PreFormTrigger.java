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
import javax.inject.Inject;

import org.tura.model.designer.repository.serialized.recipe.ConfigExtension;
import org.tura.model.designer.repository.serialized.recipe.Configuration;
import org.tura.model.designer.repository.serialized.recipe.Infrastructure;
import org.tura.model.designer.repository.serialized.recipe.Infrastructure2Configuration;
import org.tura.model.designer.repository.serialized.recipe.Ingredient;
import org.tura.model.designer.repository.serialized.recipe.JavaComponent;
import org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent;
import org.tura.model.designer.repository.serialized.recipe.ModelMapper;
import org.tura.model.designer.repository.serialized.recipe.Recipe;
import org.tura.model.designer.ui.recipe.mmdesigner.recipe.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.FactoryInitializeTrigger;
import org.tura.platform.datacontrol.commons.TuraException;

@Alternative
@Priority(10)
@Selector("mmdesigner.recipe")
public class PreFormTrigger implements FactoryInitializeTrigger{

	private static final long serialVersionUID = 1L;
	
	public static String RECIPE_CONSTANT = Recipe.class.getName(); 
	public static String INGREDIENT_CONSTANT = Ingredient.class.getName();
	public static String JAVA_COMPONENT_CONSTANT = JavaComponent.class.getName();
	public static String JAVA_SCRIPT_COMPONENT_CONSTANT = JavaScriptComponent.class.getName();
	public static String MODELMAPPER_CONSTANT = ModelMapper.class.getName();
	public static String INFRASTRUCTURE_CONSTANT = Infrastructure.class.getName();
	public static String INFRASTRUCTURE2CONFIGURATION_CONSTANT = Infrastructure2Configuration.class.getName();
	public static String CONFIGURATION_CONSTANT = Configuration.class.getName();
	public static String CONFIGURATION_EXTENSION_CONSTANT =  ConfigExtension.class.getName();
	
	public static String VIEWLAYERS_SELECTOR_CONSTANT = "VIEWLAYERS_SELECTOR_CONSTANT";
	public static String MODELLAYERS_SELECTOR_CONSTANT = "MODELLAYERS_SELECTOR_CONSTANT";
	
	
	
	@Inject
	private IBeanFactory bf;
	
	@Override
	public void execute(Object obj) throws TuraException {
		bf.setRecipeConstant(RECIPE_CONSTANT);
		bf.setIngredientConstant(INGREDIENT_CONSTANT);
		bf.setJavaComponentConstant(JAVA_COMPONENT_CONSTANT);
		bf.setJavaScriptComponentConstant(JAVA_SCRIPT_COMPONENT_CONSTANT);
		bf.setModelMapperConstant(MODELMAPPER_CONSTANT);
		bf.setInfrastructureConstant(INFRASTRUCTURE_CONSTANT);
		bf.setInfrastructure2ConfigurationConstant(INFRASTRUCTURE2CONFIGURATION_CONSTANT);
		bf.setConfigurationConstant(CONFIGURATION_CONSTANT);
		bf.setConfigurationExtensionConstant(CONFIGURATION_EXTENSION_CONSTANT);
		
		bf.setViewLayersSelectorConstant(VIEWLAYERS_SELECTOR_CONSTANT);
		bf.setModelLayersSelectorConstant(MODELLAYERS_SELECTOR_CONSTANT);
		
	}

}
