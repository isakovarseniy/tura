package com.turasolutions.sirius.dsl.diagram;

import org.eclipse.sirius.viewpoint.description.tool.AbstractToolDescription;

import com.turasolutions.sirius.dsl.viewpoint.tRoot;

public class tTool {
	private AbstractToolDescription tool;

	public tTool(AbstractToolDescription tool) {
		this.tool = tool;
		tRoot.context.put(tool.getName() + tTool.class.getName(), this);
	}

	public AbstractToolDescription getAbstractToolDescription() {
		return this.tool;
	}
}
