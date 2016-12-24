package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import mapper.MapperPackage;
import mapper.MappingLayer;

public class MappingLayerName implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		if (feature.equals(MapperPackage.eINSTANCE.getMappingLayer_Name()) ){
			MappingLayer layer = (MappingLayer) eObject;
			 if (layer.getName() == null){
				 return "Layer "+ layer.getOrder();
			 }else{
				 return layer.getName();
			 }
		}
		return ((EObject )eObject).eGet(feature);
	}

	@Override
	public EStructuralFeature getFeature() {
		return MapperPackage.eINSTANCE.getMappingLayer_Name();
	}

}
