package org.tura.metamodel.sirius.properties.selections.events;

import java.util.ArrayList;
import java.util.List;

public class Bus {
	
	private static Bus instance;
	private List<EventListener> listeners = new ArrayList<EventListener>();
	
	private Bus(){
		
	}
	
	public static Bus getInstance(){
		if ( instance == null){
			 instance = new Bus();
		}
		return instance;
	}

	
	public void addEventListner( EventListener listener){
		listeners.add(listener);
	}

	public void removeEventListner( EventListener listener){
		listeners.remove(listener);
	}
	
	
	public void notify(Event event){
		for (EventListener listener : listeners){
			listener.handleEvent(event);
		}
	}
}
