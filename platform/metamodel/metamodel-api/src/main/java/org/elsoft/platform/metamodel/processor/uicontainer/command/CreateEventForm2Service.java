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
import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateEventUIElement2ServiceDAO;
import org.elsoft.platform.metamodel.objects.type.MethodDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Helper;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.datasource.model.RemoteMethod;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Form;

public class CreateEventForm2Service {
	public static String CREATEEVENTUIELEMENT2SERVICE = "org.elsoft.platform.metamodel.objects.command.form.ui.CreateEventUIElement2ServiceDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {

		CreateEventUIElement2ServiceDAO command = (CreateEventUIElement2ServiceDAO) cmd;
		Form form = (Form) context.get(command.getParentUUID());

		Helper.findType(rf, command.getDomain(), command.getFunctionalDomain(),
				command.getApplication(), command.getTypeName());

		MethodDAO method = rf.getTypeDefinitionHandler().getMethodHandler()
				.cleanSearch().searchString("method", command.getMethodName())
				.getObject();

		RemoteMethod rmi = new RemoteMethod(rf.getTypeDefinitionHandler()
				.getMethodHandler(), method, command.getMethodType());

		rmi.setRefMethod(method.getObjId());
		rmi.setUuid(method.getObjId().toString());
		
		form.addTrigger(rmi,command);
		
		return Processor.COMMAND_COMPLITED;
	}

	public static void save(CommandHandler ch, String  parentUUid, CreateEventUIElement2ServiceDAO  rmi) {
		ch.getMode()
				.getElResolver()
				.setValue(SessionContext.COMMAND_TYPE,
						CREATEEVENTUIELEMENT2SERVICE);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateEventUIElement2ServiceDAO obj = (CreateEventUIElement2ServiceDAO) dc
				.createObject();

		obj.setDomain(rmi.getDomain());
		obj.setFunctionalDomain( rmi.getFunctionalDomain());
		obj.setApplication(rmi.getApplication() );
		obj.setTypeName( rmi.getTypeName());
		obj.setMethodName(rmi.getMethodName());
		obj.setMethodType(rmi.getMethodType());
		obj.setRefMethod(rmi.getRefMethod());
		
		obj.setCommandExecutor(CreateEventForm2Service.class.getName());
		obj.setParentUUID(parentUUid);
		obj.setEventType(MetamodelTriggerEventsType.CreateEventPreFormTrigger2ServiceMethod.name());

	}

}
