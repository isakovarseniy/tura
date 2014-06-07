package org.tura.metamodel.commons.properties.sections.grid.impl;

import java.util.List;
import java.util.Set;

import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.sections.grid.GridProperty;

import domain.ApplicationMapper;
import domain.Ingredient;
import domain.UsingMappers;

public class IngredientMappersListDS  extends AbstractMappersListDS{

	public IngredientMappersListDS(GridProperty property) {
		super(property);
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
