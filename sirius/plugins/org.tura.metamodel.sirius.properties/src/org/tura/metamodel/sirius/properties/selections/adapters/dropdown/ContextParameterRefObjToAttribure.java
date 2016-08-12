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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.DropDownDataAdapter;

import form.ContextParameter;
import form.FormPackage;
import type.Attribute;

public class ContextParameterRefObjToAttribure implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { FormPackage.eINSTANCE.getContextParameter_RefObj() };
	}

	public String getFeatureAsText(Object eObject) {
		if (((ContextParameter) eObject).getRefObj() != null)
			return ((Attribute) ((ContextParameter) eObject).getRefObj()).getName();
		else
			return "";
	}


	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return ((EObject)eObject).eGet(feature);
	}

	
	public Object getSelectedFeatureValue(Object eObject,Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		return values.get(obj[0]);
	}

	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		return true;
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
