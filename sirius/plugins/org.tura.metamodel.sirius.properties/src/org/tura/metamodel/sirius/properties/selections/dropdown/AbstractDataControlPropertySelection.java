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

package org.tura.metamodel.sirius.properties.selections.dropdown;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.tura.metamodel.commons.QueryHelper1;
import org.tura.metamodel.commons.properties.selections.adapters.DataControlProvider;
import org.tura.metamodel.commons.properties.selections.adapters.TreeDataControlProvider;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlHolder;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeDataControl;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRootDataControlHolder;
import org.tura.metamodel.sirius.properties.selections.events.Bus;
import org.tura.metamodel.sirius.properties.selections.events.DataControlChangeEvent;

import form.DataControl;

public abstract class AbstractDataControlPropertySelection extends AbstractEnumerationPropertySection {

	protected String getLabelText() {
		return "Data control name";
	}

	protected HashMap<String, ?> getEnumerationFeatureValues() {
		if (values == null) {
			try {
				values = new LinkedHashMap<String, Object>();
				DiagramImpl root = (DiagramImpl) editPart.getRoot().getContents().getModel();

				for (Object obj : new QueryHelper1().getControlsList(root)) {
					if (obj instanceof TreeRootDataControlHolder) {
						TreeRootDataControlHolder th = (TreeRootDataControlHolder) obj;
						TreeDataControlProvider provider = new TreeDataControlProvider();
						for (TreeDataControl tdc : th.getControls()) {
							if (provider.getLabel(tdc) != null)
								values.put(provider.getLabel(tdc), tdc.getDc());
						}
					}
					if (obj instanceof DataControlHolder) {
						DataControlHolder dh = (DataControlHolder) obj;
						DataControlProvider provider = new DataControlProvider();
						for (DataControl dc : dh.getControls()) {
							if (provider.getLabel(dc) != null)
								values.put(provider.getLabel(dc), dc);
						}
					}
				}
			} catch (Exception e) {

			}
		}
		return values;
	}


	@Override
	public EObject getModel(EStructuralFeature feature) {
		return getModel();
	}

	@Override
	public void afterUpdate(){
		Bus.getInstance().notify(new DataControlChangeEvent());
		
	}


}
