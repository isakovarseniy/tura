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
import org.tura.metamodel.commons.properties.selections.adapters.MapperProvider;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import recipe.JavaScriptComponent;
import recipe.RecipePackage;

public class JavaScriptComponentMapperPointerMapperName   implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		JavaScriptComponent component = (JavaScriptComponent) eObject;
		if (component.getMapperRef() == null){
			return "";
		}else{
			return new MapperProvider().getLabel(component.getMapperRef());
		}
	}

	@Override
	public EStructuralFeature getFeature() {
		return RecipePackage.eINSTANCE.getJavaScriptComponent_MapperRef();
	}

}
