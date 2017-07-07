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
import org.eclipse.sirius.diagram.description.tool.ToolFactory;
import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.viewpoint.LabelAlignment;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.InitialNodeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.tura.sirius.dsl.config.ContainerConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.ToolHelper;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class ColumnConfigurator implements ContainerConfigurator {
	private String suffix = "";
	private String feature = null;

	public ColumnConfigurator(String suffix, String feature) {
		this.suffix = suffix;
		this.feature = feature;
	}

	public ColumnConfigurator() {
	}

	public static tContainer create(String suffix, String feature) {
		return new tContainer(new ColumnConfigurator(suffix, feature));
	}

	public static tContainer create(String suffix) {
		return new tContainer(new ColumnConfigurator(suffix, null));
	}

	public static tContainer create() {
		return new tContainer(new ColumnConfigurator());
	}

	public String getName() {
		return "Column" + this.suffix;
	}

	public String getCandidates() {
		if (this.feature != null) {
			return this.feature;
		}
		return "feature:cols";
	}

	public String getDomainClass() {
		return "form.Column";
	}

	public ContainerStyleDescription getStyle() {
		FlatContainerStyleDescription style = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		style.setLabelExpression("aql:self.label");
		style.setLabelSize(12);
		style.setLabelAlignment(LabelAlignment.LEFT);
		style.setBorderSizeComputationExpression("2");
		style.setShowIcon(true);
		style.setHideLabelByDefault(false);
		SystemColor foregroundColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("white");
		style.setForegroundColor(foregroundColor);
		style.setIconPath("/org.tura.metamodel.sirius.diagram.designer/icons/column.png");

		return style;
	}

	public ContainerLayout getContainerLayout() {
		return ContainerLayout.VERTICAL_STACK;
	}

	public static List<ToolEntry> getTools() {
		List<ToolEntry> list = new ArrayList<ToolEntry>();

		ToolEntry tool = getColumnContainerCreationDescription();
		list.add(tool);

		return list;
	}

	private static ToolEntry getColumnContainerCreationDescription() {
		ContainerCreationDescription tool = ToolFactory.eINSTANCE.createContainerCreationDescription();
		tool.setName("Column");
		tool.setVariable(ToolHelper.createNodeCreationVariable("container"));
		tool.setViewVariable(ToolHelper.createContainerViewVariable("containerView"));
		tool.setIconPath("/org.tura.metamodel.sirius.diagram.designer/icons/column.png");

		InitialNodeCreationOperation v = ToolHelper.createInitialNodeCreationOperation();
		tool.setInitialOperation(v);

		CreateInstance c3 = ToolHelper.createInstance("form.Column", "instance", "cols");
		v.setFirstModelOperations(c3);
		c3.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("ColumnTable" + tContainer.class.getName());

		ContainerMapping mapper = (ContainerMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		tool.getContainerMappings().add(mapper);

		wrapper = (ObjectWrapper) tRoot.context.get("ColumnTree" + tContainer.class.getName());

		mapper = (ContainerMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		tool.getContainerMappings().add(mapper);

		return tool;
	}

	public List<ConditionalContainerStyleDescription> getConditionalStyle() {
		return null;
	}
}
