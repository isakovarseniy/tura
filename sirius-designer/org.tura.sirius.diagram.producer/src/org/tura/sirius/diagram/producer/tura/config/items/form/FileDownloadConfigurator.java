package org.tura.sirius.diagram.producer.tura.config.items.form;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.diagram.LabelPosition;
import org.eclipse.sirius.diagram.description.ConditionalNodeStyleDescription;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.style.NodeStyleDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.diagram.description.style.WorkspaceImageDescription;
import org.eclipse.sirius.diagram.description.tool.ContainerDropDescription;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.diagram.description.tool.NodeCreationDescription;
import org.eclipse.sirius.viewpoint.LabelAlignment;
import org.eclipse.sirius.viewpoint.description.tool.Case;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.DragSource;
import org.eclipse.sirius.viewpoint.description.tool.InitialContainerDropOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialNodeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.Switch;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.tura.sirius.diagram.producer.tura.CanvasDiagram;
import org.tura.sirius.dsl.config.NodeConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.ToolHelper;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.diagram.tNode;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class FileDownloadConfigurator implements NodeConfigurator{

    private String suffix = "";
    private String feature = null;

    public FileDownloadConfigurator(String suffix, String feature) {
        this.suffix = suffix;
        this.feature = feature;
    }

    public FileDownloadConfigurator() {
    }

    public static tNode create(String suffix, String feature) {
        return new tNode(new FileDownloadConfigurator(suffix, feature));
    }

    public static tNode create(String suffix) {
        return new tNode(new FileDownloadConfigurator(suffix, null));
    }

    public static tNode create() {
        return new tNode(new FileDownloadConfigurator());
    }

    public String getName() {
        return "FileDownload" + this.suffix;
    }

    public String getCandidates() {
        if (this.feature != null) {
            return this.feature;
        }
        return "feature:children";
    }

    public String getPreConditionExpression() {
        return null;
    }

    public String getDomainClass() {
        return "form.FileDownload";
    }

    public NodeStyleDescription getStyle() {
        WorkspaceImageDescription style = StyleFactory.eINSTANCE.createWorkspaceImageDescription();
        style.setLabelExpression("aql:self.label");
        style.setLabelSize(12);
        style.setLabelAlignment(LabelAlignment.CENTER);
        style.setLabelPosition(LabelPosition.NODE_LITERAL);
        style.setWorkspacePath("/org.tura.metamodel.sirius.diagram.designer/images/download.png");
        style.setShowIcon(false);
        style.setSizeComputationExpression("-1");

        return style;
    }

    public static List<ToolEntry> getTools() {
        List<ToolEntry> list = new ArrayList<ToolEntry>();

        ToolEntry tool = getFileDownloadNodeCreationDescription();
        list.add(tool);

        tool = getDirectEditLabel();
        list.add(tool);

        tool = getDrugAndDrop();
        list.add(tool);

        return list;
    }

    private static ToolEntry getFileDownloadNodeCreationDescription() {
        NodeCreationDescription tool = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
                .createNodeCreationDescription();
        tool.setName("FileDownload");
        tool.setVariable(ToolHelper.createNodeCreationVariable("container"));
        tool.setViewVariable(ToolHelper.createContainerViewVariable("containerView"));
        tool.setIconPath("/org.tura.metamodel.sirius.diagram.designer/icons/download.png");

        InitialNodeCreationOperation v = ToolHelper.createInitialNodeCreationOperation();
        tool.setInitialOperation(v);

        Switch c1 = ToolHelper.createSwitch();
        v.setFirstModelOperations(c1);

        Case c2 = ToolHelper.createCase("aql:self.oclIsKindOf(form::LayerHolder)");
        c1.getCases().add(c2);

        CreateInstance c3 = ToolHelper.createInstance("form.FileDownload", "instance", "children");
        c2.getSubModelOperations().add(c3);
        c3.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));

        
		c2 = ToolHelper.createCase("aql:self.oclIsKindOf(form::DataScroller)");
		c1.getCases().add(c2);
		c3 = ToolHelper.createInstance("form.FileDownload", "instance", "children");
		c2.getSubModelOperations().add(c3);
		c3.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));
		
		        
        
        c2 = ToolHelper.createCase("aql:self.oclIsKindOf(form::Column)");
        c1.getCases().add(c2);

        c3 = ToolHelper.createInstance("form.FileDownload", "instance", "element");
        c2.getSubModelOperations().add(c3);
        c3.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUID"));
        for (int i = 0; i < CanvasDiagram.SUFFIX_LIMIT; i++) {
            ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("FileDownload" + i + tNode.class.getName());

            NodeMapping mapper = (NodeMapping) wrapper.getWrapedObject();
            if (mapper == null) {
                throw new RuntimeException("Tool mapping is null");
            }
            tool.getNodeMappings().add(mapper);
        }
        return tool;
    }

    private static ToolEntry getDirectEditLabel() {
        DirectEditLabel tool = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
                .createDirectEditLabel();
        tool.setName("FileDownload edit label");
        tool.setMask(ToolHelper.getEditMaskVariables("{0}"));
        InitialOperation opr = ToolHelper.createInitialOperation();
        tool.setInitialOperation(opr);
        opr.setFirstModelOperations(ToolHelper.createSet("name", "var:0"));
        for (int i = 0; i < CanvasDiagram.SUFFIX_LIMIT; i++) {
            ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("FileDownload" + i + tNode.class.getName());

            NodeMapping mapper = (NodeMapping) wrapper.getWrapedObject();
            if (mapper == null) {
                throw new RuntimeException("Tool mapping is null");
            }
            mapper.setLabelDirectEdit(tool);
        }
        return tool;
    }

    private static ToolEntry getDrugAndDrop() {
        ContainerDropDescription tool = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
                .createContainerDropDescription();
        tool.setName("FileDownload to LayerHolder");
        tool.setOldContainer(ToolHelper.createDropContainerVariable("oldSemanticContainer"));
        tool.setNewContainer(ToolHelper.createDropContainerVariable("newSemanticContainer"));
        tool.setElement(ToolHelper.createElementDropVariable("element"));
        tool.setNewViewContainer(ToolHelper.createContainerViewVariable("newContainerView"));
        tool.setDragSource(DragSource.BOTH_LITERAL);

        InitialContainerDropOperation opr = ToolHelper.createInitialDropDownOperation();
        tool.setInitialOperation(opr);

        ChangeContext c1 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createChangeContext();
        c1.setBrowseExpression("var:newSemanticContainer");
        opr.setFirstModelOperations(c1);

        c1.getSubModelOperations().add(ToolHelper.createSet("children", "var:element"));

        ObjectWrapper w = (ObjectWrapper) tRoot.context.get("LayerHolder" + tContainer.class.getName());
        ContainerMapping container = (ContainerMapping) w.getWrapedObject();

        w = (ObjectWrapper) tRoot.context.get("LayerHolderinTableColumn" + tContainer.class.getName());
        ContainerMapping tableContainer = (ContainerMapping) w.getWrapedObject();

        w = (ObjectWrapper) tRoot.context.get("LayerHolderinTreeColumn" + tContainer.class.getName());
        ContainerMapping treeContainer = (ContainerMapping) w.getWrapedObject();
        for (int i = 0; i < CanvasDiagram.SUFFIX_LIMIT; i++) {
            ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("FileDownload" + i + tNode.class.getName());

            NodeMapping mapper = (NodeMapping) wrapper.getWrapedObject();
            if (mapper == null) {
                throw new RuntimeException("Tool mapping is null");
            }
            container.getDropDescriptions().add(tool);
            tableContainer.getDropDescriptions().add(tool);
            treeContainer.getDropDescriptions().add(tool);
            tool.getMappings().add(mapper);
        }
        return tool;
    }

    public List<ConditionalNodeStyleDescription> getConditionalStyle() {
        return null;
    }
}