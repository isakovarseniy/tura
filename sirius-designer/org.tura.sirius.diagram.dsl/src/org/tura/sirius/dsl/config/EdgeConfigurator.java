package org.tura.sirius.dsl.config;

import java.util.List;
import org.eclipse.sirius.diagram.description.ConditionalEdgeStyleDescription;
import org.eclipse.sirius.diagram.description.style.EdgeStyleDescription;

public abstract interface EdgeConfigurator
{
  public abstract String getName();
  
  public abstract String getCandidates();
  
  public abstract String getDomainClass();
  
  public abstract EdgeStyleDescription getStyle();
  
  public abstract String getSourceFinderExpression();
  
  public abstract String getTargetFinderExpression();
  
  public abstract List<String> getSource();
  
  public abstract List<String> getTarget();
  
  public abstract List<ConditionalEdgeStyleDescription> getConditionalStyle();
  
  public abstract String getPreConditionExpression();
}
