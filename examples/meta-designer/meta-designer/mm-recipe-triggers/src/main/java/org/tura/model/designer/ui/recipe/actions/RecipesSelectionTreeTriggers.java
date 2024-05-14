/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import org.tura.model.designer.repository.serialized.recipe.ConfigExtension;
import org.tura.model.designer.repository.serialized.recipe.Configuration;
import org.tura.model.designer.repository.serialized.recipe.Infrastructure;
import org.tura.model.designer.repository.serialized.recipe.Ingredient;
import org.tura.model.designer.repository.serialized.recipe.JavaComponent;
import org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent;
import org.tura.model.designer.repository.serialized.recipe.ModelMapper;
import org.tura.model.designer.repository.serialized.recipe.Recipe;
import org.tura.model.designer.repository.serialized.recipe.Recipes;
import org.tura.model.designer.ui.recipe.mmdesigner.recipe.viewmodel.IViewPortHolder;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.uuiclient.model.AbstractTreeModelTriggers;
import org.tura.platform.uuiclient.model.tree.TreeNode;

public class RecipesSelectionTreeTriggers extends AbstractTreeModelTriggers{

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	private ELResolver elResolver;
	
	public RecipesSelectionTreeTriggers (ELResolver elResolver){
		this.elResolver = elResolver;
	}
	
	
	@Override
	public void onNodeSelect(TreeNode expnode) throws Exception {
		Object obj = expnode.getData();
		IViewPortHolder vh = (IViewPortHolder) elResolver.getValue("#{viewPortHolderMmdesignerRecipe}");
		
		if (obj instanceof Recipes) {
			vh.setDetailPort(IViewPortHolder.DETAILPORT_RECIPIESDETAILS);
			return;
		}

		if (obj instanceof Recipe) {
			vh.setDetailPort(IViewPortHolder.DETAILPORT_RECIPEDETAILS);
			return;
		}

		if (obj instanceof Ingredient) {
			vh.setDetailPort(IViewPortHolder.DETAILPORT_INGREDIENTDETAILS);
			return;
		}
		
		if (obj instanceof JavaComponent) {
			vh.setDetailPort(IViewPortHolder.DETAILPORT_JAVACOMPONENTDETAILS);
			return;
		}
		
		if (obj instanceof JavaScriptComponent) {
			vh.setDetailPort(IViewPortHolder.DETAILPORT_JAVASCRIPTCOMPONENTDETAILS);
			return;
		}

		if (obj instanceof ModelMapper) {
			vh.setDetailPort(IViewPortHolder.DETAILPORT_MODELMAPPERDETAILS);
			return;
		}
		
		if (obj instanceof ConfigExtension) {
			vh.setDetailPort(IViewPortHolder.DETAILPORT_CONFIGURATIONEXTENSIONDETAILS);
			return;
		}

		if (obj instanceof Configuration) {
			vh.setDetailPort(IViewPortHolder.DETAILPORT_CONFIGURATIONDETAILS);
			return;
		}
		
		if (obj instanceof Infrastructure) {
			vh.setDetailPort(IViewPortHolder.DETAILPORT_INFRASTRUCTUREDETAILS);
			return;
		}

		
	}
	
	
}
