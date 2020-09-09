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

package org.tura.metamodel.sirius.properties.selections.dropdown;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.FormVariablesParameRef;

import form.Controls;
import form.Form;
import form.FormParameter;
import form.Root;

public class FormParametersPropertySelection extends AbstractEnumerationPropertySection {

	protected String getLabelText() {
		return "Parameter name";//$NON-NLS-1$
	}

	protected HashMap<String, ?> getEnumerationFeatureValues() {

		if (values == null) {
			values = new LinkedHashMap<String, Object>();
			Root root = (Root) getModel().eContainer();

			List<FormParameter> params = ((Form) (((Controls) (root.eContainer())).eContainer())).getParameters();
			for (FormParameter param : params) {
				if (param.getName() != null)
					values.put(param.getName(), param);
			}
		}
		return values;
	}

	@Override
	public EObject getModel(EStructuralFeature feature) {
		return getModel();
	}

	@Override
	public EObject getModel() {
		DRepresentationElement element = (DRepresentationElement) getEObject();
		return element.getTarget();
	}

	protected void init() {
		dropDownDataSupplier = new FormVariablesParameRef();
	}
}
