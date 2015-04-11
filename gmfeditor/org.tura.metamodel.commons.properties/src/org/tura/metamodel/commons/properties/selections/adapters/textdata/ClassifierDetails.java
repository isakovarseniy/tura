package org.tura.metamodel.commons.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.TextDataAdapter;

import domain.DomainPackage;

public class ClassifierDetails implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		String result = "";
		domain.Classifier task = (domain.Classifier) eObject;
		if (task.getDetails() != null)
			result = task.getDetails();
		return result;
	}

	@Override
	public EStructuralFeature getFeature() {
		return DomainPackage.eINSTANCE.getClassifier_Details();
	}

}
