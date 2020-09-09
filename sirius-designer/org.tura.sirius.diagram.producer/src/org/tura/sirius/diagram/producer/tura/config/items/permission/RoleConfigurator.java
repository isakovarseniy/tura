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

package org.tura.sirius.diagram.producer.tura.config.items.permission;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.diagram.LabelPosition;
import org.eclipse.sirius.diagram.description.ConditionalNodeStyleDescription;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.style.NodeStyleDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.diagram.description.style.WorkspaceImageDescription;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.diagram.description.tool.NodeCreationDescription;
import org.eclipse.sirius.diagram.description.tool.ToolFactory;
import org.eclipse.sirius.viewpoint.LabelAlignment;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.InitialNodeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.tura.sirius.dsl.config.NodeConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.ToolHelper;
import org.tura.sirius.dsl.diagram.tNode;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class RoleConfigurator implements NodeConfigurator {
	public static tNode create() {
		return new tNode(new RoleConfigurator());
	}

	public String getName() {
		return "Role";
	}

	public String getCandidates() {
		return "aql:self.roles.roles";
	}

	public String getPreConditionExpression() {
		return null;
	}

	public String getDomainClass() {
		return "permission.Role";
	}

	public NodeStyleDescription getStyle() {
		WorkspaceImageDescription style = StyleFactory.eINSTANCE.createWorkspaceImageDescription();
		style.setLabelExpression("aql:self.name");
		style.setLabelSize(12);
		style.setLabelAlignment(LabelAlignment.LEFT);
		style.setLabelPosition(LabelPosition.BORDER_LITERAL);
		style.setWorkspacePath("/org.tura.metamodel.sirius.diagram.designer/images/role.png");
		style.setShowIcon(false);
		style.setSizeComputationExpression("-1");

		return style;
	}

	public static List<ToolEntry> getTools() {
		List<ToolEntry> list = new ArrayList<>();

		ToolEntry tool = getRoleNodeCreationDescription();
		list.add(tool);

		tool = getDirectEditLabel();
		list.add(tool);

		return list;
	}

	private static ToolEntry getRoleNodeCreationDescription() {
		NodeCreationDescription tool = ToolFactory.eINSTANCE.createNodeCreationDescription();
		tool.setName("Role");
		tool.setVariable(ToolHelper.createNodeCreationVariable("container"));
		tool.setViewVariable(ToolHelper.createContainerViewVariable("containerView"));
		tool.setIconPath("/org.tura.metamodel.sirius.diagram.designer/icons/role.png");

		InitialNodeCreationOperation v = ToolHelper.createInitialNodeCreationOperation();
		tool.setInitialOperation(v);
		ChangeContext c11 = ToolHelper.createChangeContext("var:container");
		v.setFirstModelOperations(c11);

		ChangeContext c1 = ToolHelper.createChangeContext("feature:roles");
		c11.getSubModelOperations().add(c1);

		CreateInstance c2 = ToolHelper.createInstance("permission.Role", "instance", "roles");
		c1.getSubModelOperations().add(c2);
		c2.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("Role" + tNode.class.getName());

		NodeMapping mapper = (NodeMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		tool.getNodeMappings().add(mapper);

		return tool;
	}

	private static ToolEntry getDirectEditLabel() {
		DirectEditLabel tool = ToolFactory.eINSTANCE.createDirectEditLabel();
		tool.setName("Roles edit label");
		tool.setMask(ToolHelper.getEditMaskVariables("{0}"));
		InitialOperation opr = ToolHelper.createInitialOperation();
		tool.setInitialOperation(opr);
		opr.setFirstModelOperations(ToolHelper.createSet("name", "var:0"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("Role" + tNode.class.getName());

		NodeMapping mapper = (NodeMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		mapper.setLabelDirectEdit(tool);
		return tool;
	}

	public List<ConditionalNodeStyleDescription> getConditionalStyle() {
		return null;
	}
}
