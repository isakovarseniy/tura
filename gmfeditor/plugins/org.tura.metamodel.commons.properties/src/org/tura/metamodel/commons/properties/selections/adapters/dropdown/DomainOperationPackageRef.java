/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.tura.metamodel.commons.properties.selections.adapters.dropdown;

import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.DropDownDataAdapter;

import domain.DomainPackage;
import domain.Package;

public class DomainOperationPackageRef implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getOperation_ReturnValue() };
	}

	public String getFeatureAsText(Object eObject) {
		if (((domain.Operation) eObject).getReturnValue() != null)
			return ((domain.Operation) eObject).getReturnValue().getPackageRef().getName();
		else
			return "";
	}

	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getOperation_ReturnValue())) {
			domain.ReturnValue rv = domain.DomainFactory.eINSTANCE.createReturnValue();
			rv.setPackageRef((Package) values.get(obj[0]));
			return rv;
		}
		return null;
	}

	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (((domain.Operation) eObject).getReturnValue() == null)
			return false;
		if (((domain.Operation) eObject).getReturnValue().getPackageRef() == null)
			return false;
		if (((domain.Operation) eObject).getReturnValue().getPackageRef().getName() == null)
			return false;
		return values.get(key).equals(((domain.Operation) eObject).getReturnValue().getPackageRef().getName());
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] {};
	}

	public Class<?> getExpectedClass() {
		return null;
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] {};
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return null;
	}

}
