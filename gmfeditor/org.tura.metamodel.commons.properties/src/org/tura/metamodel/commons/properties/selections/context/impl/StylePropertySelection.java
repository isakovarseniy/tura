package org.tura.metamodel.commons.properties.selections.context.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

import domain.DomainFactory;
import domain.DomainPackage;

public class StylePropertySelection extends AbstractStringPropertySelection {

	public String getLabelText() {
		return "Style";//$NON-NLS-1$
	}
	@Override
	public EObject getModel() {

		domain.StyleElement el = ((domain.StyleElement) getEObject());
		if (el.getStyle() == null) {

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el,
							DomainPackage.eINSTANCE.getStyleElement_Style(),
							DomainFactory.eINSTANCE.createContext()));

		}

		return el.getStyle();
	}
}
