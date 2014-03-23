package org.metamodel.tura.ui.properties.sections.dropdown.impl;

import java.util.HashMap;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.metamodel.tura.ui.properties.sections.dropdown.DropDownDataSupplier;

import domain.DomainPackage;

public class DomainMethodPointerMethodMethodRef implements DropDownDataSupplier {

	@Override
	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] {
				DomainPackage.eINSTANCE.getMethodPointer_MethodRef(),
				DomainPackage.eINSTANCE.getMethodPointer_FakeMethod() };
	}

	@Override
	public String getFeatureAsText(Object eObject) {
		if (((domain.MethodPointer) eObject).getMethodRef() != null)
			return ((domain.MethodPointer) eObject).getMethodRef().getName();
		else
			return "";
	}

	@Override
	public Object getFeatureValue(Object eObject,
			HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE
				.getMethodPointer_MethodRef()))
			return values.get(obj[0]);

		if (feature.equals(DomainPackage.eINSTANCE
				.getMethodPointer_FakeMethod()))
			return ((domain.Operation) values.get(obj[0])).getName();

		return null;
	}

	@Override
	public boolean isEqual(HashMap<String, Object> values, Object key,
			Object eObject) {
		if (((domain.MethodPointer) eObject).getMethodRef() == null)
			return false;

		if (((domain.MethodPointer) eObject).getMethodRef().getName() == null)
			return false;

		return values.get(key).equals(
				((domain.MethodPointer) eObject).getMethodRef().getName());
	}

	@Override
	public Object getWatchPointObject(Object eObject) {
		return 	((domain.TypePointer) eObject).getTypeRef();
	}

	@Override
	public EStructuralFeature getWatchPointFeature() {
		return 	DomainPackage.eINSTANCE.getTypePointer_TypeRef();
	}

	@Override
	public Class<?> getExpectedClass() {
		return domain.MethodPointer.class;
	}

}
