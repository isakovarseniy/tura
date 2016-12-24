package org.tura.metamodel.sirius.properties.selections.grid.impl;

public class IngredientViewMappingLayerPropertySelection extends MappingLayerPropertySelection{
	
	public IngredientViewMappingLayerPropertySelection(){
		ds = new IngredientViewMappingLayerDS(this);
	}
}
