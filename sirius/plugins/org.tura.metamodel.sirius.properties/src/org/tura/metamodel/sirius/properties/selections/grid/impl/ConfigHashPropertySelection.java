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
