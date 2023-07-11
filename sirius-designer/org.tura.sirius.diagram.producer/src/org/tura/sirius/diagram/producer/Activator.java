/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.sirius.diagram.producer;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator
  extends AbstractUIPlugin
{
  public static final String PLUGIN_ID = "com.turasolutions.sirius.diagram.producer";
  private static Activator plugin;
  
  public void start(BundleContext context)
    throws Exception
  {
    super.start(context);
    plugin = this;
  }
  
  public void stop(BundleContext context)
    throws Exception
  {
    plugin = null;
    super.stop(context);
  }
  
  public static Activator getDefault()
  {
    return plugin;
  }
}
