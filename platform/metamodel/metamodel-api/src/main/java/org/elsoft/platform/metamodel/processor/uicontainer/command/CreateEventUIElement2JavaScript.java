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
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateEventUIElement2JavaScriptDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.uicontainer.model.UIElement;

public class CreateEventUIElement2JavaScript {
	public static String CREATEEVENTUIELEMENT2JAVASCRIPT = "org.elsoft.platform.metamodel.objects.command.form.ui.CreateEventUIElement2JavaScriptDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {

		CreateEventUIElement2JavaScriptDAO command = (CreateEventUIElement2JavaScriptDAO) cmd;
		UIElement element = (UIElement) context.get(command.getParentUUID());
		element.addScriptTrigger(command.getTriggerType(),
				command.getJavaScript());

		return Processor.COMMAND_COMPLITED;
	}

	public static void save(CommandHandler ch, String parentUUID, String triggerName,
			String triggerBody) {

		ch.getMode()
				.getElResolver()
				.setValue(SessionContext.COMMAND_TYPE,
						CREATEEVENTUIELEMENT2JAVASCRIPT);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateEventUIElement2JavaScriptDAO obj = (CreateEventUIElement2JavaScriptDAO) dc
				.createObject();

		obj.setJavaScript(triggerBody);
		obj.setTriggerType(triggerName);
		obj.setCommandExecutor(CreateEventUIElement2JavaScript.class
				.getName());
		obj.setParentUUID(parentUUID);
		obj.setEventType(MetamodelTriggerEventsType.CreateEventUIElement2JavaScript
				.name());
	}
}
