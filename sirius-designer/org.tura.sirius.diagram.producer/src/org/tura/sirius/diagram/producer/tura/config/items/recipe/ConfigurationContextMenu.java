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

package org.tura.sirius.diagram.producer.tura.config.items.recipe;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.viewpoint.description.tool.ExternalJavaAction;
import org.eclipse.sirius.viewpoint.description.tool.PopupMenu;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.eclipse.sirius.viewpoint.description.tool.ToolFactory;

public class ConfigurationContextMenu {
	public static List<ToolEntry> getMenu() {
		List<ToolEntry> tools = new ArrayList<>();

		PopupMenu menu = ToolFactory.eINSTANCE.createPopupMenu();
		menu.setPrecondition("service:enableContextMenuForConfiguration");
		menu.setName("Configuration");
		tools.add(menu);

		ExternalJavaAction action = ToolFactory.eINSTANCE.createExternalJavaAction();
		action.setName("Config variables");
		action.setId("org.tura.metamodel.sirius.diagram.actions.ConfigVariablesActionID");

		menu.getMenuItemDescription().add(action);

		action = ToolFactory.eINSTANCE.createExternalJavaAction();
		action.setName("Config hash variables");
		action.setId("org.tura.metamodel.sirius.diagram.actions.ConfigHashVariablesActionID");

		menu.getMenuItemDescription().add(action);

		return tools;
	}
}
