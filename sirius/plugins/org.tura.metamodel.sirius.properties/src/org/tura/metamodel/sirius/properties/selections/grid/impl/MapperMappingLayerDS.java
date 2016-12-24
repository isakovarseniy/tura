package org.tura.metamodel.sirius.properties.selections.grid.impl;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import mapper.MapperPackage;

public class MapperMappingLayerDS extends MappingLayerDS{

	public MapperMappingLayerDS(GridProperty property) {
		super(property);
	}

	@Override
	public EStructuralFeature getFeature() {
		return MapperPackage.eINSTANCE.getMapper_Layers();
	}

}
