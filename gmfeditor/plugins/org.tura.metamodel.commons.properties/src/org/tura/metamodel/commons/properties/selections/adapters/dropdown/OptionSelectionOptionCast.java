package org.tura.metamodel.commons.properties.selections.adapters.dropdown;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.DropDownDataAdapter;

import domain.DomainPackage;

public class OptionSelectionOptionCast implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {

		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getOptionSelection_OptionCast(),
				DomainPackage.eINSTANCE.getOptionSelection_OptionCastDataControl()};
	}

	public String getFeatureAsText(Object eObject) {
		String name = null;
		if (((domain.OptionSelection) eObject).getOptionCast() instanceof domain.Type)
			name = ((domain.Type) ((domain.OptionSelection) eObject).getOptionCast()).getName();

		return name;
	}

	@SuppressWarnings("unchecked")
	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getOptionSelection_OptionCast()))
			return ((List<Object>) values.get(obj[0])).get(1);

		if (feature.equals(DomainPackage.eINSTANCE.getOptionSelection_OptionCastDataControl()))
			return ((List<Object>) values.get(obj[0])).get(0);

		return null;
	}

	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (((domain.OptionSelection) eObject).getOptionCast() == null)
			return false;

		String name = (((domain.OptionSelection) eObject).getOptionCast()).getName();

		if (name == null)
			return false;
		return values.get(key).equals(name);
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] { ((domain.OptionSelection) eObject).getOptionPointer() };
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getOptionSelection_OptionPointer() };
	}

	public Class<?> getExpectedClass() {
		return EObject.class;
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return null;
	}
}