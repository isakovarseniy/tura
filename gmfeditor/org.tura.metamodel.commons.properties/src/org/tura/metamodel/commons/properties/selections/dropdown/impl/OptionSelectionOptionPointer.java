package org.tura.metamodel.commons.properties.selections.dropdown.impl;

import java.util.HashMap;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.dropdown.DropDownDataSupplier;

import domain.DomainPackage;

public class OptionSelectionOptionPointer implements DropDownDataSupplier {

	@Override
	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE
				.getOptionSelection_OptionPointer() };
	}

	@Override
	public String getFeatureAsText(Object eObject) {
		if (((domain.OptionSelection) eObject).getOptionPointer() != null)
			return ((domain.OptionSelection) eObject).getOptionPointer()
					.getName();
		else
			return "";
	}

	@Override
	public Object getFeatureValue(Object eObject,
			HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE
				.getOptionSelection_OptionPointer()))
			return values.get(obj[0]);

		return null;
	}

	@Override
	public boolean isEqual(HashMap<String, Object> values, Object key,
			Object eObject) {
		if (((domain.OptionSelection) eObject).getOptionPointer() == null)
			return false;

		if (((domain.OptionSelection) eObject).getOptionPointer().getName() == null)
			return false;

		return values.get(key)
				.equals(((domain.OptionSelection) eObject).getOptionPointer()
						.getName());
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[]{};
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] { };
	}

	public Class<?> getExpectedClass() {
		return null;
	}
	
	
}
