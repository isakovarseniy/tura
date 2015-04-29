package org.tura.metamodel.commons.properties.selections.adapters.dropdown;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.DropDownDataAdapter;

import domain.DomainPackage;

public class DomainTypePointerTypeRef implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] {
				DomainPackage.eINSTANCE.getTypePointer_TypeRef(),
				DomainPackage.eINSTANCE.getTypePointer_FakeTypeName() };
	}

	public String getFeatureAsText(Object eObject) {
		if (((domain.TypePointer) eObject).getTypeRef() != null)
			return ((domain.TypePointer) eObject).getTypeRef().getName();
		else
			return "";
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return ((EObject)eObject).eGet(feature);
	}	
	
	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values,
			EStructuralFeature feature, Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getTypePointer_TypeRef()))
			return values.get(obj[0]);

		if (feature.equals(DomainPackage.eINSTANCE
				.getTypePointer_FakeTypeName()))
			return ((domain.TypeElement)values.get(obj[0])).getName();

		return null;
	}

	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (((domain.TypePointer) eObject).getTypeRef() == null)
			return false;
		if (((domain.TypePointer) eObject).getTypeRef().getName() == null)
			return false;
		return values.get(key).equals(
				((domain.TypePointer) eObject).getTypeRef().getName());
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[]{((domain.TypePointer) eObject).getPackageRef()};
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getTypePointer_PackageRef()};
	}

	public Class<?> getExpectedClass() {
		return domain.TypePointer.class;
	}

	
}
