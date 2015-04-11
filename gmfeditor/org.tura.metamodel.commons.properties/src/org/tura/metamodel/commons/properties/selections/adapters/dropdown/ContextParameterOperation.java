package org.tura.metamodel.commons.properties.selections.adapters.dropdown;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.DropDownDataAdapter;

import domain.DomainPackage;

public class ContextParameterOperation implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getContextParameter_Operation() };
	}

	public String getFeatureAsText(Object eObject) {
		if (((domain.ContextParameter) eObject).getRefObj() != null)
			return ((domain.Comparator) ((domain.ContextParameter) eObject).getOperation()).getName();
		else
			return "";
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return ((EObject)eObject).eGet(feature);
	}

	
	public Object getSelectedFeatureValue(Object eObject, HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		return values.get(obj[0]);
	}

	public boolean isEqual(HashMap<String, Object> values, Object key, Object eObject) {
		return true;
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] {};
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] {};
	}

	public Class<?> getExpectedClass() {
		return null;
	}

}
