package org.metamodel.tura.ui.properties.sections.grid.impl;

public class RecipeMappersListPropertySelection extends
		AbstractMappersListPropertySelection {

	public RecipeMappersListPropertySelection() {
		ds = new RecipeMappersListDS(this);
	}

}
