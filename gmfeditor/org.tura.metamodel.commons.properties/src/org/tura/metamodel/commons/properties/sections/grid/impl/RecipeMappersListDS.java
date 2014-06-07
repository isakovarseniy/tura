package org.tura.metamodel.commons.properties.sections.grid.impl;

import java.util.List;
import java.util.Set;

import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.sections.grid.GridProperty;

import domain.ApplicationMapper;
import domain.Recipe;
import domain.UsingMappers;

public class RecipeMappersListDS  extends AbstractMappersListDS{

	public RecipeMappersListDS(GridProperty property) {
		super(property);
	}

	@Override
	public List<ApplicationMapper> findRemovedMappers(UsingMappers usingMappers) {
		return new QueryHelper().removeMappersForRecipe((Recipe) usingMappers);
	}

	@Override
	public Set<domain.ApplicationMapper> findAvailableMappers(UsingMappers usingMappers) {
		return new QueryHelper().findAvailableMappersForRecipe((domain.Recipe)usingMappers);
	}



}
