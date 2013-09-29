package org.metamodel.tura.ui.properties.sections;

public class RecipeMappersListPropertySelection  extends MappersListPropertySelection{

	public void refresh() {
		optionList = new RecipeMappersList(this);
		tableViewer.setInput(optionList);
	}

}
