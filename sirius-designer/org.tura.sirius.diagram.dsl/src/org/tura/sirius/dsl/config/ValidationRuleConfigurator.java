package org.tura.sirius.dsl.config;

import org.eclipse.sirius.viewpoint.description.validation.ValidationRule;

public abstract interface ValidationRuleConfigurator
{
  public abstract ValidationRule getRule();
}
