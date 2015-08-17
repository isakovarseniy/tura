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

public class DomainMethodPointerMethodMethodRef implements DropDownDataAdapter {

	@Override
	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getMethodPointer_MethodRef(),
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
	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getMethodPointer_MethodRef()))
			return values.get(obj[0]);

		if (feature.equals(DomainPackage.eINSTANCE.getMethodPointer_FakeMethod()))
			return ((domain.Operation) values.get(obj[0])).getName();

		return null;
	}

	@Override
	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (((domain.MethodPointer) eObject).getMethodRef() == null)
			return false;

		if (((domain.MethodPointer) eObject).getMethodRef().getName() == null)
			return false;

		return values.get(key).equals(((domain.MethodPointer) eObject).getMethodRef().getName());
	}

	@Override
	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] { ((domain.TypePointer) eObject).getTypeRef() };
	}

	@Override
	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getTypePointer_TypeRef() };
	}

	@Override
	public Class<?> getExpectedClass() {
		return domain.TypePointer.class;
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return null;
	}

}
