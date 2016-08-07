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
package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;
import org.tura.metamodel.sirius.properties.selections.grid.TextColumnConverter;

import type.TypePackage;

public class ParametersOrder  implements TextDataAdapter, TextColumnConverter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		return ((EObject )eObject).eGet(feature);
	}

	@Override
	public EStructuralFeature getFeature() {
		return TypePackage.eINSTANCE.getParameter_Order();
	}

	@Override
	public String convertToText(Object obj) {
		return obj.toString();
	}

	@Override
	public Object convertToObject(String str) {
		return new Integer(str);
	}

}
