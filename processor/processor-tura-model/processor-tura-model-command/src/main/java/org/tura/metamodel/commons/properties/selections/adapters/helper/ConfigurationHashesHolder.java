/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.commons.properties.selections.adapters.helper;

import org.tura.model.designer.repository.serialized.artifact.TechLeaf;

public class ConfigurationHashesHolder {
	private TechLeaf leaf;
	
	public TechLeaf getLeaf() {
		return leaf;
	}

	public ConfigurationHashesHolder(TechLeaf leaf){
		this.leaf = leaf;
	}

}