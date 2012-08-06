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
import java.util.Iterator;

import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUILovDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2UIElement;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUILov;

public class Lov extends OptionsInputElement  implements PointerElement{


	private ArrayList<EventDAO> updateOnValueChanged = new ArrayList<EventDAO> ();
	

	public Lov(CreateUILovDAO command,HashMap<String, Object> context){
		this.setCss(command.getCss());
		this.setCssClass(command.getCssClass());
		this.setUuid(command.getUUID());
		setLabel(command.getLabel());
		context.put(command.getUUID(), this);
	}

	public ArrayList<EventDAO> getUpdateOnValueChanged() {
		return updateOnValueChanged;
	}
	
	@Override
	protected void serialize(CommandHandler ch) throws Exception {
		CreateUILov.save(ch, getParentUuid(), this);		
        super.serialize(ch);  

        Iterator<EventDAO> itr = updateOnValueChanged.iterator();
		while (itr.hasNext())
			CreateEventUIElement2UIElement
					.save(ch, getUuid(), itr.next());
       
	}

	@Override
	public String getUiElementType() {
		return "Lov";
	}

	@Override
	public void addReference(EventDAO event, HashMap<String, Object> context) {
        if (event.getEventType().equals(MetamodelTriggerEventsType.OnValueChanged.name())){
        	updateOnValueChanged.add(event);
        }
	}

	
}
