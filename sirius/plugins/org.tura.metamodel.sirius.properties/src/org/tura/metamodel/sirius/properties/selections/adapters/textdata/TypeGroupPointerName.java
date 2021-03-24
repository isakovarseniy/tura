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

import type.PackagePointer;
import type.TypePackage;

public class TypeGroupPointerName  implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		PackagePointer pkgRef = (PackagePointer) eObject;
		if (pkgRef.getPackageRef() == null || pkgRef.getPackageRef().getName() == null){
			return "";
		}else{
			return  pkgRef.getPackageRef().getName();
			
		}
	}

	@Override
	public EStructuralFeature getFeature() {
		return TypePackage.eINSTANCE.getPackagePointer_PackageRef();
	}

}
