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

package org.tura.metamodel.sirius.properties.selections;

import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;

public interface DropDownDataAdapter {
	public EStructuralFeature[] getFeature();

	public String getFeatureAsText(Object eObject);

	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature);

	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj);

	public boolean isEqual(Map<String, Object> values, Object key, Object eObject);

	public Object[] getWatchPointObject(Object eObject);

	public EStructuralFeature[] getWatchPointFeature();

	public Class<?> getExpectedClass();

}
