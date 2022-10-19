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

import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DescriptionFactory;
import org.tura.sirius.dsl.config.ContainerConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class tContainer implements ObjectWrapper {
	private ContainerMapping container;

	public tContainer(ContainerConfigurator config) {
		this.container = DescriptionFactory.eINSTANCE.createContainerMapping();
		this.container.setName(config.getName());
		this.container.setSemanticCandidatesExpression(config.getCandidates());
		this.container.setDomainClass(config.getDomainClass());
		this.container.setChildrenPresentation(config.getContainerLayout());
		if (config.getStyle() != null) {
			this.container.setStyle(config.getStyle());
		}
		if (config.getConditionalStyle() != null) {
			this.container.getConditionnalStyles().addAll(config.getConditionalStyle());
		}
		tRoot.context.put(config.getName() + tContainer.class.getName(), this);
	}

	public ContainerMapping getContainer() {
		return this.container;
	}

	public tContainer addChild(tContainer child) {
		this.container.getSubContainerMappings().add(child.getContainer());
		return this;
	}

	public tContainer addChild(tNode child) {
		this.container.getSubNodeMappings().add(child.getNode());
		return this;
	}

	public tContainer addBorderedChild(tNode child) {
		this.container.getBorderedNodeMappings().add(child.getNode());
		return this;
	}
	
	
	public Object getWrapedObject() {
		return this.container;
	}
}
