/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
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
 ******************************************************************************/
package org.elsoft.platform.metamodel.suite;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;

import org.elsoft.platform.ComparatorType;
import org.elsoft.platform.OrderType;
import org.elsoft.platform.datacontrol.Mode;
import org.elsoft.platform.datacontrol.annotations.CreateTrigger;
import org.elsoft.platform.datacontrol.annotations.InsertTrigger;
import org.elsoft.platform.datacontrol.annotations.RemoveTrigger;
import org.elsoft.platform.datacontrol.annotations.SearchTrigger;
import org.elsoft.platform.datacontrol.annotations.TriggerOutput;
import org.elsoft.platform.datacontrol.annotations.GetMode;
import org.elsoft.platform.datacontrol.annotations.IdField;
import org.elsoft.platform.datacontrol.annotations.Link;
import org.elsoft.platform.datacontrol.annotations.Variable;
import org.elsoft.platform.datacontrol.annotations.Variables;
import org.elsoft.platform.datacontrol.annotations.Proxy;
import org.elsoft.platform.datacontrol.annotations.Connection;
import org.elsoft.platform.datacontrol.annotations.Base;
import org.elsoft.platform.datacontrol.annotations.UpdateTrigger;
import org.elsoft.platform.datacontrol.annotations.VersionField;
import org.elsoft.platform.datacontrol.extender.Handler;
import org.elsoft.platform.metamodel.MetamodelPlatformLevel;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.general.GeneralService;
import org.elsoft.platform.metamodel.general.TransactionManagerImpl;
import org.elsoft.platform.metamodel.objects.ELsoftObject;
import org.elsoft.platform.metamodel.objects.recipe.IngredientDAO;
import org.elsoft.platform.metamodel.objects.recipe.RecipeDAO;

@TriggerOutput(expression = SessionContext.RESULT_EXPRESSION)
@Base(clazz = RecipeDAO.class)
@VersionField(field = "version")
@IdField(field = "objId")
public class RecipeHandler extends Handler<RecipeHandler, RecipeDAO> {

	@Proxy(name = "generalService")
	private GeneralService generalService;
	@InsertTrigger(objectAction = "insert", parameters = @Variables(value = { @Variable(expression = SessionContext.CURRENT_RECORD, type = ELsoftObject.class) }), object = "generalService")
	private Method insert;
	@CreateTrigger(objectAction = "create", parameters = @Variables(value = { @Variable(value = "org.elsoft.platform.metamodel.objects.recipe.RecipeDAO", type = String.class) }), object = "generalService")
	private Method create;
	@UpdateTrigger(objectAction = "update", parameters = @Variables(value = { @Variable(expression = SessionContext.CURRENT_RECORD, type = ELsoftObject.class) }), object = "generalService")
	private Method update;
	@RemoveTrigger(objectAction = "remove", parameters = @Variables(value = { @Variable(expression = SessionContext.CURRENT_RECORD, type = ELsoftObject.class) }), object = "generalService")
	private Method remove;
	@SearchTrigger(objectAction = "find", parameters = @Variables(value = {
			@Variable(type = java.util.List.class),
			@Variable(type = java.util.List.class),
			@Variable(type = java.lang.Integer.class),
			@Variable(type = java.lang.Integer.class),
			@Variable(value = "org.elsoft.platform.metamodel.objects.recipe.RecipeDAO", type = String.class) }), object = "generalService")
	private Method search;
	@GetMode
	private Mode<RecipeDAO> mode;
	@Connection(links = { @Link(field1 = "objId", field2 = "parentId") }, connectedObject = IngredientHandler.class, connectionName = "recipe2Ingredient")
	private IngredientHandler ingredientHandler;

	public Method getInsert() {
		return insert;
	}

	public void setInsert(Method insert) {
		this.insert = insert;
	}

	public Method getCreate() {
		return create;
	}

	public void setCreate(Method create) {
		this.create = create;
	}

	public Method getUpdate() {
		return update;
	}

	public void setUpdate(Method update) {
		this.update = update;
	}

	public Method getRemove() {
		return remove;
	}

	public void setRemove(Method remove) {
		this.remove = remove;
	}

	public Method getSearch() {
		return search;
	}

	public void setSearch(Method search) {
		this.search = search;
	}

	public RecipeHandler() {
	}

	public Object getGeneralService() {
		if (generalService == null)
		    generalService = new GeneralService(TransactionManagerImpl.getCurrentInstance());
		return generalService;
	}

	public Mode<RecipeDAO> getMode() {
		return mode;
	}

	public RecipeDAO addRecipe(String recipeName) {
		RecipeDAO obj = getMode().getControl().createObject();
		obj.setRecipeName(recipeName);
		return obj;
	}

	public void buildRecipe(RepositoryFactory rf,
			HashMap<String, Object> infrastructureContext,
			MetamodelPlatformLevel begin, MetamodelPlatformLevel end,
			String domain, String functionalDomain, String application)
			throws Exception {

		Iterator<IngredientDAO> itr = getIngredientHandler()
				.cleanSearch()
				.search("level", Integer.class,
						new Integer(begin.ordinal()).toString(),
						ComparatorType.GTEQ)
				.search("level", Integer.class,
						new Integer(end.ordinal()).toString(),
						ComparatorType.LTEQ).orderBy("numId", OrderType.ASC)
				.getList();
		while (itr.hasNext()) {
			IngredientDAO ing = itr.next();
			System.out.println("Ingradien name = " + ing.getIngradientName());
			getIngredientHandler().buildIngradient(rf, domain,
					functionalDomain, application, infrastructureContext, ing);
		}
	}

	public IngredientHandler getIngredientHandler() {
		return ingredientHandler;
	}

}
