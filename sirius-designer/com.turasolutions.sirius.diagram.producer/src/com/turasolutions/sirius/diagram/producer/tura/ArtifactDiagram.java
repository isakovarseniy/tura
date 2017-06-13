package com.turasolutions.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import com.turasolutions.sirius.diagram.producer.tura.config.items.artifact.ArtifactConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.artifact.ConfigHashWithNickNameConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.artifact.ConfigHashWithNickNamesConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.artifact.ConfigVariableWithNickNameConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.artifact.ConfigVariableWithNickNamesConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.artifact.ModelQueryConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.artifact.ModelQueryesConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.artifact.TechnologiesConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.artifact.TechnologyConfigurator;
import com.turasolutions.sirius.dsl.diagram.tContainer;
import com.turasolutions.sirius.dsl.diagram.tToolSection;

public class ArtifactDiagram {
	public List<Object> getChildrens() {
		ArrayList<Object> list = new ArrayList<Object>();

		tContainer cnt = ArtifactConfigurator.create();
		list.add(cnt);
		cnt.addChild(ModelQueryesConfigurator.create().addChild(ModelQueryConfigurator.create()));
		cnt.addChild(TechnologiesConfigurator.create().addChild(TechnologyConfigurator.create()));
		cnt.addChild(ConfigVariableWithNickNamesConfigurator.create()
				.addChild(ConfigVariableWithNickNameConfigurator.create()));
		cnt.addChild(
				ConfigHashWithNickNamesConfigurator.create().addChild(ConfigHashWithNickNameConfigurator.create()));

		tToolSection nodeToolSection = new tToolSection("Nodes");
		list.add(nodeToolSection);
		nodeToolSection.addChildrens(ArtifactConfigurator.getTools());
		nodeToolSection.addChildrens(ModelQueryConfigurator.getTools());
		nodeToolSection.addChildrens(TechnologyConfigurator.getTools());

		return list;
	}
}
