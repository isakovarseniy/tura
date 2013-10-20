package org.metamodel.tura.ui.properties.sections;

public class IngredientMappersListPropertySelection extends AbstractMappersListPropertySelection{

	public void refresh() {
		optionList = new IngredientMappersList(this);
		tableViewer.setInput(optionList);
	}

}
