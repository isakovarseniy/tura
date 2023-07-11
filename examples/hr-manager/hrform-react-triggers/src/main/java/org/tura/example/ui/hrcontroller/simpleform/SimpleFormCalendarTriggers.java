/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
 */

package org.tura.example.ui.hrcontroller.simpleform;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.uuiclient.model.FullCalendarModel;
import org.tura.platform.uuiclient.model.FullCalendarModel.CalendarEvent;
import org.tura.platform.uuiclient.model.FullCalendarModel.CalendarOptions;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.model.FullCalendarTriggers;

public class SimpleFormCalendarTriggers implements FullCalendarTriggers , Serializable{

	private static final long serialVersionUID = -8471313564395077931L;
	
	public SimpleFormCalendarTriggers(ELResolver elResolver){
	}
	
	
	@Override
	public void  load(FullCalendarModel model) throws TuraException {
		
		List<CalendarEvent> events = new ArrayList<>();
		CalendarOptions options =  model.getOptions();
		if ( options == null) {
			options = model. new CalendarOptions();
		}
		
		Calendar c1 = Calendar.getInstance();

		CalendarEvent ev1 = model .new CalendarEvent();
		c1.add(Calendar.HOUR, 6);
		ev1.setStart(c1.getTime());
		c1.add(Calendar.HOUR, 3);
		ev1.setEnd(c1.getTime());
		ev1.setTitle("Title 1");
		ev1.setEditable(true);
		ev1.setOverlap(false);
		ev1.setId("1");

		events.add(ev1);
		
		CalendarEvent ev2 = model .new CalendarEvent();
		c1.add(Calendar.DAY_OF_MONTH, 2);
		ev2.setStart(c1.getTime());
		c1.add(Calendar.DAY_OF_MONTH,3);
		ev2.setEnd(c1.getTime());
		ev2.setOverlap(false);
		ev2.setDisplay("background");
		ev2.setGroupId("testGroup");
		ev2.setAllDay(true);
		
		events.add(ev2);


		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		options.setDefaultDate(calendar.getTime() );
		
		model.setEvents(events);
		model.setOptions(options);
	}


	@Override
	public void onDataClick(FullCalendarModel model,EventDescription event) throws TuraException {
		
	}


	@Override
	public void onDrop(FullCalendarModel model,EventDescription event) throws TuraException {
		
	}

}
