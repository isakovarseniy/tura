package com.turasolutions.sirius.diagram.producer.tura.config.items.message;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.table.metamodel.table.description.BackgroundStyleDescription;
import org.eclipse.sirius.table.metamodel.table.description.CreateLineTool;
import org.eclipse.sirius.table.metamodel.table.description.DescriptionFactory;
import org.eclipse.sirius.table.metamodel.table.description.ForegroundStyleDescription;
import org.eclipse.sirius.table.metamodel.table.description.TableVariable;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;
import org.eclipse.sirius.viewpoint.description.tool.ToolFactory;

import com.turasolutions.sirius.dsl.config.LineConfiguration;
import com.turasolutions.sirius.dsl.table.tLine;

public class MessageConfiguration implements LineConfiguration {
	public static tLine create() {
		return new tLine(new MessageConfiguration());
	}

	public String getDomainClass() {
		return "message.Message";
	}

	public String getCandidates() {
		return "feature:messages";
	}

	public String getName() {
		return "Key";
	}

	public BackgroundStyleDescription getBackgroundStyle() {
		BackgroundStyleDescription style = DescriptionFactory.eINSTANCE.createBackgroundStyleDescription();
		return style;
	}

	public ForegroundStyleDescription getForegroundStyle() {
		ForegroundStyleDescription style = DescriptionFactory.eINSTANCE.createForegroundStyleDescription();
		return style;
	}

	public String getHeaderLabelExpression() {
		return "service:generateName";
	}

	public List<CreateLineTool> getCreateTools() {
		ArrayList<CreateLineTool> tools = new ArrayList<>();

		CreateLineTool tool = DescriptionFactory.eINSTANCE.createCreateLineTool();
		tool.setName("Create translation");

		TableVariable v1 = DescriptionFactory.eINSTANCE.createTableVariable();
		v1.setName("root");
		v1.setDocumentation("The semantic element of the table.");
		tool.getVariables().add(v1);

		v1 = DescriptionFactory.eINSTANCE.createTableVariable();
		v1.setName("element");
		v1.setDocumentation("The currently edited element.");
		tool.getVariables().add(v1);

		v1 = DescriptionFactory.eINSTANCE.createTableVariable();
		v1.setName("container");
		v1.setDocumentation("The semantic element corresponding to the view container.");
		tool.getVariables().add(v1);

		ChangeContext c1 = ToolFactory.eINSTANCE.createChangeContext();
		c1.setBrowseExpression("var:element");
		tool.setFirstModelOperation(c1);

		CreateInstance c2 = ToolFactory.eINSTANCE.createCreateInstance();
		c2.setReferenceName("translatioins");
		c2.setTypeName("message.Translation");
		c2.setVariableName("instance");
		c1.getSubModelOperations().add(c2);

		SetValue c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("uid");
		c3.setValueExpression("service:generateUID");
		c2.getSubModelOperations().add(c3);

		c3 = ToolFactory.eINSTANCE.createSetValue();
		c3.setFeatureName("translation");
		c3.setValueExpression("service:generateName");
		c2.getSubModelOperations().add(c3);

		tools.add(tool);

		return tools;
	}
}
