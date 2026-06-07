/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.model.designer.ui.recipe.actions;

import java.util.Map;

import jakarta.annotation.Priority;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import org.tura.model.designer.repository.serialized.recipe.Infrastructure;
import org.tura.model.designer.repository.serialized.recipe.Recipes;
import org.tura.model.designer.ui.recipe.mmdesigner.recipe.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.annotations.PostCreate;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.PostCreateTrigger;
import org.tura.platform.datacontrol.commons.TuraException;

@Alternative
@Priority(10)
@Selector("mmdesigner.recipe")
@PostCreate("infrastructure")
public class PostCreateInfrastructure implements PostCreateTrigger {

	private static final long serialVersionUID = 1L;

	@Inject
	@Named("beanFactoryMmdesignerRecipe")
	IBeanFactory bf;

	@Override
	public void execute(DataControl<?> datacontrol, Object obj, Map<String, Object> attributes) throws TuraException {
		try {
			TreeDataControl tdc = (TreeDataControl) bf.getTreeRootRecipes();
			Recipes recipes = (Recipes) tdc.getRoot().getCurrentObject();
			recipes.getInfrastructures().add((Infrastructure) obj);
		} catch (Exception e) {
			throw new TuraException(e);
		}
	}

}
