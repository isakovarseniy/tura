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

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.QueryHelper1;
import org.tura.metamodel.sirius.properties.selections.adapters.dropdown.MenuMenuHolder;

import form.MenuFolder;

public class MenuPointerPropertySelection extends AbstractEnumerationPropertySection {

	protected String getLabelText() {
		return "Menu";//$NON-NLS-1$
	}

	protected void init() {
		dropDownDataSupplier = new MenuMenuHolder();
	}

	protected HashMap<String, ?> getEnumerationFeatureValues() {

		if (values == null) {
			values = new LinkedHashMap<String, Object>();

			QueryHelper query = new QueryHelper();
			DiagramImpl diagram = (DiagramImpl) editPart.getRoot().getContents()
					.getModel();

			
			List<MenuFolder> ls = query.findMenus(new QueryHelper1().getForm(diagram));

			for (MenuFolder p : ls) {
				values.put(p.getName(), p);
			}
		}

		return values;
	}

	@Override
	public EObject getModel(EStructuralFeature feature) {
		return getModel();
	}

}
