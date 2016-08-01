package org.tura.metamodel.sirius.properties.selections.grid.impl;

import org.tura.metamodel.sirius.properties.selections.adapters.textdata.ConfigVariableNickName;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.ConfigVariableNickRef;

import artifact.ArtifactPackage;
import artifact.ConfigVariable;

public class ConfigVariablePropertySelection extends ArtifactConfigPropertySelector {
	
	public ConfigVariablePropertySelection(){
		super(ArtifactPackage.eINSTANCE.getConfigVariable_Name(), new ConfigVariableNickRef(),new ConfigVariableNickName());
		ds = new ConfigVariablesDS(this);
	}

	@Override
	public String getNameContextColumn() {
		return "Config var";
	}

	@Override
	public Class<?> getComaringClass() {
		return ConfigVariable.class;
	}
	
}
