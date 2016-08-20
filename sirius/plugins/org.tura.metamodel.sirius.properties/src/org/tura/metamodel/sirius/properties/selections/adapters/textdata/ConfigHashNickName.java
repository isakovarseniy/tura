package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import artifact.ArtifactPackage;

public class ConfigHashNickName  implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		return ((EObject )eObject).eGet(feature);
	}

	@Override
	public EStructuralFeature getFeature() {
		return ArtifactPackage.eINSTANCE.getConfigHashWithNickName_Name();
	}

}