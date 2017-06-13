package com.turasolutions.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import com.turasolutions.sirius.diagram.producer.tura.config.items.form.MenuExtensionPointConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.MenuFolderConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.MenuItemConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.MenuSeparatorConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.SubMenuConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.ToSubmenuConfigurator;
import com.turasolutions.sirius.dsl.diagram.tContainer;
import com.turasolutions.sirius.dsl.diagram.tToolSection;

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
