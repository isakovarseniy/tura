package org.tura.metamodel.commons.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.TextDataAdapter;

import domain.DomainPackage;

public class TypeName  implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		if (eObject == null)
			return "";
		domain.TypePointer opt = (domain.TypePointer) eObject;
		if (opt  == null || opt.getTypeRef() == null || opt.getTypeRef().getName() == null)
			return "";
		return ((domain.TypeDefinition) (opt.getTypeRef().eContainer())).getParent().getName() + ":" + opt.getTypeRef().getName();
		
	}

	@Override
	public EStructuralFeature getFeature() {
		return DomainPackage.eINSTANCE.getTypePointer_TypeRef();
	}

}