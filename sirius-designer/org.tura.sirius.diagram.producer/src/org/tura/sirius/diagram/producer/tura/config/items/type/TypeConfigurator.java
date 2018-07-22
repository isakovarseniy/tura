package org.tura.sirius.diagram.producer.tura.config.items.type;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.diagram.ContainerLayout;
import org.eclipse.sirius.diagram.description.ConditionalContainerStyleDescription;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DescriptionFactory;
import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.FlatContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.diagram.description.tool.ContainerCreationDescription;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.diagram.description.tool.ToolFactory;
import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.InitialNodeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.tura.sirius.dsl.config.ContainerConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.ToolHelper;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class TypeConfigurator implements ContainerConfigurator {
	public static tContainer create() {
		return new tContainer(new TypeConfigurator());
	}

	public String getName() {
		return "Type";
	}

	public String getCandidates() {
		return "aql:self.types";
	}

	public String getDomainClass() {
		return "type.Type";
	}

	
	public List<ConditionalContainerStyleDescription> getConditionalStyle() {
		ConditionalContainerStyleDescription conditionalNoAdapter = DescriptionFactory.eINSTANCE
				.createConditionalContainerStyleDescription();
		conditionalNoAdapter.setPredicateExpression("service:checkIfNotAdapterType");
		conditionalNoAdapter.setStyle(getBaseStyle());

		ConditionalContainerStyleDescription conditionalAdapter = DescriptionFactory.eINSTANCE
				.createConditionalContainerStyleDescription();
		conditionalAdapter.setPredicateExpression("service:checkIfAdapterType");
		conditionalAdapter.setStyle(getConditionalAdapter());
		
		ArrayList<ConditionalContainerStyleDescription> ls = new ArrayList<ConditionalContainerStyleDescription>();
		ls.add(conditionalNoAdapter);
		ls.add(conditionalAdapter);
		
		return ls;
	}
	
	
	public ContainerStyleDescription getStyle() {
		return null;
	}	
	private ContainerStyleDescription getConditionalAdapter() {
		ContainerStyleDescription style = getBaseStyle();
		SystemColor borderColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("red");
		style.setBorderColor(borderColor);
		return style;
	}
	
	
	private ContainerStyleDescription getBaseStyle() {
		FlatContainerStyleDescription style = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		style.setLabelExpression("aql:self.name");
		style.setLabelSize(12);
		style.setBorderSizeComputationExpression("2");
		style.setShowIcon(false);
		SystemColor foregroundColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("orange");
		style.setForegroundColor(foregroundColor);

		return style;
	}

	
	public ContainerLayout getContainerLayout() {
		return ContainerLayout.VERTICAL_STACK;
	}

	public static List<ToolEntry> getTools() {
		List<ToolEntry> list = new ArrayList<>();

		ToolEntry tool = getTypeContainerCreationDescription();
		list.add(tool);

		tool = getDirectEditLabel();
		list.add(tool);

		return list;
	}

	private static ToolEntry getTypeContainerCreationDescription() {
		ContainerCreationDescription tool = ToolFactory.eINSTANCE.createContainerCreationDescription();
		tool.setName("Type");
		tool.setVariable(ToolHelper.createNodeCreationVariable("container"));
		tool.setViewVariable(ToolHelper.createContainerViewVariable("containerView"));
		InitialNodeCreationOperation v = ToolHelper.createInitialNodeCreationOperation();
		tool.setInitialOperation(v);
		CreateInstance c1 = ToolHelper.createInstance("type.Type", "instance", "types");
		v.setFirstModelOperations(c1);
		c1.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("Type" + tContainer.class.getName());

		ContainerMapping mapper = (ContainerMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		tool.getContainerMappings().add(mapper);

		return tool;
	}

	private static ToolEntry getDirectEditLabel() {
		DirectEditLabel tool = ToolFactory.eINSTANCE.createDirectEditLabel();
		tool.setName("Type edit label");
		tool.setMask(ToolHelper.getEditMaskVariables("{0}"));
		InitialOperation opr = ToolHelper.createInitialOperation();
		tool.setInitialOperation(opr);
		opr.setFirstModelOperations(ToolHelper.createSet("name", "var:0"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("Type" + tContainer.class.getName());

		ContainerMapping mapper = (ContainerMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		mapper.setLabelDirectEdit(tool);
		return tool;
	}

}
