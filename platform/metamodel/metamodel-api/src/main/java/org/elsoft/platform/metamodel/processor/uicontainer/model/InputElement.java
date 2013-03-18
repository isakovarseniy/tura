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

import java.util.HashMap;

import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.datasource.model.Field;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventGetCurrentRow;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2Field;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateSecurityTrigger;

public abstract class InputElement extends UIElement {

	private Field dataSrcField;
	private DataLink dataSrcLnk;
	private String label;
	private String required;

	
	public Field getDataSrcField() {
		return dataSrcField;
	}

	public void setDataSrcField(Field dataSrcField) {
		this.dataSrcField = dataSrcField;
	}

	public DataLink getDataSrcLnk() {
		return dataSrcLnk;
	}

	public void setDataSrcLnk(DataLink dataSrcLnk) {
		this.dataSrcLnk = dataSrcLnk;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getRequired() {
		return required;
	}

	public void setRequired(String required) {
		this.required = required;
	}

	public void setUIElement2FieldEvent(EventDAO command,
			HashMap<String, Object> context) {
		setDataSrcField((Field) context.get(command.getDstUUID()));
	}

	public void setUIElement2DataLinkEvent(EventDAO command,
			HashMap<String, Object> context) throws Exception {
		DataLink dataLink = (DataLink) context.get(command.getDstUUID());
		dataLink.addTrigger(this.getUiElementType(), MetamodelTriggerEventsType.valueOf(command.getEventType()).name());
		setDataSrcLnk(dataLink);
		
	}

	@Override
	protected void serialize(CommandHandler ch) throws Exception {
		if (this.dataSrcLnk != null)
			CreateEventGetCurrentRow.save(ch, getUuid(), this);		
        if (this.dataSrcField != null)
        	CreateEventUIElement2Field.save(ch, getUuid(), this);
        if (getReadonly() != null)
			CreateSecurityTrigger.save(ch, getUuid(), getReadonly() );
        
		super.serialize(ch);  
	}


}
