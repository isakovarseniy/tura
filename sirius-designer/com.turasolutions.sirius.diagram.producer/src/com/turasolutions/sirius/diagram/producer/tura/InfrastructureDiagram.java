package com.turasolutions.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import com.turasolutions.sirius.diagram.producer.tura.config.items.infrastructure.DatacenterConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.infrastructure.HubConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.infrastructure.InfrastructureConnectionConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.infrastructure.LayerConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.infrastructure.LayersConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.infrastructure.RouterConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.infrastructure.ServerConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.infrastructure.StorageConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.infrastructure.SubsystemConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.infrastructure.SubsystemsConfigurator;
import com.turasolutions.sirius.dsl.diagram.tContainer;
import com.turasolutions.sirius.dsl.diagram.tToolSection;

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
