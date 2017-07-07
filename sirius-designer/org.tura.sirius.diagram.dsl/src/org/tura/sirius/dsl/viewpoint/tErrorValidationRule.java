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
