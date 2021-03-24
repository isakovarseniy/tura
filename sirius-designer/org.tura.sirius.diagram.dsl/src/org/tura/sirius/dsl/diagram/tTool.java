/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.sirius.dsl.diagram;

import org.eclipse.sirius.viewpoint.description.tool.AbstractToolDescription;
import org.tura.sirius.dsl.viewpoint.tRoot;

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
