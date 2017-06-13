package com.turasolutions.sirius.dsl.diagram;

import org.eclipse.sirius.diagram.description.DescriptionFactory;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.Layer;
import org.eclipse.sirius.diagram.description.tool.DiagramCreationDescription;
import org.eclipse.sirius.diagram.description.tool.ToolSection;
import org.eclipse.sirius.viewpoint.description.tool.ContainerViewVariable;
import org.eclipse.sirius.viewpoint.description.tool.NameVariable;
import org.eclipse.sirius.viewpoint.description.tool.RepresentationCreationDescription;

import com.turasolutions.sirius.dsl.config.ConfigProvider;
import com.turasolutions.sirius.dsl.config.ObjectWrapper;
import com.turasolutions.sirius.dsl.viewpoint.tRoot;

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
		this.diagramDescription.getAllLayers().add(layer);
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
		if (this.diagramDescription.getAllLayers() == null) {
			throw new RuntimeException("No layer define");
		}
		boolean isFindLayer = false;
		for (Layer layer : this.diagramDescription.getAllLayers()) {
			if (layer.getName().equals(layerName)) {
				isFindLayer = true;
				if ((layer.getToolSections() == null) || (layer.getToolSections().size() == 0)) {
					throw new RuntimeException("No Tools define");
				}
				((ToolSection) layer.getToolSections().get(0)).getOwnedTools().add(desc);
			}
		}
		if (!isFindLayer) {
			throw new RuntimeException("No layer define");
		}
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
