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

package org.tura.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import org.tura.sirius.diagram.producer.tura.config.items.form.MenuExtensionPointConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.MenuFolderConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.MenuItemConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.MenuSeparatorConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.SubMenuConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.ToSubmenuConfigurator;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.diagram.tToolSection;

public class MenuDiagram {
	public List<Object> getChildrens() {
		ArrayList<Object> list = new ArrayList<Object>();

		tContainer cnt = MenuFolderConfigurator.create().addChild(MenuItemConfigurator.create())
				.addChild(SubMenuConfigurator.create()).addChild(MenuExtensionPointConfigurator.create())
				.addChild(MenuSeparatorConfigurator.create());

		list.add(cnt);
		list.add(ToSubmenuConfigurator.create());

		tToolSection nodeToolSection = new tToolSection("Nodes");
		list.add(nodeToolSection);
		nodeToolSection.addChildrens(MenuFolderConfigurator.getTools());
		nodeToolSection.addChildrens(MenuItemConfigurator.getTools());
		nodeToolSection.addChildrens(SubMenuConfigurator.getTools());
		nodeToolSection.addChildrens(MenuExtensionPointConfigurator.getTools());
		nodeToolSection.addChildrens(MenuSeparatorConfigurator.getTools());

		tToolSection edgeToolSection = new tToolSection("Connections");
		list.add(edgeToolSection);
		edgeToolSection.addChildrens(ToSubmenuConfigurator.getTools());

		return list;
	}
}
