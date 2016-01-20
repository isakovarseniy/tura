package org.tura.metamodel.commons.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.TextDataAdapter;

public class FlexFieldName implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		if (((domain.FlexField) eObject).getValue() != null)
			return ((domain.FlexField) eObject).getValue();

		return "NA";		
	}

	@Override
	public EStructuralFeature getFeature() {
		return null;
	}

}
