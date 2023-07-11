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

package org.tura.sirius.diagram.producer.tura.config.items.form;

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
import org.eclipse.sirius.viewpoint.description.tool.Case;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.InitialNodeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.Switch;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.tura.sirius.diagram.producer.tura.CanvasDiagram;
import org.tura.sirius.dsl.config.NodeConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.ToolHelper;
import org.tura.sirius.dsl.diagram.tNode;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class ImageConfigurator implements NodeConfigurator {
	private String suffix = "";
	private String feature = null;

	public ImageConfigurator(String suffix, String feature) {
		this.suffix = suffix;
		this.feature = feature;
	}

	public ImageConfigurator() {
	}

	public static tNode create(String suffix, String feature) {
		return new tNode(new ImageConfigurator(suffix, feature));
	}

	public String getPreConditionExpression() {
		return null;
	}

	public static tNode create(String suffix) {
		return new tNode(new ImageConfigurator(suffix, null));
	}

	public static tNode create() {
		return new tNode(new ImageConfigurator());
	}

	public String getName() {
		return "Image" + this.suffix;
	}

	public String getCandidates() {
		if (this.feature != null) {
			return this.feature;
		}
		return "feature:children";
	}

	public String getDomainClass() {
		return "form.Image";
	}

	public NodeStyleDescription getStyle() {
		WorkspaceImageDescription style = StyleFactory.eINSTANCE.createWorkspaceImageDescription();
		style.setLabelExpression("aql:self.label");
		style.setLabelSize(12);
		style.setLabelAlignment(LabelAlignment.LEFT);
		style.setLabelPosition(LabelPosition.NODE_LITERAL);
		style.setWorkspacePath("/org.tura.metamodel.sirius.diagram.designer/images/image.png");
		style.setShowIcon(false);
		style.setSizeComputationExpression("-1");

		return style;
	}

	public static List<ToolEntry> getTools() {
		List<ToolEntry> list = new ArrayList<ToolEntry>();

		ToolEntry tool = getImageNodeCreationDescription();
		list.add(tool);

		tool = getDirectEditLabel();
		list.add(tool);

		return list;
	}

	private static ToolEntry getImageNodeCreationDescription() {
		NodeCreationDescription tool = ToolFactory.eINSTANCE.createNodeCreationDescription();
		tool.setName("Image");
		tool.setVariable(ToolHelper.createNodeCreationVariable("container"));
		tool.setViewVariable(ToolHelper.createContainerViewVariable("containerView"));
		tool.setIconPath("/org.tura.metamodel.sirius.diagram.designer/icons/image.png");

		InitialNodeCreationOperation v = ToolHelper.createInitialNodeCreationOperation();
		tool.setInitialOperation(v);

		Switch c1 = ToolHelper.createSwitch();
		v.setFirstModelOperations(c1);

		Case c2 = ToolHelper.createCase("aql:self.oclIsKindOf(form::LayerHolder)");
		c1.getCases().add(c2);

		CreateInstance c3 = ToolHelper.createInstance("form.Image", "instance", "children");
		c2.getSubModelOperations().add(c3);
		c3.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));

		c2 = ToolHelper.createCase("aql:self.oclIsKindOf(form::DataScroller)");
		c1.getCases().add(c2);
		c3 = ToolHelper.createInstance("form.Image", "instance", "children");
		c2.getSubModelOperations().add(c3);
		c3.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));
		
		
		c2 = ToolHelper.createCase("aql:self.oclIsKindOf(form::Column)");
		c1.getCases().add(c2);

		c3 = ToolHelper.createInstance("form.Image", "instance", "element");
		c2.getSubModelOperations().add(c3);
		c3.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));
		

		c2 = ToolHelper.createCase("aql:self.oclIsKindOf(form::BlockUI)");
		c1.getCases().add(c2);

		c3 = ToolHelper.createInstance("form.Image", "instance", "children");
		c2.getSubModelOperations().add(c3);
		c3.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));
		
		
		
		for (int i = 0; i < CanvasDiagram.SUFFIX_LIMIT+1; i++) {
			ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("Image" + i + tNode.class.getName());

			NodeMapping mapper = (NodeMapping) wrapper.getWrapedObject();
			if (mapper == null) {
				throw new RuntimeException("Tool mapping is null");
			}
			tool.getNodeMappings().add(mapper);
		}
		return tool;
	}

	private static ToolEntry getDirectEditLabel() {
		DirectEditLabel tool = ToolFactory.eINSTANCE.createDirectEditLabel();
		tool.setName("Image edit label");
		tool.setMask(ToolHelper.getEditMaskVariables("{0}"));
		InitialOperation opr = ToolHelper.createInitialOperation();
		tool.setInitialOperation(opr);
		opr.setFirstModelOperations(ToolHelper.createSet("name", "var:0"));
		for (int i = 0; i < CanvasDiagram.SUFFIX_LIMIT+1; i++) {
			ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("Image" + i + tNode.class.getName());

			NodeMapping mapper = (NodeMapping) wrapper.getWrapedObject();
			if (mapper == null) {
				throw new RuntimeException("Tool mapping is null");
			}
			mapper.setLabelDirectEdit(tool);
		}
		return tool;
	}

	public List<ConditionalNodeStyleDescription> getConditionalStyle() {
		return null;
	}
}
