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
package org.tura.metamodel.commons.properties.selections.dropdown;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.Util;
import org.tura.metamodel.commons.properties.selections.adapters.TypeElementProvider;

import domain.DataControl;
import domain.Type;

public abstract class AbstractCastPropertySelection extends
		AbstractDependentEnumerationPropertySection {

	protected String getLabelText() {
		return "Cast type";//$NON-NLS-1$
	}

	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	protected HashMap<String, Object> getEnumerationFeatureValues() {
		if (dropDownDataSupplier == null)
			init();

		if (values == null) {
			values = new LinkedHashMap<String, Object>();

			if (dropDownDataSupplier.getWatchPointObject(getModel()) == null)
				return values;

			QueryHelper helper = new QueryHelper();
			DiagramImpl root = (DiagramImpl) editPart.getRoot().getContents()
					.getModel();

			domain.DataControl ndc = (DataControl) dropDownDataSupplier
					.getWatchPointObject(getModel())[0];

			ArrayList<Object> controls = new ArrayList<>();

			try {
				if (Util.ifDataControlIsTreeRoot(ndc, root)) {
					helper.getTreeLeafs(controls, ndc);
				} else
					controls.add(ndc);
			} catch (Exception e) {

			}

			for (Object obj : controls) {
				final domain.DataControl dc = (DataControl) obj;
				if (dc == null || dc.getCreate() == null)
					return values;

				if (Util.getBase(dc) == null)
					return values;

				Type type = (Type) Util.getBase(dc);

				ArrayList<domain.Type> typeTree = new ArrayList<>();
				new QueryHelper().getInheritTypes(typeTree, type);
				// add basetype
				typeTree.add(type);

				TypeElementProvider provider = new TypeElementProvider();
				for (final domain.Type p : typeTree) {
					if (provider.getLabel(p) != null)
						values.put(provider.getLabel(p), new ArrayList() {
							{
								add(dc);
								add(p);
							}
						});
				}
			}
		}
		return values;
	}

	@Override
	public EObject getModel() {
		return getEObject();
	}

	@Override
	public EObject getModel(EStructuralFeature feature) {
		return getEObject();
	}

}
