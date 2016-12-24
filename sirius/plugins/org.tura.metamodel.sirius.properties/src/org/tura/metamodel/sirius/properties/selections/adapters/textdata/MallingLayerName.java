package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import mapper.MappingLayer;

public class MallingLayerName  implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		MappingLayer opt = (MappingLayer) eObject;
		return opt.getName();
	}

	@Override
	public EStructuralFeature getFeature() {
		return null;
	}

}
