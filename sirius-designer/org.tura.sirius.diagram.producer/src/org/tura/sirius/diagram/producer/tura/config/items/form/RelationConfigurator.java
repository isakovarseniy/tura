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
import org.tura.sirius.dsl.viewpoint.tRoot;

public class RelationConfigurator implements EdgeConfigurator {
	public static tEdge create() {
		return new tEdge(new RelationConfigurator());
	}

	public String getName() {
		return "Relation";
	}

	public String getCandidates() {
		return "feature:relations";
	}

	public String getDomainClass() {
		return "form.Relation";
	}

	public List<String> getSource() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("DataControl" + tContainer.class.getName());

		return list;
	}

	public List<String> getTarget() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("DataControl" + tContainer.class.getName());

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
		return "feature:master";
	}

	public String getTargetFinderExpression() {
		return "feature:detail";
	}

	public static List<ToolEntry> getTools() {
		List<ToolEntry> list = new ArrayList<ToolEntry>();

		ToolEntry tool = getRelationEdgeCreationDescription();
		list.add(tool);

		tool = getReconectEdgeTarget();
		list.add(tool);

		tool = getReconectEdgeSource();
		list.add(tool);

		return list;
	}

	private static ToolEntry getRelationEdgeCreationDescription() {
		EdgeCreationDescription tool = ToolFactory.eINSTANCE.createEdgeCreationDescription();
		tool.setName("Relation");
		tool.setSourceVariable(ToolHelper.getSourceEdgeCreationVariable("master"));
		tool.setSourceViewVariable(ToolHelper.getSourceEdgeViewCreationVariable("masterView"));

		tool.setTargetVariable(ToolHelper.getTargetEdgeCreationVariable("detail"));
		tool.setTargetViewVariable(ToolHelper.getTargetEdgeViewCreationVariable("detailView"));

		InitEdgeCreationOperation v = ToolHelper.createInitEdgeCreationOperation();
		tool.setInitialOperation(v);
		ChangeContext c1 = ToolHelper.createChangeContext("aql:self.eContainer()");
		v.setFirstModelOperations(c1);

		CreateInstance c2 = ToolHelper.createInstance("form.Relation", "instance", "relations");
		c1.getSubModelOperations().add(c2);
		c2.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));

		c2.getSubModelOperations().add(ToolHelper.createSet("master", "var:master"));
		c2.getSubModelOperations().add(ToolHelper.createSet("detail", "var:detail"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("Relation" + tEdge.class.getName());

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
		tool.setName("Reconect detail Relation");

		tool.setSource(ToolHelper.getSourceEdgeCreationVariable("master"));
		tool.setSourceView(ToolHelper.getSourceEdgeViewCreationVariable("masterView"));
		tool.setTarget(ToolHelper.getTargetEdgeCreationVariable("detail"));
		tool.setTargetView(ToolHelper.getTargetEdgeViewCreationVariable("detailView"));

		InitialOperation op = ToolHelper.createInitialOperation();
		tool.setInitialOperation(op);
		ChangeContext c = ToolHelper.createChangeContext("var:element");
		op.setFirstModelOperations(c);
		c.getSubModelOperations().add(ToolHelper.createSet("detail", "var:detail"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("Relation" + tEdge.class.getName());

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
		tool.setName("Reconect master Relation");

		tool.setSource(ToolHelper.getSourceEdgeCreationVariable("master"));
		tool.setSourceView(ToolHelper.getSourceEdgeViewCreationVariable("masterView"));
		tool.setTarget(ToolHelper.getTargetEdgeCreationVariable("detail"));
		tool.setTargetView(ToolHelper.getTargetEdgeViewCreationVariable("detailView"));

		InitialOperation op = ToolHelper.createInitialOperation();
		tool.setInitialOperation(op);
		ChangeContext c = ToolHelper.createChangeContext("var:element");
		op.setFirstModelOperations(c);
		c.getSubModelOperations().add(ToolHelper.createSet("master", "var:detail"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("Relation" + tEdge.class.getName());

		EdgeMapping mapper = (EdgeMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		mapper.getReconnections().add(tool);

		return tool;
	}

	public List<ConditionalEdgeStyleDescription> getConditionalStyle() {
		return null;
	}

	public String getPreConditionExpression() {
		return "aql:(not self.oclIsKindOf(form::InternalRelation))";
	}
}
