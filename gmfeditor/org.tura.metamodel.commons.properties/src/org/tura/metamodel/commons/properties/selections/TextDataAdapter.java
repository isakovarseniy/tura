package org.tura.metamodel.commons.properties.selections;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface TextDataAdapter {
	
	public Object getFeatureValue(EObject eObject, EStructuralFeature feature);
	public EStructuralFeature getFeature();
	

}
