package org.tura.sirius.diagram.producer.tura.config.items.form;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.diagram.LabelPosition;
import org.eclipse.sirius.diagram.ResizeKind;
import org.eclipse.sirius.diagram.description.ConditionalNodeStyleDescription;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.style.NodeStyleDescription;
import org.eclipse.sirius.diagram.description.style.SquareDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.diagram.description.tool.ContainerDropDescription;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.diagram.description.tool.NodeCreationDescription;
import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.viewpoint.LabelAlignment;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.DragSource;
import org.eclipse.sirius.viewpoint.description.tool.InitialContainerDropOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialNodeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.tura.sirius.diagram.producer.tura.ViewsDiagram;
import org.tura.sirius.dsl.config.NodeConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.ToolHelper;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.diagram.tNode;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class ViewAreaConfigurator implements NodeConfigurator {
	public static tNode create() {
		return new tNode(new ViewAreaConfigurator());
	}

	public String getName() {
		return "ViewArea" + ViewsDiagram.ID;
	}

	public String getCandidates() {
		return "feature:viewElement";
	}

	public String getPreConditionExpression() {
		return null;
	}

	public String getDomainClass() {
		return "form.ViewArea";
	}

	public NodeStyleDescription getStyle() {
		SquareDescription style = StyleFactory.eINSTANCE.createSquareDescription();
		style.setLabelExpression("aql:self.name");
		style.setLabelSize(12);
		style.setLabelAlignment(LabelAlignment.LEFT);
		style.setLabelPosition(LabelPosition.NODE_LITERAL);
		style.setBorderSizeComputationExpression("2");
		style.setResizeKind(ResizeKind.NSEW_LITERAL);
		SystemColor foregroundColor = EnvironmentSystemColorFactory.getDefault()
				.getSystemColorDescription("light_blue");
		style.setColor(foregroundColor);

		return style;
	}

	public static List<ToolEntry> getTools() {
		List<ToolEntry> list = new ArrayList<ToolEntry>();

		ToolEntry tool = getViewAreaNodeCreationDescription();
		list.add(tool);

		tool = getDirectEditLabel();
		list.add(tool);

		tool = getDrugAndDrop();
		list.add(tool);

		return list;
	}

	private static ToolEntry getViewAreaNodeCreationDescription() {
		NodeCreationDescription tool = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createNodeCreationDescription();
		tool.setName("ViewArea");
		tool.setVariable(ToolHelper.createNodeCreationVariable("container"));
		tool.setViewVariable(ToolHelper.createContainerViewVariable("containerView"));

		InitialNodeCreationOperation v = ToolHelper.createInitialNodeCreationOperation();
		tool.setInitialOperation(v);
		ChangeContext c1 = ToolHelper.createChangeContext("var:container");
		v.setFirstModelOperations(c1);
		CreateInstance c2 = ToolHelper.createInstance("form.ViewArea", "instance", "viewElement");
		c1.getSubModelOperations().add(c2);
		c2.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));
		for (int i = 0; i < 4; i++) {
			ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("ViewArea" + i + tNode.class.getName());

			NodeMapping mapper = (NodeMapping) wrapper.getWrapedObject();
			if (mapper == null) {
				throw new RuntimeException("Tool mapping is null");
			}
			tool.getNodeMappings().add(mapper);
		}
		return tool;
	}

	private static ToolEntry getDirectEditLabel() {
		DirectEditLabel tool = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createDirectEditLabel();
		tool.setName("ViewArea edit label");
		tool.setMask(ToolHelper.getEditMaskVariables("{0}"));
		InitialOperation opr = ToolHelper.createInitialOperation();
		tool.setInitialOperation(opr);
		opr.setFirstModelOperations(ToolHelper.createSet("name", "var:0"));
		for (int i = 0; i < 4; i++) {
			ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("ViewArea" + i + tNode.class.getName());

			NodeMapping mapper = (NodeMapping) wrapper.getWrapedObject();
			if (mapper == null) {
				throw new RuntimeException("Tool mapping is null");
			}
			mapper.setLabelDirectEdit(tool);
		}
		return tool;
	}

	private static ToolEntry getDrugAndDrop() {
		ContainerDropDescription tool = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createContainerDropDescription();
		tool.setName("ViewAria to PopupCanvase");
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

		c1.getSubModelOperations().add(ToolHelper.createSet("viewElement", "var:element"));

		ObjectWrapper w = (ObjectWrapper) tRoot.context.get("ViewElements0" + tContainer.class.getName());
		ContainerMapping winContainer = (ContainerMapping) w.getWrapedObject();

		w = (ObjectWrapper) tRoot.context.get("ViewElements1" + tContainer.class.getName());
		ContainerMapping canvasContainer = (ContainerMapping) w.getWrapedObject();

		w = (ObjectWrapper) tRoot.context.get("ViewElements2" + tContainer.class.getName());
		ContainerMapping popupContainer = (ContainerMapping) w.getWrapedObject();

		w = (ObjectWrapper) tRoot.context.get("ViewElements3" + tContainer.class.getName());
		ContainerMapping tabContainer = (ContainerMapping) w.getWrapedObject();
		for (int i = 0; i < 4; i++) {
			ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("ViewArea" + i + tNode.class.getName());

			NodeMapping mapper = (NodeMapping) wrapper.getWrapedObject();
			if (mapper == null) {
				throw new RuntimeException("Tool mapping is null");
			}
			winContainer.getDropDescriptions().add(tool);
			canvasContainer.getDropDescriptions().add(tool);
			popupContainer.getDropDescriptions().add(tool);
			tabContainer.getDropDescriptions().add(tool);
			tool.getMappings().add(mapper);
		}
		return tool;
	}

	public List<ConditionalNodeStyleDescription> getConditionalStyle() {
		return null;
	}
}
