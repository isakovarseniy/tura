/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import org.tura.sirius.diagram.producer.tura.config.items.form.ArtificialFieldConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.ArtificialFieldsConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.CreateTriggerConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.DataControlConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.DataControlContextMenu;
import org.tura.sirius.diagram.producer.tura.config.items.form.DependencyConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.FakeDataControlRelationsMapperConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.FakeDatacontrolRelationMapperConfiguration;
import org.tura.sirius.diagram.producer.tura.config.items.form.FakeRelationMapperConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.FormVariableConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.FormVariablesConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.InternalRelationConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.POSTCreateTriggerConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.POSTQueryTriggerConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.PREDeleteTriggerConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.PREFormTriggerConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.PREFormTriggersConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.PREInsertTriggerConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.PREQueryTriggerConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.PREUpdateTriggerConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.RelationConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.RelationMapperConfiguration;
import org.tura.sirius.diagram.producer.tura.config.items.form.RelationsMapperConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.RootConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.SearchTriggerConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.TriggersConfigurator;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.diagram.tToolSection;

public class DataControlDiagram
{
  public List<Object> getChildrens()
  {
		ArrayList<Object> list = new ArrayList<Object>();
    
    tContainer cnt = DataControlConfigurator.create()
      .addChild(TriggersConfigurator.create()
      .addChild(PREQueryTriggerConfigurator.create())
      .addChild(POSTQueryTriggerConfigurator.create())
      .addChild(PREInsertTriggerConfigurator.create())
      .addChild(PREDeleteTriggerConfigurator.create())
      .addChild(POSTCreateTriggerConfigurator.create())
      .addChild(PREUpdateTriggerConfigurator.create())
      .addChild(CreateTriggerConfigurator.create())
      .addChild(SearchTriggerConfigurator.create()))
      .addChild(ArtificialFieldsConfigurator.create()
      .addChild(ArtificialFieldConfigurator.create()))
      .addChild(RelationsMapperConfigurator.create()
      .addChild(RelationMapperConfiguration.create()))
      .addChild(FakeDataControlRelationsMapperConfigurator.create()
      .addChild(FakeDatacontrolRelationMapperConfiguration.create()));
    
    list.add(cnt);
    list.add(FakeRelationMapperConfigurator.create());
    
    cnt = RootConfigurator.create()
      .addChild(PREFormTriggersConfigurator.create()
      .addChild(PREFormTriggerConfigurator.create()))
      .addChild(FormVariablesConfigurator.create()
      .addChild(FormVariableConfigurator.create()));
    
    list.add(cnt);
    
    list.add(RelationConfigurator.create());
    list.add(InternalRelationConfigurator.create());
    list.add(DependencyConfigurator.create());
    
    tToolSection nodeToolSection = new tToolSection("Nodes");
    list.add(nodeToolSection);
    nodeToolSection.addChildrens(DataControlConfigurator.getTools());
    nodeToolSection.addChildrens(PREQueryTriggerConfigurator.getTools());
    nodeToolSection.addChildrens(POSTQueryTriggerConfigurator.getTools());
    nodeToolSection.addChildrens(PREInsertTriggerConfigurator.getTools());
    nodeToolSection.addChildrens(PREDeleteTriggerConfigurator.getTools());
    nodeToolSection.addChildrens(POSTCreateTriggerConfigurator.getTools());
    nodeToolSection.addChildrens(PREUpdateTriggerConfigurator.getTools());
    nodeToolSection.addChildrens(CreateTriggerConfigurator.getTools());
    nodeToolSection.addChildrens(SearchTriggerConfigurator.getTools());
    nodeToolSection.addChildrens(ArtificialFieldConfigurator.getTools());
    nodeToolSection.addChildrens(RootConfigurator.getTools());
    nodeToolSection.addChildrens(PREFormTriggerConfigurator.getTools());
    nodeToolSection.addChildrens(FormVariableConfigurator.getTools());
    nodeToolSection.addChildrens(DataControlContextMenu.getMenu());
    nodeToolSection.addChildrens(RelationMapperConfiguration.getTools());
    
    tToolSection edgeToolSection = new tToolSection("Connections");
    list.add(edgeToolSection);
    edgeToolSection.addChildrens(RelationConfigurator.getTools());
    edgeToolSection.addChildrens(DependencyConfigurator.getTools());
    edgeToolSection.addChildrens(InternalRelationConfigurator.getTools());
    
    return list;
  }
}
