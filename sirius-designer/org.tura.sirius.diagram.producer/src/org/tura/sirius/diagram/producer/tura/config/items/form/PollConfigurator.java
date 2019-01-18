package org.tura.sirius.diagram.producer.tura.config.items.form;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.diagram.LabelPosition;
import org.eclipse.sirius.diagram.description.ConditionalNodeStyleDescription;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.style.NodeStyleDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.diagram.description.style.WorkspaceImageDescription;
import org.eclipse.sirius.diagram.description.tool.ContainerDropDescription;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.diagram.description.tool.NodeCreationDescription;
import org.eclipse.sirius.viewpoint.LabelAlignment;
import org.eclipse.sirius.viewpoint.description.tool.Case;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.DragSource;
import org.eclipse.sirius.viewpoint.description.tool.InitialContainerDropOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialNodeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.Switch;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.tura.sirius.dsl.config.NodeConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.ToolHelper;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.diagram.tNode;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class PollConfigurator implements NodeConfigurator {
	private String suffix = "";
	private String feature = null;

	public PollConfigurator(String suffix, String feature) {
		this.suffix = suffix;
		this.feature = feature;
	}

	public PollConfigurator() {
	}

	public static tNode create(String suffix, String feature) {
		return new tNode(new PollConfigurator(suffix, feature));
	}

	public static tNode create(String suffix) {
		return new tNode(new PollConfigurator(suffix, null));
	}

	public static tNode create() {
		return new tNode(new PollConfigurator());
	}

	public String getName() {
		return "Poll" + this.suffix;
	}

	public String getCandidates() {
		if (this.feature != null) {
			return this.feature;
		}
		return "feature:children";
	}

	public String getPreConditionExpression() {
		return null;
	}

	public String getDomainClass() {
		return "form.Poll";
	}

	public NodeStyleDescription getStyle() {
		WorkspaceImageDescription style = StyleFactory.eINSTANCE.createWorkspaceImageDescription();
		style.setLabelExpression("aql:self.label");
		style.setLabelSize(12);
		style.setLabelAlignment(LabelAlignment.CENTER);
		style.setLabelPosition(LabelPosition.NODE_LITERAL);
		style.setWorkspacePath("/org.tura.metamodel.sirius.diagram.designer/images/poll.png");
		style.setShowIcon(false);
		style.setSizeComputationExpression("-1");

		return style;
	}

	public static List<ToolEntry> getTools() {
		List<ToolEntry> list = new ArrayList<ToolEntry>();

		ToolEntry tool = getPollNodeCreationDescription();
		list.add(tool);

		tool = getDirectEditLabel();
		list.add(tool);

		tool = getDrugAndDrop();
		list.add(tool);

		return list;
	}

	private static ToolEntry getPollNodeCreationDescription() {
		NodeCreationDescription tool = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createNodeCreationDescription();
		tool.setName("Poll");
		tool.setVariable(ToolHelper.createNodeCreationVariable("container"));
		tool.setViewVariable(ToolHelper.createContainerViewVariable("containerView"));
		tool.setIconPath("/org.tura.metamodel.sirius.diagram.designer/icons/poll.png");

		InitialNodeCreationOperation v = ToolHelper.createInitialNodeCreationOperation();
		tool.setInitialOperation(v);

		Switch c1 = ToolHelper.createSwitch();
		v.setFirstModelOperations(c1);

		Case c2 = ToolHelper.createCase("aql:self.oclIsKindOf(form::LayerHolder)");
		c1.getCases().add(c2);

		CreateInstance c3 = ToolHelper.createInstance("form.Poll", "instance", "children");
		c2.getSubModelOperations().add(c3);
		c3.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));

		c2 = ToolHelper.createCase("aql:self.oclIsKindOf(form::Column)");
		c1.getCases().add(c2);

		c3 = ToolHelper.createInstance("form.Poll", "instance", "element");
		c2.getSubModelOperations().add(c3);
		c3.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("Poll"  + tNode.class.getName());

		NodeMapping mapper = (NodeMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		tool.getNodeMappings().add(mapper);
		return tool;
	}

	private static ToolEntry getDirectEditLabel() {
		DirectEditLabel tool = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createDirectEditLabel();
		tool.setName("Poll edit label");
		tool.setMask(ToolHelper.getEditMaskVariables("{0}"));
		InitialOperation opr = ToolHelper.createInitialOperation();
		tool.setInitialOperation(opr);
		opr.setFirstModelOperations(ToolHelper.createSet("name", "var:0"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("Poll"  + tNode.class.getName());

		NodeMapping mapper = (NodeMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		mapper.setLabelDirectEdit(tool);

		return tool;
	}

	private static ToolEntry getDrugAndDrop() {
		ContainerDropDescription tool = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createContainerDropDescription();
		tool.setName("Poll to LayerHolder");
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

		ObjectWrapper w = (ObjectWrapper) tRoot.context.get("LayerHolder" + tContainer.class.getName());
		ContainerMapping container = (ContainerMapping) w.getWrapedObject();

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("Poll"  + tNode.class.getName());

		NodeMapping mapper = (NodeMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		container.getDropDescriptions().add(tool);
		tool.getMappings().add(mapper);
		return tool;
	}

	public List<ConditionalNodeStyleDescription> getConditionalStyle() {
		return null;
	}
}