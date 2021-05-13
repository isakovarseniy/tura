/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.adapters.VersionProvider;
import org.tura.metamodel.sirius.properties.selections.AbstractTuraPropertySection;
import org.tura.metamodel.sirius.properties.selections.DropDownDataAdapter;

import mapper.MapperPackage;
import mapper.Version;
import mapper.VersionRef;

public class VersionReferenceVersionReference implements DropDownDataAdapter {

	private AbstractTuraPropertySection property;

	public VersionReferenceVersionReference(AbstractTuraPropertySection property) {
		this.property = property;
	}

	@Override
	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { MapperPackage.eINSTANCE.getVersionRef_VersionRef() };
	}

	@Override
	public String getFeatureAsText(Object eObject) {
		if (((VersionRef) eObject).getVersionRef() != null) {
			Version version =  ((VersionRef) eObject).getVersionRef();
			 return new VersionProvider().getLabel(version) ;
		} else
			return "";
	}

	@Override
	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals( MapperPackage.eINSTANCE.getVersionRef_VersionRef() )){
			return values.get(obj[0]);
		}
		return null;
	}

	@Override
	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (((VersionRef) eObject).getVersionRef() == null)
			return false;

		if (((VersionRef) eObject).getVersionRef().getName() == null)
			return false;

		return values.get(key).equals(((VersionRef) eObject).getVersionRef());
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

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return null;
	}

}
