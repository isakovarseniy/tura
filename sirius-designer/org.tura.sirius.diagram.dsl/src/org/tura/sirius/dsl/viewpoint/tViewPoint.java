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

package org.tura.sirius.dsl.viewpoint;

import java.util.List;

import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.table.metamodel.table.description.EditionTableDescription;
import org.eclipse.sirius.tree.description.TreeDescription;
import org.eclipse.sirius.viewpoint.description.JavaExtension;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.sirius.viewpoint.description.validation.ValidationFactory;
import org.eclipse.sirius.viewpoint.description.validation.ValidationSet;
import org.tura.sirius.dsl.config.ConfigProvider;
import org.tura.sirius.dsl.config.ValidationRuleConfigurator;
import org.tura.sirius.dsl.diagram.tDiagram;
import org.tura.sirius.dsl.table.tTableDiagram;
import org.tura.sirius.dsl.treediagram.tTreeDiagram;

public class tViewPoint {
	private Viewpoint viewpoint;
	private ConfigProvider configurator;

	public tViewPoint(Viewpoint viewpoint, ConfigProvider configurator) {
		this.viewpoint = viewpoint;
		this.configurator = configurator;
	}

	public tTreeDiagram addTreeDiagram(String name, String domainClass) {
		TreeDescription treeDescription = org.eclipse.sirius.tree.description.DescriptionFactory.eINSTANCE
				.createTreeDescription();
		treeDescription.setName(name);
		treeDescription.setDomainClass(domainClass);
		this.viewpoint.getOwnedRepresentations().add(treeDescription);
		return new tTreeDiagram(treeDescription, this.configurator);
	}

	public tDiagram addDiagram(String name, String domainClass) {
		DiagramDescription diagramDescription = org.eclipse.sirius.diagram.description.DescriptionFactory.eINSTANCE
				.createDiagramDescription();
		diagramDescription.setDomainClass(domainClass);
		diagramDescription.setName(name);
		this.viewpoint.getOwnedRepresentations().add(diagramDescription);
		return new tDiagram(diagramDescription, this.configurator);
	}

	public tTableDiagram addTableDiagram(String name, String domainClass) {
		EditionTableDescription diagramDescription = org.eclipse.sirius.table.metamodel.table.description.DescriptionFactory.eINSTANCE
				.createEditionTableDescription();
		diagramDescription.setDomainClass(domainClass);
		diagramDescription.setName(name);
		this.viewpoint.getOwnedRepresentations().add(diagramDescription);
		return new tTableDiagram(diagramDescription, this.configurator);
	}

	public tViewPoint addJavaExtension(String className) {
		JavaExtension ext = org.eclipse.sirius.viewpoint.description.DescriptionFactory.eINSTANCE.createJavaExtension();
		ext.setQualifiedClassName(className);
		this.viewpoint.getOwnedJavaExtensions().add(ext);
		return this;
	}

	public tViewPoint addValidationRules(List<ValidationRuleConfigurator> rules) {
		if (this.viewpoint.getValidationSet() == null) {
			ValidationSet set = ValidationFactory.eINSTANCE.createValidationSet();
			this.viewpoint.setValidationSet(set);
		}
		for (ValidationRuleConfigurator rule : rules) {
			this.viewpoint.getValidationSet().getOwnedRules().add(rule.getRule());
		}
		return this;
	}
}
