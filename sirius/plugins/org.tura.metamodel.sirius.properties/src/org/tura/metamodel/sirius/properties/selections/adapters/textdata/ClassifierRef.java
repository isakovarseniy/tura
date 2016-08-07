package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import artifact.ArtifactPackage;
import artifact.Classifier;
import artifact.TechLeaf;

public class ClassifierRef  implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		if (eObject == null)
			return "";
		Classifier opt = (Classifier) eObject;
		if (opt.getHint() == null || opt.getHint().getName() == null)
			return "";
		return getName(opt);
		
	}

	@Override
	public EStructuralFeature getFeature() {
		return ArtifactPackage.eINSTANCE.getClassifier_Hint();
	}

	private String getName(Classifier opt){
		  if (opt.getHint().eContainer() instanceof TechLeaf){
				return ((TechLeaf) (opt.getHint().eContainer())).getName() + ":" + opt.getHint().getName();
		  }else{
				return  opt.getHint().getName();
		  }
	}
			
	
	
	
}
