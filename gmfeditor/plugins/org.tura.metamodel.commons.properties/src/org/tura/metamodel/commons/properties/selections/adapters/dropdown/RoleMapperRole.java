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

public class RoleMapperRole implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getRoleMapper_Role(),
				DomainPackage.eINSTANCE.getRoleMapper_FakeRoleName() };
	}

	public String getFeatureAsText(Object eObject) {
		if (((domain.RoleMapper) eObject).getRole() != null)
			return getText(eObject);
		else
			return "";
	}

	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getRoleMapper_Role()))
			return values.get(obj[0]);

		if (feature.equals(DomainPackage.eINSTANCE.getRoleMapper_FakeRoleName()))
			return getText1(values.get(obj[0]));

		return null;
	}

	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (((domain.RoleMapper) eObject).getRole() == null)
			return false;

		if (!((EObject) eObject).eClass().getName().equals(((EObject) values.get(key)).eClass().getName()))
			return false;

		if (getText(eObject) == null)
			return false;

		return values.get(key).equals(getText(eObject));
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] {};
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] {};
	}

	public Class<?> getExpectedClass() {
		return EObject.class;
	}

	private String getText(Object eObject) {

		if (((domain.RoleMapper) eObject).getRole() instanceof domain.Group)
			return ((domain.Group) (((domain.RoleMapper) eObject).getRole())).getName();
		if (((domain.RoleMapper) eObject).getRole() instanceof domain.Role)
			return ((domain.Role) (((domain.RoleMapper) eObject).getRole())).getName();
		return "";

	}

	private String getText1(Object eObject) {

		if (eObject instanceof domain.Group)
			return ((domain.Group) eObject).getName();
		if (eObject instanceof domain.Role)
			return ((domain.Role) eObject).getName();
		return "";

	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return null;
	}

}
