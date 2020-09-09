/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
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

public class TypeValidation{
  public static List<ValidationRuleConfigurator> getRules(){
    ArrayList<ValidationRuleConfigurator> rules = new ArrayList<>();
    
    rules.add(new tErrorValidationRule("Type name validation", "type.Type", "Type name cannot be empty ", new String[] { "aql:self.name <> null" }));
    rules.add(new tErrorValidationRule("Type name repetition validation", "type.Type", "Type cannot have same name ", new String[] { "aql:self.oclAsType(ecore::EObject).eContainer().oclAsType(type::TypeGroup).types->select(q|q.oclAsType(type::TypeElement).name = self.name)->size()=1" }));
    
    rules.add(new tErrorValidationRule("Enumerator name validation", "type.Enumerator", "Enumerator name cannot be empty ", new String[] { "aql:self.name <> null" }));
    rules.add(new tErrorValidationRule("Enumerator name repetition validation", "type.Enumerator", "Enumerator cannot have same name ", new String[] { "aql:self.oclAsType(ecore::EObject).eContainer().oclAsType(type::TypeGroup).types->select(q|q.oclAsType(type::TypeElement).name = self.name)->size()=1" }));
    
    rules.add(new tErrorValidationRule("TypePointer typeRef validation", "type.TypePointer", "TypePointer typeRef cannot be empty ", new String[] { "aql:self.typeRef <> null" }));
    
    rules.add(new tErrorValidationRule("Attribute name validation", "type.Attribute", "Attribute name cannot be empty ", new String[] { "aql:self.name <> null" }));
    rules.add(new tErrorValidationRule("Attribute type validation", "type.Attribute", "Attribute type cannot be empty ", new String[] { "aql:self.typeRef <> null" }));
    rules.add(new tErrorValidationRule("Attribute name repetition validation", "type.Attribute", "Attributes cannot have same name ", new String[] { "aql:self.oclAsType(ecore::EObject).eContainer().oclAsType(type::Type).attributes->select(q|q.oclAsType(type::Attribute).name = self.name)->size()=1" }));
    
    rules.add(new tErrorValidationRule("EnumAttribute name validation", "type.EnumAttribute", "EnumAttribute name cannot be empty ", new String[] { "aql:self.name <> null" }));
    
    rules.add(new tErrorValidationRule("Operation name validation", "type.Operation", "Operation name cannot be empty ", new String[] { "aql:self.name <> null" }));
    rules.add(new tErrorValidationRule("Operation return type  validation", "type.Operation", "Operation return type cannot be empty ", new String[] { "aql:self.returnValue <> null" }));
    
    return rules;
  }
}
