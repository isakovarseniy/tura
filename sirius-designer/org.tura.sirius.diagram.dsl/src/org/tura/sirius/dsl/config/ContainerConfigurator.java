package org.tura.sirius.dsl.config;

import java.util.List;
import org.eclipse.sirius.diagram.ContainerLayout;
import org.eclipse.sirius.diagram.description.ConditionalContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;

public abstract interface ContainerConfigurator
{
  public abstract String getName();
  
  public abstract String getCandidates();
  
  public abstract String getDomainClass();
  
  public abstract ContainerStyleDescription getStyle();
  
  public abstract ContainerLayout getContainerLayout();
  
  public abstract List<ConditionalContainerStyleDescription> getConditionalStyle();
}
