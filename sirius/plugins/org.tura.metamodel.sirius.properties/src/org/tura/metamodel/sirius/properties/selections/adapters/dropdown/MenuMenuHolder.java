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

import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.DropDownDataAdapter;

import form.FormPackage;
import form.MenuHolder;

public class MenuMenuHolder implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { FormPackage.eINSTANCE.getMenuHolder_Menu()} ;
	}

	public String getFeatureAsText(Object eObject) {
		MenuHolder ref = (MenuHolder) eObject;
		if (ref != null && ref.getMenu() != null)
			return ref.getMenu().getName();
		else
			return "";
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return ((MenuHolder) eObject).eGet(feature);
	}

	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		
		if (feature.equals(FormPackage.eINSTANCE.getMenuHolder_Menu()))
			return values.get(obj[0]);

		return null;
		
	}

	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		
		if (((MenuHolder) eObject).getMenu() == null)
			return false;

		return values.get(key).equals(((MenuHolder) eObject).getMenu());
		
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
