/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.DropDownDataAdapter;

import form.FormPackage;
import form.FormVariable;

public class FormVariablesParameRef implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { FormPackage.eINSTANCE.getFormVariable_ParamRef() };
	}

	public String getFeatureAsText(Object eObject) {
		if (((FormVariable) eObject).getParamRef() != null)
			return ((FormVariable) eObject).getParamRef().getName();
		else
			return "";
	}

	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(FormPackage.eINSTANCE.getFormVariable_ParamRef()))
			return values.get(obj[0]);

		return null;
	}

	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (((FormVariable) eObject).getParamRef() == null)
			return false;
		if (((FormVariable) eObject).getParamRef().getName() == null)
			return false;
		return values.get(key).equals(((FormVariable) eObject).getParamRef().getName());
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

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return null;
	}

}
