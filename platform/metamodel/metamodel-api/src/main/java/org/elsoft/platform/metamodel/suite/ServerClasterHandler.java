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
import org.elsoft.platform.metamodel.general.CommandDAO;
import org.elsoft.platform.metamodel.general.ContainerDAO;
import org.elsoft.platform.metamodel.general.ELsoftObject;
import org.elsoft.platform.metamodel.general.ServerClasterDAO;
import org.elsoft.platform.metamodel.general.impl.GeneralService;
import org.elsoft.platform.metamodel.general.impl.GeneralService_Service;
import org.elsoft.platform.metamodel.processor.CommandHandler;

@TriggerOutput(expression = SessionContext.RESULT_EXPRESSION)
@Base(clazz = ServerClasterDAO.class)
@VersionField(field = "version")
@IdField(field = "objId")
public class ServerClasterHandler extends
		Handler<ServerClasterHandler, ServerClasterDAO> {

	@Proxy(name = "generalService")
	private GeneralService generalService;
	@InsertTrigger(objectAction = "insert", parameters = @Variables(value = { @Variable(expression = SessionContext.CURRENT_RECORD, type = ELsoftObject.class) }), object = "generalService")
	private Method insert;
	@CreateTrigger(objectAction = "create", parameters = @Variables(value = { @Variable(value = "org.elsoft.platform.metamodel.objects.infrastructure.ServerClasterDAO", type = String.class) }), object = "generalService")
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
			@Variable(value = "org.elsoft.platform.metamodel.objects.infrastructure.ServerClasterDAO", type = String.class) }), object = "generalService")
	private Method search;
	@GetMode
	private Mode<ServerClasterDAO> mode;

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

	@Connection(links = { @Link(field1 = "objId", field2 = "parentId") }, connectedObject = ContainerHandler.class, connectionName = "ServerClaster2Container")
	private ContainerHandler containerHandler;

	@Connection(links = { @Link(field1 = "objId", field2 = "parentId") }, connectedObject = CommandHandler.class, connectionName = "ServerClaster2Command")
	private CommandHandler commandHandler;

	public ServerClasterHandler() {
		GeneralService_Service srv1 = new GeneralService_Service();
		generalService = srv1.getGeneralServiceImplPort();
	}

	public Object getGeneralService() {
		return generalService;
	}

	public Mode<ServerClasterDAO> getMode() {
		return mode;
	}

	public ServerClasterDAO addServerClaster(String scName) {
		ServerClasterDAO obj = getMode().getControl().createObject();
		obj.setClasterName(scName);
		return obj;
	}

	public void saveProperties(ServerClasterDAO server, Object obj)
			throws Exception {
		ServerClasterDAO srv = (ServerClasterDAO) this.clean()
				.searchLong("objId", server.getObjId()).getObject();
		if (srv != null) {
			Method m = server.getClass().getDeclaredMethod("serialize",
					CommandHandler.class);
			m.setAccessible(true);
			m.invoke(server, this.getCommandHandler());
		} else
			throw new Exception("Server claster does not exists");
	}

	protected Collection<CommandDAO> loadProperties(RepositoryFactory rf)
			throws Exception {
		Collection<CommandDAO> command = getCommandHandler().getCommandList();
		Iterator<ContainerDAO> itr = getContainerHandler().getList();
		while (itr.hasNext()) {
			itr.next();
			command.addAll(getContainerHandler().loadProperties(rf));
		}
		return command;
	}

	public ContainerHandler getContainerHandler() {
		return containerHandler;
	}

	public CommandHandler getCommandHandler() throws Exception {
		return commandHandler;
	}

}