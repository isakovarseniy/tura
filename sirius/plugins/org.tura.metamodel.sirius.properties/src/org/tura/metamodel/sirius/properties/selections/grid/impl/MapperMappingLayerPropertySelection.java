package org.tura.metamodel.sirius.properties.selections.grid.impl;

public class MapperMappingLayerPropertySelection extends MappingLayerPropertySelection{
	
	public MapperMappingLayerPropertySelection(){
		ds = new MapperMappingLayerDS(this);
	}
}
