package org.tura.metamodel.commons.properties.selections.adapters.dropdown;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.DropDownDataAdapter;

import domain.DomainPackage;

public class SourcesPointerSourceCast implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {

		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getSourcesPointer_SourceCast(),
				DomainPackage.eINSTANCE.getSourcesPointer_SourceCastDataControl() };
	}

	public String getFeatureAsText(Object eObject) {
		String name = null;
		if (((domain.SourcesPointer) eObject).getSourceCast() instanceof domain.Type)
			name = ((domain.Type) ((domain.SourcesPointer) eObject).getSourceCast()).getName();

		return name;
	}

	@SuppressWarnings("unchecked")
	public Object getSelectedFeatureValue(Object eObject, HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getSourcesPointer_SourceCast()))
			return ((List<Object>) values.get(obj[0])).get(1);

		if (feature.equals(DomainPackage.eINSTANCE.getSourcesPointer_SourceCastDataControl()))
			return ((List<Object>) values.get(obj[0])).get(0);

		return null;
	}

	public boolean isEqual(HashMap<String, Object> values, Object key, Object eObject) {
		if (((domain.SourcesPointer) eObject).getSourceCast() == null)
			return false;

		String name = (((domain.SourcesPointer) eObject).getSourceCast()).getName();

		if (name == null)
			return false;
		return values.get(key).equals(name);
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] { ((domain.SourcesPointer) eObject).getSourcePointer() };
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getSourcesPointer_SourcePointer() };
	}

	public Class<?> getExpectedClass() {
		return EObject.class;
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return null;
	}
}