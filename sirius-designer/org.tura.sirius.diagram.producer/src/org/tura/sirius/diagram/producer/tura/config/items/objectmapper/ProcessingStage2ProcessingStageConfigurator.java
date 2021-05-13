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
import org.eclipse.sirius.diagram.description.tool.DeleteElementDescription;
import org.eclipse.sirius.diagram.description.tool.EdgeCreationDescription;
import org.eclipse.sirius.diagram.description.tool.ReconnectEdgeDescription;
import org.eclipse.sirius.diagram.description.tool.ReconnectionKind;
import org.eclipse.sirius.diagram.description.tool.ToolFactory;
import org.eclipse.sirius.viewpoint.description.tool.InitEdgeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.eclipse.sirius.viewpoint.description.tool.Unset;
import org.tura.sirius.dsl.config.EdgeConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.ToolHelper;
import org.tura.sirius.dsl.diagram.tEdge;
import org.tura.sirius.dsl.diagram.tNode;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class ProcessingStage2ProcessingStageConfigurator implements EdgeConfigurator {
	public static tEdge create() {
		return new tEdge(new ProcessingStage2ProcessingStageConfigurator());
	}

	public String getName() {
		return "ProcessingStage2ProcessingStage";
	}

	public String getCandidates() {
		return "service:getProcessingStage2ProcessingStageRelationship";
	}

	public String getDomainClass() {
		return "objectmapper.ProcessingStage";
	}

	public List<String> getSource() {
		ArrayList<String> list = new ArrayList<>();
		list.add("ProcessingStage" + tNode.class.getName());

		return list;
	}

	public List<String> getTarget() {
		ArrayList<String> list = new ArrayList<>();
		list.add("ProcessingStage" + tNode.class.getName());

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

		return style;
	}

	public String getSourceFinderExpression() {
		return "aql:self";
	}

	public String getTargetFinderExpression() {
		return "feature:nextStage";
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

//		tool = getReconectEdgeSource();
//		list.add(tool);

		tool = getDeleteEdge();
		list.add(tool);
		
		return list;
	}

	private static ToolEntry getEdgeCreationDescription() {
		EdgeCreationDescription tool = ToolFactory.eINSTANCE.createEdgeCreationDescription();
		tool.setName("Stages connector");
		tool.setSourceVariable(ToolHelper.getSourceEdgeCreationVariable("source"));
		tool.setSourceViewVariable(ToolHelper.getSourceEdgeViewCreationVariable("sourceView"));

		tool.setTargetVariable(ToolHelper.getTargetEdgeCreationVariable("target"));
		tool.setTargetViewVariable(ToolHelper.getTargetEdgeViewCreationVariable("targetView"));

		InitEdgeCreationOperation v = ToolHelper.createInitEdgeCreationOperation();
		tool.setInitialOperation(v);
		v.setFirstModelOperations(ToolHelper.createSet("nextStage", "var:target"));


		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("ProcessingStage2ProcessingStage" + tEdge.class.getName());

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
		tool.setName("Reconect target ProcessingStage2ProcessingStage");

		tool.setSource(ToolHelper.getSourceEdgeCreationVariable("source"));
		tool.setSourceView(ToolHelper.getSourceEdgeViewCreationVariable("sourceView"));
		tool.setTarget(ToolHelper.getTargetEdgeCreationVariable("target"));
		tool.setTargetView(ToolHelper.getTargetEdgeViewCreationVariable("targetView"));

		InitialOperation op = ToolHelper.createInitialOperation();
		tool.setInitialOperation(op);
		op.setFirstModelOperations(ToolHelper.createSet("nextStage", "var:target"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("ProcessingStage2ProcessingStage" + tEdge.class.getName());

		EdgeMapping mapper = (EdgeMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		mapper.getReconnections().add(tool);

		return tool;
	}


	private static ToolEntry getDeleteEdge() {
		DeleteElementDescription tool = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createDeleteElementDescription();
		tool.setName("Delete ProcessingStage2ProcessingStage");
		tool.setElement(ToolHelper.getElementDeleteVariable("element"));
		tool.setElementView(ToolHelper.getElementDeleteVariable("elementView"));
		tool.setContainerView(ToolHelper.createContainerViewVariable("containerView"));

		InitialOperation opr = ToolHelper.createInitialOperation();
		tool.setInitialOperation(opr);
		Unset c = ToolHelper.createUnSet("nextStage", null);
		opr.setFirstModelOperations(c);
		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("ProcessingStage2ProcessingStage" + tEdge.class.getName());

		EdgeMapping mapper = (EdgeMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		mapper.setDeletionDescription(tool);

		return tool;
	}

	
//	private static ToolEntry getReconectEdgeSource() {
//		ReconnectEdgeDescription tool = ToolFactory.eINSTANCE.createReconnectEdgeDescription();
//		tool.setReconnectionKind(ReconnectionKind.RECONNECT_SOURCE_LITERAL);
//		tool.setName("Reconect source Generalization");
//
//		tool.setSource(ToolHelper.getSourceEdgeCreationVariable("source"));
//		tool.setSourceView(ToolHelper.getSourceEdgeViewCreationVariable("sourceView"));
//		tool.setTarget(ToolHelper.getTargetEdgeCreationVariable("target"));
//		tool.setTargetView(ToolHelper.getTargetEdgeViewCreationVariable("targetView"));
//
//		InitialOperation op = ToolHelper.createInitialOperation();
//		tool.setInitialOperation(op);
//		Unset c = ToolHelper.createUnSet("nextStage", null);
//		op.setFirstModelOperations(c);
//		ChangeContext c1 = ToolHelper.createChangeContext("var:source");
//		c.getSubModelOperations().add(c1);
//		SetValue c2 = ToolHelper.createSet("nextStage", "var:target");
//		c.getSubModelOperations().add(c2);
//
//		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("ProcessingStage2ProcessingStage" + tEdge.class.getName());
//
//		EdgeMapping mapper = (EdgeMapping) wrapper.getWrapedObject();
//		if (mapper == null) {
//			throw new RuntimeException("Tool mapping is null");
//		}
//		mapper.getReconnections().add(tool);
//
//		return tool;
//	}
	
}




