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

package org.tura.sirius.diagram.producer.tura.config.items.form;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.viewpoint.description.tool.ExternalJavaAction;
import org.eclipse.sirius.viewpoint.description.tool.PopupMenu;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.eclipse.sirius.viewpoint.description.tool.ToolFactory;

public class DataControlContextMenu
{
  public static List<ToolEntry> getMenu()
  {
    List<ToolEntry> tools = new ArrayList<ToolEntry>();
    
    PopupMenu menu = ToolFactory.eINSTANCE.createPopupMenu();
    menu.setPrecondition("service:enableContextMenuForDatacontrol");
    menu.setName("Configuration");
    tools.add(menu);
    
    ExternalJavaAction action = ToolFactory.eINSTANCE.createExternalJavaAction();
    action.setName("Init Data control commands");
    action.setId("org.tura.metamodel.sirius.diagram.actions.DataControlCompressorCommandActionID");
    
    menu.getMenuItemDescription().add(action);
    
    return tools;
  }
}
