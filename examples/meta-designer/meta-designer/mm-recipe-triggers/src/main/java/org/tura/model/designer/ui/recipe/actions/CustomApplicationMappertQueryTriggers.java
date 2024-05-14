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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.model.designer.repository.serialized.application.ApplicationMapper;
import org.tura.model.designer.repository.serialized.application.ApplicationMappers;
import org.tura.model.designer.repository.serialized.mapper.Mappers;
import org.tura.model.designer.repository.serialized.mapper.MappersProxy;
import org.tura.model.designer.repository.serialized.recipe.Ingredient;
import org.tura.model.designer.repository.serialized.recipe.IngredientProxy;
import org.tura.model.designer.repository.serialized.recipe.Recipe;
import org.tura.model.designer.ui.recipe.mmdesigner.recipe.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.Pager;
import org.tura.platform.datacontrol.annotations.CustomQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.QueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.proxy.access.ArrayListWithSearch;

@Alternative
@Priority(10)
@Selector("mmdesigner.recipe") 
@CustomQuery("applicationMapper")
public class CustomApplicationMappertQueryTriggers implements QueryTrigger{

	@Inject
	IBeanFactory bf;
	
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> execute(CpaRepository repository, Pager<T> pager) throws TuraException {
		Object obj = bf.getTreeRootRecipes().getCurrentObject();
		ApplicationMappers applicationMappers = (ApplicationMappers) bf.getApplicationMappers().getCurrentObject();
		if ( obj instanceof Recipe) {
			return  (List<T>) applicationMappers.getMappers();
		}
		if ( obj instanceof Ingredient) {
			Recipe recipe = (Recipe) ((IngredientProxy)obj).eContainer();
			List<ApplicationMapper> list =  new ArrayListWithSearch<ApplicationMapper>();
			List<ApplicationMapper>recipeMappers = new ArrayList<ApplicationMapper>();
			for ( Mappers m : recipe.getMappers()) {
				MappersProxy mp = (MappersProxy) m;
				ApplicationMapper am = (ApplicationMapper) mp.eContainer();
				recipeMappers.add(am);
			}
			for(ApplicationMapper m :  applicationMappers.getMappers()) {
				if ( !recipeMappers.contains(m)) {
					list.add(m);
				}
			}
			
			return  (List<T>) list;
		}
		
		
		return new ArrayListWithSearch<T>();
	}


}
