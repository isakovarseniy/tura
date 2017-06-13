package com.turasolutions.sirius.diagram.producer.tura.config.items.form;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.diagram.LabelPosition;
import org.eclipse.sirius.diagram.description.ConditionalNodeStyleDescription;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.style.NodeStyleDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.diagram.description.style.WorkspaceImageDescription;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.diagram.description.tool.NodeCreationDescription;
import org.eclipse.sirius.diagram.description.tool.ToolFactory;
import org.eclipse.sirius.viewpoint.LabelAlignment;
import org.eclipse.sirius.viewpoint.description.tool.Case;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.InitialNodeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.Switch;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;

import com.turasolutions.sirius.dsl.config.NodeConfigurator;
import com.turasolutions.sirius.dsl.config.ObjectWrapper;
import com.turasolutions.sirius.dsl.diagram.ToolHelper;
import com.turasolutions.sirius.dsl.diagram.tNode;
import com.turasolutions.sirius.dsl.viewpoint.tRoot;

public class CheckBoxConfigurator
  implements NodeConfigurator
{
  private String suffix = "";
  private String feature = null;
  
  public CheckBoxConfigurator(String suffix, String feature)
  {
    this.suffix = suffix;
    this.feature = feature;
  }
  
  public CheckBoxConfigurator() {}
  
  public static tNode create(String suffix, String feature)
  {
    return new tNode(new CheckBoxConfigurator(suffix, feature));
  }
  
  public static tNode create(String suffix)
  {
    return new tNode(new CheckBoxConfigurator(suffix, null));
  }
  
  public String getPreConditionExpression()
  {
    return null;
  }
  
  public static tNode create()
  {
    return new tNode(new CheckBoxConfigurator());
  }
  
  public String getName()
  {
    return "CheckBox" + this.suffix;
  }
  
  public String getCandidates()
  {
    if (this.feature != null) {
      return this.feature;
    }
    return "feature:children";
  }
  
  public String getDomainClass()
  {
    return "form.CheckBox";
  }
  
  public NodeStyleDescription getStyle()
  {
    WorkspaceImageDescription style = StyleFactory.eINSTANCE.createWorkspaceImageDescription();
    style.setLabelExpression("aql:self.label");
    style.setLabelSize(12);
    style.setLabelAlignment(LabelAlignment.LEFT);
    style.setLabelPosition(LabelPosition.NODE_LITERAL);
    style.setWorkspacePath("/org.tura.metamodel.sirius.diagram.designer/images/checkbox.png");
    style.setShowIcon(false);
    style.setSizeComputationExpression("-1");
    style.setHideLabelByDefault(true);
    
    return style;
  }
  
  public static List<ToolEntry> getTools()
  {
    List<ToolEntry> list = new ArrayList<ToolEntry>();
    
    ToolEntry tool = getCheckBoxNodeCreationDescription();
    list.add(tool);
    
    tool = getDirectEditLabel();
    list.add(tool);
    
    return list;
  }
  
  private static ToolEntry getCheckBoxNodeCreationDescription()
  {
    NodeCreationDescription tool = ToolFactory.eINSTANCE.createNodeCreationDescription();
    tool.setName("CheckBox");
    tool.setVariable(ToolHelper.createNodeCreationVariable("container"));
    tool.setViewVariable(ToolHelper.createContainerViewVariable("containerView"));
    tool.setIconPath("/org.tura.metamodel.sirius.diagram.designer/icons/checkbox.png");
    
    InitialNodeCreationOperation v = ToolHelper.createInitialNodeCreationOperation();
    tool.setInitialOperation(v);
    
    Switch c1 = ToolHelper.createSwitch();
    v.setFirstModelOperations(c1);
    
    Case c2 = ToolHelper.createCase("aql:self.oclIsKindOf(form::LayerHolder)");
    c1.getCases().add(c2);
    
    CreateInstance c3 = ToolHelper.createInstance("form.CheckBox", "instance", "children");
    c2.getSubModelOperations().add(c3);
    c3.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));
    
    c2 = ToolHelper.createCase("aql:self.oclIsKindOf(form::Column)");
    c1.getCases().add(c2);
    
    c3 = ToolHelper.createInstance("form.CheckBox", "instance", "element");
    c2.getSubModelOperations().add(c3);
    c3.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));
    for (int i = 0; i < 5; i++)
    {
      ObjectWrapper wrapper = (ObjectWrapper)tRoot.context.get("CheckBox" + i + tNode.class.getName());
      
      NodeMapping mapper = (NodeMapping)wrapper.getWrapedObject();
      if (mapper == null) {
        throw new RuntimeException("Tool mapping is null");
      }
      tool.getNodeMappings().add(mapper);
    }
    return tool;
  }
  
  private static ToolEntry getDirectEditLabel()
  {
    DirectEditLabel tool = ToolFactory.eINSTANCE.createDirectEditLabel();
    tool.setName("CheckBox edit label");
    tool.setMask(ToolHelper.getEditMaskVariables("{0}"));
    InitialOperation opr = ToolHelper.createInitialOperation();
    tool.setInitialOperation(opr);
    opr.setFirstModelOperations(ToolHelper.createSet("name", "var:0"));
    for (int i = 0; i < 5; i++)
    {
      ObjectWrapper wrapper = (ObjectWrapper)tRoot.context.get("CheckBox" + i + tNode.class.getName());
      
      NodeMapping mapper = (NodeMapping)wrapper.getWrapedObject();
      if (mapper == null) {
        throw new RuntimeException("Tool mapping is null");
      }
      mapper.setLabelDirectEdit(tool);
    }
    return tool;
  }
  
  public List<ConditionalNodeStyleDescription> getConditionalStyle()
  {
    return null;
  }
}
