/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
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

		for (String key : p.shifterHash.keySet()) {
			this.shifterHash.put(key, p.shifterHash.get(key));
		}

		for (PoolElement element : p.isolatedCommandList) {
			this.isolatedCommandList.add(element);
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

}
