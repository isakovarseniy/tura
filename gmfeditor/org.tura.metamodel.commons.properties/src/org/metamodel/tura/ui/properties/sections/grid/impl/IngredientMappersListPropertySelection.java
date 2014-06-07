package org.metamodel.tura.ui.properties.sections.grid.impl;

public class IngredientMappersListPropertySelection extends
		AbstractMappersListPropertySelection {

	public IngredientMappersListPropertySelection() {
		ds = new IngredientMappersListDS(this);
	}

}
