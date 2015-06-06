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
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.tura.platform.datacontrol.command.Command;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.event.ControlRallbackEvent;
import org.tura.platform.datacontrol.pool.PoolElement;
import org.tura.platform.datacontrol.shift.Element;

public abstract class CommandStack {

	private ArrayList<Command> transaction = new ArrayList<Command>();
	private Stack<SavePoint> savePoints;

	public CommandStack() {
		initSavePoint();
	}

	public void addTransaction(Command cmd) throws TuraException {
		this.transaction.add(cmd);
	}

	public void addGostTrackingDataControl(DataControl<?> dc)
			throws TuraException {
		this.savePoints.peek().getGostTracking().put(dc.getId(), dc);
	}

	public void rallbackCommand() throws Exception {

		HashMap<String, DataControl<?>> hash = new HashMap<>();

		for (Command cmd : transaction) {
			hash.put(cmd.getDatacontrol().getId(), cmd.getDatacontrol());
		}

		for (String key : savePoints.peek().getGostTracking().keySet()) {
			hash.put(key, savePoints.peek().getGostTracking().get(key));
		}

		// for ( DataControl<?> dc : hash.values() ) {
		// dc.cleanShifter();
		// }

		transaction = new ArrayList<Command>();
		initSavePoint();

		for (DataControl<?> dc : hash.values()) {
			dc.forceRefresh();
			dc.notifyLiteners(new ControlRallbackEvent(dc));
		}
	}

	public synchronized void rallbackSavePoint() throws Exception {
		HashMap<String, DataControl<?>> hash = new HashMap<>();

		for (int i = savePoints.peek().transactionPointer; i < transaction
				.size();) {
			Command cmd = transaction.remove(i - 1);
			hash.put(cmd.getDatacontrol().getId(), cmd.getDatacontrol());
		}

		for (String key : savePoints.peek().getGostTracking().keySet()) {
			hash.put(key, savePoints.peek().getGostTracking().get(key));
		}

		savePoints.pop();

		for (DataControl<?> dc : hash.values()) {
			dc.forceRefresh();
			dc.notifyLiteners(new ControlRallbackEvent(dc));
		}

	}

	private void initSavePoint() {
		savePoints = new Stack<SavePoint>();
		SavePoint sp = new SavePoint(new ArrayList<PoolElement>(),
				new HashMap<String, ShifterVar>(), 0,0);
		savePoints.push(sp);
	}

	public void commitCommand() throws TuraException {
		Iterator<Command> itr = transaction.iterator();

		HashMap<String, DataControl<?>> controlsId = new HashMap<>();

		try {
			beginTransaction();
			while (itr.hasNext()) {
				Command cmd = itr.next();
				cmd.delayedExecution();
				controlsId.put(cmd.getDatacontrol().getId(),
						cmd.getDatacontrol());
			}
			commitTransaction();

			Iterator<DataControl<?>> itrc = controlsId.values().iterator();
			while (itrc.hasNext()) {
				DataControl<?> ctl = itrc.next();
				ctl.cleanShifter();
				ctl.forceRefresh();
			}

			transaction = new ArrayList<Command>();
			initSavePoint();

		} catch (Exception e) {
			rallbackTransaction();
			throw new TuraException(e);
		}
	}

	public boolean isEmpty() {
		return transaction.isEmpty();
	}

	public List<PoolElement> getPoolElement() {
		return this.savePoints.peek().getPoolElement();
	}

	public List<Element> getShifterArray(String id) {
		return this.savePoints.peek().getShifterArray(id);
	}
	
   public long getShifterLastUpdate(String id) {
		return this.savePoints.peek().getShifterLastUpdate(id);
   }

   public void setShifterLastUpdate(String id, long lastUpdate) {
		this.savePoints.peek().setShifterLastUpdate(id,lastUpdate);
   }  
   
	public synchronized long getNextId() {
		return this.savePoints.peek().getNextId();
	}

	public synchronized void savePoint() {
		SavePoint sp = savePoints.peek();
		SavePoint newSp = new SavePoint(sp.poolElement, sp.shifterMap,
				transaction.size(),sp.getNextId());
		savePoints.push(newSp);
	}

	public abstract void beginTransaction();

	public abstract void commitTransaction();

	public abstract void rallbackTransaction();

	class ShifterVar {

		private List<Element> shifterArray;
		private long lastUpdate;

		ShifterVar(List<Element> shifterArray, long lastUpdate) {
			this.shifterArray = shifterArray;
			this.lastUpdate = lastUpdate;
		}

		ShifterVar() {
			this.shifterArray = new ArrayList<>();
			this.lastUpdate = 0;
		}

		public List<Element> getShifterArray() {
			return shifterArray;
		}

		public void setShifterArray(List<Element> shifterArray) {
			this.shifterArray = shifterArray;
		}

		public long getLastUpdate() {
			return lastUpdate;
		}

		public void setLastUpdate(long lastUpdate) {
			this.lastUpdate = lastUpdate;
		}

	}

	class SavePoint {

		private List<PoolElement> poolElement = new ArrayList<>();
		private Map<String, ShifterVar> shifterMap = new HashMap<>();
		private HashMap<String, DataControl<?>> gostTracking = new HashMap<>();
		private int transactionPointer;
		private long id;

		SavePoint(List<PoolElement> poolElement,
				Map<String, ShifterVar> shifterMap, int transactionPointer,long id) {
			this.transactionPointer = transactionPointer;
			this.id = id;
			this.poolElement.addAll(poolElement);
			for (String key : shifterMap.keySet()) {
				this.shifterMap.put(key, shifterMap.get(key));
			}
		}

		public List<PoolElement> getPoolElement() {
			return poolElement;
		}

		public int getTransacrionPointer() {
			return transactionPointer;
		}

		public List<Element> getShifterArray(String shifterId) {
			if (shifterMap.get(shifterId) == null)
				shifterMap.put(shifterId, new ShifterVar());
			return shifterMap.get(shifterId).getShifterArray();
		}

		public long getShifterLastUpdate(String shifterId) {
			if (shifterMap.get(shifterId) == null)
				shifterMap.put(shifterId, new ShifterVar());
			return shifterMap.get(shifterId).getLastUpdate();
		}
		
		public void setShifterLastUpdate(String shifterId,long lastUpdate ) {
			if (shifterMap.get(shifterId) == null)
				shifterMap.put(shifterId, new ShifterVar());
			shifterMap.get(shifterId).setLastUpdate(lastUpdate);
		}
		
		
		public HashMap<String, DataControl<?>> getGostTracking() {
			return gostTracking;
		}

		public long getNextId() {
			return ++id;
		}

	}

}
