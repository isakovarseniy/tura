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
import org.elsoft.platform.metamodel.general.CreateDataLink2BusinessObjectMethodDAO;
import org.elsoft.platform.metamodel.general.MethodDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Helper;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.datasource.model.RemoteMethod;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DataLink;
import org.elsoft.platform.metamodel.types.BusinessObjectHandler;

public class CreateDataLink2BusinessObjectMethod {

	public static String CREATEDATALINK2BUSINESSOBJECTMETHOD = "org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2BusinessObjectMethodDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {
		CreateDataLink2BusinessObjectMethodDAO command = (CreateDataLink2BusinessObjectMethodDAO) cmd;
		DataLink lnk = (DataLink) context.get(command.getParentUUID());

		Helper.findBusinessObject(rf, command.getDomain(),
				command.getFunctionalDomain(), command.getBusinessObjectName());

		BusinessObjectHandler boh = rf.getRoot().getFunctionalDomain()
				.getBusinessObjectsHandler();
		boh.getMethodReferenceHandler().clean()
				.searchLong("objId", command.getRefMethod()).getObject();

		MethodDAO method = boh.getMethodReferenceHandler().getMethodHandler()
				.getObject();

		RemoteMethod rmi = new RemoteMethod(boh.getMethodReferenceHandler()
				.getMethodHandler(), method, command.getMethodType());

		rmi.setRefMethod(command.getRefMethod());
		rmi.setUuid(command.getRefMethod().toString());
		lnk.addRemoteBusinessMethod(rmi);
		context.put(rmi.getUuid(), rmi);

		return Processor.COMMAND_COMPLITED;

	}

	public static void save(CommandHandler ch, String domain,
			String functionalDomain, String businessObjectName, RemoteMethod rmi) {
		ch.getMode()
				.getElResolver()
				.setValue(SessionContext.COMMAND_TYPE,
						CREATEDATALINK2BUSINESSOBJECTMETHOD);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateDataLink2BusinessObjectMethodDAO obj = (CreateDataLink2BusinessObjectMethodDAO) dc
				.createObject();

		obj.setDomain(domain);
		obj.setFunctionalDomain(functionalDomain);
		obj.setBusinessObjectName(businessObjectName);
		obj.setRefMethod(rmi.getRefMethod());
		obj.setMethodType(rmi.getMethodType());
		obj.setParentUUID(rmi.getParentUuid());
		obj.setCommandExecutor(CreateDataLink2BusinessObjectMethod.class
				.getName());
	}

}
