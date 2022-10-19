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

package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import type.MethodPointer;
import type.Operation;
import type.Type;
import type.TypeGroup;
import type.TypePackage;

public class MethodPointerMethodName implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		MethodPointer operRefRef = (MethodPointer) eObject;
		if (operRefRef.getMethodRef() == null || operRefRef.getMethodRef().getName() == null){
			return "";
		}else{
			Operation opr =  operRefRef.getMethodRef();
			Type type = (Type) opr.eContainer();
			TypeGroup pkg = (TypeGroup) type.eContainer();
			
			return pkg.getName() +"." +type.getName() +"."+opr.getName();
		}
	}

	
	
	@Override
	public EStructuralFeature getFeature() {
		return TypePackage.eINSTANCE.getMethodPointer_MethodRef();
	}

}
