package org.tura.metamodel.commons.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.TextDataAdapter;


public class MappingSpecifierName implements TextDataAdapter {

	@Override
	public Object getFeatureValue(EObject eObject, EStructuralFeature feature) {
		domain.MappingSpecifier opt = (domain.MappingSpecifier) eObject;

			if (opt.getSpecifierRef() == null)
				return "";
			else
				return  opt.getSpecifierRef().getName();
	}

	@Override
	public EStructuralFeature getFeature() {
		return null;
	}

}
