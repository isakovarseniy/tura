package com.turasolutions.sirius.diagram.producer.tura.config.items.infrastructure;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.tree.description.DescriptionFactory;
import org.eclipse.sirius.tree.description.TreeItemStyleDescription;
import org.eclipse.sirius.tree.description.TreeItemTool;
import org.eclipse.sirius.viewpoint.description.SystemColor;

import com.turasolutions.sirius.dsl.config.TreeItemConfigurator;
import com.turasolutions.sirius.dsl.treediagram.tTreeItem;

public class EnterpriseInfrastructureConfigurator implements TreeItemConfigurator {
	public static tTreeItem create() {
		return new tTreeItem(new EnterpriseInfrastructureConfigurator());
	}

	public String getDomainClass() {
		return "infrastructure.EnterpriseInfrastructure";
	}

	public String getCandidates() {
		return "feature:infarastructures";
	}

	public String getName() {
		return "Infrastructure Layer";
	}

	public TreeItemStyleDescription getStyle() {
		SystemColor backgroundColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("white");
		SystemColor labelColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("black");
		TreeItemStyleDescription style = DescriptionFactory.eINSTANCE.createTreeItemStyleDescription();
		style.setLabelSize(12);
		style.setLabelExpression("feature:name");
		style.setLabelColor(labelColor);
		style.setBackgroundColor(backgroundColor);

		return style;
	}

	public List<TreeItemTool> getTools() {
		ArrayList<TreeItemTool> tools = new ArrayList<>();

		return tools;
	}
}
