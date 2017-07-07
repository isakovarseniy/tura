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
import org.eclipse.sirius.diagram.description.tool.DeleteElementDescription;
import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.sirius.viewpoint.description.tool.ExternalJavaAction;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.tura.sirius.dsl.config.EdgeConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.ToolHelper;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.diagram.tEdge;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class InternalRelationConfigurator implements EdgeConfigurator {
	public static tEdge create() {
		return new tEdge(new InternalRelationConfigurator());
	}

	public String getName() {
		return "InternalRelation";
	}

	public String getCandidates() {
		return "feature:relations";
	}

	public String getDomainClass() {
		return "form.InternalRelation";
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

		SystemColor color = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("orange");
		style.setStrokeColor(color);

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

		list.add(deleteInternalRelation());

		return list;
	}

	public List<ConditionalEdgeStyleDescription> getConditionalStyle() {
		return null;
	}

	public String getPreConditionExpression() {
		return null;
	}

	private static ToolEntry deleteInternalRelation() {
		DeleteElementDescription tool = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createDeleteElementDescription();
		tool.setName("Delete InternalRelation");
		tool.setElement(ToolHelper.getElementDeleteVariable("element"));
		tool.setElementView(ToolHelper.getElementDeleteVariable("elementView"));
		tool.setContainerView(ToolHelper.createContainerViewVariable("containerView"));

		InitialOperation opr = ToolHelper.createInitialOperation();
		tool.setInitialOperation(opr);

		ExternalJavaAction action = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createExternalJavaAction();
		opr.setFirstModelOperations(action);
		action.setId("org.tura.metamodel.sirius.diagram.actions.DeleteInternalRelationActionID");
		action.setName("Delete InternalRelation");

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("InternalRelation" + tEdge.class.getName());

		EdgeMapping mapper = (EdgeMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		mapper.setDeletionDescription(tool);

		return tool;
	}
}
