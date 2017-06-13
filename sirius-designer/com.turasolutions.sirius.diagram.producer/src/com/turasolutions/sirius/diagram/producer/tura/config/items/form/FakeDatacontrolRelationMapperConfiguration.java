package com.turasolutions.sirius.diagram.producer.tura.config.items.form;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.diagram.description.ConditionalNodeStyleDescription;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.style.NodeStyleDescription;
import org.eclipse.sirius.diagram.description.style.SquareDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.diagram.description.tool.ContainerDropDescription;
import org.eclipse.sirius.diagram.description.tool.ToolFactory;
import org.eclipse.sirius.viewpoint.LabelAlignment;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.DragSource;
import org.eclipse.sirius.viewpoint.description.tool.InitialContainerDropOperation;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;

import com.turasolutions.sirius.dsl.config.NodeConfigurator;
import com.turasolutions.sirius.dsl.config.ObjectWrapper;
import com.turasolutions.sirius.dsl.diagram.ToolHelper;
import com.turasolutions.sirius.dsl.diagram.tContainer;
import com.turasolutions.sirius.dsl.diagram.tDiagram;
import com.turasolutions.sirius.dsl.diagram.tNode;
import com.turasolutions.sirius.dsl.viewpoint.tRoot;

public class FakeDatacontrolRelationMapperConfiguration implements NodeConfigurator {
	public static tNode create() {
		return new tNode(new FakeDatacontrolRelationMapperConfiguration());
	}

	public String getName() {
		return "FakeDatacontrolRelationMapper";
	}

	public String getCandidates() {
		return "feature:baseType";
	}

	public String getDomainClass() {
		return "form.RelationMapper";
	}

	public String getPreConditionExpression() {
		return "service:showRelationMapper";
	}

	public NodeStyleDescription getStyle() {
		SquareDescription style = StyleFactory.eINSTANCE.createSquareDescription();
		style.setLabelExpression("service:generateName");
		style.setLabelSize(12);
		style.setLabelAlignment(LabelAlignment.LEFT);

		return style;
	}

	public static List<ToolEntry> getTools() {
		List<ToolEntry> list = new ArrayList<ToolEntry>();

		list.add(getDrugAndDrop());

		return list;
	}

	private static ToolEntry getDrugAndDrop() {
		ContainerDropDescription tool = ToolFactory.eINSTANCE.createContainerDropDescription();
		tool.setName("Relation to Controls");
		tool.setOldContainer(ToolHelper.createDropContainerVariable("oldSemanticContainer"));
		tool.setNewContainer(ToolHelper.createDropContainerVariable("newSemanticContainer"));
		tool.setElement(ToolHelper.createElementDropVariable("element"));
		tool.setNewViewContainer(ToolHelper.createContainerViewVariable("newContainerView"));
		tool.setPrecondition("service:checkRelationMapperDropDown");
		tool.setDragSource(DragSource.BOTH_LITERAL);

		InitialContainerDropOperation opr = ToolHelper.createInitialDropDownOperation();
		tool.setInitialOperation(opr);

		CreateInstance c1 = ToolHelper.createInstance("form.DataControl", "instance", "controls");
		opr.setFirstModelOperations(c1);

		c1.getSubModelOperations().add(ToolHelper.createSet("name", "aql:element.typeRef.name"));

		CreateInstance c2 = ToolHelper.createInstance("type.TypePointer", "instance1", "baseType");
		c2.getSubModelOperations().add(ToolHelper.createSet("typeRef", "aql:element.typeRef"));

		c1.getSubModelOperations().add(c2);

		c1.getSubModelOperations().add(ToolHelper.createSet("uid", "service:generateUIDForObjectMapper"));
		ChangeContext c3 = ToolHelper.createChangeContext("var:element");
		c1.getSubModelOperations().add(c3);
		c3.getSubModelOperations().add(ToolHelper.createSet("dataControlRef", "var:instance"));

		ObjectWrapper w = (ObjectWrapper) tRoot.context.get("Data Control" + tDiagram.class.getName());
		DiagramDescription container = (DiagramDescription) w.getWrapedObject();

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("RelationMapper" + tNode.class.getName());

		NodeMapping mapper = (NodeMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		container.getDropDescriptions().add(tool);
		container.getDropDescriptions().add(tool);
		container.getDropDescriptions().add(tool);
		tool.getMappings().add(mapper);

		wrapper = (ObjectWrapper) tRoot.context.get("FakeRelationMapper" + tContainer.class.getName());

		ContainerMapping cmapper = (ContainerMapping) wrapper.getWrapedObject();
		if (cmapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		container.getDropDescriptions().add(tool);
		container.getDropDescriptions().add(tool);
		container.getDropDescriptions().add(tool);
		tool.getMappings().add(cmapper);

		return tool;
	}

	public List<ConditionalNodeStyleDescription> getConditionalStyle() {
		return null;
	}
}
