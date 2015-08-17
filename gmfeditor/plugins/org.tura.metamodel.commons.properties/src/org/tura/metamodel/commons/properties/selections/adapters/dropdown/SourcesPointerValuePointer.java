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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.DropDownDataAdapter;

import domain.DomainPackage;

public class SourcesPointerValuePointer implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {

		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getSourcesPointer_ValuePointer() };
	}

	public String getFeatureAsText(Object eObject) {
		String name = null;
		if (((domain.SourcesPointer) eObject).getValuePointer() instanceof domain.Attribute)
			name = ((domain.Attribute) ((domain.SourcesPointer) eObject).getValuePointer()).getName();

		if (((domain.SourcesPointer) eObject).getValuePointer() instanceof domain.ArtificialField)
			name = ((domain.ArtificialField) ((domain.SourcesPointer) eObject).getValuePointer()).getName();

		return name;
	}

	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getSourcesPointer_ValuePointer()))
			return values.get(obj[0]);

		return null;
	}

	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (((domain.SourcesPointer) eObject).getValuePointer() == null)
			return false;

		String name = null;
		if (((domain.SourcesPointer) eObject).getValuePointer() instanceof domain.Attribute)
			name = ((domain.Attribute) ((domain.SourcesPointer) eObject).getValuePointer()).getName();

		if (((domain.SourcesPointer) eObject).getValuePointer() instanceof domain.ArtificialField)
			name = ((domain.ArtificialField) ((domain.SourcesPointer) eObject).getValuePointer()).getName();

		if (name == null)
			return false;
		return values.get(key).equals(name);
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] { ((domain.SourcesPointer) eObject).getSourcePointer(),
				((domain.SourcesPointer) eObject).getSourceCast(),
				((domain.SourcesPointer) eObject).getSourceCastDataControl() };
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getSourcesPointer_SourcePointer(),
				DomainPackage.eINSTANCE.getSourcesPointer_SourceCast(),
				DomainPackage.eINSTANCE.getSourcesPointer_SourceCastDataControl() };
	}

	public Class<?> getExpectedClass() {
		return EObject.class;
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return null;
	}
}