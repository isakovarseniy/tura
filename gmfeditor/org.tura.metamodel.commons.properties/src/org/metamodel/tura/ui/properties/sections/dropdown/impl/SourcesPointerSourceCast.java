package org.metamodel.tura.ui.properties.sections.dropdown.impl;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.metamodel.tura.ui.properties.sections.dropdown.DropDownDataSupplier;

import domain.DomainPackage;

public class SourcesPointerSourceCast implements DropDownDataSupplier {

	public EStructuralFeature[] getFeature() {

		return new EStructuralFeature[] { DomainPackage.eINSTANCE
				.getSourcesPointer_SourceCast() };
	}

	public String getFeatureAsText(Object eObject) {
		String name = null;
		if (((domain.SourcesPointer) eObject).getSourceCast() instanceof domain.Type)
			name = ((domain.Type) ((domain.SourcesPointer) eObject)
					.getSourceCast()).getName();

		return name;
	}

	public Object getFeatureValue(Object eObject,
			HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE
				.getSourcesPointer_SourceCast()))
			return values.get(obj[0]);

		return null;
	}

	public boolean isEqual(HashMap<String, Object> values, Object key,
			Object eObject) {
		if (((domain.SourcesPointer) eObject).getSourceCast() == null)
			return false;

		String name = (((domain.SourcesPointer) eObject)
				.getSourceCast()).getName();

		if (name == null)
			return false;
		return values.get(key).equals(name);
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[]{((domain.SourcesPointer) eObject).getSourcePointer()};
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] {DomainPackage.eINSTANCE.getSourcesPointer_SourcePointer()};
	}

	public Class<?> getExpectedClass() {
		return EObject.class;
	}
}