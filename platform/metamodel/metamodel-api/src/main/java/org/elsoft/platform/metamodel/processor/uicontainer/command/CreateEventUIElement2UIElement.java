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
import org.elsoft.platform.metamodel.processor.uicontainer.model.PointerElement;
import org.elsoft.platform.metamodel.processor.uicontainer.model.UIElement;

public class CreateEventUIElement2UIElement {
	public static String CREATEEVENTUIELEMENT2UIELEMENT = "org.elsoft.platform.metamodel.objects.command.EventDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {
		EventDAO command = (EventDAO) cmd;

		UIElement element = (UIElement) context.get(command.getDstUUID());

		PointerElement pointer = (PointerElement) context.get(command
				.getParentUUID());

		if ((pointer == null) || (element == null)){
			System.out.println("Parent -> "+command.getParentUUID()+ " Dst -> "+command.getDstUUID());
			return Processor.COMMAND_POSTPONE;
		}

		pointer.addReference(command, context);

		return Processor.COMMAND_COMPLITED;

	}

	public static void save(CommandHandler ch, String parentUUID,
			 EventDAO event) {
		ch.getMode()
				.getElResolver()
				.setValue(SessionContext.COMMAND_TYPE,
						CREATEEVENTUIELEMENT2UIELEMENT);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		EventDAO obj = (EventDAO) dc.createObject();
		obj.setParentUUID(parentUUID);
		obj.setDstUUID(event.getDstUUID());
		obj.setEventType(event.getEventType());
		obj.setCommandExecutor(CreateEventUIElement2UIElement.class.getName());
	}

}
