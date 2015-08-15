package org.tura.metamodel.commons.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.TextDataAdapter;

import domain.DomainPackage;

public class ClassifierHint  implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		if (eObject == null)
			return "";
		domain.Classifier opt = (domain.Classifier) eObject;
		if (opt.getHint() == null || opt.getHint().getName() == null)
			return "";
		return ((domain.Artifact) (opt.getHint().eContainer())).getName() + ":" + opt.getHint().getName();
		
	}

	@Override
	public EStructuralFeature getFeature() {
		return DomainPackage.eINSTANCE.getClassifier_Hint();
	}

}
