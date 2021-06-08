/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.DropDownDataAdapter;
import objectmapper.AttributeConnector;

import objectmapper.ObjectmapperPackage;
import objectmapper.OperationConnector;

public class OperationConnectorOperation implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { ObjectmapperPackage.eINSTANCE.getOperationConnectorRef_OperationRef() };
	}

	public String getFeatureAsText(Object eObject) {
		if (eObject instanceof AttributeConnector) {
			if (((AttributeConnector) eObject).getOperationRef() != null) {
				String key = ((AttributeConnector) eObject).getOperationRef().getUid();
				if (((AttributeConnector) eObject).getOperationRef().getName() != null
						&& !"".equals(((AttributeConnector) eObject).getOperationRef().getName())) {
					key = ((AttributeConnector) eObject).getOperationRef().getName();
				}
				return key;

			}
		}
		if (eObject instanceof OperationConnector) {
			if (((OperationConnector) eObject).getOperationRef() != null) {
				String key = ((OperationConnector) eObject).getOperationRef().getUid();
				if (((OperationConnector) eObject).getOperationRef().getName() != null
						&& !"".equals(((OperationConnector) eObject).getOperationRef().getName())) {
					key = ((OperationConnector) eObject).getOperationRef().getName();
				}
				return key;
			}
		}
		return "";
	}

	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(ObjectmapperPackage.eINSTANCE.getOperationConnectorRef_OperationRef()))
			return values.get(obj[0]);

		return null;
	}

	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (eObject instanceof AttributeConnector) {
			if (((AttributeConnector) eObject).getOperationRef() == null)
				return false;
			if (((AttributeConnector) eObject).getOperationRef() == null)
				return false;
			return values.get(key).equals(((AttributeConnector) eObject).getOperationRef());
		}
		if (eObject instanceof OperationConnector) {
			if (((OperationConnector) eObject).getOperationRef() == null)
				return false;
			if (((OperationConnector) eObject).getOperationRef() == null)
				return false;
			return values.get(key).equals(((OperationConnector) eObject).getOperationRef());
		}

		return false;
		
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
		return null;
	}

}
