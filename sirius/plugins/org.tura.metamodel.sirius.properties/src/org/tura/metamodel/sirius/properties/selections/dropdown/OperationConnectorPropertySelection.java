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
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.OperationConnectorOperation;

import objectmapper.AttributeConnector;
import objectmapper.OperationConnector;

public class OperationConnectorPropertySelection extends AbstractEnumerationPropertySection {

	protected String getLabelText() {
		return "Operation name";//$NON-NLS-1$
	}

	protected HashMap<String, ?> getEnumerationFeatureValues() {

		if (values == null) {
			values = new LinkedHashMap<String, Object>();
			List<OperationConnector> ls = null;
			if ( getModel() instanceof AttributeConnector) {
			   ls = new QueryHelper().findOperationConnectorByTarget((AttributeConnector) getModel()) ;
			}
			if ( getModel() instanceof OperationConnector) {
				   ls = new QueryHelper().findOperationConnectorByTarget((OperationConnector) getModel()) ;
				}
			if ( ls != null) {
				for ( OperationConnector op : ls) {
					  String key = op.getUid();
					  if (op.getName() != null && !"".equals(op.getName() )) {
						  key = op.getName() ;
					  }
						values.put(key, op);
				}
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
		dropDownDataSupplier = new OperationConnectorOperation();
	}
}
