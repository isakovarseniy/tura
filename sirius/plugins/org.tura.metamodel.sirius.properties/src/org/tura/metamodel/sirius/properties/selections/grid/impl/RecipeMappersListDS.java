/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.tura.metamodel.sirius.properties.selections.grid.impl;

import java.util.List;
import java.util.Set;

import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import application.ApplicationMapper;
import recipe.Recipe;
import recipe.UsingMappers;

public class RecipeMappersListDS  extends AbstractMappersListDS{

	public RecipeMappersListDS(GridProperty property) {
		super(property);
	}

	@Override
	public List<ApplicationMapper> findRemovedMappers(UsingMappers usingMappers) {
		return new QueryHelper().removeMappersForRecipe((Recipe) usingMappers);
	}

	@Override
	public Set<ApplicationMapper> findAvailableMappers(UsingMappers usingMappers) {
		return new QueryHelper().findAvailableMappersForRecipe((domain.Recipe)usingMappers);
	}



}
