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

package org.tura.sirius.diagram.producer.tura.config.items.objectmapper;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.diagram.description.ConditionalNodeStyleDescription;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.style.NodeStyleDescription;
import org.eclipse.sirius.diagram.description.style.SquareDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.diagram.description.tool.ContainerDropDescription;
import org.eclipse.sirius.diagram.description.tool.ToolFactory;
import org.eclipse.sirius.viewpoint.LabelAlignment;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.DragSource;
import org.eclipse.sirius.viewpoint.description.tool.InitialContainerDropOperation;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.tura.sirius.dsl.config.NodeConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.ToolHelper;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.diagram.tDiagram;
import org.tura.sirius.dsl.diagram.tNode;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class OmRelationConfiguration implements NodeConfigurator {
	public static tNode create() {
		return new tNode(new OmRelationConfiguration());
	}

	public String getName() {
		return "OmRelation";
	}

	public String getCandidates() {
		return "feature:relations";
	}

	public String getDomainClass() {
		return "objectmapper.OmRelation";
	}

	public String getPreConditionExpression() {
		return "service:showOmRelation";
	}

	public NodeStyleDescription getStyle() {
		SquareDescription style = StyleFactory.eINSTANCE.createSquareDescription();
		style.setLabelExpression("service:generateName");
		style.setLabelSize(12);
		style.setLabelAlignment(LabelAlignment.LEFT);

		return style;
	}

	public static List<ToolEntry> getTools() {
		List<ToolEntry> list = new ArrayList<ToolEntry>();

		list.add(getDrugAndDrop());

		return list;
	}

	private static ToolEntry getDrugAndDrop() {
		ContainerDropDescription tool = ToolFactory.eINSTANCE.createContainerDropDescription();
		tool.setName("OmRelation to ObjectMapperGroup");
		tool.setOldContainer(ToolHelper.createDropContainerVariable("oldSemanticContainer"));
		tool.setNewContainer(ToolHelper.createDropContainerVariable("newSemanticContainer"));
		tool.setElement(ToolHelper.createElementDropVariable("element"));
		tool.setNewViewContainer(ToolHelper.createContainerViewVariable("newContainerView"));
		tool.setPrecondition("service:checkOmRelationDropDown");
		tool.setDragSource(DragSource.BOTH_LITERAL);

		InitialContainerDropOperation opr = ToolHelper.createInitialDropDownOperation();
		tool.setInitialOperation(opr);

		CreateInstance c1 = ToolHelper.createInstance("objectmapper.ObjectMapper", "instance", "objectMappers");
		opr.setFirstModelOperations(c1);

		c1.getSubModelOperations().add(ToolHelper.createSet("name", "service:getBaseTypeName(element)"));

		CreateInstance c2 = ToolHelper.createInstance("type.TypePointer", "instance1", "baseType");
		c2.getSubModelOperations().add(ToolHelper.createSet("typeRef", "service:getBaseType(element)"));

		c1.getSubModelOperations().add(c2);

		c1.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUIDForObjectMapper"));
		ChangeContext c3 = ToolHelper.createChangeContext("var:element");
		c1.getSubModelOperations().add(c3);
		c3.getSubModelOperations().add(ToolHelper.createSet("objectMapperRef", "var:instance"));

		ChangeContext c4 = ToolHelper.createChangeContext("aql:self.eContainer()");
		c1.getSubModelOperations().add(c4);


		ObjectWrapper w = (ObjectWrapper) tRoot.context.get("ObjectMapper diagram" + tDiagram.class.getName());
		DiagramDescription container = (DiagramDescription) w.getWrapedObject();

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("OmRelation" + tNode.class.getName());

		NodeMapping mapper = (NodeMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		container.getDropDescriptions().add(tool);
		container.getDropDescriptions().add(tool);
		container.getDropDescriptions().add(tool);
		tool.getMappings().add(mapper);

		wrapper = (ObjectWrapper) tRoot.context.get("FakeOmRelation" + tContainer.class.getName());

		ContainerMapping cmapper = (ContainerMapping) wrapper.getWrapedObject();
		if (cmapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		container.getDropDescriptions().add(tool);
		container.getDropDescriptions().add(tool);
		container.getDropDescriptions().add(tool);
		tool.getMappings().add(cmapper);

		return tool;
	}


	public List<ConditionalNodeStyleDescription> getConditionalStyle() {
		return null;
	}
}
