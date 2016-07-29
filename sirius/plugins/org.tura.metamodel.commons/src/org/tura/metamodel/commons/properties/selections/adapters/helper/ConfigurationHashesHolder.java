package org.tura.metamodel.commons.properties.selections.adapters.helper;

import artifact.TechLeaf;

public class ConfigurationHashesHolder {
	private TechLeaf leaf;
	
	public TechLeaf getLeaf() {
		return leaf;
	}

	public ConfigurationHashesHolder(TechLeaf leaf){
		this.leaf = leaf;
	}

}
