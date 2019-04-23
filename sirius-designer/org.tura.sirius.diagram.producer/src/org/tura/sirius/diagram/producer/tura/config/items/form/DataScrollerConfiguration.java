package org.tura.sirius.diagram.producer.tura.config.items.form;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.diagram.ContainerLayout;
import org.eclipse.sirius.diagram.description.ConditionalContainerStyleDescription;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.FlatContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.diagram.description.tool.ContainerCreationDescription;
import org.eclipse.sirius.diagram.description.tool.ContainerDropDescription;
import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.DragSource;
import org.eclipse.sirius.viewpoint.description.tool.InitialContainerDropOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialNodeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.tura.sirius.dsl.config.ContainerConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.ToolHelper;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class DataScrollerConfiguration implements ContainerConfigurator {
	private String suffix = "";

	public DataScrollerConfiguration(String suffix) {
		this.suffix = suffix;
	}

	public DataScrollerConfiguration() {
	}

	public static tContainer create() {
		return new tContainer(new DataScrollerConfiguration());
	}

	public static tContainer create(String suffix) {
		return new tContainer(new DataScrollerConfiguration(suffix));
	}

	public String getName() {
		return "DataScroller" + this.suffix;
	}

	public String getCandidates() {
		return "service:getCandidates";
	}

	public String getDomainClass() {
		return "form.DataScroller";
	}

	public ContainerStyleDescription getStyle() {
		FlatContainerStyleDescription style = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		style.setLabelExpression("aql:self.name");
		style.setLabelSize(12);
		style.setBorderSizeComputationExpression("1");
		style.setShowIcon(true);
		style.setHideLabelByDefault(true);
		SystemColor foregroundColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("white");
		style.setForegroundColor(foregroundColor);
		SystemColor borderColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("green");
		style.setBorderColor(borderColor);
		
		style.setIconPath("/org.tura.metamodel.sirius.diagram.designer/icons/layerholder.png");

		return style;
	}

	public ContainerLayout getContainerLayout() {
		return ContainerLayout.FREE_FORM;
	}

	public static List<ToolEntry> getTools() {
		List<ToolEntry> list = new ArrayList<ToolEntry>();

		ToolEntry tool = getDataScrollerContainerCreationDescription();
		list.add(tool);

		tool = getDrugAndDrop();
		list.add(tool);

		return list;
	}

	private static ToolEntry getDataScrollerContainerCreationDescription() {
		ContainerCreationDescription tool = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createContainerCreationDescription();
		tool.setName("DataScroller");
		tool.setVariable(ToolHelper.createNodeCreationVariable("container"));
		tool.setViewVariable(ToolHelper.createContainerViewVariable("containerView"));
		InitialNodeCreationOperation v = ToolHelper.createInitialNodeCreationOperation();
		tool.setInitialOperation(v);

		CreateInstance c3 = ToolHelper.createInstance("form.DataScroller", "instance", "children");
		v.setFirstModelOperations(c3);
		c3.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("DataScroller" + tContainer.class.getName());

		ContainerMapping mapper = (ContainerMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		tool.getContainerMappings().add(mapper);

		return tool;
	}

	private static ToolEntry getDrugAndDrop() {
		ContainerDropDescription tool = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createContainerDropDescription();
		tool.setName("Table to DataScroller");
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

		ObjectWrapper w = (ObjectWrapper) tRoot.context.get("DataScroller" + tContainer.class.getName());
		ContainerMapping container = (ContainerMapping) w.getWrapedObject();

		container.getDropDescriptions().add(tool);
		tool.getMappings().add(container);

		return tool;
	}

	public List<ConditionalContainerStyleDescription> getConditionalStyle() {
		return null;
	}
}
