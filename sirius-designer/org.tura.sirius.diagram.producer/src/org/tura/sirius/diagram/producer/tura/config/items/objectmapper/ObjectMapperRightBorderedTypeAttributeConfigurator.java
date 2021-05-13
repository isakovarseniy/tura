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

import org.eclipse.sirius.diagram.ResizeKind;
import org.eclipse.sirius.diagram.description.ConditionalNodeStyleDescription;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.style.DotDescription;
import org.eclipse.sirius.diagram.description.style.NodeStyleDescription;
import org.eclipse.sirius.diagram.description.style.Side;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.diagram.description.tool.DeleteElementDescription;
import org.eclipse.sirius.viewpoint.LabelAlignment;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.tura.sirius.dsl.config.NodeConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.ToolHelper;
import org.tura.sirius.dsl.diagram.tNode;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class ObjectMapperRightBorderedTypeAttributeConfigurator implements NodeConfigurator {
	public static tNode create() {
		return new tNode(new ObjectMapperRightBorderedTypeAttributeConfigurator());
	}

	public String getName() {
		return "ObjectMapperRightBorderedTypeAttribute";
	}

	public String getCandidates() {
		return "feature:attributes";
	}

	public String getDomainClass() {
		return "type.AttributePointer";
	}


	public NodeStyleDescription getStyle() {
		DotDescription style = StyleFactory.eINSTANCE.createDotDescription();
		style.setLabelExpression("aql:self.attributeRef.name");
		style.setLabelSize(12);
		style.setLabelAlignment(LabelAlignment.RIGHT);
	    style.setResizeKind(ResizeKind.NONE_LITERAL);
	    style.getForbiddenSides().add(Side.NORTH);
	    style.getForbiddenSides().add(Side.SOUTH);
	    style.getForbiddenSides().add(Side.WEST);
	    
	    style.setShowIcon(false);
	    style.setSizeComputationExpression("2");


		return style;
	}

	@Override
	public List<ConditionalNodeStyleDescription> getConditionalStyle() {
		return null;
	}

	@Override
	public String getPreConditionExpression() {
		return null;
	}
	
	public static List<ToolEntry> getTools() {
		List<ToolEntry> list = new ArrayList<>();

		ToolEntry tool = getDeleteObjectMapperTypeAttributes();
		list.add(tool);
		return list;
	}	
	
	private static ToolEntry getDeleteObjectMapperTypeAttributes() {
		DeleteElementDescription tool = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createDeleteElementDescription();
		tool.setName("Delete ObjectMapperRightBorderedTypeAttribute");
		tool.setElement(ToolHelper.getElementDeleteVariable("element"));
		tool.setElementView(ToolHelper.getElementDeleteVariable("elementView"));
		tool.setContainerView(ToolHelper.createContainerViewVariable("containerView"));

		InitialOperation opr = ToolHelper.createInitialOperation();
		tool.setInitialOperation(opr);


		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("ObjectMapperRightBorderedTypeAttribute" + tNode.class.getName());

		NodeMapping mapper = (NodeMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		mapper.setDeletionDescription(tool);

		return tool;
	}
	
}