package org.tura.metamodel.commons.properties.selections.dropdown.impl;

import java.util.HashMap;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.dropdown.DropDownDataSupplier;

import domain.DomainPackage;

public class SourcesPointerSourcePointer implements DropDownDataSupplier {

	@Override
	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE
				.getSourcesPointer_SourcePointer() };
	}

	@Override
	public String getFeatureAsText(Object eObject) {
		if (((domain.SourcesPointer) eObject).getSourcePointer() != null)
			return ((domain.SourcesPointer) eObject).getSourcePointer()
					.getName();
		else
			return "";
	}

	@Override
	public Object getFeatureValue(Object eObject,
			HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE
				.getSourcesPointer_SourcePointer()))
			return values.get(obj[0]);

		return null;
	}

	@Override
	public boolean isEqual(HashMap<String, Object> values, Object key,
			Object eObject) {
		if (((domain.SourcesPointer) eObject).getSourcePointer() == null)
			return false;

		if (((domain.SourcesPointer) eObject).getSourcePointer().getName() == null)
			return false;

		return values.get(key).equals(
				((domain.SourcesPointer) eObject).getSourcePointer().getName());
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
