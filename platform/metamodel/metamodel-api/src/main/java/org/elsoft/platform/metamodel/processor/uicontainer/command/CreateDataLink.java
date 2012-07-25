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
import org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDataLinkDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DataLink;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Form;

public class CreateDataLink {
	public static String CREATEDATALINK = "org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDataLinkDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {
		CreateDataLinkDAO command = (CreateDataLinkDAO) cmd;

		Form frm = (Form) context.get(command.getParentUUID());

		DataLink lnk = new DataLink(command,context);
		frm.addDataLink(lnk);

		return Processor.COMMAND_COMPLITED;
	}

	public static void save(CommandHandler ch, String parentUUID,
			String objectUUID, String name) {
		ch.getMode().getElResolver()
				.setValue(SessionContext.COMMAND_TYPE, CREATEDATALINK);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateDataLinkDAO obj = (CreateDataLinkDAO) dc.createObject();
		obj.setUUID(objectUUID);
		obj.setParentUUID(parentUUID);
		obj.setDataLinkName(name);
		obj.setCommandExecutor(CreateDataLink.class.getName());
	}
}
