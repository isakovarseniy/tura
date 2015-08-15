package org.tura.metamodel.commons.properties.selections.context.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.commons.properties.selections.grid.DataSource;

import domain.DomainFactory;
import domain.DomainPackage;

public class ReadOnlyParameterPropertySelection extends DependentContextParameterPropertySelection{



	@Override
	public domain.TypeElement contextRefTypeExtreactor(domain.ContextParameter  obj) {
		return ((domain.Parameter) obj.getRefObj()).getTypeRef();
	}
	
	
	@Override
	public EObject getModel() {

		domain.Uielement el = ((domain.Uielement) getEObject());
		if (el.getReadOnly() == null) {

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el,
							DomainPackage.eINSTANCE.getUielement_ReadOnly(),
							DomainFactory.eINSTANCE.createContext()));

		}

		return el.getReadOnly();

	}

	@Override
	protected DataSource getDS() {
		return new ContextDS(this);
	}
	
}
