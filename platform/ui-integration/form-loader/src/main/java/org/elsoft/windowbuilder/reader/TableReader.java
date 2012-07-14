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
package org.elsoft.windowbuilder.reader;

import java.util.HashMap;
import java.util.List;


import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.general.CreateUIGridDAO;
import org.elsoft.platform.metamodel.general.EventDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventGetList;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIGrid;
import org.elsoft.platform.metamodel.general.CommandDAO;

public class TableReader extends ItemReader {

	private int columnNumber;
	private int rowNumber;
	private String label;

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent,List<CommandDAO> program) throws Exception {

		CreateUIGridDAO createUIGrid = new CreateUIGridDAO();
		createUIGrid.setCommandExecutor(CreateUIGrid.class.getName());
		createUIGrid.setParentUUID(parent.getUuid());
		createUIGrid.setUUID(getUuid());
		createUIGrid.setColumnNumber(columnNumber);
		if (rowNumber == 0)
			rowNumber = 5;
		createUIGrid.setRowNumber(rowNumber);
		createUIGrid.setLabel(label);
		createUIGrid.setCss(getCssStyle());
		createUIGrid.setCssClass(getCssStyleClass());
		
		program.add(createUIGrid);

		EventDAO event = new EventDAO();
		event.setCommandExecutor(CreateEventGetList.class.getName());
		event.setParentUUID(createUIGrid.getUUID());
		event.setDstUUID(getDataControlId());
		event.setEventType(MetamodelTriggerEventsType.CreateEventGetList.name());
		program.add(event);

	}

	protected void inc() {
		columnNumber++;
	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

}
