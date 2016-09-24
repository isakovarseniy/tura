package org.tura.metamodel.sirius.properties.selections.context.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import form.DropDownSelection;
import form.FormFactory;
import form.FormPackage;

public class InitialOptionMessagePropertySelection extends MultiLangLabelPropertySelection{

	
	@Override
	public EObject getModel() {

		DRepresentationElement element = (DRepresentationElement) getEObject();
		DropDownSelection el = (DropDownSelection) element.getTarget();
		
		if (el.getInitialOptionMessage() == null) {

			EditingDomain editingDomain = ((DiagramEditor) getPart()).getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el,
							FormPackage.eINSTANCE.getDropDownSelection_InitialOptionMessage(),
							FormFactory.eINSTANCE.createContext()));

		}
		return el.getInitialOptionMessage();
	}	
	
}
