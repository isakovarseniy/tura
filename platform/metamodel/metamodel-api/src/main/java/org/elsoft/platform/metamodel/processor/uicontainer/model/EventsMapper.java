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

import org.apache.commons.collections.map.MultiKeyMap;

public class EventsMapper {

	private MultiKeyMap matrix = new MultiKeyMap();
	
	public EventsMapper(){
		matrix.put("Button", "CreateEventCommit","ButtonCommit");
		matrix.put("Button", "CreateEventCreateRecord","ButtonCreateRecord");
		matrix.put("Button", "CreateEventNextRecord","ButtonNextRow");
		matrix.put("Button", "CreateEventPrevRecord","ButtonPrevRow");
		matrix.put("Button", "CreateEventQuery","ButtonQuery");
		matrix.put("Button", "CreateEventRallback","ButtonRallback");
		matrix.put("Button", "CreateEventRemoveRecord","ButtonRemoveRecord");
		matrix.put("Button", "CreateEventSearch","ButtonSearch");
		matrix.put("Button", "CreateEventGetCurrentRow","CommonGetCurrentRow");
		matrix.put("DropDownList", "CreateEventGetOptionsList","DropDownListGetOptionsList");
		matrix.put("DropDownList", "CreateEventGetCurrentRow","CommonGetCurrentRow");
		matrix.put("Grid", "CreateEventGetCurrentRow","GridGetCurrentRow");
		matrix.put("Grid", "CreateEventGetCurrentRow1","CommonGetCurrentRow");
		matrix.put("Grid", "CreateEventGetList","GridGetList");
		matrix.put("Grid", "CreateEventNextRecord","GridNextRow");
		matrix.put("Grid", "CreateEventPrevRecord","GridPrevRow");
		matrix.put("InputText", "CreateEventGetCurrentRow","CommonGetCurrentRow");
		matrix.put("OutputText", "CreateEventGetCurrentRow","CommonGetCurrentRow");
		matrix.put("CheckBox", "CreateEventGetCurrentRow","CommonGetCurrentRow");
		matrix.put("Lov", "CreateEventGetOptionsList","LovGetOptionsList");
		matrix.put("Lov", "CreateEventGetCurrentRow","CommonGetCurrentRow");
		matrix.put("Tree", "CreateEventGetTreeRoot","TreeGetTreeRoot");
		matrix.put("Tree", "CreateEventGetCurrentRow2","TreeGetCurrentRow");
		matrix.put("FileUpLoader", "CreateEventFileUpload","FileUpLoaderLoadFile");
		matrix.put("FileUpLoader", "CreateEventGetCurrentRow","CommonGetCurrentRow");

		
	}
	public String map (String element, String event) throws Exception{
		String result = (String) this.matrix.get(element, event);
		if (result == null)
			throw new Exception ("Mapping has not been found <"+element+"---- "+event+" > ");
		return result;
	}
	
	
}
