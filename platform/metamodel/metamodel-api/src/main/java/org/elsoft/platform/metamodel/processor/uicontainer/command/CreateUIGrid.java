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
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIGridDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.uicontainer.model.ChildrenOwner;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Grid;

public class CreateUIGrid {
	public static String CREATEUIGRID = "org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIGridDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {
		CreateUIGridDAO command = (CreateUIGridDAO) cmd;
		ChildrenOwner own = (ChildrenOwner) context
				.get(command.getParentUUID());
		own.addChild(new Grid(command, context));
		return Processor.COMMAND_COMPLITED;
	}

	public static void save(CommandHandler ch, String parentUUID, Grid grid) {
		ch.getMode().getElResolver()
				.setValue(SessionContext.COMMAND_TYPE, CREATEUIGRID);

		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateUIGridDAO obj = (CreateUIGridDAO) dc.createObject();
		obj.setParentUUID(parentUUID);
		obj.setCss(grid.getCss());
		obj.setCssClass(grid.getCssClass());
		obj.setColumnNumber(grid.getColumnNumber());
		obj.setRowNumber(grid.getRowNumber());
		obj.setCommandExecutor(CreateUIGrid.class.getName());
		obj.setUUID(grid.getUuid());
		
	}
}
