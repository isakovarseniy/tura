package org.tura.metamodel.commons.properties.selections.adapters.dropdown;

import java.util.HashMap;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.DropDownDataAdapter;

import domain.DomainPackage;

public class LinkDetailField implements DropDownDataAdapter {

	@Override
	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getLink_DetailField() };
	}

	@Override
	public String getFeatureAsText(Object eObject) {
		String result = "";
		domain.Link lnk = (domain.Link) eObject;

		if (lnk.getDetailField() == null)
			result = "";
		else
			result = lnk.getDetailField().getName();
		return result;

	}
	
	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return ((domain.Link)eObject).eGet(feature);
	}
	
	@Override
	public Object getSelectedFeatureValue(Object eObject, HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj) {
			return values.get(obj[0]);
	}

	@Override
	public boolean isEqual(HashMap<String, Object> values, Object key, Object eObject) {
		return true;
	}

	@Override
	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] {};
	}

	@Override
	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] {};
	}

	@Override
	public Class<?> getExpectedClass() {
		return null;
	}

}
