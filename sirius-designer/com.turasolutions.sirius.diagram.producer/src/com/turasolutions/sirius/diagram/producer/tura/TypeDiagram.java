package com.turasolutions.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import com.turasolutions.sirius.diagram.producer.tura.config.items.type.AssosiationConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.type.AttributeConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.type.AttributesConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.type.DomainConnectorConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.type.EnumValueConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.type.EnumValuesConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.type.EnumeratorConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.type.GeneralizationConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.type.OperatioinsConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.type.OperationConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.type.TypeConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.type.TypeReferenceConfigurator;
import com.turasolutions.sirius.dsl.diagram.tContainer;
import com.turasolutions.sirius.dsl.diagram.tEdge;
import com.turasolutions.sirius.dsl.diagram.tToolSection;

public class TypeDiagram {
	public List<Object> getChildrens() {
		ArrayList<Object> list = new ArrayList<Object>();

		tContainer cnt = TypeConfigurator.create();
		list.add(cnt);
		cnt.addChild(OperatioinsConfigurator.create().addChild(OperationConfigurator.create()));
		cnt.addChild(AttributesConfigurator.create().addChild(AttributeConfigurator.create()));

		cnt = EnumeratorConfigurator.create();
		list.add(cnt);

		cnt.addChild(EnumValuesConfigurator.create().addChild(EnumValueConfigurator.create()));

		list.add(TypeReferenceConfigurator.create());

		tEdge e = AssosiationConfigurator.create();
		list.add(e);

		e = DomainConnectorConfigurator.create();
		list.add(e);

		e = GeneralizationConfigurator.create();
		list.add(e);

		tToolSection nodeToolSection = new tToolSection("Nodes");
		list.add(nodeToolSection);
		nodeToolSection.addChildrens(TypeConfigurator.getTools());
		nodeToolSection.addChildrens(OperationConfigurator.getTools());
		nodeToolSection.addChildrens(AttributeConfigurator.getTools());
		nodeToolSection.addChildrens(EnumeratorConfigurator.getTools());
		nodeToolSection.addChildrens(EnumValueConfigurator.getTools());
		nodeToolSection.addChildrens(TypeReferenceConfigurator.getTools());

		tToolSection edgeToolSection = new tToolSection("Connections");
		edgeToolSection.addChildrens(DomainConnectorConfigurator.getTools());
		edgeToolSection.addChildrens(AssosiationConfigurator.getTools());
		edgeToolSection.addChildrens(GeneralizationConfigurator.getTools());
		list.add(edgeToolSection);

		return list;
	}
}
