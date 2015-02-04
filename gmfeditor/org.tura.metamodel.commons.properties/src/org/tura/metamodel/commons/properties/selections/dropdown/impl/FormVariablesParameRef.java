package org.tura.metamodel.commons.properties.selections.dropdown.impl;

import java.util.HashMap;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.dropdown.DropDownDataSupplier;

import domain.DomainPackage;

public class FormVariablesParameRef implements DropDownDataSupplier {
	
	

	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE
				.getFormVariable_ParamRef() };
	}

	public String getFeatureAsText(Object eObject) {
		if (((domain.FormVariable) eObject).getParamRef() != null)
			return ((domain.FormVariable) eObject).getParamRef().getName();
		else
			return "";
	}

	public Object getFeatureValue(Object eObject,
			HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getFormVariable_ParamRef()))
			return values.get(obj[0]);


		return null;
	}

	public boolean isEqual(HashMap<String, Object> values, Object key,
			Object eObject) {
		if (((domain.FormVariable) eObject).getParamRef() == null)
			return false;
		if (((domain.FormVariable) eObject).getParamRef().getName() == null)
			return false;
		return values.get(key).equals(
				((domain.FormVariable) eObject).getParamRef().getName());
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
