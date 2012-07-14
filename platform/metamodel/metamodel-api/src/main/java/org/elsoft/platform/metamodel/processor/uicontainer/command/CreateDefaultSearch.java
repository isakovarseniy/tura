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
import org.elsoft.platform.metamodel.general.CreateDefaultSearchDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DataLink;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DefaultSearch;

public class CreateDefaultSearch {
	public static String CREATEDEFAULTSEARCH = "org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDefaultSearchDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {
		CreateDefaultSearchDAO command = (CreateDefaultSearchDAO) cmd;
		DataLink lnk = (DataLink) context.get(command.getParentUUID());
		lnk.addDefaultSearch(new DefaultSearch(command, rf));

		return Processor.COMMAND_COMPLITED;

	}

	public static void save(CommandHandler ch, String parentUUID, String field,
			String type, String comparator, String value, String expression) {
		ch.getMode().getElResolver()
				.setValue(SessionContext.COMMAND_TYPE, CREATEDEFAULTSEARCH);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateDefaultSearchDAO obj = (CreateDefaultSearchDAO) dc.createObject();
		obj.setParentUUID(parentUUID);
		obj.setColumnName(field);
		obj.setTypeName(type);
		obj.setComparator(comparator);
		obj.setValue(value);
		obj.setExpression(expression);
		obj.setCommandExecutor(CreateDefaultSearch.class.getName());

	}
}
