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
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateEventViewPort2ControllerDAO;
import org.elsoft.platform.metamodel.objects.type.MethodDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Helper;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.datasource.model.RemoteMethod;
import org.elsoft.platform.metamodel.processor.uicontainer.model.ViewPort;

public class CreateEventViewPort2Controller {
	public static String CREATEEVENTVIEWPORT2CONTROLLER = "org.elsoft.platform.metamodel.objects.command.form.ui.CreateEventViewPort2ControllerDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {

		CreateEventViewPort2ControllerDAO command = (CreateEventViewPort2ControllerDAO) cmd;
		ViewPort element = (ViewPort) context.get(command.getParentUUID());

		Helper.findType(rf, command.getDomain(), command.getFunctionalDomain(),
				command.getApplication(), command.getTypeName());

		MethodDAO method = rf.getTypeDefinitionHandler().getMethodHandler()
				.cleanSearch().searchString("method", command.getMethodName())
				.getObject();

		RemoteMethod rmi = new RemoteMethod(rf.getTypeDefinitionHandler()
				.getMethodHandler(), method, element.getUiElementType()
				+ command.getMethodType());

		rmi.setRefMethod(method.getObjId());
		rmi.setUuid(method.getObjId().toString());
		element.setRmi(rmi);
		element.setVewPortController(command);
		
		return Processor.COMMAND_COMPLITED;
	}

	public static void save(CommandHandler ch, ViewPort element) {

		ch.getMode()
				.getElResolver()
				.setValue(SessionContext.COMMAND_TYPE,
						CREATEEVENTVIEWPORT2CONTROLLER);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateEventViewPort2ControllerDAO obj = (CreateEventViewPort2ControllerDAO) dc
				.createObject();

		obj.setDomain(element.getVewPortController().getDomain());
		obj.setFunctionalDomain(element.getVewPortController()
				.getFunctionalDomain());
		obj.setApplication(element.getVewPortController().getApplication());
		obj.setTypeName(element.getVewPortController().getTypeName());
		obj.setMethodName(element.getVewPortController().getMethodName());
		obj.setMethodType(element.getVewPortController().getMethodType());
		obj.setRefMethod(element.getVewPortController().getRefMethod());

		obj.setCommandExecutor(CreateEventViewPort2Controller.class
				.getName());
		obj.setParentUUID(element.getVewPortController().getParentUUID());
		obj.setDstUUID(element.getVewPortController().getDstUUID());
		obj.setEventType(MetamodelTriggerEventsType.CreateEventViewPort2Controller
				.name());
	}

}
