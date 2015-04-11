package org.tura.metamodel.commons.properties.selections;

import java.util.HashMap;

import org.eclipse.emf.ecore.EStructuralFeature;

public interface DropDownDataAdapter {
	public EStructuralFeature[] getFeature();

	public String getFeatureAsText(Object eObject);

	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature);

	public Object getSelectedFeatureValue(Object eObject, HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj);

	public boolean isEqual(HashMap<String, Object> values, Object key, Object eObject);

	public Object[] getWatchPointObject(Object eObject);

	public EStructuralFeature[] getWatchPointFeature();

	public Class<?> getExpectedClass();

}
