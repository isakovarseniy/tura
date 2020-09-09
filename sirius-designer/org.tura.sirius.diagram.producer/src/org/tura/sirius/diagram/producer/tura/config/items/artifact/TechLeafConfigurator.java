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

package org.tura.sirius.diagram.producer.tura.config.items.artifact;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.tree.description.DescriptionFactory;
import org.eclipse.sirius.tree.description.TreeItemEditionTool;
import org.eclipse.sirius.tree.description.TreeItemStyleDescription;
import org.eclipse.sirius.tree.description.TreeItemTool;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;
import org.eclipse.sirius.viewpoint.description.tool.ToolFactory;
import org.tura.sirius.dsl.config.TreeItemConfigurator;
import org.tura.sirius.dsl.treediagram.ToolHelper;
import org.tura.sirius.dsl.treediagram.tTreeItem;

public class TechLeafConfigurator implements TreeItemConfigurator {
	public static tTreeItem create() {
		return new tTreeItem(new TechLeafConfigurator());
	}

	public String getDomainClass() {
		return "artifact.TechLeaf";
	}

	public String getCandidates() {
		return "feature:techLeafs";
	}

	public String getName() {
		return "Technology";
	}

	public TreeItemStyleDescription getStyle() {
		SystemColor backgroundColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("white");
		SystemColor labelColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("red");
		TreeItemStyleDescription style = DescriptionFactory.eINSTANCE.createTreeItemStyleDescription();
		style.setLabelSize(12);
		style.setLabelExpression("feature:name");
		style.setLabelColor(labelColor);
		style.setBackgroundColor(backgroundColor);

		return style;
	}

	public List<TreeItemTool> getTools() {
		List<TreeItemTool> tools = new ArrayList<TreeItemTool>();
		tools.addAll(new TecnologiesTreeConfigurator().getTools());

		tools.add(getDirectEditLabel());
		return tools;
	}

	private static TreeItemTool getDirectEditLabel() {
		TreeItemEditionTool tool = DescriptionFactory.eINSTANCE.createTreeItemEditionTool();
		tool.setName("Technology edit label");

		tool.setMask(ToolHelper.getEditMaskVariables("{0}"));
		tool.setElement(ToolHelper.getElementDropVariable("element"));
		tool.setRoot(ToolHelper.getElementDropVariable("root"));

		ChangeContext c1 = ToolFactory.eINSTANCE.createChangeContext();
		c1.setBrowseExpression("var:element");
		tool.setFirstModelOperation(c1);

		SetValue c2 = ToolFactory.eINSTANCE.createSetValue();
		c2.setFeatureName("name");
		c2.setValueExpression("var:0");
		c1.getSubModelOperations().add(c2);

		return tool;
	}
}
