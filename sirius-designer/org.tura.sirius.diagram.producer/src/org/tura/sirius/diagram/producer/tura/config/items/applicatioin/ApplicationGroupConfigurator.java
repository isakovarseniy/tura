/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
import org.eclipse.sirius.viewpoint.description.tool.Let;
import org.eclipse.sirius.viewpoint.description.tool.ModelOperation;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;
import org.eclipse.sirius.viewpoint.description.tool.ToolFactory;
import org.tura.sirius.dsl.config.TreeItemConfigurator;
import org.tura.sirius.dsl.treediagram.tTreeItem;

public class ApplicationGroupConfigurator implements TreeItemConfigurator {
	public static tTreeItem create() {
		return new tTreeItem(new ApplicationGroupConfigurator());
	}

	public String getDomainClass() {
		return "application.ApplicationGroup";
	}

	public String getCandidates() {
		return "feature:applicationPackages";
	}

	public String getName() {
		return "Application groups";
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
		tool.setName("Create Application");

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

		Let cx1 = ToolFactory.eINSTANCE.createLet();
		cx1.setValueExpression("service:createApp");
		cx1.setVariableName("instance");
		c1.getSubModelOperations().add(cx1);
		
		SetValue cx2 = ToolFactory.eINSTANCE.createSetValue();
		cx2.setFeatureName("applications");
		cx2.setValueExpression("var:instance");
		c1.getSubModelOperations().add(cx2);


		ChangeContext c2 = ToolFactory.eINSTANCE.createChangeContext();
		c2.setBrowseExpression("var:instance");
		c1.getSubModelOperations().add(c2);
		
		
		SetValue c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("uid");
		c3.setValueExpression("service:generateUID");
		c2.getSubModelOperations().add(c3);

		c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("name");
		c3.setValueExpression("service:generateName");
		c2.getSubModelOperations().add(c3);

		createApplicationRecipes(c2);
		createApplicationMappers(c2);
		createApplicationUILayer(c2);
		createApplicationInfrastructureLayers(c2);
		createApplicationStyleLibraries(c2);
		createApplicationRealms(c2);
		createApplicationMessageLibraries(c2);

		tools.add(tool);

		return tools;
	}

	private ModelOperation createApplicationRecipes(ChangeContext c1) {
		CreateInstance c2 = ToolFactory.eINSTANCE.createCreateInstance();
		c2.setReferenceName("applicationRecipes");
		c2.setTypeName("application.ApplicationRecipes");
		c2.setVariableName("instance1");
		c1.getSubModelOperations().add(c2);

		SetValue c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("uid");
		c3.setValueExpression("service:generateUID");
		c2.getSubModelOperations().add(c3);

		c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("name");
		c3.setValueExpression("Recipes");
		c2.getSubModelOperations().add(c3);

		return c2;
	}

	private ModelOperation createApplicationMappers(ChangeContext c1) {
		CreateInstance c2 = ToolFactory.eINSTANCE.createCreateInstance();
		c2.setReferenceName("applicationMappers");
		c2.setTypeName("application.ApplicationMappers");
		c2.setVariableName("instance2");
		c1.getSubModelOperations().add(c2);

		SetValue c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("uid");
		c3.setValueExpression("service:generateUID");
		c2.getSubModelOperations().add(c3);

		c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("name");
		c3.setValueExpression("Mappers");
		c2.getSubModelOperations().add(c3);

		return c2;
	}

	private ModelOperation createApplicationUILayer(ChangeContext c1) {
		CreateInstance c2 = ToolFactory.eINSTANCE.createCreateInstance();
		c2.setReferenceName("applicationUILayer");
		c2.setTypeName("application.ApplicationUILayer");
		c2.setVariableName("instance3");
		c1.getSubModelOperations().add(c2);

		SetValue c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("uid");
		c3.setValueExpression("service:generateUID");
		c2.getSubModelOperations().add(c3);

		c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("name");
		c3.setValueExpression("UILayer");
		c2.getSubModelOperations().add(c3);

		return c2;
	}

