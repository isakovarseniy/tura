package org.tura.metamodel.commons.properties.selections.dropdown;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

import domain.DomainFactory;
import domain.DomainPackage;
import domain.TypePointer;

public class AssosiationPackagePropertySelection extends PackageNamePropertySection{

	@Override
	public EObject getModel() {
		TypePointer typeRef = ((domain.Assosiation) getEObject())
				.getMany2manyHelper();
		if (typeRef == null) {
			typeRef = DomainFactory.eINSTANCE.createTypePointer();
			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();

			editingDomain.getCommandStack()
					.execute(
							SetCommand.create(editingDomain, getEObject(),
									DomainPackage.eINSTANCE
											.getAssosiation_Many2manyHelper(),
									typeRef));
		}

		return typeRef;
	}	

	@Override
	public EObject getModel(EStructuralFeature feature) {
		return getModel();
	}
	
	
}
