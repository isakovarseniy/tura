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
