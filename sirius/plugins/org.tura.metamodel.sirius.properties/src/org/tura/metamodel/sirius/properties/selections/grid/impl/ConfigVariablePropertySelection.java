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

package org.tura.metamodel.sirius.properties.selections.grid.impl;

import org.tura.metamodel.sirius.properties.selections.adapters.textdata.ConfigVariableNickName;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.ConfigVariableNickRef;

import artifact.ArtifactPackage;
import artifact.ConfigVariable;

public class ConfigVariablePropertySelection extends ArtifactConfigPropertySelector {
	
	public ConfigVariablePropertySelection(){
		super(ArtifactPackage.eINSTANCE.getConfigVariable_Name(), new ConfigVariableNickRef(),new ConfigVariableNickName());
		ds = new ConfigVariablesDS(this);
	}

	@Override
	public String getNameContextColumn() {
		return "Config var";
	}

	@Override
	public Class<?> getComaringClass() {
		return ConfigVariable.class;
	}
	
}
