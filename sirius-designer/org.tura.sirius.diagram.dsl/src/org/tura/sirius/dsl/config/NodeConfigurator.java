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
