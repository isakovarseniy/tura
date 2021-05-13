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

package org.tura.metamodel.sirius.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import form.ContextParameter;
import form.ContextParameters;

public class DefaultContextParametersDS extends ContextParameterDS {

	public DefaultContextParametersDS(GridProperty property) {
		super(property);
	}

	@Override
	public List<Object> queryRows() {
		try {
			ArrayList<Object> rows = new ArrayList<Object>();
			for (ContextParameter param : ((ContextParameters) property.getModel()).getParameters()) {
				rows.add(param);
			}

			return rows;
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

}
