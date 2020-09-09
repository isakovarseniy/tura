/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import org.eclipse.sirius.diagram.description.tool.NodeCreationVariable;
import org.eclipse.sirius.diagram.description.tool.SourceEdgeCreationVariable;
import org.eclipse.sirius.diagram.description.tool.SourceEdgeViewCreationVariable;
import org.eclipse.sirius.diagram.description.tool.TargetEdgeCreationVariable;
import org.eclipse.sirius.diagram.description.tool.TargetEdgeViewCreationVariable;
import org.eclipse.sirius.viewpoint.description.tool.Case;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.ContainerViewVariable;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.DropContainerVariable;
import org.eclipse.sirius.viewpoint.description.tool.EditMaskVariables;
import org.eclipse.sirius.viewpoint.description.tool.ElementDeleteVariable;
import org.eclipse.sirius.viewpoint.description.tool.ElementDropVariable;
import org.eclipse.sirius.viewpoint.description.tool.InitEdgeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialContainerDropOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialNodeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;
import org.eclipse.sirius.viewpoint.description.tool.Switch;
import org.eclipse.sirius.viewpoint.description.tool.Unset;

public class ToolHelper {
	public static NodeCreationVariable createNodeCreationVariable(String name) {
		NodeCreationVariable var = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createNodeCreationVariable();
		var.setName(name);
		return var;
	}

	public static DropContainerVariable createDropContainerVariable(String name) {
		DropContainerVariable var = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createDropContainerVariable();
		var.setName(name);
		return var;
	}

	public static ElementDropVariable createElementDropVariable(String name) {
		ElementDropVariable var = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createElementDropVariable();
		var.setName(name);
		return var;
	}

	public static ContainerViewVariable createContainerViewVariable(String name) {
		ContainerViewVariable var = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createContainerViewVariable();
		var.setName(name);
		return var;
	}

	public static InitialNodeCreationOperation createInitialNodeCreationOperation() {
		InitialNodeCreationOperation var = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createInitialNodeCreationOperation();
		return var;
	}

	public static CreateInstance createInstance(String type, String var, String refName) {
		CreateInstance c = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createCreateInstance();
		c.setTypeName(type);
		c.setVariableName(var);
		c.setReferenceName(refName);

		return c;
	}

	public static ChangeContext createChangeContext(String expression) {
		ChangeContext c = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createChangeContext();
		c.setBrowseExpression(expression);
		return c;
	}

	public static ElementDeleteVariable getElementDeleteVariable(String name) {
		ElementDeleteVariable c = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createElementDeleteVariable();
		c.setName(name);
		return c;
	}

	public static SourceEdgeCreationVariable getSourceEdgeCreationVariable(String name) {
		SourceEdgeCreationVariable c = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createSourceEdgeCreationVariable();
		c.setName(name);
		return c;
	}

	public static SourceEdgeViewCreationVariable getSourceEdgeViewCreationVariable(String name) {
		SourceEdgeViewCreationVariable c = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createSourceEdgeViewCreationVariable();
		c.setName(name);
		return c;
	}

	public static TargetEdgeCreationVariable getTargetEdgeCreationVariable(String name) {
		TargetEdgeCreationVariable c = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createTargetEdgeCreationVariable();
		c.setName(name);
		return c;
	}

	public static TargetEdgeViewCreationVariable getTargetEdgeViewCreationVariable(String name) {
		TargetEdgeViewCreationVariable c = org.eclipse.sirius.diagram.description.tool.ToolFactory.eINSTANCE
				.createTargetEdgeViewCreationVariable();
		c.setName(name);
		return c;
	}

	public static InitEdgeCreationOperation createInitEdgeCreationOperation() {
		InitEdgeCreationOperation var = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createInitEdgeCreationOperation();
		return var;
	}

	public static SetValue createSet(String feature, String value) {
		SetValue c = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createSetValue();
		c.setFeatureName(feature);
		c.setValueExpression(value);
		return c;
	}

	public static Unset createUnSet(String feature, String experssion) {
		Unset c = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createUnset();
		c.setFeatureName(feature);
		c.setElementExpression(experssion);
		return c;
	}

	public static EditMaskVariables getEditMaskVariables(String mask) {
		EditMaskVariables var = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createEditMaskVariables();
		var.setMask(mask);
		return var;
	}

	public static InitialOperation createInitialOperation() {
		InitialOperation var = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createInitialOperation();
		return var;
	}

	public static InitialContainerDropOperation createInitialDropDownOperation() {
		InitialContainerDropOperation var = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createInitialContainerDropOperation();
		return var;
	}

	public static InitialContainerDropOperation createInitialRadioOperation() {
		InitialContainerDropOperation var = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createInitialContainerDropOperation();
		return var;
	}

	
	public static Case createCase(String expression) {
		Case var = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createCase();
		var.setConditionExpression(expression);
		return var;
	}

	public static Switch createSwitch() {
		Switch var = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createSwitch();
		return var;
	}
}
