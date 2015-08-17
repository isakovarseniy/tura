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
package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.ContextParameters;

public class DefaultContextParametersDS extends ContextParameterDS {

	public DefaultContextParametersDS(GridProperty property) {
		super(property);
	}

	@Override
	public List<Object> queryRows() {
		try {
			ArrayList<Object> rows = new ArrayList<Object>();
			for (Iterator<domain.ContextParameter> itr = ((ContextParameters) property
					.getModel()).getParameters().iterator(); itr
					.hasNext();) {
				rows.add(itr.next());
			}

			return rows;
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

}
