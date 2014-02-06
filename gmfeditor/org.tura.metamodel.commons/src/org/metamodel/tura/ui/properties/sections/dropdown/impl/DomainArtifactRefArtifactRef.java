package org.metamodel.tura.ui.properties.sections.dropdown.impl;

import java.util.HashMap;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.metamodel.tura.ui.properties.sections.dropdown.DropDownDataSupplier;

import domain.DomainPackage;

public class DomainArtifactRefArtifactRef implements DropDownDataSupplier{

	@Override
	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { 
				DomainPackage.eINSTANCE.getArtifactRef_ArtifactRef() };
	}

	@Override
	public String getFeatureAsText(Object eObject) {
		if (((domain.ArtifactRef) eObject).getArtifactRef() != null)
			return ((domain.ArtifactRef) eObject).getArtifactRef().getName();
		else
			return "";
	}

	@Override
	public Object getFeatureValue(Object eObject,
			HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature
				.equals(DomainPackage.eINSTANCE.getArtifactRef_ArtifactRef()))
			return values.get(obj[0]);

		return null;
	}

	@Override
	public boolean isEqual(HashMap<String, Object> values, Object key,
			Object eObject) {
		if (((domain.ArtifactRef) eObject).getArtifactRef() == null)
			return false;

		if (((domain.ArtifactRef) eObject).getArtifactRef().getName() == null)
			return false;

		return values.get(key).equals(
				((domain.ArtifactRef) eObject).getArtifactRef().getName());
	}

	@Override
	public Object getWatchPointObject(Object eObject) {
		return ((domain.ArtifactRef) eObject).getDomainArtifactRef();
	}

	@Override
	public EStructuralFeature getWatchPointFeature() {
		return DomainPackage.eINSTANCE
				.getArtifactRef_DomainArtifactRef();
	}

	@Override
	public Class<?> getExpectedClass() {
		return domain.ArtifactRef.class;
	}


}
