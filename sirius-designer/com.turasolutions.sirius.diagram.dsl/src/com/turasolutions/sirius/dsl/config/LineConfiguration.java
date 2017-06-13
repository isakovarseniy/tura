package com.turasolutions.sirius.dsl.config;

import java.util.List;
import org.eclipse.sirius.table.metamodel.table.description.BackgroundStyleDescription;
import org.eclipse.sirius.table.metamodel.table.description.CreateLineTool;
import org.eclipse.sirius.table.metamodel.table.description.ForegroundStyleDescription;

public abstract interface LineConfiguration
{
  public abstract String getDomainClass();
  
  public abstract String getCandidates();
  
  public abstract String getName();
  
  public abstract BackgroundStyleDescription getBackgroundStyle();
  
  public abstract ForegroundStyleDescription getForegroundStyle();
  
  public abstract String getHeaderLabelExpression();
  
  public abstract List<CreateLineTool> getCreateTools();
}
