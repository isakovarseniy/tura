package org.tura.metamodel.commons.properties.selections.context.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

import domain.DomainFactory;
import domain.DomainPackage;

public class ButtonIconPropertySelection extends AbstractStringPropertySelection {

	
	@Override
	public EObject getModel() {

		domain.Button el = ((domain.Button) getEObject());
		if (el.getIcon() == null) {

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el,
							DomainPackage.eINSTANCE.getButton_Icon(),
							DomainFactory.eINSTANCE.createContext()));
		}
		return el.getIcon();
	}	
}
