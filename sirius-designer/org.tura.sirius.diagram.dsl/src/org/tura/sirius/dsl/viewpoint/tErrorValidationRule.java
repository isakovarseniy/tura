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

package org.tura.sirius.dsl.viewpoint;

import org.eclipse.sirius.viewpoint.description.validation.ERROR_LEVEL;
import org.eclipse.sirius.viewpoint.description.validation.ValidationRule;

public class tErrorValidationRule
  extends tValidationRule
{
  public tErrorValidationRule(String name, String context, String message, String[] validations)
  {
    super(name, context, message, validations);
  }
  
  public ValidationRule getRule()
  {
    ValidationRule rule = super.getRule();
    rule.setLevel(ERROR_LEVEL.ERROR_LITERAL);
    return rule;
  }
}
