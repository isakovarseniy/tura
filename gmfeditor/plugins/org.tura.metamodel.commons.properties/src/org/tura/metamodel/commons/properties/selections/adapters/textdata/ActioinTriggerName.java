package org.tura.metamodel.commons.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.TextDataAdapter;

public class ActioinTriggerName implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		if (((domain.ActionTrigger) eObject).getMethodRef() != null)
			return ((domain.ActionTrigger) eObject).getMethodRef().getName();

		return "NA";		
	}

	@Override
	public EStructuralFeature getFeature() {
		return null;
	}

}
