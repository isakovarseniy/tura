package com.turasolutions.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import com.turasolutions.sirius.diagram.producer.tura.config.items.form.ArtificialFieldConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.ArtificialFieldsConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.CreateTriggerConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.DataControlConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.DataControlContextMenu;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.DependencyConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.FakeDataControlRelationsMapperConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.FakeDatacontrolRelationMapperConfiguration;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.FakeRelationMapperConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.FormVariableConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.FormVariablesConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.InternalRelationConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.POSTCreateTriggerConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.POSTQueryTriggerConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.PREDeleteTriggerConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.PREFormTriggerConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.PREFormTriggersConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.PREInsertTriggerConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.PREQueryTriggerConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.PREUpdateTriggerConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.RelationConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.RelationMapperConfiguration;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.RelationsMapperConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.RootConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.SearchTriggerConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.TriggersConfigurator;
import com.turasolutions.sirius.dsl.diagram.tContainer;
import com.turasolutions.sirius.dsl.diagram.tToolSection;

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
