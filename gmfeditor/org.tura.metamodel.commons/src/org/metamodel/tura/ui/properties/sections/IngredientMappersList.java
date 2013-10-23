package org.metamodel.tura.ui.properties.sections;

import java.util.List;
import java.util.Set;

import domain.ApplicationMapper;
import domain.Ingredient;
import domain.UsingMappers;

public class IngredientMappersList extends AbstractMappersList {

	public IngredientMappersList(
			AbstractMappersListPropertySelection mappersListPropertySelection) {
		super(mappersListPropertySelection);

	}

	@Override
	public List<ApplicationMapper> findRemovedMappers(UsingMappers usingMappers) {
		return new QueryHelper().removeMappersForIngredient((Ingredient) usingMappers);
	}

	@Override
	public Set<domain.ApplicationMapper> findAvailableMappers(UsingMappers usingMappers) {
		return new QueryHelper()
				.findAvailableMappersForIngredient((domain.Ingredient) usingMappers);
	}

}
