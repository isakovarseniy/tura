/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
