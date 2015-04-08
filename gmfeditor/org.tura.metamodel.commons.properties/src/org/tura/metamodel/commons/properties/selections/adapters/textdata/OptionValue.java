package org.tura.metamodel.commons.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.TextDataAdapter;

import domain.DomainPackage;

public class OptionValue  implements TextDataAdapter {

	@Override
	public Object getFeatureValue(EObject eObject, EStructuralFeature feature) {
		return eObject.eGet(feature);
	}

	@Override
	public EStructuralFeature getFeature() {
		return DomainPackage.eINSTANCE.getOption_Value();
	}

}
