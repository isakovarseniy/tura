package org.tura.metamodel.commons.properties.selections.adapters.dropdown;

import java.util.HashMap;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.DropDownDataAdapter;

import domain.DomainPackage;

public class DomainDomainArtifactArtifactRef implements DropDownDataAdapter {

	@Override
	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getArtifactRef_DomainArtifactRef() };
	}

	@Override
	public String getFeatureAsText(Object eObject) {
		if (((domain.ArtifactRef) eObject).getDomainArtifactRef() != null)
			return ((domain.ArtifactRef) eObject).getDomainArtifactRef().getName();
		else
			return "";
	}

	@Override
	public Object getSelectedFeatureValue(Object eObject, HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getArtifactRef_DomainArtifactRef()))
			return values.get(obj[0]);

		return null;
	}

	@Override
	public boolean isEqual(HashMap<String, Object> values, Object key, Object eObject) {
		if (((domain.ArtifactRef) eObject).getDomainArtifactRef() == null)
			return false;
		if (((domain.ArtifactRef) eObject).getDomainArtifactRef().getName() == null)
			return false;
		return values.get(key).equals(((domain.ArtifactRef) eObject).getDomainArtifactRef().getName());
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

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return null;
	}

}
