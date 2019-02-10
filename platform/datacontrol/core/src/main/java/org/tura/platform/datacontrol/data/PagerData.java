/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
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
package org.tura.platform.datacontrol.data;

import java.util.HashMap;
import java.util.Stack;

import org.tura.platform.datacontrol.pool.PoolElement;
import org.tura.platform.datacontrol.shift.ShiftControl;

public class PagerData {

	private HashMap<String, ShiftControl> shifterHash = new HashMap<>();
	private ShiftControl shifter;
	private boolean isolated = false;
	private Stack<PoolElement> isolatedCommandList = new Stack<>();
	private long newObjectsUpdate;
	private HashMap<Object , UpdateTracker>  tracker = new HashMap<>();
	

	public static Object factory(Object obj) {
		if (obj == null)
			return new PagerData();
		if (obj instanceof PagerData)
			return new PagerData((PagerData) obj);
		return null;
	}

	public PagerData() {

	}

	public PagerData(PagerData p) {
		this.shifter = p.shifter;
		this.isolated = p.isolated;
		this.newObjectsUpdate = p.newObjectsUpdate;

		for (String key : p.shifterHash.keySet()) {
			this.shifterHash.put(key, p.shifterHash.get(key));
		}

		for (PoolElement element : p.isolatedCommandList) {
			this.isolatedCommandList.add(element);
		}

		for (Object key : p.tracker.keySet()) {
			this.tracker.put(key, p.tracker.get(key));
		}
		
	}

	public HashMap<String, ShiftControl> getShifterHash() {
		return shifterHash;
	}

	public void setShifterHash(HashMap<String, ShiftControl> shifterHash) {
		this.shifterHash = shifterHash;
	}

	public ShiftControl getShifter() {
		return shifter;
	}

	public void setShifter(ShiftControl shifter) {
		this.shifter = shifter;
	}

	public Stack<PoolElement> getIsolatedCommandList() {
		return isolatedCommandList;
	}

	public void setIsolatedCommandList(Stack<PoolElement> isolatedCommandList) {
		this.isolatedCommandList = isolatedCommandList;
	}

	public boolean isIsolated() {
		return isolated;
	}

	public void setIsolated(boolean isolated) {
		this.isolated = isolated;
	}

	public long getNewObjectsUpdate() {
		return newObjectsUpdate;
	}

	public void setNewObjectsUpdate(long newObjectsUpdate) {
		this.newObjectsUpdate = newObjectsUpdate+1;
	}


	public long getLastRemoveUpdate(Object key){
		if ( tracker.get(key)  == null){
			return 0L;
		}else{
			return tracker.get(key).lastRemove;
		}
	}
	
	public void setLastRemoveUpdate(Object key, long date){
		UpdateTracker t = tracker.get(key);
		if ( t   == null){
			t = new UpdateTracker();
			tracker.put(key, t);
		}
		t.lastRemove = date+1;
	}
	
	public long getLastUpdateUpdate(Object key){
		if ( tracker.get(key)  == null){
			return 0L;
		}else{
			return tracker.get(key).lastUpdate;
		}
	}
	
	public void setLastUpdateUpdate(Object key, long date){
		UpdateTracker t = tracker.get(key);
		if ( t   == null){
			t = new UpdateTracker();
			tracker.put(key, t);
		}
		t.lastUpdate = date+1;
	}

	
	
	private class UpdateTracker {
		long lastUpdate;
		long lastRemove;
	}
	
	
}
