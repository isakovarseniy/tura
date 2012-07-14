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
import org.elsoft.platform.metamodel.general.CreateDefaultOrderByDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DataLink;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DefaultOrderBy;

public class CreateDefaultOrderBy {
	public static String CREATEDEFAULTORDERBY = "org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDefaultOrderByDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {
		CreateDefaultOrderByDAO command = (CreateDefaultOrderByDAO) cmd;
		DataLink lnk = (DataLink) context.get(command.getParentUUID());
		lnk.addDefaultOrderBy(new DefaultOrderBy(command));

		return Processor.COMMAND_COMPLITED;

	}

	public static void save(CommandHandler ch, String parentUUID,
			 DefaultOrderBy orderBy ) {
		ch.getMode().getElResolver()
				.setValue(SessionContext.COMMAND_TYPE, CREATEDEFAULTORDERBY);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateDefaultOrderByDAO obj = (CreateDefaultOrderByDAO) dc.createObject();

		obj.setColumnName(orderBy.getField());
		obj.setParentUUID(parentUUID);
		obj.setOrder(orderBy.getOrder());
		obj.setCommandExecutor(CreateDefaultOrderBy.class.getName());
	}
}
