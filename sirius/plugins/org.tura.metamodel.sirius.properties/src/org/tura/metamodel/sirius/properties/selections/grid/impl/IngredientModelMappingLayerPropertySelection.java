package org.tura.metamodel.sirius.properties.selections.grid.impl;

public class IngredientModelMappingLayerPropertySelection extends MappingLayerPropertySelection{
	
	public IngredientModelMappingLayerPropertySelection(){
		ds = new IngredientModelMappingLayerDS(this);
	}
}
