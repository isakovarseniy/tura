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

package org.tura.metamodel.sirius.properties.selections.adapters.dropdown;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.DropDownDataAdapter;

import form.FormPackage;
import form.OptionSelection;
import type.Type;

public class OptionSelectionOptionCast implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {

		return new EStructuralFeature[] { FormPackage.eINSTANCE.getOptionSelection_OptionCast(),
				FormPackage.eINSTANCE.getOptionSelection_OptionCastDataControl()};
	}

	public String getFeatureAsText(Object eObject) {
		String name = null;
		if (((OptionSelection) eObject).getOptionCast() instanceof Type)
			name = ((Type) ((OptionSelection) eObject).getOptionCast()).getName();

		return name;
	}

	@SuppressWarnings("unchecked")
	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(FormPackage.eINSTANCE.getOptionSelection_OptionCast()))
			return ((List<Object>) values.get(obj[0])).get(1);

		if (feature.equals(FormPackage.eINSTANCE.getOptionSelection_OptionCastDataControl()))
			return ((List<Object>) values.get(obj[0])).get(0);

		return null;
	}

	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (((OptionSelection) eObject).getOptionCast() == null)
			return false;

		String name = (((OptionSelection) eObject).getOptionCast()).getName();

		if (name == null)
			return false;
		return values.get(key).equals(name);
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] { ((OptionSelection) eObject).getOptionPointer() };
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] { FormPackage.eINSTANCE.getOptionSelection_OptionPointer() };
	}

	public Class<?> getExpectedClass() {
		return EObject.class;
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return null;
	}
}