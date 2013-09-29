package org.metamodel.tura.ui.properties.sections;

import java.util.List;
import java.util.Set;

import domain.Recipe;
import domain.UsingMappers;

public class RecipeMappersList extends AbstractMappersList {

	public RecipeMappersList(
			MappersListPropertySelection mappersListPropertySelection) {
		super(mappersListPropertySelection);

	}

	@Override
	public List<String> findRemovedMappers(UsingMappers usingMappers) {
		return new QueryHelper().removeMappersForRecipe((Recipe) usingMappers);
	}

	@Override
	public Set<String> findAvailableMappers(UsingMappers usingMappers) {
		return new QueryHelper().findAvailableMappersForRecipe((domain.Recipe)usingMappers);
	}



}
