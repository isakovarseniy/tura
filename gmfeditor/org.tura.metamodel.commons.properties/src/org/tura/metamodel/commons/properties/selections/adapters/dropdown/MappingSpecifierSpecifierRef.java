package org.tura.metamodel.commons.properties.selections.adapters.dropdown;

import java.util.HashMap;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.DropDownDataAdapter;

import domain.DomainPackage;

public class MappingSpecifierSpecifierRef implements DropDownDataAdapter {

	@Override
	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getMappingSpecifier_ValueRef() };
	}

	@Override
	public String getFeatureAsText(Object eObject) {
		
		if (((domain.MappingSpecifier) eObject).getValueRef() != null){
			return ((domain.MappingSpecifier) eObject).getValueRef().getValue();
		}
		else
			return "";
	}

	@Override
	public Object getFeatureValue(Object eObject, HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		return values.get(obj[0]);
	}

	@Override
	public boolean isEqual(HashMap<String, Object> values, Object key, Object eObject) {
		if (((domain.MappingSpecifier) eObject).getValueRef() == null)
			return false;
		if (((domain.MappingSpecifier) eObject).getValueRef() == null)
			return false;
		return values.get(key).equals(((domain.MappingSpecifier) eObject).getValueRef());
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
