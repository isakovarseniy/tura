package org.tura.metamodel.commons.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.TextDataAdapter;
import org.tura.metamodel.commons.properties.selections.grid.TextColumnConverter;

import domain.DomainPackage;

public class ParametersOrder  implements TextDataAdapter, TextColumnConverter {

	@Override
	public Object getFeatureValue(EObject eObject, EStructuralFeature feature) {
		return eObject.eGet(feature);
	}

	@Override
	public EStructuralFeature getFeature() {
		return DomainPackage.eINSTANCE.getParameter_Order();
	}

	@Override
	public String convertToText(Object obj) {
		return obj.toString();
	}

	@Override
	public Object convertToObject(String str) {
		return new Integer(str);
	}

}
