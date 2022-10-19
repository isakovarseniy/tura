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

package org.tura.metamodel.sirius.properties.selections.dropdown;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.sirius.properties.selections.adapters.dropdown.IngredientControllertLayer;

import mapper.MappingLayer;

public class IngredientControllerLayerPropertySelection extends AbstractEnumerationPropertySection {

	protected String getLabelText() {
		return "Layer:";//$NON-NLS-1$
	}

	protected void init() {
		dropDownDataSupplier = new IngredientControllertLayer();
	}

	protected HashMap<String, Object> getEnumerationFeatureValues() {

		if (values == null) {
			values = new LinkedHashMap<String, Object>();
			
			List<MappingLayer> result = new QueryHelper().findApplicationLayers(getModel());
			ArrayList<MappingLayer> array = new ArrayList<MappingLayer>();
			array.addAll(result);
			
			for (MappingLayer l : array) {
				values.put(l.getName(), l);
			}
		}
		return values;
	}


	@Override
	public EObject getModel(EStructuralFeature feature) {
		return getModel();
	}

}
