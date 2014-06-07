package org.metamodel.tura.ui.properties.sections.dropdown;

import java.util.HashMap;

import org.eclipse.emf.ecore.EStructuralFeature;

public interface DropDownDataSupplier {
	public EStructuralFeature[] getFeature();

	public String getFeatureAsText(Object eObject);

	public Object getFeatureValue(Object eObject,
			HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj);

	public boolean isEqual(HashMap<String, Object> values, Object key,
			Object eObject);

	public Object[] getWatchPointObject(Object eObject);

	public EStructuralFeature[] getWatchPointFeature();

	public Class<?> getExpectedClass();

}
