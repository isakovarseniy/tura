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

import artifact.ArtifactGroup;
import recipe.ModelMapper;
import recipe.RecipePackage;

public class ModelMapperArtifactName  implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		ModelMapper mapper = (ModelMapper) eObject;
		if (mapper.getArtifactRef() == null || mapper.getArtifactRef().getName() == null){
			return "";
		}else{
			return ((ArtifactGroup) (mapper.getArtifactRef().eContainer())).getName() + ":" + mapper.getArtifactRef().getName();
		}
	}

	@Override
	public EStructuralFeature getFeature() {
		return RecipePackage.eINSTANCE.getArtifactRef_ArtifactRef();
	}

}
