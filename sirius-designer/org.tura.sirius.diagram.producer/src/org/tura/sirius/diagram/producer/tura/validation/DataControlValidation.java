/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

public class DataControlValidation{
  public static List<ValidationRuleConfigurator> getRules(){
    ArrayList<ValidationRuleConfigurator> rules = new ArrayList<>();
    
    rules.add(new tErrorValidationRule("DataControl name validation", "form.DataControl", "DataControl name cannot be empty ", new String[] { "aql:self.name <> null" }));
    rules.add(new tErrorValidationRule("DataControl name repetition validation", "form.DataControl", "form.DataControl cannot have same name ", new String[] { "aql:self.oclAsType(ecore::EObject).eContainer().oclAsType(form::Controls).controls->select(q|q.oclAsType(form::DataControl).name = self.name)->size()=1" }));
    rules.add(new tErrorValidationRule("Create method definition validation", "form.DataControl", "Create method  is not defined", new String[] { "aql:self.create <> null" }));
    rules.add(new tErrorValidationRule("Insert method definition validation", "form.DataControl", "Insert method  is not defined", new String[] { "aql:self.insert <> null" }));
    rules.add(new tErrorValidationRule("Update method definition validation", "form.DataControl", "Update method  is not defined", new String[] { "aql:self.update <> null" }));
    rules.add(new tErrorValidationRule("Delete method definition validation", "form.DataControl", "Delete method  is not defined", new String[] { "aql:self.remove <> null" }));
    rules.add(new tErrorValidationRule("Search method definition validation", "form.DataControl", "Search method  is not defined", new String[] { "aql:self.search <> null" }));
    rules.add(new tErrorValidationRule("Base type  definition validation", "form.DataControl", "Base type  is not defined", new String[] { "aql:self.baseType <> null  and self.baseType.typeRef <> null" }));
    rules.add(new tErrorValidationRule("Artificial field name validation", "form.ArtificialField", "ArtificialField name cannot be empty ", new String[] { "aql:self.name <> null" }));
    rules.add(new tErrorValidationRule("Artificial name repetition validation", "form.ArtificialField", "form.ArtificialField cannot have same name ", new String[] { "aql:self.oclAsType(ecore::EObject).eContainer().oclAsType(form::DataControl).artificialFields->select(q|q.oclAsType(form::ArtificialField).name = self.name)->size()=1" }));
    rules.add(new tErrorValidationRule("Relation validation", "form.Relation", "form.Relation has wrong description of master detail ", new String[] { "service:validateRelation" }));
    
    return rules;
  }
}
