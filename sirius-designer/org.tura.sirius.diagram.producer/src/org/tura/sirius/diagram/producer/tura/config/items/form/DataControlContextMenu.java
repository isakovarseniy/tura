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
