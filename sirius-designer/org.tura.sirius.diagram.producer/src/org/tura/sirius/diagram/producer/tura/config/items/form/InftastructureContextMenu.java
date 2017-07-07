package org.tura.sirius.diagram.producer.tura.config.items.form;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.viewpoint.description.tool.ExternalJavaAction;
import org.eclipse.sirius.viewpoint.description.tool.PopupMenu;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.eclipse.sirius.viewpoint.description.tool.ToolFactory;

public class InftastructureContextMenu {
	public static List<ToolEntry> getMenu() {
		List<ToolEntry> tools = new ArrayList<ToolEntry>();

		PopupMenu menu = ToolFactory.eINSTANCE.createPopupMenu();
		menu.setPrecondition("service:enableContextMenuForInfrastructure");
		menu.setName("Recipe processing");
		tools.add(menu);

		ExternalJavaAction action = ToolFactory.eINSTANCE.createExternalJavaAction();
		action.setName("Run generation");
		action.setId("org.tura.metamodel.sirius.properties.actions.RunGenerationActionID");

		menu.getMenuItemDescription().add(action);

		action = ToolFactory.eINSTANCE.createExternalJavaAction();
		action.setName("Run deployment");
		action.setId("org.tura.metamodel.sirius.properties.actions.RunDeploymentActionID");

		menu.getMenuItemDescription().add(action);

		return tools;
	}
}
