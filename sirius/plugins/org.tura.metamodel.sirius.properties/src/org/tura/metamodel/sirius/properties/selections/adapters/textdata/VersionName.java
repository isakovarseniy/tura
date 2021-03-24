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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import mapper.MapperPackage;
import mapper.Version;

public class VersionName implements TextDataAdapter{

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		if (feature.equals(MapperPackage.eINSTANCE.getVersion_Name()) ){
			Version version = (Version) eObject;
			 if (version.getName() == null){
				 return "Version  "+ version.getUid();
			 }else{
				 return version.getName();
			 }
		}
		return ((EObject )eObject).eGet(feature);
	}

	@Override
	public EStructuralFeature getFeature() {
		return MapperPackage.eINSTANCE.getVersion_Name();
	}
	
	
}
