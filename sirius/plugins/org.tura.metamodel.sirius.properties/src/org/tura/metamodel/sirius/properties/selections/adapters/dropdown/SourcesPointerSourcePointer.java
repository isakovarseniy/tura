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
package org.tura.metamodel.sirius.properties.selections.adapters.dropdown;

import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.Util;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeDataControl;
import org.tura.metamodel.sirius.properties.selections.AbstractTuraPropertySection;
import org.tura.metamodel.sirius.properties.selections.DropDownDataAdapter;

import form.ControlPointer;
import form.DataControl;
import form.Form;
import form.FormPackage;

public class SourcesPointerSourcePointer implements DropDownDataAdapter {

	private AbstractTuraPropertySection property;

	public SourcesPointerSourcePointer(AbstractTuraPropertySection property) {
		this.property = property;
	}

	@Override
	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { FormPackage.eINSTANCE.getControlPointer_SourcePointer() };
	}

	@Override
	public String getFeatureAsText(Object eObject) {
		if (((ControlPointer) eObject).getSourcePointer() != null) {
			DiagramImpl root = (DiagramImpl) property.getEditPart().getRoot().getContents().getModel();
			DataControl dc = ((ControlPointer) eObject).getSourcePointer();
			try {
				Object obj;
				QueryHelper helper = new QueryHelper();
				Form frm = helper.getForm(root);

				if (Util.ifDataControlIsTreeRoot(dc, frm)) {
					obj = new TreeDataControl(dc);
				} else {
					obj = dc;
				}
				IWorkbenchAdapter adapter = (IWorkbenchAdapter) Platform.getAdapterManager().getAdapter(obj,
						IWorkbenchAdapter.class);
				return adapter.getLabel(obj);

			} catch (Exception e) {
				return "";
			}
		} else
			return "";
	}

	@Override
	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(FormPackage.eINSTANCE.getControlPointer_SourcePointer()))
			return values.get(obj[0]);

		return null;
	}

	@Override
	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (((ControlPointer) eObject).getSourcePointer() == null)
			return false;

		if (((ControlPointer) eObject).getSourcePointer().getName() == null)
			return false;

		return values.get(key).equals(((ControlPointer) eObject).getSourcePointer().getName());
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] {};
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] {};
	}

	public Class<?> getExpectedClass() {
		return null;
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return null;
	}

}
