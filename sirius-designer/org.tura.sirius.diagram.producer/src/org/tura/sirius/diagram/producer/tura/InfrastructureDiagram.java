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

package org.tura.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import org.tura.sirius.diagram.producer.tura.config.items.infrastructure.DatacenterConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.infrastructure.HubConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.infrastructure.InfrastructureConnectionConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.infrastructure.LayerConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.infrastructure.LayersConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.infrastructure.RouterConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.infrastructure.ServerConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.infrastructure.StorageConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.infrastructure.SubsystemConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.infrastructure.SubsystemsConfigurator;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.diagram.tToolSection;

public class InfrastructureDiagram {
	public List<Object> getChildrens() {
		ArrayList<Object> list = new ArrayList<Object>();

		tContainer cnt = DatacenterConfigurator.create()
				.addChild(SubsystemsConfigurator.create()
						.addChild(SubsystemConfigurator.create()
								.addChild(LayersConfigurator.create().addChild(LayerConfigurator.create()
										.addChild(ServerConfigurator.create()).addChild(RouterConfigurator.create())
										.addChild(HubConfigurator.create()).addChild(StorageConfigurator.create())))));

		list.add(cnt);
		list.add(InfrastructureConnectionConfigurator.create());

		tToolSection nodeToolSection = new tToolSection("Nodes");
		list.add(nodeToolSection);
		nodeToolSection.addChildrens(DatacenterConfigurator.getTools());
		nodeToolSection.addChildrens(SubsystemConfigurator.getTools());
		nodeToolSection.addChildrens(LayerConfigurator.getTools());
		nodeToolSection.addChildrens(ServerConfigurator.getTools());
		nodeToolSection.addChildrens(RouterConfigurator.getTools());
		nodeToolSection.addChildrens(HubConfigurator.getTools());
		nodeToolSection.addChildrens(StorageConfigurator.getTools());

		tToolSection edgeToolSection = new tToolSection("Connections");
		list.add(edgeToolSection);
		edgeToolSection.addChildrens(InfrastructureConnectionConfigurator.getTools());

		return list;
	}
}
