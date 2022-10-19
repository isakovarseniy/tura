/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.sirius.dsl.treediagram;

import org.eclipse.sirius.viewpoint.description.tool.EditMaskVariables;
import org.eclipse.sirius.viewpoint.description.tool.ElementDropVariable;
import org.eclipse.sirius.viewpoint.description.tool.ToolFactory;

public class ToolHelper {
	public static EditMaskVariables getEditMaskVariables(String mask) {
		EditMaskVariables var = ToolFactory.eINSTANCE.createEditMaskVariables();
		var.setMask(mask);
		return var;
	}

	public static ElementDropVariable getElementDropVariable(String name) {
		ElementDropVariable var = ToolFactory.eINSTANCE.createElementDropVariable();
		var.setName(name);
		return var;
	}
}
