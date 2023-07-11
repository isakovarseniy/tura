/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.sirius.dsl.diagram;

import java.util.List;

import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.Layer;
import org.tura.sirius.dsl.config.ConfigProvider;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class tLayer {
	private Layer layer;
	@SuppressWarnings("unused")
	private ConfigProvider configurator;

	public tLayer(Layer layer, ConfigProvider configurator) {
		this.layer = layer;
		this.configurator = configurator;

		tRoot.context.put(layer.getName() + tLayer.class.getName(), this);
	}

	public tLayer addChildren(List<Object> childrens) {
		for (Object obj : childrens) {
			if ((obj instanceof tContainer)) {
				tContainer cnt = (tContainer) obj;
				this.layer.getContainerMappings().add(cnt.getContainer());
			}
			if ((obj instanceof tNode)) {
				tNode cnt = (tNode) obj;
				this.layer.getNodeMappings().add(cnt.getNode());
			}
			if ((obj instanceof tEdge)) {
				tEdge edge = (tEdge) obj;
				this.layer.getEdgeMappings().add(edge.getEdgeMapping());
			}
			if ((obj instanceof tRelationEdge)) {
				tRelationEdge edge = (tRelationEdge) obj;
				this.layer.getEdgeMappings().add(edge.getEdgeMapping());
			}
			if ((obj instanceof tToolSection)) {
				tToolSection toolSection = (tToolSection) obj;
				this.layer.getToolSections().add(toolSection.getToolSection());
			}
		}
		return this;
	}

	public tLayer addChild(tNode child) {
		this.layer.getNodeMappings().add(child.getNode());
		return this;
	}

	public tLayer addChild(tEdge child, AbstractNodeMapping source, AbstractNodeMapping target) {
		child.getEdgeMapping().getSourceMapping().add(source);
		child.getEdgeMapping().getTargetMapping().add(target);
		this.layer.getEdgeMappings().add(child.getEdgeMapping());
		return this;
	}

	public tLayer addToolsPanel(tToolSection panel) {
		this.layer.getToolSections().add(panel.getToolSection());
		return this;
	}
}
