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
package org.elsoft.platform.metamodel.processor.uicontainer.command;

import java.util.HashMap;

import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.general.CommandDAO;
import org.elsoft.platform.metamodel.general.CreateDataLink2ServiceMethodDAO;
import org.elsoft.platform.metamodel.general.MethodDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Helper;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.datasource.model.RemoteMethod;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DataLink;

public class CreateDataLink2ServiceMethod {
	public static String CREATEDATALINK2SERVICEMETHOD = "org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2ServiceMethodDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {
		CreateDataLink2ServiceMethodDAO command = (CreateDataLink2ServiceMethodDAO) cmd;
		DataLink lnk = (DataLink) context.get(command.getParentUUID());

		Helper.findType(rf, command.getDomain(),
				command.getFunctionalDomain(), command.getApplication(),
				command.getTypeName());

		MethodDAO method = rf.getTypeDefinitionHandler().getMethodHandler()
				.clean().searchString("method", command.getMethodName()).getObject();

		
		
		RemoteMethod rmi = new RemoteMethod(rf.getTypeDefinitionHandler()
				.getMethodHandler(), method,command.getMethodType());
		
		rmi.setRefMethod(command.getRefMethod());
		rmi.setUuid(command.getRefMethod().toString());
		lnk.addRemoteMethod(rmi);

		return Processor.COMMAND_COMPLITED;

	}

	public static void save(CommandHandler ch, String domain,
			String functionalDomain, String application, String typeName, RemoteMethod rmi) {

		ch.getMode()
				.getElResolver()
				.setValue(SessionContext.COMMAND_TYPE,
						CREATEDATALINK2SERVICEMETHOD);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateDataLink2ServiceMethodDAO obj = (CreateDataLink2ServiceMethodDAO) dc
				.createObject();

		obj.setDomain(domain);
		obj.setFunctionalDomain(functionalDomain);
		obj.setApplication(application);
		obj.setTypeName(typeName);
		obj.setRefMethod(rmi.getRefMethod());
		obj.setParentUUID(rmi.getParentUuid());
		obj.setMethodName(rmi.getMethodName());
		obj.setMethodType(rmi.getMethodType());
		obj.setCommandExecutor(CreateDataLink2ServiceMethod.class
				.getName());
	}

}
