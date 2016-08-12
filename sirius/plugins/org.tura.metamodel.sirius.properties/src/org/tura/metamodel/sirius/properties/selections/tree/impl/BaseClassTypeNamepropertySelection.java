package org.tura.metamodel.sirius.properties.selections.tree.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

import form.DataControl;
import form.FormPackage;
import type.TypeFactory;
import type.TypePointer;

public class BaseClassTypeNamepropertySelection extends TypePropertySelection{
	
	
	@Override
	public EObject getModel() {
		TypePointer typeRef = ((DataControl) super.getModel()).getBaseType();
		if (typeRef == null) {
			typeRef = TypeFactory.eINSTANCE.createTypePointer();
			EditingDomain editingDomain = ((DiagramEditor) getPart()).getEditingDomain();

			editingDomain.getCommandStack()
					.execute(
							SetCommand.create(editingDomain, super.getModel(),
									FormPackage.eINSTANCE.getDataControl_BaseType(),typeRef));
		}

		return typeRef;
	}	


}
