/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.sirius.dsl.diagram;

import org.eclipse.sirius.diagram.description.DescriptionFactory;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.Layer;
import org.eclipse.sirius.diagram.description.tool.DiagramCreationDescription;
import org.eclipse.sirius.diagram.description.tool.ToolSection;
import org.eclipse.sirius.viewpoint.description.tool.ContainerViewVariable;
import org.eclipse.sirius.viewpoint.description.tool.NameVariable;
import org.eclipse.sirius.viewpoint.description.tool.RepresentationCreationDescription;
import org.tura.sirius.dsl.config.ConfigProvider;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class tDiagram implements ObjectWrapper {
	private DiagramDescription diagramDescription;
	private ConfigProvider configurator;

	public tDiagram(DiagramDescription diagramDescription, ConfigProvider configurator) {
		this.diagramDescription = diagramDescription;
		this.configurator = configurator;
		this.diagramDescription.setTitleExpression("aql:self.name");

		tRoot.context.put(diagramDescription.getName() + tDiagram.class.getName(), this);
	}

	public tLayer getDefaultLayer() {
		return new tLayer(this.diagramDescription.getDefaultLayer(), this.configurator);
	}

	public tLayer addDefaultLayer() {
		Layer layer = DescriptionFactory.eINSTANCE.createLayer();
		layer.setName("Default");
		this.diagramDescription.setDefaultLayer(layer);
		return new tLayer(layer, this.configurator);
	}

	public tLayer addLayer(String name) {
		Layer layer = DescriptionFactory.eINSTANCE.createLayer();
		layer.setName(name);
		this.diagramDescription.setDefaultLayer(layer);
		return new tLayer(layer, this.configurator);
	}

	public DiagramCreationDescription getCreationRepresentation() {
		DiagramCreationDescription creationDescription = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createDiagramCreationDescription();
		creationDescription.setName("Create " + this.diagramDescription.getName());
		creationDescription.setDiagramDescription(this.diagramDescription);

		ContainerViewVariable var = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createContainerViewVariable();
		var.setName("containerView");
		creationDescription.setContainerViewVariable(var);

		NameVariable var1 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createNameVariable();
		var1.setName("diagramName");
		creationDescription.setRepresentationNameVariable(var1);

		return creationDescription;
	}

	public tDiagram addCreationRepresentation(RepresentationCreationDescription desc, String layerName) {
		if (this.diagramDescription.getDefaultLayer() == null) {
			throw new RuntimeException("No layer define");
		}
		Layer layer = this.diagramDescription.getDefaultLayer();
		((ToolSection) layer.getToolSections().get(0)).getOwnedTools().add(desc);
		return this;
	}

	public tDiagram addCreationDiagramNavigation(String diagramName, String[] nodeNames, String layerName) {
		tDiagram diagram = (tDiagram) tRoot.context.get(diagramName + tDiagram.class.getName());

		DiagramCreationDescription diagramDescription = diagram.getCreationRepresentation();
		String[] arrayOfString;
		int j = (arrayOfString = nodeNames).length;
		for (int i = 0; i < j; i++) {
			String nodeName = arrayOfString[i];
			if ((tRoot.context.get(nodeName) instanceof tNode)) {
				tNode tnode = (tNode) tRoot.context.get(nodeName);
				tnode.getNode().getDetailDescriptions().add(diagramDescription);
			}
			if ((tRoot.context.get(nodeName) instanceof tContainer)) {
				tContainer tnode = (tContainer) tRoot.context.get(nodeName);
				tnode.getContainer().getDetailDescriptions().add(diagramDescription);
			}
		}
		addCreationRepresentation(diagramDescription, layerName);
		return this;
	}

	public Object getWrapedObject() {
		return this.diagramDescription;
	}
}
