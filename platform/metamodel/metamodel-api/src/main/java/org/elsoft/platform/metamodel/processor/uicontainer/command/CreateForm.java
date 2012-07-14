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
import org.elsoft.platform.metamodel.general.CreateFormDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Form;

public class CreateForm {
	public static String CREATEFORM = "org.elsoft.platform.metamodel.objects.command.form.CreateFormDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {
		CreateFormDAO command = (CreateFormDAO) cmd;


		Form frm = new Form(command,context);
		context.put(frm.getUuid(),frm);
		context.put(frm.getName(),frm);
		
		return Processor.COMMAND_COMPLITED;

	}

	public static void save(CommandHandler ch, String parentUUID,
			Form frm) {
		ch.getMode().getElResolver()
				.setValue(SessionContext.COMMAND_TYPE, CREATEFORM);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateFormDAO obj = (CreateFormDAO) dc.createObject();
		obj.setUUID(frm.getUuid());
		obj.setParentUUID(parentUUID);
		obj.setFormName(frm.getName());
		obj.setCommandExecutor(CreateForm.class.getName());
		obj.setDomain(frm.getDomain());
		obj.setFunctionalDomain(frm.getFunctionalDomain());
		obj.setApplication(frm.getApplication());
	}

}
