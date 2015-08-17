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

public class CSSMapperStylesLibraryRef implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getCSSMapper_StyleLibrary(),
				DomainPackage.eINSTANCE.getCSSMapper_FakeTypeName() };
	}

	public String getFeatureAsText(Object eObject) {
		if (((domain.CSSMapper) eObject).getStyleLibrary() != null)
			return ((domain.CSSMapper) eObject).getStyleLibrary().getName();
		else
			return "";
	}

	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getCSSMapper_StyleLibrary()))
			return values.get(obj[0]);

		if (feature.equals(DomainPackage.eINSTANCE.getCSSMapper_FakeTypeName()))
			return ((domain.StyleLibrary) values.get(obj[0])).getName();

		return null;
	}

	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (((domain.CSSMapper) eObject).getStyleLibrary() == null)
			return false;
		if (((domain.CSSMapper) eObject).getStyleLibrary().getName() == null)
			return false;
		return values.get(key).equals(((domain.CSSMapper) eObject).getStyleLibrary().getName());
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] { ((domain.CSSMapper) eObject).getStylePackage() };
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getTypePointer_PackageRef() };
	}

	public Class<?> getExpectedClass() {
		return domain.CSSMapper.class;
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return null;
	}

}
