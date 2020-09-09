/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.sirius.dsl.treediagram;

import org.eclipse.sirius.diagram.description.tool.DiagramCreationDescription;
import org.eclipse.sirius.table.metamodel.table.description.TableCreationDescription;
import org.eclipse.sirius.tree.description.DescriptionFactory;
import org.eclipse.sirius.tree.description.TreeCreationDescription;
import org.eclipse.sirius.tree.description.TreeItemCreationTool;
import org.eclipse.sirius.tree.description.TreeItemEditionTool;
import org.eclipse.sirius.tree.description.TreeItemMapping;
import org.eclipse.sirius.tree.description.TreeItemTool;
import org.tura.sirius.dsl.config.ChildrenProvider;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.config.TreeItemConfigurator;
import org.tura.sirius.dsl.diagram.tDiagram;
import org.tura.sirius.dsl.table.tTableDiagram;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class tTreeItem implements ObjectWrapper {
	private TreeItemMapping treeItemMapping;

	public TreeItemMapping getTreeItemMapping() {
		return this.treeItemMapping;
	}

	public void setTreeItemMapping(TreeItemMapping treeItemMapping) {
		this.treeItemMapping = treeItemMapping;
	}

	public tTreeItem(TreeItemConfigurator config) {
		this.treeItemMapping = DescriptionFactory.eINSTANCE.createTreeItemMapping();
		this.treeItemMapping.setName(config.getName());
		this.treeItemMapping.setDomainClass(config.getDomainClass());
		this.treeItemMapping.setSemanticCandidatesExpression(config.getCandidates());
		this.treeItemMapping.setDefaultStyle(config.getStyle());
		for (TreeItemTool t : config.getTools()) {
			if ((t instanceof TreeItemCreationTool)) {
				TreeItemCreationTool tool = (TreeItemCreationTool) t;
				tool.getMapping().add(this.treeItemMapping);
				this.treeItemMapping.getCreate().add(tool);
			}
			if ((t instanceof TreeItemEditionTool)) {
				TreeItemEditionTool tool = (TreeItemEditionTool) t;
				tool.getMapping().add(this.treeItemMapping);
				this.treeItemMapping.setDirectEdit(tool);
			}
		}
		tRoot.context.put(this.treeItemMapping.getName() + tTreeItem.class.getName(), this);
	}

	public tTreeItem addChild(tTreeItem item) {
		this.treeItemMapping.getSubItemMappings().add(item.getTreeItemMapping());
		return this;
	}

	public tTreeItem addChildren(ChildrenProvider childrenProvider) {
		for (tTreeItem item : childrenProvider.getChildren()) {
			this.treeItemMapping.getSubItemMappings().add(item.getTreeItemMapping());
		}
		return this;
	}

	public tTreeItem addCreationTableNavigation(String tableDiagramName, String treeDiagramName) {
		tTableDiagram tableDiagram = (tTableDiagram) tRoot.context
				.get(tableDiagramName + tTableDiagram.class.getName());
		tTreeDiagram treeDiagram = (tTreeDiagram) tRoot.context.get(treeDiagramName + tTreeDiagram.class.getName());

		TableCreationDescription tableCreationDescription = tableDiagram.getCreationRepresentation();
		this.treeItemMapping.getDetailDescriptions().add(tableCreationDescription);
		treeDiagram.addCreationRepresentation(tableCreationDescription);
		return this;
	}

	public tTreeItem addCreationDiagramNavigation(String diagramName, String treeDiagramName) {
		tDiagram diagram = (tDiagram) tRoot.context.get(diagramName + tDiagram.class.getName());
		tTreeDiagram treeDiagram = (tTreeDiagram) tRoot.context.get(treeDiagramName + tTreeDiagram.class.getName());

		DiagramCreationDescription diagramDescription = diagram.getCreationRepresentation();
		this.treeItemMapping.getDetailDescriptions().add(diagramDescription);
		treeDiagram.addCreationRepresentation(diagramDescription);
		return this;
	}

	public tTreeItem addCreationTreeNavigation(String diagramName, String treeDiagramName) {
		tTreeDiagram diagram = (tTreeDiagram) tRoot.context.get(diagramName + tTreeDiagram.class.getName());
		tTreeDiagram treeDiagram = (tTreeDiagram) tRoot.context.get(treeDiagramName + tTreeDiagram.class.getName());

		TreeCreationDescription diagramDescription = diagram.getCreationRepresentation();
		this.treeItemMapping.getDetailDescriptions().add(diagramDescription);
		treeDiagram.addCreationRepresentation(diagramDescription);
		return this;
	}

	public Object getWrapedObject() {
		return this.treeItemMapping;
	}


}
