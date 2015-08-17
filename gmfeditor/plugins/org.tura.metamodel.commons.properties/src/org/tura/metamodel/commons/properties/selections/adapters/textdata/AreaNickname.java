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
package org.tura.metamodel.commons.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.TextDataAdapter;
import org.tura.metamodel.commons.properties.selections.grid.impl.UielementOnEventRefreshAreaDS;

public class AreaNickname implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		UielementOnEventRefreshAreaDS.Area opt = (UielementOnEventRefreshAreaDS.Area) eObject;
		return opt.getElement().getNickname();
	}

	@Override
	public EStructuralFeature getFeature() {
		return null;
	}

}
