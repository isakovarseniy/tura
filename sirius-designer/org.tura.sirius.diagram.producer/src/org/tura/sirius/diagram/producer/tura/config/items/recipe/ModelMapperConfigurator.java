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

package org.tura.sirius.diagram.producer.tura.config.items.recipe;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.ContainerLayout;
import org.eclipse.sirius.diagram.description.ConditionalContainerStyleDescription;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DescriptionFactory;
import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.FlatContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.diagram.description.tool.ContainerCreationDescription;
import org.eclipse.sirius.diagram.description.tool.ContainerDropDescription;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.diagram.description.tool.ToolFactory;
import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.viewpoint.LabelAlignment;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.sirius.viewpoint.description.style.LabelBorderStyleDescription;
import org.eclipse.sirius.viewpoint.description.style.StylePackage;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.DragSource;
import org.eclipse.sirius.viewpoint.description.tool.InitialContainerDropOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialNodeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.tura.sirius.diagram.producer.tura.RecipeDiagram;
import org.tura.sirius.dsl.config.ContainerConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.ToolHelper;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class ModelMapperConfigurator implements ContainerConfigurator {
	private String suffix = "";

	public ModelMapperConfigurator(String suffix) {
		this.suffix = suffix;
	}

	public ModelMapperConfigurator() {
	}
	
	
	public static tContainer create(String suffix) {
		return new tContainer(new ModelMapperConfigurator(suffix));
	}

	
	public String getName() {
		return "ModelMapper" +this.suffix;
	}

	public String getCandidates() {
		return "feature:mappers";
	}

	public ContainerLayout getContainerLayout() {
		return ContainerLayout.LIST;
	}

	public String getDomainClass() {
		return "recipe.ModelMapper";
	}

	public ContainerStyleDescription getStyle() {
		FlatContainerStyleDescription style = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		style.setLabelExpression("feature:name");
		style.setLabelSize(12);
		style.setShowIcon(true);
		style.setLabelAlignment(LabelAlignment.LEFT);

		SystemColor foregroundColor = EnvironmentSystemColorFactory.getDefault()
				.getSystemColorDescription("light_gray");
		style.setForegroundColor(foregroundColor);

		SystemColor backgroundColor = EnvironmentSystemColorFactory.getDefault()
				.getSystemColorDescription("light_gray");
		style.setBackgroundColor(backgroundColor);

		LabelBorderStyleDescription labelStyle = getLabelBorderStyleDescription("labelBorderForContainer");
		style.setLabelBorderStyle(labelStyle);

		return style;
	}

	public static List<ToolEntry> getTools() {
		List<ToolEntry> list = new ArrayList<>();

		ToolEntry tool = getModelMapperContainerCreationDescription();
		list.add(tool);

		tool = getDirectEditLabel();
		list.add(tool);

		tool = getDrugAndDrop();
		
		list.add(tool);
		
		return list;
	}

	private static ToolEntry getModelMapperContainerCreationDescription() {
		ContainerCreationDescription tool = ToolFactory.eINSTANCE.createContainerCreationDescription();
		tool.setName("ModelMapper");
		tool.setVariable(ToolHelper.createNodeCreationVariable("container"));
		tool.setViewVariable(ToolHelper.createContainerViewVariable("containerView"));

		InitialNodeCreationOperation v = ToolHelper.createInitialNodeCreationOperation();
		tool.setInitialOperation(v);
		ChangeContext c1 = ToolHelper.createChangeContext("var:container");
		v.setFirstModelOperations(c1);
		CreateInstance c2 = ToolHelper.createInstance("recipe.ModelMapper", "instance", "mappers");
		c1.getSubModelOperations().add(c2);
		c2.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));

		
		for (int i = 0; i < RecipeDiagram.SUFFIX_LIMIT; i++) {
			ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("ModelMapper" + i + tContainer.class.getName());

			ContainerMapping mapper = (ContainerMapping) wrapper.getWrapedObject();
			if (mapper == null) {
				throw new RuntimeException("Tool mapping is null");
			}
			tool.getContainerMappings().add(mapper);
		}

		return tool;
	}

	private static ToolEntry getDirectEditLabel() {
		DirectEditLabel tool = ToolFactory.eINSTANCE.createDirectEditLabel();
		tool.setName("ModelMapper edit label");
		tool.setMask(ToolHelper.getEditMaskVariables("{0}"));
		InitialOperation opr = ToolHelper.createInitialOperation();
		tool.setInitialOperation(opr);
		opr.setFirstModelOperations(ToolHelper.createSet("name", "var:0"));

		
		for (int i = 0; i < RecipeDiagram.SUFFIX_LIMIT; i++) {
			ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("ModelMapper" + i + tContainer.class.getName());
	
			ContainerMapping mapper = (ContainerMapping) wrapper.getWrapedObject();
			if (mapper == null) {
				throw new RuntimeException("Tool mapping is null");
			}
			mapper.setLabelDirectEdit(tool);
		}
		return tool;
	}

	public LabelBorderStyleDescription getLabelBorderStyleDescription(String name) {
		String uri = "environment:/viewpoint#/0/@labelBorderStyles/@labelBorderStyleDescriptions[id='" + name + "']";
		EObject color = EcoreUtil.create(StylePackage.eINSTANCE.getLabelBorderStyleDescription());
		URI colorURI = URI.createURI(uri);
		((InternalEObject) color).eSetProxyURI(colorURI);
		return (LabelBorderStyleDescription) color;
	}

	public List<ConditionalContainerStyleDescription> getConditionalStyle() {
		ConditionalContainerStyleDescription conditional = DescriptionFactory.eINSTANCE
				.createConditionalContainerStyleDescription();
		conditional.setPredicateExpression("aql:self.skip");
		FlatContainerStyleDescription style = (FlatContainerStyleDescription) getStyle();
		conditional.setStyle(style);

		SystemColor lineColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("red");
		style.setBorderColor(lineColor);

		style.setBorderSizeComputationExpression("2");

		List<ConditionalContainerStyleDescription> ls = new ArrayList<>();
		ls.add(conditional);
		return ls;
	}
	
	private static ToolEntry getDrugAndDrop() {
		ContainerDropDescription tool = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createContainerDropDescription();
		tool.setName("Mapper to Component");
		tool.setOldContainer(ToolHelper.createDropContainerVariable("oldSemanticContainer"));
		tool.setNewContainer(ToolHelper.createDropContainerVariable("newSemanticContainer"));
		tool.setElement(ToolHelper.createElementDropVariable("element"));
		tool.setNewViewContainer(ToolHelper.createContainerViewVariable("newContainerView"));
		tool.setDragSource(DragSource.BOTH_LITERAL);

		InitialContainerDropOperation opr = ToolHelper.createInitialDropDownOperation();
		tool.setInitialOperation(opr);

		ChangeContext c1 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createChangeContext();
		c1.setBrowseExpression("var:newSemanticContainer");
		opr.setFirstModelOperations(c1);

		c1.getSubModelOperations().add(ToolHelper.createSet("children", "var:element"));

		ObjectWrapper w = (ObjectWrapper) tRoot.context.get("JavaComponent" + tContainer.class.getName());
		ContainerMapping javacomponent = (ContainerMapping) w.getWrapedObject();

		w = (ObjectWrapper) tRoot.context.get("JavaScriptComponent" + tContainer.class.getName());
		ContainerMapping javascriptcomponent = (ContainerMapping) w.getWrapedObject();

		
		
		for (int i = 0; i < RecipeDiagram.SUFFIX_LIMIT; i++) {
			ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("ModelMapper" + i + tContainer.class.getName());

			ContainerMapping mapper = (ContainerMapping) wrapper.getWrapedObject();
			if (mapper == null) {
				throw new RuntimeException("Tool mapping is null");
			}
			javacomponent.getDropDescriptions().add(tool);
			javascriptcomponent.getDropDescriptions().add(tool);
			tool.getMappings().add(mapper);
		}
		return tool;
	}
	
	
}
