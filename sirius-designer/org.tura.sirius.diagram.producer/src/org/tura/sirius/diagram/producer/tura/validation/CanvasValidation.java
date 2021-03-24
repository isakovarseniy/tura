/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

public class CanvasValidation{
  public static List<ValidationRuleConfigurator> getRules(){
    ArrayList<ValidationRuleConfigurator> rules = new ArrayList<>();
    
    rules.add(new tErrorValidationRule("Is Menu pointer defined ", "form.Menu", "Menu pointer cannot be empty ", new String[] { "aql:self.menu <> null" }));
    rules.add(new tErrorValidationRule("Is Source pointer defined ", "form.SourcesPointer", "Source pointer cannot be empty ", new String[] { "service:validateSourcesPointer" }));
    rules.add(new tErrorValidationRule("Is Value pointer defined ", "form.SourcesPointer", "Value pointer cannot be empty ", new String[] { "service:validateValuePointer" }));
    rules.add(new tErrorValidationRule("Is OptionSelection Source pointer defined ", "form.OptionSelection", "OptionSelection pointer cannot be empty ", new String[] { "service:validateOptionSelectionSourcesPointer" }));
    rules.add(new tErrorValidationRule("Is DropDownSelection Selection", "form.DropDownSelection", "DropDownSelection Selection cannot be empty ", new String[] { "service:validateOptionSelectionSelection" }));
    rules.add(new tErrorValidationRule("Is Selection Display value pointer defined ", "form.Selection", " Selection Display value pointer cannot be empty ", new String[] { "service:validateSelectionDisplayOption" }));
    rules.add(new tErrorValidationRule("Is Selection Value value pointer defined ", "form.Selection", " Selection value pointer cannot be empty ", new String[] { "service:validateSelectionValuePointer" }));
    
    return rules;
  }
}
