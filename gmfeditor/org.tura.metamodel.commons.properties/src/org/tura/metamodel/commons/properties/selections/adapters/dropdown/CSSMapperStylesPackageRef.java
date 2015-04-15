package org.tura.metamodel.commons.properties.selections.adapters.dropdown;

import java.util.HashMap;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.DropDownDataAdapter;

import domain.DomainPackage;

public class CSSMapperStylesPackageRef implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getCSSMapper_StylePackage(),
				DomainPackage.eINSTANCE.getCSSMapper_FakePackageName() };
	}

	public String getFeatureAsText(Object eObject) {
		if (((domain.CSSMapper) eObject).getStylePackage() != null)
			return ((domain.CSSMapper) eObject).getStylePackage().getName();
		else
			return "";
	}

	public Object getSelectedFeatureValue(Object eObject, HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getCSSMapper_StylePackage()))
			return values.get(obj[0]);

		if (feature.equals(DomainPackage.eINSTANCE.getCSSMapper_FakePackageName()))
			return ((domain.StylesPackage) values.get(obj[0])).getName();

		return null;
	}

	public boolean isEqual(HashMap<String, Object> values, Object key, Object eObject) {
		if (((domain.CSSMapper) eObject).getStylePackage() == null)
			return false;
		if (((domain.CSSMapper) eObject).getStylePackage().getName() == null)
			return false;
		return values.get(key).equals(((domain.CSSMapper) eObject).getStylePackage().getName());
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

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return null;
	}

}