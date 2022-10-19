/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.AggregatedFieldConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.AggregatedFieldsConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.CalculatedFieldConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.CalculatedFieldsConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.FakeOmRelationConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.Field2FieldConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.ObectMapper2ObjectMapperConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.ObjectMapperConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.ObjectMapperContextMenu;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.ObjectMapperLeftBorderedAggregatedFieldConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.ObjectMapperLeftBorderedCalculatedFieldConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.ObjectMapperLeftBorderedTypeAttributeConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.ObjectMapperRightBorderedCalculatedFieldConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.ObjectMapperRightBorderedTypeAttributeConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.ObjectMapperTypeAttributeConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.ObjectMapperTypeAttributesConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.OmRelationConfiguration;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.OmRelationsConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.OperationConnectorConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.ProcessingStage2ObjectMapperConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.ProcessingStage2ProcessingStageConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.ProcessingStageConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.objectmapper.VariableConfigurator;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.diagram.tEdge;
import org.tura.sirius.dsl.diagram.tToolSection;

public class ObjectMapperDiagram {
	  public List<Object> getChildrens(){
			ArrayList<Object> list = new ArrayList<Object>();

		    tContainer cnt = ObjectMapperConfigurator.create()
		    		  .addBorderedChild(ObjectMapperRightBorderedTypeAttributeConfigurator.create())
		    		  .addBorderedChild(ObjectMapperRightBorderedCalculatedFieldConfigurator.create())
//		    		  .addBorderedChild(ObjectMapperRightBorderedAggregatedFieldConfigurator.create())
		    		  .addBorderedChild(ObjectMapperLeftBorderedTypeAttributeConfigurator.create())
		    		  .addBorderedChild(ObjectMapperLeftBorderedCalculatedFieldConfigurator.create())
		    		  .addBorderedChild(ObjectMapperLeftBorderedAggregatedFieldConfigurator.create())
		    		  
		    	      .addChild(OmRelationsConfigurator.create()
		    	      .addChild(OmRelationConfiguration.create()))
		    	      .addChild(ObjectMapperTypeAttributesConfigurator.create()
		    	    		  .addChild(ObjectMapperTypeAttributeConfigurator.create()))
		    	      .addChild(CalculatedFieldsConfigurator.create()
		    	    		  .addChild(CalculatedFieldConfigurator.create()))
		    	      .addChild(AggregatedFieldsConfigurator.create()
		    	    		  .addChild(AggregatedFieldConfigurator.create()));
		    	      
		    	      ;
		    
		    list.add(cnt);
		    list.add(VariableConfigurator.create());
		    list.add(FakeOmRelationConfigurator.create());
		    list.add(ProcessingStageConfigurator.create());
		    
		    
			tEdge e = ObectMapper2ObjectMapperConfigurator.create();
			list.add(e);
			list.add(ProcessingStage2ProcessingStageConfigurator.create());
			list.add(ProcessingStage2ObjectMapperConfigurator.create());
			list.add(Field2FieldConfigurator.create());
			list.add(OperationConnectorConfigurator.create());
			
		    

		    tToolSection nodeToolSection = new tToolSection("Nodes");
		    list.add(nodeToolSection);
		    nodeToolSection.addChildrens(ObjectMapperConfigurator.getTools());
		    nodeToolSection.addChildrens(OmRelationConfiguration.getTools());
		    nodeToolSection.addChildrens(ProcessingStageConfigurator.getTools());
		    nodeToolSection.addChildrens(ObjectMapperTypeAttributeConfigurator.getTools());
		    nodeToolSection.addChildrens(CalculatedFieldConfigurator.getTools());
		    nodeToolSection.addChildrens(AggregatedFieldConfigurator.getTools());
		    nodeToolSection.addChildrens(VariableConfigurator.getTools());
			nodeToolSection.addChildrens(ObjectMapperContextMenu.getMenu());
		    
		    

			tToolSection edgeToolSection = new tToolSection("Connections");
			edgeToolSection.addChildrens(ProcessingStage2ProcessingStageConfigurator.getTools());
			edgeToolSection.addChildrens(ProcessingStage2ObjectMapperConfigurator.getTools());
			edgeToolSection.addChildrens(Field2FieldConfigurator.getTools());
			edgeToolSection.addChildrens(OperationConnectorConfigurator.getTools());
			
			list.add(edgeToolSection);

			return list;
	  }
}
