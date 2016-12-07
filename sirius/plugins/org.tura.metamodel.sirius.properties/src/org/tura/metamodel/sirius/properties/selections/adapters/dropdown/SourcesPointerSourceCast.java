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

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.DropDownDataAdapter;

import form.ControlPointer;
import form.FormPackage;
import form.SourcesPointer;
import type.Type;

public class SourcesPointerSourceCast implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {

		return new EStructuralFeature[] { FormPackage.eINSTANCE.getControlPointer_SourceCast(),
				FormPackage.eINSTANCE.getControlPointer_SourceCastDataControl() };
	}

	public String getFeatureAsText(Object eObject) {
		String name = null;
		if (((ControlPointer) eObject).getSourceCast() instanceof Type)
			name = ((Type) ((ControlPointer) eObject).getSourceCast()).getName();

		return name;
	}

	@SuppressWarnings("unchecked")
	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(FormPackage.eINSTANCE.getControlPointer_SourceCast()))
			return ((List<Object>) values.get(obj[0])).get(1);

		if (feature.equals(FormPackage.eINSTANCE.getControlPointer_SourceCastDataControl()))
			return ((List<Object>) values.get(obj[0])).get(0);

		return null;
	}

	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (((SourcesPointer) eObject).getSourceCast() == null)
			return false;

		String name = (((ControlPointer) eObject).getSourceCast()).getName();

		if (name == null)
			return false;
		return values.get(key).equals(name);
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] { ((ControlPointer) eObject).getSourcePointer() };
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] { FormPackage.eINSTANCE.getControlPointer_SourcePointer() };
	}

	public Class<?> getExpectedClass() {
		return EObject.class;
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return null;
	}
}