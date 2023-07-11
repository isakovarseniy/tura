/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
import org.tura.metamodel.commons.properties.selections.adapters.MapperProvider;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import recipe.JavaComponent;
import recipe.RecipePackage;

public class JavaComponentMapperPointerMapperName   implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		JavaComponent component = (JavaComponent) eObject;
		if (component.getMapperRef() == null){
			return "";
		}else{
			return new MapperProvider().getLabel(component.getMapperRef());
		}
	}

	@Override
	public EStructuralFeature getFeature() {
		return RecipePackage.eINSTANCE.getJavaComponent_MapperRef();
	}

}
