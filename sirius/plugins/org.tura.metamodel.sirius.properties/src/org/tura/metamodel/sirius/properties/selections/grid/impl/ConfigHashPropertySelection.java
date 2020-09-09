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

package org.tura.metamodel.sirius.properties.selections.grid.impl;

import org.tura.metamodel.sirius.properties.selections.adapters.textdata.ConfigHashNickName;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.ConfigHashNickRef;

import artifact.ArtifactPackage;
import artifact.ConfigHash;

public class ConfigHashPropertySelection  extends ArtifactConfigPropertySelector {
	
	public ConfigHashPropertySelection(){
		super(ArtifactPackage.eINSTANCE.getConfigHash_Name(), new ConfigHashNickRef(),new ConfigHashNickName());
		ds = new ConfigHashesDS(this);
	}

	@Override
	public String getNameContextColumn() {
		return "Config hash";
	}

	@Override
	public Class<?> getComaringClass() {
		return ConfigHash.class;
	}
	
}
