package org.tura.metamodel.commons.properties.selections.context.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

import domain.DomainFactory;
import domain.DomainPackage;

public class RequiredParameterPropertySelection  extends DependentContextParameterPropertySelection{

	
	@Override
	public EObject getModel() {

		domain.Uielement el = ((domain.Uielement) getEObject());
		if (el.getRequired() == null) {

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el,
							DomainPackage.eINSTANCE.getUielement_Required(),
							DomainFactory.eINSTANCE.createContext()));

		}

		return el.getRequired();

	}
	
}
