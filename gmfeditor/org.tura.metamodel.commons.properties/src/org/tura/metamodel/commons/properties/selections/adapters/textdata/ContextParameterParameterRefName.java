package org.tura.metamodel.commons.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.TextDataAdapter;


public class ContextParameterParameterRefName  implements TextDataAdapter{

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		return  (  ( domain.Parameter )( (domain.ContextParameter) eObject) .getRefObj() ).getName();
	}

	@Override
	public EStructuralFeature getFeature() {
		return null;
	}

}
