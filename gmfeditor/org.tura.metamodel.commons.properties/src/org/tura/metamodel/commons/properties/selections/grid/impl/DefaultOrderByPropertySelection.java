package org.tura.metamodel.commons.properties.selections.grid.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

import domain.DomainFactory;
import domain.DomainPackage;

public class DefaultOrderByPropertySelection extends DefaultSearchPropertySelection{

	@Override
	public EObject getModel() {
		if (((domain.DataControl) getEObject()).getDefaultOrderBy() == null){
			EditingDomain editingDomain = ((DiagramEditor) this.getPart())
					.getEditingDomain();

			domain.ContextParameters  ctx = DomainFactory.eINSTANCE.createContextParameters();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, getEObject(), DomainPackage.eINSTANCE
							.getDataControl_DefaultOrderBy(), ctx));
		}
		return ((domain.DataControl) getEObject()).getDefaultOrderBy();
	}
	
	
}
