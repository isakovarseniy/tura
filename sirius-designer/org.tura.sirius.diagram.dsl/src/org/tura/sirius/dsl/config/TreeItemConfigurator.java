package org.tura.sirius.dsl.config;

import java.util.List;
import org.eclipse.sirius.tree.description.TreeItemStyleDescription;
import org.eclipse.sirius.tree.description.TreeItemTool;

public abstract interface TreeItemConfigurator
{
  public abstract String getDomainClass();
  
  public abstract String getCandidates();
  
  public abstract String getName();
  
  public abstract TreeItemStyleDescription getStyle();
  
  public abstract List<TreeItemTool> getTools();
}
