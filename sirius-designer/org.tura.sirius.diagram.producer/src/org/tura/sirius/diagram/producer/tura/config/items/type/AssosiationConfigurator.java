/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.sirius.diagram.producer.tura.config.items.type;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.diagram.EdgeArrows;
import org.eclipse.sirius.diagram.description.ConditionalEdgeStyleDescription;
import org.eclipse.sirius.diagram.description.DescriptionFactory;
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
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.InitEdgeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.tura.sirius.dsl.config.EdgeConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.ToolHelper;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.diagram.tEdge;
import org.tura.sirius.dsl.diagram.tNode;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class AssosiationConfigurator implements EdgeConfigurator {
	public static tEdge create() {
		return new tEdge(new AssosiationConfigurator());
	}

	public String getName() {
		return "Assosiation";
	}

	public String getCandidates() {
		return "feature:relationships";
	}

	public String getDomainClass() {
		return "type.Assosiation";
	}

	public List<String> getSource() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Type" + tContainer.class.getName());
		list.add("TypeReference" + tNode.class.getName());

		return list;
	}

	public List<String> getTarget() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Type" + tContainer.class.getName());
		list.add("TypeReference" + tNode.class.getName());

		return list;
	}

	public EdgeStyleDescription getStyle() {
		return null;
	}

	public List<ConditionalEdgeStyleDescription> getConditionalStyle() {
		ConditionalEdgeStyleDescription conditionalSrc = DescriptionFactory.eINSTANCE
				.createConditionalEdgeStyleDescription();
		conditionalSrc.setPredicateExpression("service:checkIfSourcetContainment");
		conditionalSrc.setStyle(getStyleSourceContainment());

		ConditionalEdgeStyleDescription conditionalTrg = DescriptionFactory.eINSTANCE
				.createConditionalEdgeStyleDescription();
		conditionalTrg.setPredicateExpression("service:checkIfTargetContainment");
		conditionalTrg.setStyle(getStyleTargetContainment());

		ConditionalEdgeStyleDescription conditionalNAN = DescriptionFactory.eINSTANCE
				.createConditionalEdgeStyleDescription();
		conditionalNAN.setPredicateExpression("service:checkIfNONContainment");
		conditionalNAN.setStyle(getStyleNonContainment());

		ConditionalEdgeStyleDescription conditionalSrcNoAssosiation = DescriptionFactory.eINSTANCE
				.createConditionalEdgeStyleDescription();
		conditionalSrcNoAssosiation.setPredicateExpression("service:checkIfSourcetContainmentNoAssosiation");
		conditionalSrcNoAssosiation.setStyle(getStyleSourceContainmentNoAssosiation());

		ConditionalEdgeStyleDescription conditionalTrgNoAssosiation = DescriptionFactory.eINSTANCE
				.createConditionalEdgeStyleDescription();
		conditionalTrgNoAssosiation.setPredicateExpression("service:checkIfTargetContainmentNoAssosiation");
		conditionalTrgNoAssosiation.setStyle(getStyleTargetContainmentNoAssosiation());

		ConditionalEdgeStyleDescription conditionalNANNoAssosiation = DescriptionFactory.eINSTANCE
				.createConditionalEdgeStyleDescription();
		conditionalNANNoAssosiation.setPredicateExpression("service:checkIfNONContainmentNoAssosiation");
		conditionalNANNoAssosiation.setStyle(getStyleNonContainmentNoAssosiation());

		ConditionalEdgeStyleDescription conditionalInternalAssosiation = DescriptionFactory.eINSTANCE
				.createConditionalEdgeStyleDescription();
		conditionalInternalAssosiation.setPredicateExpression("service:checkIfInternalAssosiation");
		conditionalInternalAssosiation.setStyle(getStyleInternalAssosiation());
		
		
		List<ConditionalEdgeStyleDescription> ls = new ArrayList<>();
		ls.add(conditionalSrc);
		ls.add(conditionalTrg);
		ls.add(conditionalNAN);
		ls.add(conditionalSrcNoAssosiation);
		ls.add(conditionalTrgNoAssosiation);
		ls.add(conditionalNANNoAssosiation);
		ls.add(conditionalInternalAssosiation);

		return ls;
	}

	
	private EdgeStyleDescription getStyleInternalAssosiation() {
		EdgeStyleDescription style = getStyleSourceContainment();
		SystemColor color = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("blue");
		style.setStrokeColor(color);
		return style;
	}
	
	private EdgeStyleDescription getStyleSourceContainmentNoAssosiation() {
		EdgeStyleDescription style = getStyleSourceContainment();
		SystemColor color = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("red");
		style.setStrokeColor(color);
		return style;
	}

	private EdgeStyleDescription getStyleTargetContainmentNoAssosiation() {
		EdgeStyleDescription style = getStyleTargetContainment();
		SystemColor color = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("red");
		style.setStrokeColor(color);
		return style;
	}

	private EdgeStyleDescription getStyleNonContainmentNoAssosiation() {
		EdgeStyleDescription style = getStyleNonContainment();
		SystemColor color = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("red");
		style.setStrokeColor(color);
		return style;
	}

	private EdgeStyleDescription getStyleTargetContainment() {
		EdgeStyleDescription style = StyleFactory.eINSTANCE.createEdgeStyleDescription();
		style.setSourceArrow(EdgeArrows.NO_DECORATION_LITERAL);
		style.setTargetArrow(EdgeArrows.INPUT_ARROW_WITH_FILL_DIAMOND_LITERAL);

		BeginLabelStyleDescription beginStyle = StyleFactory.eINSTANCE.createBeginLabelStyleDescription();
		style.setBeginLabelStyleDescription(beginStyle);
		beginStyle.setLabelExpression("service:generateSourceName");
		beginStyle.setShowIcon(false);
		beginStyle.setLabelSize(12);

		EndLabelStyleDescription endStyle = StyleFactory.eINSTANCE.createEndLabelStyleDescription();
		style.setEndLabelStyleDescription(endStyle);
		endStyle.setLabelExpression("service:generateTargetName");
		endStyle.setShowIcon(false);
		endStyle.setLabelSize(12);

		CenterLabelStyleDescription centerStyle = StyleFactory.eINSTANCE.createCenterLabelStyleDescription();
		style.setCenterLabelStyleDescription(centerStyle);

		return style;
	}

	private EdgeStyleDescription getStyleNonContainment() {
		EdgeStyleDescription style = StyleFactory.eINSTANCE.createEdgeStyleDescription();
		style.setSourceArrow(EdgeArrows.NO_DECORATION_LITERAL);
		style.setTargetArrow(EdgeArrows.INPUT_ARROW_LITERAL);

		BeginLabelStyleDescription beginStyle = StyleFactory.eINSTANCE.createBeginLabelStyleDescription();
		style.setBeginLabelStyleDescription(beginStyle);
		beginStyle.setLabelExpression("service:generateSourceName");
		beginStyle.setShowIcon(false);
		beginStyle.setLabelSize(12);

		EndLabelStyleDescription endStyle = StyleFactory.eINSTANCE.createEndLabelStyleDescription();
		style.setEndLabelStyleDescription(endStyle);
		endStyle.setLabelExpression("service:generateTargetName");
		endStyle.setShowIcon(false);
		endStyle.setLabelSize(12);

		CenterLabelStyleDescription centerStyle = StyleFactory.eINSTANCE.createCenterLabelStyleDescription();
		style.setCenterLabelStyleDescription(centerStyle);

		return style;
	}

	private EdgeStyleDescription getStyleSourceContainment() {
		EdgeStyleDescription style = StyleFactory.eINSTANCE.createEdgeStyleDescription();
		style.setSourceArrow(EdgeArrows.FILL_DIAMOND_LITERAL);
		style.setTargetArrow(EdgeArrows.INPUT_ARROW_LITERAL);

		BeginLabelStyleDescription beginStyle = StyleFactory.eINSTANCE.createBeginLabelStyleDescription();
		style.setBeginLabelStyleDescription(beginStyle);
		beginStyle.setLabelExpression("service:generateSourceName");
		beginStyle.setShowIcon(false);
		beginStyle.setLabelSize(12);

		EndLabelStyleDescription endStyle = StyleFactory.eINSTANCE.createEndLabelStyleDescription();
		style.setEndLabelStyleDescription(endStyle);
		endStyle.setLabelExpression("service:generateTargetName");
		endStyle.setShowIcon(false);
		endStyle.setLabelSize(12);

		CenterLabelStyleDescription centerStyle = StyleFactory.eINSTANCE.createCenterLabelStyleDescription();
		style.setCenterLabelStyleDescription(centerStyle);

		return style;
	}

	public String getSourceFinderExpression() {
		return "feature:source";
	}

	public String getTargetFinderExpression() {
		return "feature:target";
	}

	public static List<ToolEntry> getTools() {
		List<ToolEntry> list = new ArrayList<>();

		ToolEntry tool = getAssosiationEdgeCreationDescription();
		list.add(tool);

		tool = getReconectEdgeTarget();
		list.add(tool);

		tool = getReconectEdgeSource();
		list.add(tool);

		return list;
	}

	private static ToolEntry getAssosiationEdgeCreationDescription() {
		EdgeCreationDescription tool = ToolFactory.eINSTANCE.createEdgeCreationDescription();
		tool.setName("Assosiation");
		tool.setSourceVariable(ToolHelper.getSourceEdgeCreationVariable("source"));
		tool.setSourceViewVariable(ToolHelper.getSourceEdgeViewCreationVariable("sourceView"));

		tool.setTargetVariable(ToolHelper.getTargetEdgeCreationVariable("target"));
		tool.setTargetViewVariable(ToolHelper.getTargetEdgeViewCreationVariable("targetView"));

		InitEdgeCreationOperation v = ToolHelper.createInitEdgeCreationOperation();
		tool.setInitialOperation(v);
		ChangeContext c1 = ToolHelper.createChangeContext("aql:self.eContainer()");
		v.setFirstModelOperations(c1);

		CreateInstance c2 = ToolHelper.createInstance("type.Assosiation", "instance", "relationships");
		c1.getSubModelOperations().add(c2);
		c2.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));

		c2.getSubModelOperations().add(ToolHelper.createSet("source", "var:source"));
		c2.getSubModelOperations().add(ToolHelper.createSet("target", "var:target"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("Assosiation" + tEdge.class.getName());

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
		tool.setName("Reconect target Assosiation");

		tool.setSource(ToolHelper.getSourceEdgeCreationVariable("source"));
		tool.setSourceView(ToolHelper.getSourceEdgeViewCreationVariable("sourceView"));
		tool.setTarget(ToolHelper.getTargetEdgeCreationVariable("target"));
		tool.setTargetView(ToolHelper.getTargetEdgeViewCreationVariable("targetView"));

		InitialOperation op = ToolHelper.createInitialOperation();
		tool.setInitialOperation(op);
		ChangeContext c = ToolHelper.createChangeContext("var:element");
		op.setFirstModelOperations(c);
		c.getSubModelOperations().add(ToolHelper.createSet("target", "var:target"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("Assosiation" + tEdge.class.getName());

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
		tool.setName("Reconect source Assosiation");

		tool.setSource(ToolHelper.getSourceEdgeCreationVariable("source"));
		tool.setSourceView(ToolHelper.getSourceEdgeViewCreationVariable("sourceView"));
		tool.setTarget(ToolHelper.getTargetEdgeCreationVariable("target"));
		tool.setTargetView(ToolHelper.getTargetEdgeViewCreationVariable("targetView"));

		InitialOperation op = ToolHelper.createInitialOperation();
		tool.setInitialOperation(op);
		ChangeContext c = ToolHelper.createChangeContext("var:element");
		op.setFirstModelOperations(c);
		c.getSubModelOperations().add(ToolHelper.createSet("source", "var:target"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("Assosiation" + tEdge.class.getName());

		EdgeMapping mapper = (EdgeMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		mapper.getReconnections().add(tool);

		return tool;
	}

	public String getPreConditionExpression() {
		return null;
	}
}
