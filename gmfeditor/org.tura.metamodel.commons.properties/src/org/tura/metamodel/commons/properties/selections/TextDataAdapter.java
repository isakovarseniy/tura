package org.tura.metamodel.commons.properties.selections;


import org.eclipse.emf.ecore.EStructuralFeature;

public interface TextDataAdapter {
	
	public Object getFeatureValue(Object eObject, EStructuralFeature feature);
	public EStructuralFeature getFeature();
	

}
