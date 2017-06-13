package com.turasolutions.sirius.diagram.producer.tura.config.items.type;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.diagram.LabelPosition;
import org.eclipse.sirius.diagram.ResizeKind;
import org.eclipse.sirius.diagram.description.ConditionalNodeStyleDescription;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.style.NodeStyleDescription;
import org.eclipse.sirius.diagram.description.style.SquareDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.diagram.description.tool.NodeCreationDescription;
import org.eclipse.sirius.diagram.description.tool.ToolFactory;
import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.viewpoint.LabelAlignment;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.InitialNodeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;

import com.turasolutions.sirius.dsl.config.NodeConfigurator;
import com.turasolutions.sirius.dsl.config.ObjectWrapper;
import com.turasolutions.sirius.dsl.diagram.ToolHelper;
import com.turasolutions.sirius.dsl.diagram.tNode;
import com.turasolutions.sirius.dsl.viewpoint.tRoot;

public class TypeReferenceConfigurator implements NodeConfigurator {
	public static tNode create() {
		return new tNode(new TypeReferenceConfigurator());
	}

	public String getName() {
		return "TypeReference";
	}

	public String getCandidates() {
		return "feature:types";
	}

	public String getPreConditionExpression() {
		return null;
	}

	public String getDomainClass() {
		return "type.TypeReference";
	}

	public NodeStyleDescription getStyle() {
		SquareDescription style = StyleFactory.eINSTANCE.createSquareDescription();
		style.setLabelExpression("service:getTypeReferenceName");
		style.setLabelSize(12);
		style.setBorderSizeComputationExpression("2");
		style.setLabelAlignment(LabelAlignment.LEFT);
		style.setLabelPosition(LabelPosition.NODE_LITERAL);
		SystemColor foregroundColor = EnvironmentSystemColorFactory.getDefault()
				.getSystemColorDescription("dark_chocolate");
		style.setColor(foregroundColor);
		SystemColor labelColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("white");
		style.setLabelColor(labelColor);
		style.setResizeKind(ResizeKind.NSEW_LITERAL);

		return style;
	}

	public static List<ToolEntry> getTools() {
		List<ToolEntry> list = new ArrayList<>();

		ToolEntry tool = getTypeReferenceNodeCreationDescription();
		list.add(tool);

		tool = getDirectEditLabel();
		list.add(tool);

		return list;
	}

	private static ToolEntry getTypeReferenceNodeCreationDescription() {
		NodeCreationDescription tool = ToolFactory.eINSTANCE.createNodeCreationDescription();
		tool.setName("TypeReference");
		tool.setVariable(ToolHelper.createNodeCreationVariable("container"));
		tool.setViewVariable(ToolHelper.createContainerViewVariable("containerView"));

		InitialNodeCreationOperation v = ToolHelper.createInitialNodeCreationOperation();
		tool.setInitialOperation(v);
		ChangeContext c1 = ToolHelper.createChangeContext("var:container");
		v.setFirstModelOperations(c1);
		CreateInstance c2 = ToolHelper.createInstance("type.TypeReference", "instance", "types");
		c1.getSubModelOperations().add(c2);
		c2.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("TypeReference" + tNode.class.getName());

		NodeMapping mapper = (NodeMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		tool.getNodeMappings().add(mapper);

		return tool;
	}

	private static ToolEntry getDirectEditLabel() {
		DirectEditLabel tool = ToolFactory.eINSTANCE.createDirectEditLabel();
		tool.setName("TypeReference edit label");
		tool.setMask(ToolHelper.getEditMaskVariables("{0}"));
		InitialOperation opr = ToolHelper.createInitialOperation();
		tool.setInitialOperation(opr);
		opr.setFirstModelOperations(ToolHelper.createSet("name", "var:0"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("TypeReference" + tNode.class.getName());

		NodeMapping mapper = (NodeMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		mapper.setLabelDirectEdit(tool);
		return tool;
	}

	public List<ConditionalNodeStyleDescription> getConditionalStyle() {
		return null;
	}
}
