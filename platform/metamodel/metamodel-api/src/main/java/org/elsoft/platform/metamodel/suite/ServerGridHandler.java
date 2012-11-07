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
import java.util.Iterator;

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
import org.elsoft.platform.metamodel.objects.ELsoftObject;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.infrastructure.ServerClasterDAO;
import org.elsoft.platform.metamodel.objects.infrastructure.ServerGridDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.persistence.ELsoftJPAEntityService;
import org.elsoft.platform.persistence.TransactionManagerImpl;

@TriggerOutput(expression = SessionContext.RESULT_EXPRESSION)
@Base(clazz = ServerGridDAO.class)
@VersionField(field = "version")
@IdField(field = "objId")
public class ServerGridHandler extends
		Handler<ServerGridHandler, ServerGridDAO> {

	@Proxy(name = "generalService")
	private ELsoftJPAEntityService generalService;
	@InsertTrigger(objectAction = "insert", parameters = @Variables(value = { @Variable(expression = SessionContext.CURRENT_RECORD, type = ELsoftObject.class) }), object = "generalService")
	private Method insert;
	@CreateTrigger(objectAction = "create", parameters = @Variables(value = { @Variable(value = "org.elsoft.platform.metamodel.objects.infrastructure.ServerGridDAO", type = String.class) }), object = "generalService")
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
			@Variable(value = "org.elsoft.platform.metamodel.objects.infrastructure.ServerGridDAO", type = String.class) }), object = "generalService")
	private Method search;
	@GetMode
	private Mode<ServerGridDAO> mode;
	@Connection(links = { @Link(field1 = "objId", field2 = "parentId") }, connectedObject = ServerClasterHandler.class, connectionName = "ServerGrid2ServerClaster")
	private ServerClasterHandler serverClasterHandler;
	@Connection(links = { @Link(field1 = "objId", field2 = "parentId") }, connectedObject = CommandHandler.class, connectionName = "ServerGrid2Command")
	private CommandHandler commandHandler;

	public ServerGridHandler() {
	}

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

	public Object getGeneralService() {
		if (generalService == null)
		    generalService = new ELsoftJPAEntityService(TransactionManagerImpl.getCurrentInstance());
		return generalService;
	}

	public Mode<ServerGridDAO> getMode() {
		return mode;
	}

	public ServerGridDAO addServerGrid(String sgName) {
		ServerGridDAO obj = getMode().getControl().createObject();
		obj.setGridName(sgName);
		return obj;
	}

	protected Collection<CommandDAO> loadProperties(RepositoryFactory rf)
			throws Exception {
		Collection<CommandDAO> command = getCommandHandler().getCommandList();
		Iterator<ServerClasterDAO> itr = getServerClasterHandler().getList();
		while (itr.hasNext()) {
			itr.next();
			command.addAll(getServerClasterHandler().loadProperties(rf));
		}
		return command;
	}

	public void saveProperties(ServerGridDAO server, Object obj)
			throws Exception {
		ServerGridDAO srv = (ServerGridDAO) this.cleanSearch()
				.searchLong("objId", server.getObjId()).getObject();
		if (srv != null) {
			Method m = server.getClass().getDeclaredMethod("serialize",
					CommandHandler.class);
			m.setAccessible(true);
			m.invoke(server, this.getCommandHandler());
		} else
			throw new Exception("Server grid does not exists");
	}

	public ServerClasterHandler getServerClasterHandler() {
		return serverClasterHandler;
	}

	public CommandHandler getCommandHandler() throws Exception {
		return commandHandler;
	}

}
