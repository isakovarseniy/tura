package org.tura.metamodel.commons.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.TextDataAdapter;

public class ApplicationMapperName  implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		return ((domain.ApplicationMapper) eObject).getName();		
	}

	@Override
	public EStructuralFeature getFeature() {
		return null;
	}

}
