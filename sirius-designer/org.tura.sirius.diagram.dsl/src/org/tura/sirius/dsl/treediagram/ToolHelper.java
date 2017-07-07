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
