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

package org.tura.metamodel.sirius.properties.selections.tree.impl;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

import type.Operation;
import type.ReturnValue;
import type.TypeFactory;
import type.TypePackage;

public class OperationReturnTypePropertySelection  extends TypePropertySelection{
	
	@Override
	public EObject getModel() {
		Operation oper = (Operation) super.getModel();
        if (oper.getReturnValue() == null){
    		EditingDomain editingDomain = ((DiagramEditor) this.getPart()).getEditingDomain();
    		ReturnValue retValue = TypeFactory.eINSTANCE.createReturnValue();
			Command setCommand = SetCommand.create(editingDomain, oper, TypePackage.eINSTANCE.getOperation_ReturnValue() , retValue);
			editingDomain.getCommandStack().execute(setCommand);
        	
        }
		return oper.getReturnValue();
	}

}
