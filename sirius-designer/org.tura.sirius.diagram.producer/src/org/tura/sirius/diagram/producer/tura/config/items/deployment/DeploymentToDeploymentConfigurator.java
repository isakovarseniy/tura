package org.tura.sirius.diagram.producer.tura.config.items.deployment;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.diagram.EdgeArrows;
import org.eclipse.sirius.diagram.description.ConditionalEdgeStyleDescription;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.style.BeginLabelStyleDescription;
import org.eclipse.sirius.diagram.description.style.CenterLabelStyleDescription;
import org.eclipse.sirius.diagram.description.style.EdgeStyleDescription;
import org.eclipse.sirius.diagram.description.style.EndLabelStyleDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.diagram.description.tool.DeleteElementDescription;
import org.eclipse.sirius.diagram.description.tool.EdgeCreationDescription;
import org.eclipse.sirius.diagram.description.tool.ReconnectEdgeDescription;
import org.eclipse.sirius.diagram.description.tool.ReconnectionKind;
import org.eclipse.sirius.diagram.description.tool.ToolFactory;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.InitEdgeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.tura.sirius.dsl.config.EdgeConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.ToolHelper;
import org.tura.sirius.dsl.diagram.tNode;
import org.tura.sirius.dsl.diagram.tRelationEdge;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class DeploymentToDeploymentConfigurator
  implements EdgeConfigurator
{
  public static tRelationEdge create()
  {
    return new tRelationEdge(new DeploymentToDeploymentConfigurator());
  }
  
  public String getName()
  {
    return "DeploymentToDeployment";
  }
  
  public String getCandidates()
  {
    return null;
  }
  
  public String getDomainClass()
  {
    return null;
  }
  
  public List<String> getSource()
  {
    ArrayList<String> list = new ArrayList<String>();
    list.add("DeploymentComponent" + tNode.class.getName());
    
    return list;
  }
  
  public List<String> getTarget()
  {
    ArrayList<String> list = new ArrayList<String>();
    list.add("DeploymentComponent" + tNode.class.getName());
    
    return list;
  }
  
  public EdgeStyleDescription getStyle()
  {
    EdgeStyleDescription style = StyleFactory.eINSTANCE.createEdgeStyleDescription();
    style.setSourceArrow(EdgeArrows.NO_DECORATION_LITERAL);
    style.setTargetArrow(EdgeArrows.INPUT_FILL_CLOSED_ARROW_LITERAL);
    
    BeginLabelStyleDescription beginStyle = StyleFactory.eINSTANCE.createBeginLabelStyleDescription();
    style.setBeginLabelStyleDescription(beginStyle);
    
    EndLabelStyleDescription endStyle = StyleFactory.eINSTANCE.createEndLabelStyleDescription();
    style.setEndLabelStyleDescription(endStyle);
    
    CenterLabelStyleDescription centerStyle = StyleFactory.eINSTANCE.createCenterLabelStyleDescription();
    style.setCenterLabelStyleDescription(centerStyle);
    
    return style;
  }
  
  public String getSourceFinderExpression()
  {
    return null;
  }
  
  public String getTargetFinderExpression()
  {
    return "feature:deploymentComponentLink";
  }
  
  public static List<ToolEntry> getTools()
  {
    List<ToolEntry> list = new ArrayList<ToolEntry>();
    
    ToolEntry tool = getDeploymentToDeploymentEdgeCreationDescription();
    list.add(tool);
    
    tool = getReconectEdgeTarget();
    list.add(tool);
    
    tool = getReconectEdgeSource();
    list.add(tool);
    
    tool = getDeletetEdgeSource();
    list.add(tool);
    
    return list;
  }
  
  private static ToolEntry getDeploymentToDeploymentEdgeCreationDescription()
  {
    EdgeCreationDescription tool = ToolFactory.eINSTANCE.createEdgeCreationDescription();
    tool.setName("DeploymentComponent");
    tool.setSourceVariable(ToolHelper.getSourceEdgeCreationVariable("source"));
    tool.setSourceViewVariable(ToolHelper.getSourceEdgeViewCreationVariable("sourceView"));
    
    tool.setTargetVariable(ToolHelper.getTargetEdgeCreationVariable("target"));
    tool.setTargetViewVariable(ToolHelper.getTargetEdgeViewCreationVariable("targetView"));
    
    InitEdgeCreationOperation v = ToolHelper.createInitEdgeCreationOperation();
    tool.setInitialOperation(v);
    
    v.setFirstModelOperations(ToolHelper.createSet("deploymentComponentLink", "var:target"));
    
    ObjectWrapper wrapper = (ObjectWrapper)tRoot.context.get("DeploymentToDeployment" + tRelationEdge.class.getName());
    
    EdgeMapping mapper = (EdgeMapping)wrapper.getWrapedObject();
    if (mapper == null) {
      throw new RuntimeException("Tool mapping is null");
    }
    tool.getEdgeMappings().add(mapper);
    
    return tool;
  }
  
  private static ToolEntry getReconectEdgeTarget()
  {
    ReconnectEdgeDescription tool = ToolFactory.eINSTANCE.createReconnectEdgeDescription();
    tool.setReconnectionKind(ReconnectionKind.RECONNECT_TARGET_LITERAL);
    tool.setName("Reconect target DeploymentComponent");
    
    tool.setSource(ToolHelper.getSourceEdgeCreationVariable("source"));
    tool.setSourceView(ToolHelper.getSourceEdgeViewCreationVariable("sourceView"));
    tool.setTarget(ToolHelper.getTargetEdgeCreationVariable("target"));
    tool.setTargetView(ToolHelper.getTargetEdgeViewCreationVariable("targetView"));
    
    InitialOperation op = ToolHelper.createInitialOperation();
    tool.setInitialOperation(op);
    ChangeContext c = ToolHelper.createChangeContext("var:element");
    op.setFirstModelOperations(c);
    c.getSubModelOperations().add(ToolHelper.createSet("deploymentComponentLink", "var:target"));
    
    ObjectWrapper wrapper = (ObjectWrapper)tRoot.context.get("DeploymentToDeployment" + tRelationEdge.class.getName());
    
    EdgeMapping mapper = (EdgeMapping)wrapper.getWrapedObject();
    if (mapper == null) {
      throw new RuntimeException("Tool mapping is null");
    }
    mapper.getReconnections().add(tool);
    
    return tool;
  }
  
  private static ToolEntry getReconectEdgeSource()
  {
    ReconnectEdgeDescription tool = ToolFactory.eINSTANCE.createReconnectEdgeDescription();
    tool.setReconnectionKind(ReconnectionKind.RECONNECT_SOURCE_LITERAL);
    tool.setName("Reconect cource DeploymentComponent");
    
    tool.setSource(ToolHelper.getSourceEdgeCreationVariable("source"));
    tool.setSourceView(ToolHelper.getSourceEdgeViewCreationVariable("sourceView"));
    tool.setTarget(ToolHelper.getTargetEdgeCreationVariable("target"));
    tool.setTargetView(ToolHelper.getTargetEdgeViewCreationVariable("targetView"));
    
    InitialOperation op = ToolHelper.createInitialOperation();
    tool.setInitialOperation(op);
    ChangeContext c = ToolHelper.createChangeContext("var:element");
    op.setFirstModelOperations(c);
    c.getSubModelOperations().add(ToolHelper.createSet("deploymentComponentLink", "var:source"));
    
    ObjectWrapper wrapper = (ObjectWrapper)tRoot.context.get("DeploymentToDeployment" + tRelationEdge.class.getName());
    
    EdgeMapping mapper = (EdgeMapping)wrapper.getWrapedObject();
    if (mapper == null) {
      throw new RuntimeException("Tool mapping is null");
    }
    mapper.getReconnections().add(tool);
    
    return tool;
  }
  
  private static ToolEntry getDeletetEdgeSource()
  {
    DeleteElementDescription tool = ToolFactory.eINSTANCE.createDeleteElementDescription();
    tool.setName("Remove DeploymentComponent");
    
    InitialOperation op = ToolHelper.createInitialOperation();
    tool.setInitialOperation(op);
    ChangeContext c = ToolHelper.createChangeContext("var:element");
    op.setFirstModelOperations(c);
    c.getSubModelOperations().add(ToolHelper.createUnSet("deploymentComponentLink", null));
    
    ObjectWrapper wrapper = (ObjectWrapper)tRoot.context.get("DeploymentToDeployment" + tRelationEdge.class.getName());
    
    EdgeMapping mapper = (EdgeMapping)wrapper.getWrapedObject();
    if (mapper == null) {
      throw new RuntimeException("Tool mapping is null");
    }
    mapper.setDeletionDescription(tool);
    
    return tool;
  }
  
  public List<ConditionalEdgeStyleDescription> getConditionalStyle()
  {
    return null;
  }
  
  public String getPreConditionExpression()
  {
    return null;
  }
}
