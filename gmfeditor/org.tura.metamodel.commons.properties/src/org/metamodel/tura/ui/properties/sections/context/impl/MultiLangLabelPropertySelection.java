package org.metamodel.tura.ui.properties.sections.context.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

import domain.DomainFactory;
import domain.DomainPackage;

public class MultiLangLabelPropertySelection extends AbstractStringPropertySelection {

	
	@Override
	public EObject getModel() {

		domain.MultiLangLabel el = ((domain.MultiLangLabel) getEObject());
		if (el.getMultiLangLabel() == null) {

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el,
							DomainPackage.eINSTANCE.getMultiLangLabel_MultiLangLabel(),
							DomainFactory.eINSTANCE.createContext()));

		}

		return el.getMultiLangLabel();

	}

	
}
