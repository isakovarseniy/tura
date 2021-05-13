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

import org.eclipse.sirius.diagram.EdgeArrows;
import org.eclipse.sirius.diagram.description.ConditionalEdgeStyleDescription;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.style.BeginLabelStyleDescription;
import org.eclipse.sirius.diagram.description.style.CenterLabelStyleDescription;
import org.eclipse.sirius.diagram.description.style.EdgeStyleDescription;
import org.eclipse.sirius.diagram.description.style.EndLabelStyleDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.diagram.description.tool.EdgeCreationDescription;
import org.eclipse.sirius.diagram.description.tool.ReconnectEdgeDescription;
import org.eclipse.sirius.diagram.description.tool.ReconnectionKind;
import org.eclipse.sirius.diagram.description.tool.ToolFactory;
import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.sirius.viewpoint.description.tool.Case;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.Default;
import org.eclipse.sirius.viewpoint.description.tool.InitEdgeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.Switch;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.tura.sirius.dsl.config.EdgeConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.ToolHelper;
import org.tura.sirius.dsl.diagram.tEdge;
import org.tura.sirius.dsl.diagram.tNode;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class Field2FieldConfigurator implements EdgeConfigurator {
	public static tEdge create() {
		return new tEdge(new Field2FieldConfigurator());
	}

	public String getName() {
		return "Field2Field";
	}

	public String getCandidates() {
		return "aql:self.attributesConnector";
	}

	public String getDomainClass() {
		return "objectmapper.AttributeConnector";
	}

	public List<String> getSource() {
		ArrayList<String> list = new ArrayList<>();
		list.add("ObjectMapperLeftBorderedTypeAttribute" + tNode.class.getName());
		list.add("ObjectMapperLeftBorderedAggregatedField" + tNode.class.getName());
		list.add("ObjectMapperLeftBorderedCalculatedField" + tNode.class.getName());
		list.add("Variable" + tNode.class.getName());
		
		return list;
	}

	public List<String> getTarget() {
		ArrayList<String> list = new ArrayList<>();
		list.add("ObjectMapperRightBorderedTypeAttribute" + tNode.class.getName());
//		list.add("ObjectMapperRightBorderedAggregatedField" + tNode.class.getName());
		list.add("ObjectMapperRightBorderedCalculatedField" + tNode.class.getName());
		return list;
	}

	public EdgeStyleDescription getStyle() {
		EdgeStyleDescription style = StyleFactory.eINSTANCE.createEdgeStyleDescription();
		style.setSourceArrow(EdgeArrows.NO_DECORATION_LITERAL);
		style.setTargetArrow(EdgeArrows.INPUT_FILL_CLOSED_ARROW_LITERAL);

		BeginLabelStyleDescription beginStyle = StyleFactory.eINSTANCE.createBeginLabelStyleDescription();
		style.setBeginLabelStyleDescription(beginStyle);

		EndLabelStyleDescription endStyle = StyleFactory.eINSTANCE.createEndLabelStyleDescription();
		style.setEndLabelStyleDescription(endStyle);

		CenterLabelStyleDescription centerStyle = StyleFactory.eINSTANCE.createCenterLabelStyleDescription();
		style.setCenterLabelStyleDescription(centerStyle);

		SystemColor color = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("purple");
		style.setStrokeColor(color);
		style.setSizeComputationExpression("3");
		
		
		return style;
	}

	public String getSourceFinderExpression() {
		return "feature:source";
	}

	public String getTargetFinderExpression() {
		return "feature:target";
	}

	@Override
	public List<ConditionalEdgeStyleDescription> getConditionalStyle() {
		return null;
	}

	@Override
	public String getPreConditionExpression() {
		return null;
	}
	
	
	public static List<ToolEntry> getTools() {
		List<ToolEntry> list = new ArrayList<>();

		ToolEntry tool = getEdgeCreationDescription();
		list.add(tool);

		tool = getReconectEdgeTarget();
		list.add(tool);

		list.add(getReconectEdgeSource());
		list.add(getReconectEdgeTarget());
		return list;
	}

	private static ToolEntry getEdgeCreationDescription() {
		
		EdgeCreationDescription tool = ToolFactory.eINSTANCE.createEdgeCreationDescription();
		tool.setName("Fields connector");
		tool.setSourceVariable(ToolHelper.getSourceEdgeCreationVariable("source"));
		tool.setSourceViewVariable(ToolHelper.getSourceEdgeViewCreationVariable("sourceView"));

		tool.setTargetVariable(ToolHelper.getTargetEdgeCreationVariable("target"));
		tool.setTargetViewVariable(ToolHelper.getTargetEdgeViewCreationVariable("targetView"));

		InitEdgeCreationOperation v = ToolHelper.createInitEdgeCreationOperation();
		tool.setInitialOperation(v);
		 
		
		Switch c1 = ToolHelper.createSwitch();
		v.setFirstModelOperations(c1);

		Case c2 = ToolHelper.createCase("aql:self.oclIsKindOf(objectmapper::Variable)");
		c1.getCases().add(c2);
		
		ChangeContext cc = ToolHelper.createChangeContext("aql:source.eContainer()");
		c2.getSubModelOperations().add(cc);
		cc.getSubModelOperations().add(ToolHelper.createInstance("objectmapper.AttributeConnector", "instance", "attributesConnector"));
		ChangeContext cc1 = ToolHelper.createChangeContext("var:instance");
		cc.getSubModelOperations().add(cc1);
		cc1.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));
		cc1.getSubModelOperations().add(ToolHelper.createSet("source", "var:source"));
		cc1.getSubModelOperations().add(ToolHelper.createSet("target", "var:target"));
		
		
		Default d1 = ToolHelper.createDefault();
		c1.setDefault(d1);
		
		cc = ToolHelper.createChangeContext("aql:source.eContainer().eContainer()");
		d1.getSubModelOperations().add(cc);
		cc.getSubModelOperations().add(ToolHelper.createInstance("objectmapper.AttributeConnector", "instance", "attributesConnector"));
		cc1 = ToolHelper.createChangeContext("var:instance");
		cc.getSubModelOperations().add(cc1);
		cc1.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));
		cc1.getSubModelOperations().add(ToolHelper.createSet("source", "var:source"));
		cc1.getSubModelOperations().add(ToolHelper.createSet("target", "var:target"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("Field2Field" + tEdge.class.getName());

		EdgeMapping mapper = (EdgeMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		tool.getEdgeMappings().add(mapper);

		return tool;
		
	}

	private static ToolEntry getReconectEdgeTarget() {
		ReconnectEdgeDescription tool = ToolFactory.eINSTANCE.createReconnectEdgeDescription();
		tool.setReconnectionKind(ReconnectionKind.RECONNECT_TARGET_LITERAL);
		tool.setName("Reconect target Field2Field");

		tool.setSource(ToolHelper.getSourceEdgeCreationVariable("source"));
		tool.setSourceView(ToolHelper.getSourceEdgeViewCreationVariable("sourceView"));
		tool.setTarget(ToolHelper.getTargetEdgeCreationVariable("target"));
		tool.setTargetView(ToolHelper.getTargetEdgeViewCreationVariable("targetView"));

		InitialOperation op = ToolHelper.createInitialOperation();
		tool.setInitialOperation(op);
		ChangeContext c = ToolHelper.createChangeContext("var:element");
		op.setFirstModelOperations(c);
		c.getSubModelOperations().add(ToolHelper.createSet("target", "var:target"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("Field2Field" + tEdge.class.getName());

		EdgeMapping mapper = (EdgeMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		mapper.getReconnections().add(tool);

		return tool;
	}

	private static ToolEntry getReconectEdgeSource() {
		ReconnectEdgeDescription tool = ToolFactory.eINSTANCE.createReconnectEdgeDescription();
		tool.setReconnectionKind(ReconnectionKind.RECONNECT_SOURCE_LITERAL);
		tool.setName("Reconect source Field2Field");

		tool.setSource(ToolHelper.getSourceEdgeCreationVariable("source"));
		tool.setSourceView(ToolHelper.getSourceEdgeViewCreationVariable("sourceView"));
		tool.setTarget(ToolHelper.getTargetEdgeCreationVariable("target"));
		tool.setTargetView(ToolHelper.getTargetEdgeViewCreationVariable("targetView"));

		InitialOperation op = ToolHelper.createInitialOperation();
		tool.setInitialOperation(op);
		ChangeContext c = ToolHelper.createChangeContext("var:element");
		op.setFirstModelOperations(c);
		c.getSubModelOperations().add(ToolHelper.createSet("source", "var:target"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("Field2Field" + tEdge.class.getName());

		EdgeMapping mapper = (EdgeMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		mapper.getReconnections().add(tool);

		return tool;
	}

	
}




