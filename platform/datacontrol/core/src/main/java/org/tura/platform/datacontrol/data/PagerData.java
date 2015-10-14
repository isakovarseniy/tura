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
package org.tura.platform.datacontrol.data;

import java.util.HashMap;

import org.tura.platform.datacontrol.shift.ShiftControl;

public class PagerData {
	
	private HashMap<String, ShiftControl> shifterHash = new HashMap<>();
	private ShiftControl shifter;

	
	public static Object factory(Object obj){
		if (obj == null)
			return new PagerData();
		if (obj instanceof PagerData)
			return new PagerData((PagerData)obj);
		return null;
	}
	
	
	public  PagerData(){
		
	}	
	
	public PagerData(PagerData p){
		this.shifter = p.shifter;
		for (String key : p.shifterHash.keySet()){
			this.shifterHash.put(key, p.shifterHash.get(key));
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

}
