/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.uuiclient.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.uuiclient.rest.client.commands.ContextRef;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;
import org.tura.platform.uuiclient.rest.events.EventProcessor;

public class RequestProcessor {
	
	@Inject
	ELResolver elResolver;
	
	private transient Logger logger = Logger.getLogger(RequestProcessor.class.getName());
	
	
	@Inject
	ResponseState responseState;
	
	@SuppressWarnings("unchecked")
	public DataUpdateResponse process( DataUpdateRequest request ) throws Exception {
		
		ContextRef ref = responseState.findContextRef(request.getFormSelector());
		Object[] array = null;
		try {
		   array = restoreObjects(request,responseState);
		}catch( Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
			responseState.addFatalValidationError(e);
			return responseState.getResponse();
		}
		if( responseState.isValidationError()){
			return responseState.getResponse();
		}
		
		try {
			
//			responseState.startTransaction(request.getFormSelector()); 
			
			applyUpdate((List<UuiElement>) array[0]);

			fireEvents((List<EventDescription>) array[1]);

			processUpdateElements ( request, responseState ,  ref);
			
//Cannot squeeze transactions (ghost objects disappear)
//		    responseState.squezeTransactions();
			
			return responseState.getResponse();
			
		}catch( Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
			responseState.addFatalError(e);
//			responseState.rollBack();
			return responseState.getResponse();
		}
	}

	
	
	private void fireEvents(List<EventDescription>eventsToFire ) {
		Map < String, EventDescription> hash = new HashMap<String, EventDescription>();

		for (  EventDescription event : eventsToFire  ) {
			hash.put(event.getId(),event );
		}
		for (  EventDescription event : hash.values()  ) {
			EventProcessor eventProcessor =  EventRegistry.findProcessor(event.getEvent());
			eventProcessor.execute(event,elResolver);
		}
		
	}


	@SuppressWarnings("unchecked")
	private Object[] restoreObjects(DataUpdateRequest request, ResponseState responseState) throws Exception{
		List<Object> objects = request.getProcessElements();
		List<UuiElement> restoredObjects = new ArrayList<UuiElement>();
		List<EventDescription> eventsToFire = new ArrayList<EventDescription>();
		
		for (Object obj : objects) {
			Map<String, Object> map = (Map<String, Object>) obj;
			if (map == null) {
				continue;
			}

			String className = (String) map.get("clazz");
			Class<UuiElement> clazz = (Class<UuiElement>) Class.forName(className);
			UuiElement uie = clazz.getDeclaredConstructor().newInstance();
			
			restoredObjects.add( (UuiElement) uie.restoreContext(map ,request ,responseState ,eventsToFire));
		}

		return new Object[] {restoredObjects, eventsToFire};
	}
	
	
	private void applyUpdate( List<UuiElement> restoredObjects) throws Exception {
		for (UuiElement uie : restoredObjects) {
			 uie.applyContext(elResolver, responseState);
		}
	}
	
	private void processUpdateElements( DataUpdateRequest request, ResponseState responseState , ContextRef ref) throws Exception {
		for ( String uid :  request.getTopUpdateElementIds() ) {
			UuiElement  elememt = ref.getModel(uid);
			elememt.initContext(elResolver,responseState);
			responseState.getResponse().getUpdateElements().add(elememt);
		}
		
	}
	
}
