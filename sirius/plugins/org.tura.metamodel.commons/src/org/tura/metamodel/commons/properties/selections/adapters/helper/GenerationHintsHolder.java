package org.tura.metamodel.commons.properties.selections.adapters.helper;

import artifact.TechLeaf;

public class GenerationHintsHolder {
	private TechLeaf leaf;
	
	public GenerationHintsHolder(TechLeaf leaf){
		this.leaf = leaf;
	}

	public TechLeaf getLeaf() {
		return leaf;
	}
	

}
