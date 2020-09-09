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

package org.tura.sirius.diagram.producer.tura.config.items.type;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.tree.description.DescriptionFactory;
import org.eclipse.sirius.tree.description.TreeItemStyleDescription;
import org.eclipse.sirius.tree.description.TreeItemTool;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.tura.sirius.dsl.config.TreeItemConfigurator;
import org.tura.sirius.dsl.treediagram.tTreeItem;

public class PrimitiveConfigurator implements TreeItemConfigurator {
	public static tTreeItem create() {
		return new tTreeItem(new PrimitiveConfigurator());
	}

	public String getDomainClass() {
		return "type.Primitive";
	}

	public String getCandidates() {
		return "feature:primitives";
	}

	public String getName() {
		return "Primitive";
	}

	public TreeItemStyleDescription getStyle() {
		SystemColor backgroundColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("white");
		SystemColor labelColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("black");
		TreeItemStyleDescription style = DescriptionFactory.eINSTANCE.createTreeItemStyleDescription();
		style.setLabelSize(12);
		style.setLabelExpression("feature:name");
		style.setLabelColor(labelColor);
		style.setBackgroundColor(backgroundColor);

		return style;
	}

	public List<TreeItemTool> getTools() {
		ArrayList<TreeItemTool> tools = new ArrayList<>();
		return tools;
	}
}
