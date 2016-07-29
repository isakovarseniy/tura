package org.tura.metamodel.commons.properties.selections.adapters.helper;

import artifact.TechLeaf;

public class ConfigurationVariablesHolder {

	private TechLeaf leaf;
	
	public TechLeaf getLeaf() {
		return leaf;
	}

	public ConfigurationVariablesHolder(TechLeaf leaf){
		this.leaf = leaf;
	}

}
