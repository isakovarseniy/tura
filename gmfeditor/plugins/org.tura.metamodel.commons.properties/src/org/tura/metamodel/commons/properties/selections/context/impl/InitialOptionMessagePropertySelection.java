package org.tura.metamodel.commons.properties.selections.context.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

import domain.DomainFactory;
import domain.DomainPackage;

public class InitialOptionMessagePropertySelection extends AbstractStringPropertySelection {

	
	@Override
	public EObject getModel() {

		domain.DropDownSelection el = ((domain.DropDownSelection) getEObject());
		if (el.getInitialOptionMessage() == null) {

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el,
							DomainPackage.eINSTANCE.getDropDownSelection_InitialOptionMessage(),
							DomainFactory.eINSTANCE.createContext()));

		}
		return el.getInitialOptionMessage();
	}

}
