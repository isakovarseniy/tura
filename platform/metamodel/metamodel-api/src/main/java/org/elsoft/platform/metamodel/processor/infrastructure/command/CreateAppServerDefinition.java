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
package org.elsoft.platform.metamodel.processor.infrastructure.command;

import java.util.HashMap;

import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.infrastructure.CreateAppServerDefinitionDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.infrastructure.model.AppServerDefinition;

public class CreateAppServerDefinition {
	public static String CREATEAPPSERVERDEFINITION = "org.elsoft.platform.metamodel.objects.command.infrastructure.CreateAppServerDefinitionDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {
		CreateAppServerDefinitionDAO command = (CreateAppServerDefinitionDAO) cmd;

		context.put(command.getPropertyName(),new AppServerDefinition(command));

		return Processor.COMMAND_COMPLITED;
	}

	public static void save(CommandHandler ch, String parentUUID,
			CreateAppServerDefinitionDAO appProperties) {
		ch.getMode().getElResolver()
				.setValue(SessionContext.COMMAND_TYPE, CREATEAPPSERVERDEFINITION);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateAppServerDefinitionDAO obj = (CreateAppServerDefinitionDAO) dc.createObject();
		obj.setUUID(appProperties.getUUID());
		obj.setParentUUID(parentUUID);
		obj.setHost(appProperties.getHost());
		obj.setHttpPort(appProperties.getHttpPort());
		obj.setPropertyName(appProperties.getPropertyName());
		obj.setManagementPort(appProperties.getManagementPort());
		obj.setManagementTool(appProperties.getManagementTool());
		obj.setCommandExecutor(CreateAppServerDefinition.class.getName());
	}

}
