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

package org.tura.sirius.diagram.producer.tura.config.items.applicatioin;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.tree.description.DescriptionFactory;
import org.eclipse.sirius.tree.description.TreeItemCreationTool;
import org.eclipse.sirius.tree.description.TreeItemStyleDescription;
import org.eclipse.sirius.tree.description.TreeItemTool;
import org.eclipse.sirius.tree.description.TreeVariable;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;
import org.eclipse.sirius.viewpoint.description.tool.ToolFactory;
import org.tura.sirius.dsl.config.TreeItemConfigurator;
import org.tura.sirius.dsl.treediagram.tTreeItem;

public class ApplicationInfrastructureLayerConfigurator implements TreeItemConfigurator {
	public static tTreeItem create() {
		return new tTreeItem(new ApplicationInfrastructureLayerConfigurator());
	}

	public String getDomainClass() {
		return "application.ApplicationInfrastructureLayer";
	}

	public String getCandidates() {
		return "feature:infarastructureLayers";
	}

	public String getName() {
		return "Application Infrastructure Layer";
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
		ArrayList<TreeItemTool> tools = new ArrayList<TreeItemTool>();

		TreeItemCreationTool tool = DescriptionFactory.eINSTANCE.createTreeItemCreationTool();
		tool.setName("Create Application infrastructure layer");

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
		c2.setReferenceName("infarastructures");
		c2.setTypeName("infrastructure.EnterpriseInfrastructure");
		c2.setVariableName("instance");
		c1.getSubModelOperations().add(c2);

		SetValue c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("uid");
		c3.setValueExpression("service:generateUID");
		c2.getSubModelOperations().add(c3);

		c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("name");
		c3.setValueExpression("service:generateName");
		c2.getSubModelOperations().add(c3);

		tools.add(tool);

		return tools;
	}
}
