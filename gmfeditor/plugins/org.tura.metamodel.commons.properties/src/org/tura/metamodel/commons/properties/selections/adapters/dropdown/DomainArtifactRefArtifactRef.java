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

public class DomainArtifactRefArtifactRef implements DropDownDataAdapter {

	@Override
	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getArtifactRef_ArtifactRef() };
	}

	@Override
	public String getFeatureAsText(Object eObject) {
		if (((domain.ArtifactRef) eObject).getArtifactRef() != null)
			return ((domain.ArtifactRef) eObject).getArtifactRef().getName();
		else
			return "";
	}

	@Override
	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getArtifactRef_ArtifactRef()))
			return values.get(obj[0]);

		return null;
	}

	@Override
	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (((domain.ArtifactRef) eObject).getArtifactRef() == null)
			return false;

		if (((domain.ArtifactRef) eObject).getArtifactRef().getName() == null)
			return false;

		return values.get(key).equals(((domain.ArtifactRef) eObject).getArtifactRef().getName());
	}

	@Override
	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] { ((domain.ArtifactRef) eObject).getDomainArtifactRef() };
	}

	@Override
	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getArtifactRef_DomainArtifactRef() };
	}

	@Override
	public Class<?> getExpectedClass() {
		return domain.ArtifactRef.class;
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return null;
	}

}
