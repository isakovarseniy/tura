package org.tura.metamodel.commons.properties.selections.dropdown.impl;

import java.util.HashMap;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.dropdown.DropDownDataSupplier;

import domain.DomainPackage;
import domain.TypeElement;

public class DomainOperationTypeRef implements DropDownDataSupplier {

	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE
				.getOperation_ReturnValue() };
	}

	public String getFeatureAsText(Object eObject) {
		if ((((domain.Operation) eObject).getReturnValue() != null)
				&& (((domain.Operation) eObject).getReturnValue().getTypeRef() != null))
			return ((domain.Operation) eObject).getReturnValue().getTypeRef()
					.getName();
		else
			return "";
	}

	public Object getFeatureValue(Object eObject,HashMap<String, Object> values,
			EStructuralFeature feature, Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getOperation_ReturnValue())) {
			domain.ReturnValue rv = domain.DomainFactory.eINSTANCE
					.createReturnValue();
			rv.setPackageRef(((domain.Operation) eObject).getReturnValue()
					.getPackageRef());
			rv.setTypeRef((TypeElement) values.get(obj[0]));
			return rv;
		}
		return null;
	}

	public boolean isEqual(HashMap<String, Object> values, Object key, Object eObject) {
		if (((domain.Operation) eObject).getReturnValue().getTypeRef() == null)
			return false;
		if (((domain.Operation) eObject).getReturnValue().getTypeRef()
				.getName() == null)
			return false;
		return values.get(key).equals(
				((domain.Operation) eObject).getReturnValue().getTypeRef()
						.getName());
	}

	public Object[] getWatchPointObject(Object eObject) {
		if (((domain.Operation) eObject).getReturnValue() == null)
			return new Object[]{};
		return new Object[]{((domain.Operation) eObject).getReturnValue().getPackageRef()};
	}

	public EStructuralFeature[] getWatchPointFeature() {

		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getOperation_ReturnValue()};
	}

	public Class<?> getExpectedClass() {
		return domain.Operation.class;
	}

	
}
