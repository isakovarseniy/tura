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
