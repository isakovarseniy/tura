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
import java.util.Collection;
import java.util.HashMap;

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
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.general.GeneralService;
import org.elsoft.platform.metamodel.general.TransactionManagerImpl;
import org.elsoft.platform.metamodel.layers.datasource.DataSourceHandler;
import org.elsoft.platform.metamodel.layers.uicontainer.UiContainerHandler;
import org.elsoft.platform.metamodel.objects.ELsoftObject;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.suite.ApplicationDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;

@TriggerOutput(expression = SessionContext.RESULT_EXPRESSION)
@Base(clazz = ApplicationDAO.class)
@VersionField(field = "version")
@IdField(field = "objId")
public class ApplicationHandler extends
		Handler<ApplicationHandler, ApplicationDAO> {
	@Proxy(name = "generalService")
	private GeneralService generalService;
	@InsertTrigger(objectAction = "insert", parameters = @Variables(value = { @Variable(expression = SessionContext.CURRENT_RECORD, type = ELsoftObject.class) }), object = "generalService")
	private Method insert;
	@CreateTrigger(objectAction = "create", parameters = @Variables(value = { @Variable(value = "org.elsoft.platform.metamodel.objects.suite.ApplicationDAO", type = String.class) }), object = "generalService")
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
			@Variable(value = "org.elsoft.platform.metamodel.objects.suite.ApplicationDAO", type = String.class) }), object = "generalService")
	private Method search;
	@GetMode
	private Mode<ApplicationDAO> mode;
	@Connection(links = { @Link(field1 = "objId", field2 = "parentId") }, connectedObject = RecipeHandler.class, connectionName = "application2recipe")
	private RecipeHandler recipeHandler;
	@Connection(links = { @Link(field1 = "objId", field2 = "parentId") }, connectedObject = UiContainerHandler.class, connectionName = "application2UiContainer")
	private UiContainerHandler uILayer;
	@Connection(links = { @Link(field1 = "objId", field2 = "parentId") }, connectedObject = DataSourceHandler.class, connectionName = "application2DataSource")
	private DataSourceHandler dataSourceHandler;
	@Connection(links = { @Link(field1 = "objId", field2 = "parentId") }, connectedObject = ServerZoneHandler.class, connectionName = "application2Infrastructure")
	private ServerZoneHandler infrastructureLayer;
	@Connection(links = { @Link(field1 = "objId", field2 = "parentId") }, connectedObject = ApplicationRoleHandler.class, connectionName = "application2approle")
	private ApplicationRoleHandler applicationRole;
	@Connection(links = { @Link(field1 = "objId", field2 = "parentId") }, connectedObject = CommandHandler.class, connectionName = "application2Command")
	private CommandHandler commandHandler;

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

	public ApplicationHandler() {
	}

	public Object getGeneralService() {
		if (generalService == null)
			generalService = new GeneralService(
					TransactionManagerImpl.getCurrentInstance());
		return generalService;
	}

	public Mode<ApplicationDAO> getMode() {
		return mode;
	}

	public ApplicationDAO addApplication(String appName) {
		ApplicationDAO obj = getMode().getControl().createObject();
		obj.setApplicationName(appName);
		// For tree testing
		obj.setName(appName);
		return obj;
	}

	public RecipeHandler getRecipeHandler() {
		return recipeHandler;
	}

	public UiContainerHandler getUILayer() {
		return uILayer;
	}

	public DataSourceHandler getDataSourceHandler() {
		return dataSourceHandler;
	}

	public ServerZoneHandler getInfrastructureLayer() {
		return infrastructureLayer;

	}

	public void saveRoleMapper(ApplicationDAO app, Object obj)
			throws Exception {
		ApplicationDAO srv = (ApplicationDAO) this.cleanSearch()
				.searchLong("objId", app.getObjId()).getObject();
		if (srv != null) {
			Method m = obj.getClass().getDeclaredMethod("serialize",
					CommandHandler.class);
			m.setAccessible(true);
			m.invoke(obj, this.getCommandHandler());
		} else
			throw new Exception("Application does not exists");
	}

	public HashMap<String, Object> loadRoleMapper(RepositoryFactory rf)
			throws Exception {
		Collection<CommandDAO> command = getCommandHandler().getCommandList();
		return new Processor().executor(rf, command.iterator());
	}

	public ApplicationRoleHandler getApplicationRole() {
		return applicationRole;
	}

	public void setApplicationRole(ApplicationRoleHandler applicationRole) {
		this.applicationRole = applicationRole;
	}

	public CommandHandler getCommandHandler() throws Exception {
		return commandHandler;
	}

}
