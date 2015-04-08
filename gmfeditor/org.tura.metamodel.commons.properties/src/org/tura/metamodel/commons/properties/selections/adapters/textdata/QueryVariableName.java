package org.tura.metamodel.commons.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.TextDataAdapter;

import domain.DomainPackage;

public class QueryVariableName implements TextDataAdapter {

	@Override
	public Object getFeatureValue(EObject eObject, EStructuralFeature feature) {
		domain.QueryVariable opt1 = (domain.QueryVariable) eObject;
		if (opt1.getQueryParamRef() == null) return null;
		return opt1.getQueryParamRef().getName();
	}

	@Override
	public EStructuralFeature getFeature() {
		return DomainPackage.eINSTANCE.getQueryParameter_Name();
	}

}
