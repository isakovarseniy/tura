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
package org.tura.platform.datacontrol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.tura.platform.datacontrol.command.Command;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.event.ControlRallbackEvent;
import org.tura.platform.datacontrol.pool.PoolElement;

public abstract class CommandStack {


	private ArrayList<PoolElement> poolElement = new ArrayList<>();
	private ArrayList<Command> transaction = new ArrayList<Command>();
	private HashMap<String, DataControl<?>> gostTracking = new HashMap<>();
	private long id = 0;
	
	public void addTransaction(Command cmd) throws TuraException {
		this.transaction.add(cmd);
	}
	
	public void addGostTrackingDataControl(DataControl<?> dc) throws TuraException {
		this.gostTracking.put(dc.getId(),dc);
	}
	
	
	public void rallbackCommand() throws Exception {

       HashMap <String, DataControl< ?>> hash = new HashMap<>();		
		
		for ( Command cmd :  transaction ) {
			hash.put(cmd.getDatacontrol().getId(), cmd.getDatacontrol());
		}
		
		for ( String key :  gostTracking.keySet() ) {
			hash.put(key, gostTracking.get(key));
		}
		
		for ( DataControl<?> dc :  hash.values() ) {
			dc.cleanShifter();
		}

		for ( DataControl<?> dc :  hash.values() ) {
			dc.forceRefresh();
			dc.notifyLiteners(new ControlRallbackEvent(dc));
		}
		
		transaction = new ArrayList<Command>();
	}

	public void commitCommand() throws TuraException {
		Iterator<Command> itr = transaction.iterator();

		HashMap<String,DataControl<?>> controlsId =  new HashMap<>();
		
		try {
			beginTransaction();
			while (itr.hasNext()) {
				Command cmd = itr.next();
				cmd.delayedExecution();
				controlsId.put(cmd.getDatacontrol().getId(), cmd.getDatacontrol());
			}
			commitTransaction();

			Iterator<DataControl<?>> itrc = controlsId.values().iterator();
			while (itrc.hasNext()) {
				DataControl<?> ctl = itrc.next();
				ctl.cleanShifter();
				ctl.forceRefresh();
			}

			transaction = new ArrayList<Command>();

		} catch (Exception e) {
			rallbackTransaction();
			throw new TuraException(e);
		}
	}

	public boolean isEmpty() {
		return transaction.isEmpty();
	}

	public ArrayList<PoolElement> getPoolElement() {
		return poolElement;
	}

	public synchronized long getNextId(){
	   return ++id;	
	}	
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	public abstract void rallbackTransaction();

	
	
}
