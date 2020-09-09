/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import artifact.ArtifactPackage;
import recipe.QueryVariable;

public class QueryVariableName implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		QueryVariable opt1 = (QueryVariable) eObject;
		if (opt1.getQueryParamRef() == null) return null;
		return opt1.getQueryParamRef().getName();
	}

	@Override
	public EStructuralFeature getFeature() {
		return ArtifactPackage.eINSTANCE.getQueryParameter_Name();
	}

}
