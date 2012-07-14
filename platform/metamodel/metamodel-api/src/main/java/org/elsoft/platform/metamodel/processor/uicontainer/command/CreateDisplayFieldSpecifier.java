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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.general.CommandDAO;
import org.elsoft.platform.metamodel.general.CreateOptionDescriptorDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DataLink;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DisplayField;
import org.elsoft.platform.metamodel.processor.uicontainer.model.OptionsInputElement;

public class CreateDisplayFieldSpecifier {

	public static String CREATEDISPLAYFIELDSPECIFIER = "org.elsoft.platform.metamodel.objects.command.form.ui.CreateOptionDescriptorDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) throws Exception {
		CreateOptionDescriptorDAO command = (CreateOptionDescriptorDAO) cmd;

		OptionsInputElement element = (OptionsInputElement) context.get(command
				.getParentUUID());

		if ((element == null) || (element == null)
				|| (element.getOptionsSrcLnk() == null))
			return Processor.COMMAND_POSTPONE;

		element.addDisplayField(command.getValue1(), command.getValue2());

		DataLink optionLink = element.getOptionsSrcLnk();
		String eventname = optionLink.getMapper().map(
				element.getUiElementType(),
				MetamodelTriggerEventsType.CreateEventGetOptionsList.name());

		@SuppressWarnings("unchecked")
		List<DisplayField> ls = (List<DisplayField>) optionLink
				.getTriggerPropery().get(eventname + "_DisplayField");
		if (ls == null) {
			ls = new ArrayList<DisplayField>();
			optionLink.getTriggerPropery().put(eventname + "_DisplayField", ls);
		}
		ls.add(new DisplayField(command.getValue1(), command.getValue2()));

		return Processor.COMMAND_COMPLITED;

	}

	public static void save(CommandHandler ch, String parentUUID,
			DisplayField displayField) {
		ch.getMode()
				.getElResolver()
				.setValue(SessionContext.COMMAND_TYPE,
						CREATEDISPLAYFIELDSPECIFIER);

		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateOptionDescriptorDAO obj = (CreateOptionDescriptorDAO) dc
				.createObject();
		obj.setParentUUID(parentUUID);
		obj.setValue1(displayField.getDisplayLabel());
		obj.setValue2(displayField.getDisplayExpression());
		obj.setCommandExecutor(CreateDisplayFieldSpecifier.class.getName());
	}

}
