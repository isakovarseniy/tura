package org.tura.metamodel.commons.properties.sections.grid.impl;

public class IngredientMappersListPropertySelection extends
		AbstractMappersListPropertySelection {

	public IngredientMappersListPropertySelection() {
		ds = new IngredientMappersListDS(this);
	}

}
