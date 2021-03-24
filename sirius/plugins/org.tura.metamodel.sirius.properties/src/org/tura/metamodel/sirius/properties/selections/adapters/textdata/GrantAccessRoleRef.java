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

package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import application.ApplicationRealm;
import permission.PermissionPackage;
import permission.SecurityEntityPointer;

public class GrantAccessRoleRef  implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		if (eObject == null)
			return "";
		SecurityEntityPointer opt = (SecurityEntityPointer) eObject;
		if (opt.getSecurityEntity() == null || opt.getSecurityEntity().getName() == null)
			return "";

		return ((ApplicationRealm) (opt.getSecurityEntity().eContainer().eContainer())).getName() + ":" + opt.getSecurityEntity().getName();
	}

	@Override
	public EStructuralFeature getFeature() {
		return PermissionPackage.eINSTANCE.getSecurityEntityPointer_SecurityEntity();
	}

}
