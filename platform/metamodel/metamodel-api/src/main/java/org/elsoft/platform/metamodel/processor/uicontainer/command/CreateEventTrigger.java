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
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.uicontainer.model.ActionElement;

public class CreateEventTrigger {
	public static String CREATEEVENTTRIGGER = "org.elsoft.platform.metamodel.objects.command.EventDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) throws Exception {
		EventDAO command = (EventDAO) cmd;

		ActionElement element = (ActionElement) context.get(command
				.getParentUUID());

		element.setTrigger(command, context);

		return Processor.COMMAND_COMPLITED;

	}

	public static void save(CommandHandler ch, String parentUUID,
			ActionElement element) {
		ch.getMode().getElResolver()
				.setValue(SessionContext.COMMAND_TYPE, CREATEEVENTTRIGGER);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		EventDAO obj = (EventDAO) dc.createObject();
		obj.setParentUUID(parentUUID);
		obj.setDstUUID(element.getDataSrcLnk().getUuid());
		obj.setEventType(element.getTriggerType());
		obj.setCommandExecutor(CreateEventTrigger.class.getName());
	}

}
