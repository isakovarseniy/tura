/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.datacontrol.data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Stack;

import org.tura.platform.datacontrol.LRUCache;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.datacontrol.pool.PoolElement;
import org.tura.platform.datacontrol.shift.ShiftControl;

public class PagerData implements Serializable{

	private static final long serialVersionUID = -4827513184380128058L;
	private LRUCache shifterHash = new LRUCache(PlatformConfig.LRU_SIZE);
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

		this.shifterHash = new LRUCache(p.shifterHash);
		
		for (PoolElement element : p.isolatedCommandList) {
			this.isolatedCommandList.add(element);
		}

		for (Object key : p.tracker.keySet()) {
			this.tracker.put(key, p.tracker.get(key));
		}
		
	}

	public LRUCache getShifterHash() {
		return shifterHash;
	}

	public void setShifterHash(LRUCache shifterHash) {
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

	
	public void resetUpdateTracker() {
		tracker = new HashMap<>();;
	}
	
	
	private class UpdateTracker implements Serializable{
		private static final long serialVersionUID = -4001757216002172104L;
		long lastUpdate;
		long lastRemove;
	}
	
	
}