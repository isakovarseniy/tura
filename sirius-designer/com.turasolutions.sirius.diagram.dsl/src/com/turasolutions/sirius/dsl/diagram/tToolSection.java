package com.turasolutions.sirius.dsl.diagram;

import java.util.List;

import org.eclipse.sirius.diagram.description.tool.ToolFactory;
import org.eclipse.sirius.diagram.description.tool.ToolSection;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;

import com.turasolutions.sirius.dsl.viewpoint.tRoot;

public class tToolSection {
	private ToolSection toolSection;

	public tToolSection(ToolSection toolSection) {
		this.toolSection = toolSection;
		tRoot.context.put(toolSection.getName() + tToolSection.class.getName(), this);
	}

	public tToolSection(String name) {
		this.toolSection = ToolFactory.eINSTANCE.createToolSection();
		this.toolSection.setName(name);
	}

	public ToolSection getToolSection() {
		return this.toolSection;
	}

	public tToolSection addChild(tTool tool) {
		this.toolSection.getOwnedTools().add(tool.getAbstractToolDescription());
		return this;
	}

	public tToolSection addChildrens(List<ToolEntry> childrens) {
		for (ToolEntry child : childrens) {
			this.toolSection.getOwnedTools().add(child);
		}
		return this;
	}
}
