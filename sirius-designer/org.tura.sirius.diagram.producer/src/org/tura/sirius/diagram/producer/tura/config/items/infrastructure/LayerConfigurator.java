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

package org.tura.sirius.diagram.producer.tura.config.items.infrastructure;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.diagram.ContainerLayout;
import org.eclipse.sirius.diagram.description.ConditionalContainerStyleDescription;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.FlatContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.diagram.description.tool.ContainerCreationDescription;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.diagram.description.tool.ToolFactory;
import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.InitialNodeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.tura.sirius.dsl.config.ContainerConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.ToolHelper;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class LayerConfigurator implements ContainerConfigurator {
	public static tContainer create() {
		return new tContainer(new LayerConfigurator());
	}

	public String getName() {
		return "InfrastructureLayer";
	}

	public String getCandidates() {
		return "feature:infrastructureLayer";
	}

	public ContainerLayout getContainerLayout() {
		return ContainerLayout.FREE_FORM;
	}

	public String getDomainClass() {
		return "infrastructure.InfrastructureLayer";
	}

	public ContainerStyleDescription getStyle() {
		FlatContainerStyleDescription style = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		style.setLabelExpression("feature:name");
		style.setLabelSize(12);
		style.setShowIcon(true);
		SystemColor foregroundColor = EnvironmentSystemColorFactory.getDefault()
				.getSystemColorDescription("light_orange");
		style.setForegroundColor(foregroundColor);
		style.setIconPath("/org.tura.metamodel.sirius.diagram.designer/icons/infra.png");
		style.setBorderSizeComputationExpression("2");

		return style;
	}

	public static List<ToolEntry> getTools() {
		List<ToolEntry> list = new ArrayList<>();

		ToolEntry tool = getLayerContainerCreationDescription();
		list.add(tool);

		tool = getDirectEditLabel();
		list.add(tool);

		return list;
	}

	private static ToolEntry getLayerContainerCreationDescription() {
		ContainerCreationDescription tool = ToolFactory.eINSTANCE.createContainerCreationDescription();
		tool.setName("Infrastructure Layer");
		tool.setVariable(ToolHelper.createNodeCreationVariable("container"));
		tool.setViewVariable(ToolHelper.createContainerViewVariable("containerView"));
		tool.setIconPath("/org.tura.metamodel.sirius.diagram.designer/icons/infra.png");

		InitialNodeCreationOperation v = ToolHelper.createInitialNodeCreationOperation();
		tool.setInitialOperation(v);
		ChangeContext c1 = ToolHelper.createChangeContext("var:container");
		v.setFirstModelOperations(c1);
		CreateInstance c2 = ToolHelper.createInstance("infrastructure.InfrastructureLayer", "instance",
				"infrastructureLayer");
		c1.getSubModelOperations().add(c2);
		c2.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("InfrastructureLayer" + tContainer.class.getName());

		ContainerMapping mapper = (ContainerMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		tool.getContainerMappings().add(mapper);

		return tool;
	}

	private static ToolEntry getDirectEditLabel() {
		DirectEditLabel tool = ToolFactory.eINSTANCE.createDirectEditLabel();
		tool.setName("InfrastructureLayer edit label");
		tool.setMask(ToolHelper.getEditMaskVariables("{0}"));
		InitialOperation opr = ToolHelper.createInitialOperation();
		tool.setInitialOperation(opr);
		opr.setFirstModelOperations(ToolHelper.createSet("name", "var:0"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("InfrastructureLayer" + tContainer.class.getName());

		ContainerMapping mapper = (ContainerMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		mapper.setLabelDirectEdit(tool);
		return tool;
	}

	public List<ConditionalContainerStyleDescription> getConditionalStyle() {
		return null;
	}
}
