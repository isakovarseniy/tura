package org.tura.metamodel.commons.properties.selections.context.impl;

import java.util.UUID;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

import domain.DomainFactory;
import domain.DomainPackage;

public class MenuTransitionPropertySelection extends AbstractStringPropertySelection {

	public String getLabelText() {
		return "Transition";//$NON-NLS-1$
	}
	@Override
	public EObject getModel() {

		domain.MenuItem el = ((domain.MenuItem) getEObject());
		if (el.getTransition() == null) {

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el,
							DomainPackage.eINSTANCE.getMenuItem_Transition(),
							DomainFactory.eINSTANCE.createContext()));

		}

		if (el.getTransition().getUid() == null) {

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el.getStyle(),
							DomainPackage.eINSTANCE.getContextValue_Uid(), UUID
									.randomUUID().toString()));

		}

		return el.getTransition();
	}
}
