package org.tura.sirius.dsl.config;

import org.eclipse.sirius.table.metamodel.table.description.BackgroundStyleDescription;
import org.eclipse.sirius.table.metamodel.table.description.ForegroundStyleDescription;

public abstract interface ColumnConfiguration
{
  public abstract String getFeatureName();
  
  public abstract String getName();
  
  public abstract BackgroundStyleDescription getBackgroundStype();
  
  public abstract ForegroundStyleDescription getForegroundStyle();
}
