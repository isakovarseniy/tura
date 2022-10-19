/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
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
import org.eclipse.sirius.tree.description.TreeItemCreationTool;
import org.eclipse.sirius.tree.description.TreeItemStyleDescription;
import org.eclipse.sirius.tree.description.TreeItemTool;
import org.eclipse.sirius.tree.description.TreeVariable;
import org.eclipse.sirius.viewpoint.FontFormat;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;
import org.eclipse.sirius.viewpoint.description.tool.ToolFactory;
import org.tura.sirius.dsl.config.TreeItemConfigurator;
import org.tura.sirius.dsl.treediagram.tTreeItem;

public class GenerationHintsConfigurator implements TreeItemConfigurator {
	public static tTreeItem create() {
		return new tTreeItem(new GenerationHintsConfigurator());
	}

	public String getDomainClass() {
		return "artifact.TechLeaf";
	}

	public String getCandidates() {
		return "var:self";
	}

	public String getName() {
		return "Generation Hints";
	}

	public TreeItemStyleDescription getStyle() {
		SystemColor backgroundColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("white");
		SystemColor labelColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("black");
		TreeItemStyleDescription style = DescriptionFactory.eINSTANCE.createTreeItemStyleDescription();
		style.setLabelSize(12);
		style.setLabelExpression("Generation Hints");
		style.getLabelFormat().add(FontFormat.BOLD_LITERAL);
		style.getLabelFormat().add(FontFormat.ITALIC_LITERAL);
		style.setLabelColor(labelColor);
		style.setBackgroundColor(backgroundColor);

		return style;
	}

	public List<TreeItemTool> getTools() {
		ArrayList<TreeItemTool> tools = new ArrayList<TreeItemTool>();

		TreeItemCreationTool tool = DescriptionFactory.eINSTANCE.createTreeItemCreationTool();
		tool.setName("Create Generation Hint");

		TreeVariable v1 = DescriptionFactory.eINSTANCE.createTreeVariable();
		v1.setName("root");
		v1.setDocumentation("The semantic element of the tree.");
		tool.getVariables().add(v1);

		v1 = DescriptionFactory.eINSTANCE.createTreeVariable();
		v1.setName("element");
		v1.setDocumentation("The currently edited element.");
		tool.getVariables().add(v1);

		v1 = DescriptionFactory.eINSTANCE.createTreeVariable();
		v1.setName("container");
		v1.setDocumentation("The semantic element corresponding to the view container.");
		tool.getVariables().add(v1);

		ChangeContext c1 = ToolFactory.eINSTANCE.createChangeContext();
		c1.setBrowseExpression("var:element");
		tool.setFirstModelOperation(c1);

		CreateInstance c2 = ToolFactory.eINSTANCE.createCreateInstance();
		c2.setReferenceName("hints");
		c2.setTypeName("artifact.GenerationHint");
		c2.setVariableName("instance");
		c1.getSubModelOperations().add(c2);

		SetValue c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("uid");
		c3.setValueExpression("service:generateUID");
		c2.getSubModelOperations().add(c3);

		tools.add(tool);

		return tools;
	}
}
