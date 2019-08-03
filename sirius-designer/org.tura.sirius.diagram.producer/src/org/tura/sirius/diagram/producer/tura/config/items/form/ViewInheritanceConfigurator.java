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
import org.tura.sirius.dsl.diagram.tNode;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class ViewInheritanceConfigurator implements EdgeConfigurator {
	public static tEdge create() {
		return new tEdge(new ViewInheritanceConfigurator());
	}

	public String getName() {
		return "ViewInheritance";
	}

	public String getCandidates() {
		return "aql:self.viewInheritances";
	}

	public String getDomainClass() {
		return "form.ViewInheritance";
	}

	public List<String> getSource() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ViewPort0" + tContainer.class.getName());
		list.add("ViewPort1" + tContainer.class.getName());
		list.add("ViewPort2" + tContainer.class.getName());
		list.add("ViewPort3" + tContainer.class.getName());
		list.add("ViewPort4" + tContainer.class.getName());

		return list;
	}

	public List<String> getTarget() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Canvas" + tContainer.class.getName());
		list.add("TabCanvas" + tNode.class.getName());
		list.add("PopupCanvas" + tContainer.class.getName());
		list.add("OverlayCanvas" + tContainer.class.getName());
		list.add("Window" + tContainer.class.getName());

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
		return "feature:source";
	}

	public String getTargetFinderExpression() {
		return "feature:target";
	}

	public static List<ToolEntry> getTools() {
		List<ToolEntry> list = new ArrayList<ToolEntry>();

		ToolEntry tool = getViewInheritanceEdgeCreationDescription();
		list.add(tool);

		tool = getReconectEdgeTarget();
		list.add(tool);

		tool = getReconectEdgeSource();
		list.add(tool);

		return list;
	}

	private static ToolEntry getViewInheritanceEdgeCreationDescription() {
		EdgeCreationDescription tool = ToolFactory.eINSTANCE.createEdgeCreationDescription();
		tool.setName("ViewInheritance");
		tool.setSourceVariable(ToolHelper.getSourceEdgeCreationVariable("source"));
		tool.setSourceViewVariable(ToolHelper.getSourceEdgeViewCreationVariable("sourceView"));

		tool.setTargetVariable(ToolHelper.getTargetEdgeCreationVariable("target"));
		tool.setTargetViewVariable(ToolHelper.getTargetEdgeViewCreationVariable("targetView"));

		InitEdgeCreationOperation v = ToolHelper.createInitEdgeCreationOperation();
		tool.setInitialOperation(v);
		ChangeContext c11 = ToolHelper.createChangeContext("aql:self.eContainer().eContainer()");
		v.setFirstModelOperations(c11);

		ChangeContext c1 = ToolHelper.createChangeContext("feature:roles");
		c11.getSubModelOperations().add(c1);

		CreateInstance c2 = ToolHelper.createInstance("form.ViewInheritance", "instance", "viewInheritances");
		c1.getSubModelOperations().add(c2);
		c2.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));

		c2.getSubModelOperations().add(ToolHelper.createSet("source", "var:source"));
		c2.getSubModelOperations().add(ToolHelper.createSet("target", "var:target"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("ViewInheritance" + tEdge.class.getName());

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
		tool.setName("Reconect target ViewInheritance");

		tool.setSource(ToolHelper.getSourceEdgeCreationVariable("source"));
		tool.setSourceView(ToolHelper.getSourceEdgeViewCreationVariable("sourceView"));
		tool.setTarget(ToolHelper.getTargetEdgeCreationVariable("target"));
		tool.setTargetView(ToolHelper.getTargetEdgeViewCreationVariable("targetView"));

		InitialOperation op = ToolHelper.createInitialOperation();
		tool.setInitialOperation(op);
		ChangeContext c = ToolHelper.createChangeContext("var:element");
		op.setFirstModelOperations(c);
		c.getSubModelOperations().add(ToolHelper.createSet("target", "var:target"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("ViewInheritance" + tEdge.class.getName());

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
		tool.setName("Reconect source ViewInheritance");

		tool.setSource(ToolHelper.getSourceEdgeCreationVariable("source"));
		tool.setSourceView(ToolHelper.getSourceEdgeViewCreationVariable("sourceView"));
		tool.setTarget(ToolHelper.getTargetEdgeCreationVariable("target"));
		tool.setTargetView(ToolHelper.getTargetEdgeViewCreationVariable("targetView"));

		InitialOperation op = ToolHelper.createInitialOperation();
		tool.setInitialOperation(op);
		ChangeContext c = ToolHelper.createChangeContext("var:element");
		op.setFirstModelOperations(c);
		c.getSubModelOperations().add(ToolHelper.createSet("source", "var:target"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("ViewInheritance" + tEdge.class.getName());

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
		return null;
	}
}
