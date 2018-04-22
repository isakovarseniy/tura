package org.tura.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import org.tura.sirius.diagram.producer.tura.config.items.type.AssosiationConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.type.AttributeConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.type.AttributesConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.type.EnumValueConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.type.EnumValuesConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.type.EnumeratorConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.type.GeneralizationConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.type.OperatioinsConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.type.OperationConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.type.TypeConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.type.TypeReferenceConfigurator;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.diagram.tEdge;
import org.tura.sirius.dsl.diagram.tToolSection;

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
		edgeToolSection.addChildrens(AssosiationConfigurator.getTools());
		edgeToolSection.addChildrens(GeneralizationConfigurator.getTools());
		list.add(edgeToolSection);

		return list;
	}
}
