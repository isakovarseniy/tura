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
package org.elsoft.platform.metamodel;


public enum MetamodelTriggerEventsType {

	CreateEventRallback("rallback"), 
	CreateEventPrevRecord("prevRecord"), 
	CreateEventCommit("commit"), 
	CreateEventSearch("search"), 
	CreateEventQuery("query"), 
	CreateEventFileUpload("fileUploader"),
	CreateEventCreateRecord("create"), 
	CreateEventRemoveRecord("remove"), 
	CreateEventNextRecord("nextRecord"),
	CreateEventUIElement2UIElement("na"),
	CreateEventGetList("GetList"), 
	CreateEventGetTreeRoot("treeRoot"), 
	CreateEventGetCurrentRow("currentRow"), 
	CreateEventGetCurrentRow1("currentRow"), 
	CreateEventGetCurrentRow2("treeCurrentRow"), 
	CreateEventSetCurrentRow("currentRow"),
	CreateEventUIElement2Field("na"), 
	CreateEventGetOptionsList("optionsList"),
	CreateEventUIElement2ServiceMethod("na"),
	CreateEventPreFormTrigger2ServiceMethod("na"),
	CreateEventUIElement2JavaScript("na"),
	CreateEventUIElement2ImageHolder("na"),
	CreateEventViewPort2Controller("na"),
	CreateEventUIElement2SecurityServiceMethod("na"),
	Drugable("na"),
	Dropable("na"),
	
	OnButtonPressed("na"),
	OnValueChanged("na"),
	OnRawSelect("na"),
	OnItemDrop("na");
	
	

    private String method;
    
	MetamodelTriggerEventsType(String method){
		this.method = method;
	}

	public String getMethod(){
		return this.method;
	}
	
}
