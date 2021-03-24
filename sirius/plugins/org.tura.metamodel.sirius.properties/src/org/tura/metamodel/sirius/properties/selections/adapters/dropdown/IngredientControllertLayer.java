/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import recipe.Ingredient;
import recipe.RecipePackage;

public class IngredientControllertLayer implements DropDownDataAdapter {

	@Override
	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { RecipePackage.eINSTANCE.getIngredient_ControllerLayer() };
	}

	@Override
	public String getFeatureAsText(Object eObject) {
		String result = "";
		Ingredient ingredient = (Ingredient) eObject;

		if (ingredient.getControllerLayer() == null)
			result = "";
		else
			result = ingredient.getControllerLayer().getName();
		return result;

	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return ((Ingredient)eObject).eGet(feature);
	}
	@Override
	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
			return values.get(obj[0]);
	}

	@Override
	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (((Ingredient) eObject).getControllerLayer() == null)
			return false;

		String name = (((Ingredient) eObject).getControllerLayer()).getName();

		if (name == null)
			return false;
		return values.get(key).equals(name);
		
	}

	@Override
	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] {};
	}

	@Override
	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] {};
	}

	@Override
	public Class<?> getExpectedClass() {
		return null;
	}



}
