/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.datacontrol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import java.util.UUID;

import org.tura.platform.datacontrol.command.Command;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.data.CommandStackData;
import org.tura.platform.datacontrol.event.ControlRallbackEvent;

public abstract class CommandStack {

	private Stack<SavePoint> savePoints;
	private String id = UUID.randomUUID().toString();
	private ArrayList<IDataControl> poolFlushAware = new ArrayList<IDataControl>(); 

	
	public abstract void beginTransaction();

	public abstract void commitTransaction();

	public abstract void rallbackTransaction();	
	
	public CommandStack() {
		initSavePoint();
	}

	protected CommandStackData getCommandStackData() {
		return (CommandStackData) this.savePoints.peek().getData().get(id);
	}

	public void addTransaction(Command cmd) throws TuraException {
		getCommandStackData().getTransaction().add(cmd);
	}

	public void registerForCleaningDataControl(DataControl<?> dc)
			throws TuraException {
		getCommandStackData().getGostTracking().put(dc.getId(), dc);
	}

	public void rallbackCommand() throws TuraException {

		HashMap<String, DataControl<?>> hash = new HashMap<>();

		for (SavePoint sv : savePoints) {
			CommandStackData csd = (CommandStackData) sv.getData().get(id);
			for (Command cmd : csd.getTransaction()) {
				hash.put(cmd.getDatacontrol().getId(), cmd.getDatacontrol());
			}
		}
		for (SavePoint sv : savePoints) {
			CommandStackData csd = (CommandStackData) sv.getData().get(id);
			for (String key : csd.getGostTracking().keySet()) {
				hash.put(key, csd.getGostTracking().get(key));
			}
		}

		if (hash.values().size() != 0)
			initSavePoint();

		for (DataControl<?> dc : hash.values()) {
			dc.cleanShifter();
		}

		for (DataControl<?> dc : hash.values()) {
			dc.forceRefresh();
			dc.notifyLiteners(new ControlRallbackEvent(dc));
		}
	}

	public synchronized void rallbackSavePoint() throws TuraException {

		if (savePoints.size() == 1)
			throw new TuraException("No savepoint");

		HashMap<String, DataControl<?>> hash = new HashMap<>();

		for (String key : getCommandStackData().getGostTracking().keySet()) {
			hash.put(key, getCommandStackData().getGostTracking().get(key));
		}

		savePoints.pop();

		for (DataControl<?> dc : hash.values()) {
			dc.forceRefresh();
			dc.notifyLiteners(new ControlRallbackEvent(dc));
		}

	}

	private void initSavePoint() {
		savePoints = new Stack<SavePoint>();
		SavePoint sp = new SavePoint();
		sp.getData().put(id, new CommandStackData());
		savePoints.push(sp);
	}

	public void commitCommand() throws TuraException {

		HashMap<String, DataControl<?>> controlsId = new HashMap<>();

		try {
			beginTransaction();
			for (SavePoint sv : savePoints) {
				CommandStackData csd = (CommandStackData) sv.getData().get(id);
				Iterator<Command> itr = csd.getTransaction().iterator();
				while (itr.hasNext()) {
					Command cmd = itr.next();
					cmd.delayedExecution();
					controlsId.put(cmd.getDatacontrol().getId(),
							cmd.getDatacontrol());
				}
			}
			commitTransaction();

			SavePoint sv = savePoints.peek();
			savePoints = new Stack<>();
			savePoints.push(sv);

			for (DataControl<?> ctl : controlsId.values()) {
				ctl.cleanShifter();
			}

			for (DataControl<?> ctl : controlsId.values()) {
				ctl.forceRefresh();
			}

		} catch (Exception e) {
			rallbackTransaction();
			throw new TuraException(e);
		}
	}

	public Object getData(String id) {
		return this.savePoints.peek().getData().get(id);
	}

	public void addData(String id, Object obj) {
		this.savePoints.peek().getData().put(id, obj);
	}

	public void removeData(String id) {
		this.savePoints.peek().getData().remove(id);
	}

	public synchronized void savePoint() throws TuraException {
		SavePoint sp = savePoints.peek();
		SavePoint newSp = new SavePoint(sp);
		savePoints.push(newSp);
	}

	
	public ArrayList<IDataControl> getPoolFlushAware() {
		return poolFlushAware;
	}


	public class SavePoint {

		private HashMap<String, Object> data = new HashMap<>();

		SavePoint() {

		}

		SavePoint(SavePoint sp) throws TuraException {
			try {
				for (String key : sp.getData().keySet()) {
					Object obj = sp.getData().get(key);
					Object nObj = Reflection.callTyped(obj, "factory",
							Object.class, obj);
					data.put(key, nObj);
				}
			} catch (Exception e) {
				throw new TuraException(e);
			}
		}

		public HashMap<String, Object> getData() {
			return data;
		}

	}

}
