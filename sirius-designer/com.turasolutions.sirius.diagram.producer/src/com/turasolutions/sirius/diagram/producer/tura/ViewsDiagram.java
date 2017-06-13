package com.turasolutions.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import com.turasolutions.sirius.diagram.producer.tura.config.items.form.CanvasConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.MenuDefinitionConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.PopupCanvasConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.TabCanvasConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.TabPageConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.TabPagesInheritanceConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.ViewAreaConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.ViewElementsConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.ViewInheritanceConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.ViewPortConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.ViewPortTriggerConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.ViewPortTriggersConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.WindowConfigurator;
import com.turasolutions.sirius.dsl.diagram.tContainer;
import com.turasolutions.sirius.dsl.diagram.tToolSection;

public class ViewsDiagram
{
  public static int ID = 0;
  
  public List<Object> getChildrens()
  {
    ArrayList<Object> list = new ArrayList<Object>();
    
    tContainer cnt = WindowConfigurator.create()
      .addChild(ViewElementsConfigurator.create()
      .addChild(ViewAreaConfigurator.create())
      .addChild(ViewPortConfigurator.create()
      .addChild(ViewPortTriggersConfigurator.create()
      .addChild(ViewPortTriggerConfigurator.create()))));
    
    list.add(cnt);
    ID += 1;
    
    cnt = CanvasConfigurator.create()
      .addChild(ViewElementsConfigurator.create()
      .addChild(ViewAreaConfigurator.create())
      .addChild(ViewPortConfigurator.create()
      .addChild(ViewPortTriggersConfigurator.create()
      .addChild(ViewPortTriggerConfigurator.create()))));
    
    list.add(cnt);
    ID += 1;
    
    cnt = PopupCanvasConfigurator.create()
      .addChild(ViewElementsConfigurator.create()
      .addChild(ViewAreaConfigurator.create())
      .addChild(ViewPortConfigurator.create()
      .addChild(ViewPortTriggersConfigurator.create()
      .addChild(ViewPortTriggerConfigurator.create()))));
    
    list.add(cnt);
    ID += 1;
    
    cnt = TabPageConfigurator.create()
      .addChild(ViewElementsConfigurator.create()
      .addChild(ViewAreaConfigurator.create())
      .addChild(ViewPortConfigurator.create()
      .addChild(ViewPortTriggersConfigurator.create()
      .addChild(ViewPortTriggerConfigurator.create()))));
    
    list.add(cnt);
    ID += 1;
    
    list.add(TabCanvasConfigurator.create());
    list.add(TabPagesInheritanceConfigurator.create());
    list.add(ViewInheritanceConfigurator.create());
    list.add(MenuDefinitionConfigurator.create());
    
    tToolSection nodeToolSection = new tToolSection("Nodes");
    list.add(nodeToolSection);
    nodeToolSection.addChildrens(WindowConfigurator.getTools());
    nodeToolSection.addChildrens(ViewAreaConfigurator.getTools());
    nodeToolSection.addChildrens(ViewPortConfigurator.getTools());
    nodeToolSection.addChildrens(ViewPortTriggerConfigurator.getTools());
    nodeToolSection.addChildrens(CanvasConfigurator.getTools());
    nodeToolSection.addChildrens(TabPageConfigurator.getTools());
    nodeToolSection.addChildrens(PopupCanvasConfigurator.getTools());
    nodeToolSection.addChildrens(TabCanvasConfigurator.getTools());
    nodeToolSection.addChildrens(MenuDefinitionConfigurator.getTools());
    
    tToolSection edgeToolSection = new tToolSection("Connections");
    list.add(edgeToolSection);
    edgeToolSection.addChildrens(TabPagesInheritanceConfigurator.getTools());
    edgeToolSection.addChildrens(ViewInheritanceConfigurator.getTools());
    
    return list;
  }
}
