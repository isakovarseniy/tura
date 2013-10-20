package org.metamodel.tura.ui.properties.sections;

import java.util.List;
import java.util.Set;

import domain.Recipe;
import domain.UsingMappers;

public class RecipeMappersList extends AbstractMappersList {

	public RecipeMappersList(
			AbstractMappersListPropertySelection mappersListPropertySelection) {
		super(mappersListPropertySelection);

	}

	@Override
	public List<domain.Mappers> findRemovedMappers(UsingMappers usingMappers) {
		return new QueryHelper().removeMappersForRecipe((Recipe) usingMappers);
	}

	@Override
	public Set<domain.ApplicationMapper> findAvailableMappers(UsingMappers usingMappers) {
		return new QueryHelper().findAvailableMappersForRecipe((domain.Recipe)usingMappers);
	}



}
