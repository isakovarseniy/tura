/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.sirius.diagram.producer.tura.validation;

import java.util.ArrayList;
import java.util.List;

import org.tura.sirius.dsl.config.ValidationRuleConfigurator;
import org.tura.sirius.dsl.viewpoint.tErrorValidationRule;

public class RecipeValidatioin{
  public static List<ValidationRuleConfigurator> getRules(){
    ArrayList<ValidationRuleConfigurator> rules = new ArrayList<>();
    
    rules.add(new tErrorValidationRule("Ingredient name validation", "recipe.Ingredient", "Ingredient name cannot be empty ", new String[] { "aql:self.name <> null" }));
    rules.add(new tErrorValidationRule("Ingredient layer validation", "recipe.Ingredient", "Ingredient layer cannot be empty ", new String[] { "aql:self.layer <> null" }));
    
    rules.add(new tErrorValidationRule("Infrastructure name validation", "recipe.Infrastructure", "Infrastructure name cannot be empty ", new String[] { "aql:self.name <> null" }));
    rules.add(new tErrorValidationRule("Infrastructure disconected from recipe", "recipe.Infrastructure", "Wrong connection between Infrastructure and recipe", new String[] { "aql:(self.oclAsType(ecore::EObject).eContainer().oclAsType(recipe::Recipes).recipe2Infrastructures->size()-self.oclAsType(ecore::EObject).eContainer().oclAsType(recipe::Recipes).infrastructures->size()) = 0" }));
    
    rules.add(new tErrorValidationRule("Component name validation", "recipe.Component", "Component name cannot be empty ", new String[] { "aql:self.name <> null" }));
    rules.add(new tErrorValidationRule("JavaComponent artifactId  validation", "recipe.JavaComponent", "JavaComponent artifactId cannot be empty ", new String[] { "aql:self.artifactId <> null" }));
    rules.add(new tErrorValidationRule("JavaComponent  groupId validation", "recipe.JavaComponent", "JavaComponent groupId cannot be empty ", new String[] { "aql:self.groupId <> null" }));
    rules.add(new tErrorValidationRule("JavaComponent  version validation", "recipe.JavaComponent", "JavaComponent version cannot be empty ", new String[] { "aql:self.version <> null" }));
    
    rules.add(new tErrorValidationRule("Configuration  variables is compleat", "recipe.Configuration", "Configuration variables is not compleat", new String[] { "service:validateConfigVariablesIsDefine" }));
    rules.add(new tErrorValidationRule("Configuration  hashVar is compleat", "recipe.Configuration", "Configuration hashVar is not compleat", new String[] { "service:validateConfigHashVariablesIsDefine" }));
    
    rules.add(new tErrorValidationRule("ModelMapper name validation", "recipe.ModelMapper", "ModelMapper name cannot be empty ", new String[] { "aql:self.name <> null" }));
    rules.add(new tErrorValidationRule("ModelMapper artifact reference is defined", "recipe.ModelMapper", "ModelMapper artifact reference is defined", new String[] { "aql:self.artifactRef <> null" }));
    rules.add(new tErrorValidationRule("ModelMapper validate technologies", "recipe.ModelMapper", "ModelMapper teschnologies definition are not compatible with artifact", new String[] { "service:validateMappingTechnologies" }));
    
    rules.add(new tErrorValidationRule("Query validate parameters", "recipe.Query", "Query paremeters definition are not compatible with artifact", new String[] { "service:validateQueryParameters" }));
    rules.add(new tErrorValidationRule("Query name validation", "recipe.Query", "Query name cannot be empty ", new String[] { "aql:self.name <> null" }));
    
    return rules;
  }
}
