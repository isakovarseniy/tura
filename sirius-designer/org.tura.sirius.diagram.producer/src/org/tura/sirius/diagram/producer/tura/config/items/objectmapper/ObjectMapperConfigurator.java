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

package org.tura.sirius.diagram.producer.tura.config.items.objectmapper;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.diagram.ContainerLayout;
import org.eclipse.sirius.diagram.description.ConditionalContainerStyleDescription;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.FlatContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.diagram.description.tool.ContainerCreationDescription;
import org.eclipse.sirius.diagram.description.tool.DeleteElementDescription;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.ExternalJavaAction;
import org.eclipse.sirius.viewpoint.description.tool.InitialNodeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.tura.sirius.dsl.config.ContainerConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.ToolHelper;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class ObjectMapperConfigurator implements ContainerConfigurator {
	public static tContainer create() {
		return new tContainer(new ObjectMapperConfigurator());
	}

	public String getName() {
		return "ObjectMapper";
	}

	public String getCandidates() {
		return "aql:self.objectMappers";
	}

	public String getDomainClass() {
		return "objectmapper.ObjectMapper";
	}

	public ContainerStyleDescription getStyle() {
		FlatContainerStyleDescription style = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		style.setLabelExpression("aql:self.name");
		style.setLabelSize(12);
		style.setBorderSizeComputationExpression("2");
		style.setShowIcon(true);
		SystemColor foregroundColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("green");
		style.setForegroundColor(foregroundColor);

		return style;
	}

	public ContainerLayout getContainerLayout() {
		return ContainerLayout.VERTICAL_STACK;
	}

	public static List<ToolEntry> getTools() {
		List<ToolEntry> list = new ArrayList<ToolEntry>();

		ToolEntry tool = getObjectMapperContainerCreationDescription();
		list.add(tool);

		tool = getDirectEditLabel();
		list.add(tool);
		
		tool = getDeleteObjectMapper();
		list.add(tool);

		return list;
	}

	private static ToolEntry getObjectMapperContainerCreationDescription() {
		ContainerCreationDescription tool = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createContainerCreationDescription();
		tool.setName("ObjectMapper");
		tool.setVariable(ToolHelper.createNodeCreationVariable("container"));
		tool.setViewVariable(ToolHelper.createContainerViewVariable("containerView"));
		InitialNodeCreationOperation v = ToolHelper.createInitialNodeCreationOperation();
		tool.setInitialOperation(v);
		CreateInstance c1 = ToolHelper.createInstance("objectmapper.ObjectMapper", "instance", "objectMappers");
		v.setFirstModelOperations(c1);
		c1.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("ObjectMapper" + tContainer.class.getName());

		ContainerMapping mapper = (ContainerMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		tool.getContainerMappings().add(mapper);

		return tool;
	}
	
	
	private static ToolEntry getDeleteObjectMapper() {
		DeleteElementDescription tool = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createDeleteElementDescription();
		tool.setName("Delete ObjectMapper");
		tool.setElement(ToolHelper.getElementDeleteVariable("element"));
		tool.setElementView(ToolHelper.getElementDeleteVariable("elementView"));
		tool.setContainerView(ToolHelper.createContainerViewVariable("containerView"));

		InitialOperation opr = ToolHelper.createInitialOperation();
		tool.setInitialOperation(opr);

		ExternalJavaAction action = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createExternalJavaAction();
		opr.setFirstModelOperations(action);
		action.setId("org.tura.metamodel.sirius.properties.actions.DeleteObjectMapperActionID");
		action.setName("Delete ObjectMapper");

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("ObjectMapper" + tContainer.class.getName());

		ContainerMapping mapper = (ContainerMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		mapper.setDeletionDescription(tool);

		return tool;
	}
	

	private static ToolEntry getDirectEditLabel() {
		DirectEditLabel tool = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createDirectEditLabel();
		tool.setName("ObjectMapper edit label");
		tool.setMask(ToolHelper.getEditMaskVariables("{0}"));
		InitialOperation opr = ToolHelper.createInitialOperation();
		tool.setInitialOperation(opr);
		opr.setFirstModelOperations(ToolHelper.createSet("name", "var:0"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("ObjectMapper" + tContainer.class.getName());

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
