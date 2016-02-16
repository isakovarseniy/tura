package org.tura.metamodel.commons.properties.selections.adapters.dropdown;

import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.DropDownDataAdapter;

import domain.DomainPackage;

public class MenuExtensionRefMenuExtensionPoint  implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getMenuExtensionRef_ExtensionRef() };
	}

	public String getFeatureAsText(Object eObject) {
		domain.MenuExtensionRef ref = (domain.MenuExtensionRef) eObject;
		if (ref != null && ref.getExtensionRef() != null)
			return ref.getExtensionRef().getName();
		else
			return "";
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return ((domain.MenuExtensionRef) eObject).eGet(feature);
	}

	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		return values.get(obj[0]);
	}

	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		
		if (((domain.MenuExtensionPoint) eObject).getExtensionRef() == null)
			return false;

		return values.get(key).equals(((domain.MenuExtensionPoint) eObject).getExtensionRef());
		
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
