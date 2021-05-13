/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.sirius.dsl.diagram;

import java.util.List;

import org.eclipse.sirius.diagram.description.tool.ToolFactory;
import org.eclipse.sirius.diagram.description.tool.ToolSection;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.tura.sirius.dsl.viewpoint.tRoot;

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
