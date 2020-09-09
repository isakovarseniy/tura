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

package org.tura.sirius.dsl.diagram;

import org.eclipse.sirius.diagram.description.DescriptionFactory;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.tura.sirius.dsl.config.NodeConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class tNode implements ObjectWrapper {
	private NodeMapping node;

	public tNode(NodeMapping node) {
		this.node = node;
		tRoot.context.put(node.getName() + tNode.class.getName(), this);
	}

	public tNode(NodeConfigurator config) {
		this.node = DescriptionFactory.eINSTANCE.createNodeMapping();
		this.node.setName(config.getName());
		this.node.setSemanticCandidatesExpression(config.getCandidates());
		this.node.setDomainClass(config.getDomainClass());
		this.node.setStyle(config.getStyle());
		this.node.setPreconditionExpression(config.getPreConditionExpression());
		if (config.getConditionalStyle() != null) {
			this.node.getConditionnalStyles().addAll(config.getConditionalStyle());
		}
		tRoot.context.put(config.getName() + tNode.class.getName(), this);
	}

	public NodeMapping getNode() {
		return this.node;
	}

	public Object getWrapedObject() {
		return this.node;
	}
}
