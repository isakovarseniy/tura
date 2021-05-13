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

import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

public class DataExporterTargetDS extends DataExporterDS{

	public DataExporterTargetDS(GridProperty property) {
		super(property);
	}

	@Override
	public int getGroup() {
		return 1;
	}

}