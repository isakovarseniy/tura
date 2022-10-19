/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.selections.adapters.dropdown;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.DropDownDataAdapter;

import form.ArtificialField;
import form.ControlPointer;
import form.FormPackage;
import form.SourcesPointer;
import type.Attribute;

public class SourcesPointerValuePointer implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {

		return new EStructuralFeature[] { FormPackage.eINSTANCE.getControlPointer_ValuePointer() };
	}

	public String getFeatureAsText(Object eObject) {
		String name = null;
		if (((ControlPointer) eObject).getValuePointer() instanceof Attribute)
			name = ((Attribute) ((ControlPointer) eObject).getValuePointer()).getName();

		if (((ControlPointer) eObject).getValuePointer() instanceof ArtificialField)
			name = ((ArtificialField) ((ControlPointer) eObject).getValuePointer()).getName();

		return name;
	}

	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(FormPackage.eINSTANCE.getControlPointer_ValuePointer()))
			return values.get(obj[0]);

		return null;
	}

	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (((ControlPointer) eObject).getValuePointer() == null)
			return false;

		String name = null;
		if (((ControlPointer) eObject).getValuePointer() instanceof Attribute)
			name = ((Attribute) ((ControlPointer) eObject).getValuePointer()).getName();

		if (((ControlPointer) eObject).getValuePointer() instanceof ArtificialField)
			name = ((ArtificialField) ((ControlPointer) eObject).getValuePointer()).getName();

		if (name == null)
			return false;
		return values.get(key).equals(name);
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] { ((ControlPointer) eObject).getSourcePointer(),
				((SourcesPointer) eObject).getSourceCast(),
				((SourcesPointer) eObject).getSourceCastDataControl() };
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] { FormPackage.eINSTANCE.getControlPointer_SourcePointer(),
				FormPackage.eINSTANCE.getControlPointer_SourceCast(),
				FormPackage.eINSTANCE.getControlPointer_SourceCastDataControl() };
	}

	public Class<?> getExpectedClass() {
		return EObject.class;
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return null;
	}
}