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
