package org.metamodel.tura.ui.properties.sections.dropdown.impl;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.metamodel.tura.ui.properties.sections.dropdown.DropDownDataSupplier;

import domain.DomainPackage;

public class OptionSelectionOptionCast implements DropDownDataSupplier {

	public EStructuralFeature[] getFeature() {

		return new EStructuralFeature[] { DomainPackage.eINSTANCE
				.getOptionSelection_OptionCast() };
	}

	public String getFeatureAsText(Object eObject) {
		String name = null;
		if (((domain.OptionSelection) eObject).getOptionCast() instanceof domain.Type)
			name = ((domain.Type) ((domain.OptionSelection) eObject)
					.getOptionCast()).getName();

		return name;
	}

	public Object getFeatureValue(Object eObject,
			HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE
				.getOptionSelection_OptionCast()))
			return values.get(obj[0]);

		return null;
	}

	public boolean isEqual(HashMap<String, Object> values, Object key,
			Object eObject) {
		if (((domain.OptionSelection) eObject).getOptionCast() == null)
			return false;

		String name = (((domain.OptionSelection) eObject)
				.getOptionCast()).getName();

		if (name == null)
			return false;
		return values.get(key).equals(name);
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[]{((domain.OptionSelection) eObject).getOptionPointer()};
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] {DomainPackage.eINSTANCE.getOptionSelection_OptionPointer()};
	}

	public Class<?> getExpectedClass() {
		return EObject.class;
	}
}