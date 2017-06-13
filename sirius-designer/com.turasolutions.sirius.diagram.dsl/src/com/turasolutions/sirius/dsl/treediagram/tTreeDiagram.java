package com.turasolutions.sirius.dsl.treediagram;

import org.eclipse.sirius.tree.description.DescriptionFactory;
import org.eclipse.sirius.tree.description.TreeCreationDescription;
import org.eclipse.sirius.tree.description.TreeDescription;
import org.eclipse.sirius.viewpoint.description.tool.ContainerViewVariable;
import org.eclipse.sirius.viewpoint.description.tool.NameVariable;
import org.eclipse.sirius.viewpoint.description.tool.RepresentationCreationDescription;
import org.eclipse.sirius.viewpoint.description.tool.ToolFactory;

import com.turasolutions.sirius.dsl.config.ConfigProvider;
import com.turasolutions.sirius.dsl.viewpoint.tRoot;

public class tTreeDiagram {
	private TreeDescription treeDescription;

	public tTreeDiagram(TreeDescription treeDescription, ConfigProvider configurator) {
		this.treeDescription = treeDescription;
		this.treeDescription.setTitleExpression("aql:self.name");
		tRoot.context.put(treeDescription.getName() + tTreeDiagram.class.getName(), this);
	}

	public tTreeItem addChild(tTreeItem item) {
		this.treeDescription.getSubItemMappings().add(item.getTreeItemMapping());
		return item;
	}

	public tTreeDiagram addCreationRepresentation(RepresentationCreationDescription desc) {
		this.treeDescription.getOwnedRepresentationCreationDescriptions().add(desc);
		return this;
	}

	public TreeCreationDescription getCreationRepresentation() {
		TreeCreationDescription creationDescription = DescriptionFactory.eINSTANCE.createTreeCreationDescription();
		creationDescription.setName("Create " + this.treeDescription.getName());
		creationDescription.setTreeDescription(this.treeDescription);

		ContainerViewVariable var = ToolFactory.eINSTANCE.createContainerViewVariable();
		var.setName("containerView");
		creationDescription.setContainerViewVariable(var);

		NameVariable var1 = ToolFactory.eINSTANCE.createNameVariable();
		var1.setName("diagramName");
		creationDescription.setRepresentationNameVariable(var1);

		return creationDescription;
	}
}
