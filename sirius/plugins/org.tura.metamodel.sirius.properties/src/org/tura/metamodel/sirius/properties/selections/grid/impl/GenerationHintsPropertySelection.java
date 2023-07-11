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

package org.tura.metamodel.sirius.properties.selections.grid.impl;


import org.tura.metamodel.sirius.properties.selections.adapters.textdata.GenerationHintNickName;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.GenerationHintNickRef;

import artifact.ArtifactPackage;
import artifact.GenerationHint;

public class GenerationHintsPropertySelection extends ArtifactConfigPropertySelector {
	
	public GenerationHintsPropertySelection(){
		super(ArtifactPackage.eINSTANCE.getGenerationHint_Name(), new GenerationHintNickRef(),new GenerationHintNickName());
		ds = new GenerationHintsDS(this);
	}

	@Override
	public String getNameContextColumn() {
		return "Generation Hint";
	}

	@Override
	public Class<?> getComaringClass() {
		return GenerationHint.class;
	}
	
}
