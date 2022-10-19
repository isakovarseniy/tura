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

package org.tura.sirius.diagram.producer.tura.config.tool;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.table.metamodel.table.description.CreateLineTool;
import org.eclipse.sirius.table.metamodel.table.description.DescriptionFactory;
import org.eclipse.sirius.table.metamodel.table.description.TableVariable;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;
import org.eclipse.sirius.viewpoint.description.tool.ToolFactory;

public class MessageTableTool {
	public static List<CreateLineTool> getCreateTools() {
		ArrayList<CreateLineTool> tools = new ArrayList<>();

		CreateLineTool tool = DescriptionFactory.eINSTANCE.createCreateLineTool();
		tool.setName("Create Key");

		TableVariable v1 = DescriptionFactory.eINSTANCE.createTableVariable();
		v1.setName("root");
		v1.setDocumentation("The semantic element of the table.");
		tool.getVariables().add(v1);

		v1 = DescriptionFactory.eINSTANCE.createTableVariable();
		v1.setName("element");
		v1.setDocumentation("The currently edited element.");
		tool.getVariables().add(v1);

		v1 = DescriptionFactory.eINSTANCE.createTableVariable();
		v1.setName("container");
		v1.setDocumentation("The semantic element corresponding to the view container.");
		tool.getVariables().add(v1);

		ChangeContext c1 = ToolFactory.eINSTANCE.createChangeContext();
		c1.setBrowseExpression("var:element");
		tool.setFirstModelOperation(c1);

		CreateInstance c2 = ToolFactory.eINSTANCE.createCreateInstance();
		c2.setReferenceName("messages");
		c2.setTypeName("message.Message");
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
