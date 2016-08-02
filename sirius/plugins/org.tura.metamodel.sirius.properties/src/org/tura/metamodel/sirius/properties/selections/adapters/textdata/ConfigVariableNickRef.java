package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import artifact.ArtifactPackage;
import artifact.ConfigVariableWithNickName;
import artifact.TechLeaf;

public class ConfigVariableNickRef  implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		if (eObject == null)
			return "";
		ConfigVariableWithNickName opt = (ConfigVariableWithNickName) eObject;
		if (opt.getVar() == null || opt.getVar().getName() == null)
			return "";
		return getName(opt);
	}

	@Override
	public EStructuralFeature getFeature() {
		return ArtifactPackage.eINSTANCE.getConfigVariableWithNickName_Var();
	}

	private String getName(ConfigVariableWithNickName opt){
		  if (opt.getVar().eContainer() instanceof TechLeaf){
				return ((TechLeaf) (opt.getVar().eContainer())).getName() + ":" + opt.getVar().getName();
		  }else{
				return  opt.getVar().getName();
		  }
	}
			
	
}
