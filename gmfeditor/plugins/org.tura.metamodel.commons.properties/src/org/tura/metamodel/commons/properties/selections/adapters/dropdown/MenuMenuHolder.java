package org.tura.metamodel.commons.properties.selections.adapters.dropdown;

import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.DropDownDataAdapter;

import domain.DomainPackage;

public class MenuMenuHolder implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getMenuHolder_Menu(),
				                                              DomainPackage.eINSTANCE.getMenu_FakeName()} ;
	}

	public String getFeatureAsText(Object eObject) {
		domain.MenuHolder ref = (domain.MenuHolder) eObject;
		if (ref != null && ref.getMenu() != null)
			return ref.getMenu().getName();
		else
			return "";
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return ((domain.MenuHolder) eObject).eGet(feature);
	}

	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		
		if (feature.equals(DomainPackage.eINSTANCE.getMenuHolder_Menu()))
			return values.get(obj[0]);

		if (feature.equals(DomainPackage.eINSTANCE
				.getMenu_FakeName()))
			return ((domain.MenuFolder)values.get(obj[0])).getName();

		return null;
		
	}

	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		
		if (((domain.MenuHolder) eObject).getMenu() == null)
			return false;

		return values.get(key).equals(((domain.MenuHolder) eObject).getMenu());
		
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
