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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import form.ContextParameter;
import type.Parameter;


public class ContextParameterParameterRefName  implements TextDataAdapter{

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		return  (  ( Parameter )( (ContextParameter) eObject) .getRefObj() ).getName();
	}

	@Override
	public EStructuralFeature getFeature() {
		return null;
	}

}
