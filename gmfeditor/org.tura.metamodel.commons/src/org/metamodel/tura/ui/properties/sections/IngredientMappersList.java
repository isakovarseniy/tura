package org.metamodel.tura.ui.properties.sections;

import java.util.List;
import java.util.Set;

import domain.Ingredient;
import domain.UsingMappers;

public class IngredientMappersList extends AbstractMappersList {

	public IngredientMappersList(
			MappersListPropertySelection mappersListPropertySelection) {
		super(mappersListPropertySelection);

	}

	@Override
	public List<String> findRemovedMappers(UsingMappers usingMappers) {
		return new QueryHelper().removeMappersForIngredient((Ingredient) usingMappers);
	}

	@Override
	public Set<String> findAvailableMappers(UsingMappers usingMappers) {
		return new QueryHelper()
				.findAvailableMappersForIngredient((domain.Ingredient) usingMappers);
	}

}
