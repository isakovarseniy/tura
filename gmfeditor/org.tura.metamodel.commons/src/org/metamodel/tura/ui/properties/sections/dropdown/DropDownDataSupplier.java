package org.metamodel.tura.ui.properties.sections.dropdown;

import java.util.HashMap;

import org.eclipse.emf.ecore.EStructuralFeature;

public interface DropDownDataSupplier {
	public abstract EStructuralFeature[] getFeature();

	public abstract String getFeatureAsText(Object eObject);

	public abstract Object getFeatureValue(Object eObject,HashMap<String,Object> values,EStructuralFeature feature,
			Object... obj);

	public abstract boolean isEqual(HashMap<String,Object> values,Object key,Object eObject);

	public abstract Object  getWatchPointObject(Object eObject);
	
	public abstract EStructuralFeature  getWatchPointFeature();

	public abstract Class<?>  getExpectedClass();

}
