package org.tura.metamodel.commons.properties.selections.adapters.dropdown;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.DropDownDataAdapter;

import domain.DomainPackage;

public class DataControlBaseType implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {

		return new EStructuralFeature[] { DomainPackage.eINSTANCE
				.getDataControl_BaseType() };
	}

	public String getFeatureAsText(Object eObject) {
		String name = null;
		if (((domain.DataControl) eObject).getBaseType() instanceof domain.Type)
			name = ((domain.Type) ((domain.DataControl) eObject).getBaseType())
					.getName();

		return name;
	}

	public Object getFeatureValue(Object eObject,
			HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getDataControl_BaseType()))
			return values.get(obj[0]);

		return null;
	}

	public boolean isEqual(HashMap<String, Object> values, Object key,
			Object eObject) {
		if (((domain.DataControl) eObject).getBaseType() == null)
			return false;

		String name = (((domain.DataControl) eObject).getBaseType()).getName();

		if (name == null)
			return false;
		return values.get(key).equals(name);
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] { ((domain.DataControl) eObject) };
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE
				.getDataControl_Create() };
	}

	public Class<?> getExpectedClass() {
		return EObject.class;
	}
}