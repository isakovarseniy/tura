package org.tura.sirius.dsl.config;

import java.util.List;
import org.eclipse.sirius.diagram.description.ConditionalNodeStyleDescription;
import org.eclipse.sirius.diagram.description.style.NodeStyleDescription;

public abstract interface NodeConfigurator
{
  public abstract String getName();
  
  public abstract String getCandidates();
  
  public abstract String getDomainClass();
  
  public abstract NodeStyleDescription getStyle();
  
  public abstract String getPreConditionExpression();
  
  public abstract List<ConditionalNodeStyleDescription> getConditionalStyle();
}
