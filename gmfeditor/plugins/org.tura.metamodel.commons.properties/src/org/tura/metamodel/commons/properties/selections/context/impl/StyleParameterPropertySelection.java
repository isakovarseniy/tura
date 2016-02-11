package org.tura.metamodel.commons.properties.selections.context.impl;

import java.util.UUID;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.commons.properties.selections.grid.DataSource;

import domain.DomainFactory;
import domain.DomainPackage;

public class StyleParameterPropertySelection extends DependentContextParameterPropertySelection{

	
	@Override
	public domain.TypeElement contextRefTypeExtreactor(domain.ContextParameter  obj) {
		return ((domain.Parameter) obj.getRefObj()).getTypeRef();
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

		if (el.getStyle().getUid() == null) {

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el.getStyle(),
							DomainPackage.eINSTANCE.getContextValue_Uid(), UUID
									.randomUUID().toString()));

		}


		return el.getStyle();

	}

	@Override
	protected DataSource getDS() {
		return new ContextDS(this);
	}
	
	
}