	private ModelOperation createApplicationInfrastructureLayers(ChangeContext c1) {
		CreateInstance c2 = ToolFactory.eINSTANCE.createCreateInstance();
		c2.setReferenceName("applicationInfrastructureLayer");
		c2.setTypeName("application.ApplicationInfrastructureLayers");
		c2.setVariableName("instance4");
		c1.getSubModelOperations().add(c2);

		SetValue c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("uid");
		c3.setValueExpression("service:generateUID");
		c2.getSubModelOperations().add(c3);

		c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("name");
		c3.setValueExpression("Infrastructure");
		c2.getSubModelOperations().add(c3);

		return c2;
	}

	private ModelOperation createApplicationStyleLibraries(ChangeContext c1) {
		CreateInstance c2 = ToolFactory.eINSTANCE.createCreateInstance();
		c2.setReferenceName("applicationStyle");
		c2.setTypeName("application.ApplicationStyleLibraries");
		c2.setVariableName("instance5");
		c1.getSubModelOperations().add(c2);

		SetValue c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("uid");
		c3.setValueExpression("service:generateUID");
		c2.getSubModelOperations().add(c3);

		c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("name");
		c3.setValueExpression("Style Libraries");
		c2.getSubModelOperations().add(c3);

		return c2;
	}

	private ModelOperation createApplicationRealms(ChangeContext c1) {
		CreateInstance c2 = ToolFactory.eINSTANCE.createCreateInstance();
		c2.setReferenceName("applicationRole");
		c2.setTypeName("application.ApplicationRealms");
		c2.setVariableName("instance6");
		c1.getSubModelOperations().add(c2);

		SetValue c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("uid");
		c3.setValueExpression("service:generateUID");
		c2.getSubModelOperations().add(c3);

		c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("name");
		c3.setValueExpression("Security");
		c2.getSubModelOperations().add(c3);

		return c2;
	}

	private ModelOperation createApplicationMessageLibraries(ChangeContext c1) {
		CreateInstance c2 = ToolFactory.eINSTANCE.createCreateInstance();
		c2.setReferenceName("applicationMessages");
		c2.setTypeName("application.ApplicationMessageLibraries");
		c2.setVariableName("instance7");
		c1.getSubModelOperations().add(c2);

		SetValue c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("uid");
		c3.setValueExpression("service:generateUID");
		c2.getSubModelOperations().add(c3);

		c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("name");
		c3.setValueExpression("Application message libraries");
		c2.getSubModelOperations().add(c3);

		createMessageLibraries(c2);
		createMessageLanguages(c2);
		return c2;
	}

	private ModelOperation createMessageLibraries(CreateInstance c1) {
		CreateInstance c2 = ToolFactory.eINSTANCE.createCreateInstance();
		c2.setReferenceName("messageLibraries");
		c2.setTypeName("application.ApplicationMessageLibrary");
		c2.setVariableName("instance8");
		c1.getSubModelOperations().add(c2);

		SetValue c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("uid");
		c3.setValueExpression("service:generateUID");
		c2.getSubModelOperations().add(c3);

		c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("name");
		c3.setValueExpression("Message libraries");
		c2.getSubModelOperations().add(c3);

		return c2;
	}

	private ModelOperation createMessageLanguages(CreateInstance c1) {
		CreateInstance c2 = ToolFactory.eINSTANCE.createCreateInstance();
		c2.setReferenceName("applicationLanguages");
		c2.setTypeName("application.ApplicationLanguages");
		c2.setVariableName("instance9");
		c1.getSubModelOperations().add(c2);

		SetValue c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("uid");
		c3.setValueExpression("service:generateUID");
		c2.getSubModelOperations().add(c3);

		c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("name");
		c3.setValueExpression("Languages");
		c2.getSubModelOperations().add(c3);

		return c2;
	}
}
