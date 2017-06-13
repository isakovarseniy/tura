package com.turasolutions.sirius.diagram.producer.tura.config.items.recipe;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.viewpoint.description.tool.ExternalJavaAction;
import org.eclipse.sirius.viewpoint.description.tool.PopupMenu;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.eclipse.sirius.viewpoint.description.tool.ToolFactory;

public class RecipeContextMenu {
	public static List<ToolEntry> getMenu() {
		List<ToolEntry> tools = new ArrayList<>();

		PopupMenu menu = ToolFactory.eINSTANCE.createPopupMenu();
		menu.setPrecondition("service:enableContextMenuForModelMapper");
		menu.setName("Add deployment step");
		tools.add(menu);

		ExternalJavaAction action = ToolFactory.eINSTANCE.createExternalJavaAction();
		action.setName("Add deployment step");
		action.setId("org.tura.metamodel.sirius.diagram.actions.AddDeploymentStepActionID");

		menu.getMenuItemDescription().add(action);

		return tools;
	}
}
