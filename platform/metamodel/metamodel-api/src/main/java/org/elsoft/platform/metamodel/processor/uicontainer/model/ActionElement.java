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
import org.elsoft.platform.metamodel.general.CreateEventUIElement2ServiceDAO;
import org.elsoft.platform.metamodel.general.EventDAO;

public abstract class ActionElement extends UIElement {
	private String label;
	private DataLink dataSrcLnk;
	private String triggerName;
	private String triggerType;
	private CreateEventUIElement2ServiceDAO uiElement2ServiceEvent;

	public String getTriggerName() {
		return triggerName;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}

	public void setTrigger(EventDAO command, HashMap<String, Object> context)
			throws Exception {
		setDataSrcLnk((DataLink) context.get(command.getDstUUID()));
		this.triggerType = command.getEventType();

		this.triggerName = MetamodelTriggerEventsType.valueOf(
				command.getEventType()).getMethod();
		dataSrcLnk.addTrigger(this.getUiElementType(),
				MetamodelTriggerEventsType.valueOf(command.getEventType())
						.name());
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public DataLink getDataSrcLnk() {
		return dataSrcLnk;
	}

	public void setDataSrcLnk(DataLink dataSrcLnk) {
		this.dataSrcLnk = dataSrcLnk;
	}

	public String getTriggerType() {
		return triggerType;
	}

	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
	}

	public CreateEventUIElement2ServiceDAO getUiElement2ServiceEvent() {
		return uiElement2ServiceEvent;
	}

	public void setUiElement2ServiceEvent(CreateEventUIElement2ServiceDAO uiElement2ServiceEvent) {
		this.uiElement2ServiceEvent = uiElement2ServiceEvent;
	}

}
