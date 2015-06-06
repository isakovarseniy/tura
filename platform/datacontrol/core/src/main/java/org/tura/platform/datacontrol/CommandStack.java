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

	private Stack<SavePoint> savePoints;

	public CommandStack() {
		initSavePoint();
	}

	public void addTransaction(Command cmd) throws TuraException {
		this.savePoints.peek().getTransactions().add(cmd);
	}

	public void addGostTrackingDataControl(DataControl<?> dc)
			throws TuraException {
		this.savePoints.peek().getGostTracking().put(dc.getId(), dc);
	}

	public void rallbackCommand() throws TuraException {

		HashMap<String, DataControl<?>> hash = new HashMap<>();

		for (SavePoint sv : savePoints) {
			for (Command cmd : sv.getTransactions()) {
				hash.put(cmd.getDatacontrol().getId(), cmd.getDatacontrol());
			}
		}
		for (SavePoint sv : savePoints) {
			for (String key : sv.getGostTracking().keySet()) {
				hash.put(key, sv.getGostTracking().get(key));
			}
		}

		initSavePoint();

		for (DataControl<?> dc : hash.values()) {
			dc.forceRefresh();
			dc.notifyLiteners(new ControlRallbackEvent(dc));
		}
	}

	public synchronized void rallbackSavePoint() throws TuraException {

		if (savePoints.size() == 1)
			throw new TuraException("No savepoint");

		HashMap<String, DataControl<?>> hash = new HashMap<>();

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
				new HashMap<String, ShifterVar>(), 0);
		savePoints.push(sp);
	}

	public void commitCommand() throws TuraException {

		HashMap<String, DataControl<?>> controlsId = new HashMap<>();

		try {
			beginTransaction();
			for (SavePoint sv : savePoints) {
				Iterator<Command> itr = sv.getTransactions().iterator();
				while (itr.hasNext()) {
					Command cmd = itr.next();
					cmd.delayedExecution();
					controlsId.put(cmd.getDatacontrol().getId(),
							cmd.getDatacontrol());
				}
			}
			commitTransaction();

			Iterator<DataControl<?>> itrc = controlsId.values().iterator();
			while (itrc.hasNext()) {
				DataControl<?> ctl = itrc.next();
				ctl.cleanShifter();
				ctl.forceRefresh();
			}

			initSavePoint();

		} catch (Exception e) {
			rallbackTransaction();
			throw new TuraException(e);
		}
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
		this.savePoints.peek().setShifterLastUpdate(id, lastUpdate);
	}

	public synchronized long getNextId() {
		return this.savePoints.peek().getNextId();
	}

	public synchronized void savePoint() {
		SavePoint sp = savePoints.peek();
		SavePoint newSp = new SavePoint(sp.poolElement, sp.shifterMap,
				sp.getNextId());
		savePoints.push(newSp);
	}

	public abstract void beginTransaction();

	public abstract void commitTransaction();

	public abstract void rallbackTransaction();

	class ShifterVar {

		private List<Element> shifterArray = new ArrayList<>();
		private long lastUpdate;

		ShifterVar(List<Element> shifterArray, long lastUpdate) {
			this.shifterArray.addAll(shifterArray);
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
		private ArrayList<Command> transaction = new ArrayList<Command>();
		private long id;

		SavePoint(List<PoolElement> poolElement,
				Map<String, ShifterVar> shifterMap, long id) {
			this.id = id;
			this.poolElement.addAll(poolElement);
			for (String key : shifterMap.keySet()) {
				ShifterVar v = shifterMap.get(key);
				ShifterVar n = new ShifterVar(v.getShifterArray(),v.getLastUpdate());
				this.shifterMap.put(key, n);
			}
		}

		public List<Command> getTransactions() {
			return transaction;
		}

		public List<PoolElement> getPoolElement() {
			return poolElement;
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

		public void setShifterLastUpdate(String shifterId, long lastUpdate) {
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
