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

package org.tura.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import org.tura.sirius.diagram.producer.tura.config.items.deployment.DeploymentStepConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.deployment.DeploymentToDeploymentConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.deployment.FirstStep2DeploymentConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.deployment.FirstStepConfigurator;
import org.tura.sirius.dsl.diagram.tToolSection;

public class DeploymentDiagram {
	public List<Object> getChildrens() {
		ArrayList<Object> list = new ArrayList<Object>();

		list.add(FirstStepConfigurator.create());
		list.add(DeploymentStepConfigurator.create());
		list.add(FirstStep2DeploymentConfigurator.create());
		list.add(DeploymentToDeploymentConfigurator.create());

		tToolSection nodeToolSection = new tToolSection("Nodes");
		list.add(nodeToolSection);
		nodeToolSection.addChildrens(FirstStepConfigurator.getTools());

		nodeToolSection = new tToolSection("Connection");
		list.add(nodeToolSection);
		nodeToolSection.addChildrens(FirstStep2DeploymentConfigurator.getTools());
		nodeToolSection.addChildrens(DeploymentToDeploymentConfigurator.getTools());

		return list;
	}
}
