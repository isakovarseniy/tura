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
import org.elsoft.platform.metamodel.objects.command.infrastructure.CreateDatabaseDefinitionDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.infrastructure.model.DatabaseDefinition;

public class CreateDatabaseDefinition {
	public static String CREATEDATABASEDEFINITION = "org.elsoft.platform.metamodel.objects.command.infrastructure.CreateDatabaseDefinitionDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {
		CreateDatabaseDefinitionDAO command = (CreateDatabaseDefinitionDAO) cmd;

		context.put(command.getPropertyName(),new DatabaseDefinition(command));
		return Processor.COMMAND_COMPLITED;

	}

	public static void save(CommandHandler ch, String parentUUID,
			CreateDatabaseDefinitionDAO dbProperties) {
		ch.getMode().getElResolver()
				.setValue(SessionContext.COMMAND_TYPE, CREATEDATABASEDEFINITION);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateDatabaseDefinitionDAO obj = (CreateDatabaseDefinitionDAO) dc.createObject();
		obj.setUUID(dbProperties.getUUID());
		obj.setParentUUID(parentUUID);
		obj.setHost(dbProperties.getHost());
		obj.setPort(dbProperties.getPort());
		obj.setPropertyName(dbProperties.getPropertyName());
		obj.setDatabaseType(dbProperties.getDatabaseType());
		obj.setDatabaseSchema(dbProperties.getDatabaseSchema());
		obj.setCommandExecutor(CreateDatabaseDefinition.class.getName());
	}

}
