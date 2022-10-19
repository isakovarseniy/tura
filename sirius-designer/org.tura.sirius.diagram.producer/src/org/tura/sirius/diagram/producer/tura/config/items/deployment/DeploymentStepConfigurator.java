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

package org.tura.sirius.diagram.producer.tura.config.items.deployment;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.diagram.LabelPosition;
import org.eclipse.sirius.diagram.ResizeKind;
import org.eclipse.sirius.diagram.description.ConditionalNodeStyleDescription;
import org.eclipse.sirius.diagram.description.DescriptionFactory;
import org.eclipse.sirius.diagram.description.style.NodeStyleDescription;
import org.eclipse.sirius.diagram.description.style.SquareDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.viewpoint.LabelAlignment;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.tura.sirius.dsl.config.NodeConfigurator;
import org.tura.sirius.dsl.diagram.tNode;

public class DeploymentStepConfigurator
  implements NodeConfigurator
{
  public static tNode create()
  {
    return new tNode(new DeploymentStepConfigurator());
  }
  
  public String getName()
  {
    return "DeploymentComponent";
  }
  
  public String getCandidates()
  {
    return "feature:deplymentStep";
  }
  
  public String getPreConditionExpression()
  {
    return null;
  }
  
  public String getDomainClass()
  {
    return "recipe.DeploymentComponent";
  }
  
  public NodeStyleDescription getStyle()
  {
    SquareDescription style = StyleFactory.eINSTANCE.createSquareDescription();
    style.setLabelExpression("aql:self.mapper.name");
    style.setLabelSize(12);
    style.setBorderSizeComputationExpression("2");
    style.setLabelAlignment(LabelAlignment.LEFT);
    style.setLabelPosition(LabelPosition.NODE_LITERAL);
    SystemColor foregroundColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("light_blue");
    style.setColor(foregroundColor);
    style.setResizeKind(ResizeKind.NSEW_LITERAL);
    
    return style;
  }
  
  public List<ConditionalNodeStyleDescription> getConditionalStyle()
  {
    ConditionalNodeStyleDescription conditional = DescriptionFactory.eINSTANCE.createConditionalNodeStyleDescription();
    conditional.setPredicateExpression("aql:self.skip");
    NodeStyleDescription style = getStyle();
    conditional.setStyle(style);
    
    SystemColor lineColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("red");
    style.setBorderColor(lineColor);
    
    style.setBorderSizeComputationExpression("2");
    
    List<ConditionalNodeStyleDescription> ls = new ArrayList<ConditionalNodeStyleDescription>();
    ls.add(conditional);
    return ls;
  }
}
