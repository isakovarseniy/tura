/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

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
