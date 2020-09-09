/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

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
