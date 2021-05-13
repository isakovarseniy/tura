/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.actions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.processor.RecipeGeneration;

import recipe.Component;
import recipe.Infrastructure;
import recipe.Ingredient;
import recipe.ModelMapper;
import recipe.Recipe;

public class RunGenerationActionForMapper implements IExternalJavaAction{

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		try {
		DRepresentationElement node = (DRepresentationElement) arg0.iterator().next();
		ModelMapper mapper = (ModelMapper)node.getTarget();
		Component component =  (Component) mapper.eContainer();
		Ingredient ingredient = (Ingredient) component.eContainer();
		Recipe recipe = (Recipe) ingredient.eContainer();
		Infrastructure infra =  new QueryHelper().getInfrastructure(recipe);
		
		new RecipeGeneration().generation(infra, recipe, ingredient,component ,  mapper);
		
		}catch (Exception e) {
			LogUtil.log(e);
		}
		
	}

}
