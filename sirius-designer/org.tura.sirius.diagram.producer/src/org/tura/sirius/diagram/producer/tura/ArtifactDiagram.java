/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import org.tura.sirius.diagram.producer.tura.config.items.artifact.ArtifactConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.ConfigHashWithNickNameConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.ConfigHashWithNickNamesConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.ConfigVariableWithNickNameConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.ConfigVariableWithNickNamesConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.ModelQueryConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.ModelQueryesConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.TechnologiesConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.TechnologyConfigurator;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.diagram.tToolSection;

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
