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

package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import artifact.ArtifactPackage;
import artifact.GenerationHintWithNickName;
import artifact.TechLeaf;

public class GenerationHintNickRef  implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		if (eObject == null)
			return "";
		GenerationHintWithNickName opt = (GenerationHintWithNickName) eObject;
		if (opt.getHint() == null || opt.getHint().getName() == null)
			return "";
		return getName(opt);
		
	}

	@Override
	public EStructuralFeature getFeature() {
		return ArtifactPackage.eINSTANCE.getGenerationHintWithNickName_Hint();
	}

	private String getName(GenerationHintWithNickName opt){
		  if (opt.getHint().eContainer() instanceof TechLeaf){
				return ((TechLeaf) (opt.getHint().eContainer())).getName() + ":" + opt.getHint().getName();
		  }else{
				return  opt.getHint().getName();
		  }
	}
			
	
	
	
}
