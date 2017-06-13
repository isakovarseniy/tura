package com.turasolutions.sirius.diagram.producer.tura.config.items.deployment;

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

import com.turasolutions.sirius.dsl.config.NodeConfigurator;
import com.turasolutions.sirius.dsl.diagram.tNode;

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
