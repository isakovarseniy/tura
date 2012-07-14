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
package org.elsoft.platform.metamodel.processor.uicontainer.model;

import java.util.ArrayList;
import java.util.HashMap;

import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.general.CreateUIGridDAO;
import org.elsoft.platform.metamodel.general.EventDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventGetList;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIGrid;

public class Grid extends ExternalIterator implements ChildrenOwner {
	private Integer columnNumber;
	private Integer rowNumber;

	public Grid(CreateUIGridDAO command, HashMap<String, Object> context) {
		this.setCss(command.getCss());
		this.setCssClass(command.getCssClass());
		setUuid(command.getUUID());
		context.put(command.getUUID(), this);
		setColumnNumber(command.getColumnNumber());
		setRowNumber(command.getRowNumber());
		setLabel(command.getLabel());
	}


	public Integer getColumnNumber() {
		return columnNumber;
	}

	public void setColumnNumber(Integer columnNumber) {
		this.columnNumber = columnNumber;
	}

	public Integer getRowNumber() {
		return rowNumber;
	}

	public void setRowNumber(Integer rowNumber) {
		this.rowNumber = rowNumber;
	}

	public ArrayList<UIElement> getChildrens() {
		return super.getChildrens();
	}

	public void addChild(UIElement child) {
		child.setParentUuid(getUuid());
		this.getChildrens().add(child);
	}

	public void setGetListEvent(EventDAO command,
			HashMap<String, Object> context) throws Exception {
		setDataSrcLnk((DataLink) context.get(command.getDstUUID()));
		this.getDataSrcLnk().addTrigger(this.getUiElementType(),
				MetamodelTriggerEventsType.valueOf(command.getEventType()).name());

		
		this.getDataSrcLnk().addTrigger(this.getUiElementType(),
				MetamodelTriggerEventsType.CreateEventGetCurrentRow.name());

		this.getDataSrcLnk().addTrigger(this.getUiElementType(),
				MetamodelTriggerEventsType.CreateEventGetCurrentRow1.name());

		
		this.getDataSrcLnk().addTrigger(this.getUiElementType(),
				MetamodelTriggerEventsType.CreateEventNextRecord.name());

		this.getDataSrcLnk().addTrigger(this.getUiElementType(),
				MetamodelTriggerEventsType.CreateEventPrevRecord.name());
		
		
	}

	@Override
	protected void serialize(CommandHandler ch) throws Exception {
		CreateUIGrid.save(ch, getParentUuid(), this);
		CreateEventGetList.save(ch, getUuid(), this);
		super.serialize(ch);
	}


	@Override
	public String getUiElementType() {
		return "Grid";
	}

}
