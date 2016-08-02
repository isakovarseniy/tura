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
package org.tura.metamodel.sirius.properties.selections.adapters.dropdown;

import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.DropDownDataAdapter;

import recipe.Query;
import recipe.RecipePackage;

public class DomainMapperQueryRef implements DropDownDataAdapter {

	@Override
	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { RecipePackage.eINSTANCE.getQuery_QueryRef() };
	}

	@Override
	public String getFeatureAsText(Object eObject) {
		if (((Query) eObject).getQueryRef() != null)
			return ((Query) eObject).getQueryRef().getName();
		else
			return "";
	}

	@Override
	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		return values.get(obj[0]);
	}

	@Override
	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (((Query) eObject).getQueryRef() == null)
			return false;

		if (((Query) eObject).getQueryRef().getName() == null)
			return false;

		return values.get(key).equals(((Query) eObject).getQueryRef().getName());
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

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return null;
	}

}
