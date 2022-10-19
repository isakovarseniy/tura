/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.DescriptionFactory;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.tura.sirius.dsl.config.EdgeConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class tRelationEdge implements ObjectWrapper {
	private EdgeMapping edge;

	public tRelationEdge(EdgeMapping edge) {
		this.edge = edge;
		tRoot.context.put(edge.getName() + tRelationEdge.class.getName(), this);
	}

	public tRelationEdge(EdgeConfigurator config) {
		this.edge = DescriptionFactory.eINSTANCE.createEdgeMapping();
		this.edge.setName(config.getName());
		this.edge.setSemanticCandidatesExpression(config.getCandidates());
		this.edge.setStyle(config.getStyle());
		this.edge.setPreconditionExpression(config.getPreConditionExpression());

		this.edge.setTargetFinderExpression(config.getTargetFinderExpression());
		for (String src : config.getSource()) {
			ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get(src);
			AbstractNodeMapping source = (AbstractNodeMapping) wrapper.getWrapedObject();
			if (source == null) {
				throw new RuntimeException("tEdge mapping is null");
			}
			this.edge.getSourceMapping().add(source);
		}
		for (String trg : config.getTarget()) {
			ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get(trg);
			AbstractNodeMapping target = (AbstractNodeMapping) wrapper.getWrapedObject();
			if (target == null) {
				throw new RuntimeException("tEdge mapping is null");
			}
			this.edge.getTargetMapping().add(target);
		}
		tRoot.context.put(this.edge.getName() + tRelationEdge.class.getName(), this);
	}

	public EdgeMapping getEdgeMapping() {
		return this.edge;
	}

	public Object getWrapedObject() {
		return this.edge;
	}
}
