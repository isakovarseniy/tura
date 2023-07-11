/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import org.tura.sirius.diagram.producer.tura.config.items.form.CanvasConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.MenuDefinitionConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.OverlayCanvasConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.PopupCanvasConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.TabCanvasConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.TabPageConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.TabPagesInheritanceConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.ViewAreaConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.ViewElementsConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.ViewInheritanceConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.ViewPortConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.ViewPortTriggerConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.ViewPortTriggersConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.WindowConfigurator;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.diagram.tToolSection;

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

    cnt = OverlayCanvasConfigurator.create()
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
    nodeToolSection.addChildrens(OverlayCanvasConfigurator.getTools());
    
    tToolSection edgeToolSection = new tToolSection("Connections");
    list.add(edgeToolSection);
    edgeToolSection.addChildrens(TabPagesInheritanceConfigurator.getTools());
    edgeToolSection.addChildrens(ViewInheritanceConfigurator.getTools());
    
    return list;
  }
}
