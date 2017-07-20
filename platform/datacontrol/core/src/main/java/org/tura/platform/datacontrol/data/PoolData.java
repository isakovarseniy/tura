/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
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

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.datacontrol.pool.PoolElement;

public class PoolData {

	private List<PoolElement> poolElement = new ArrayList<>();
	private long id;
	
	
	public static Object factory(Object obj){
		if (obj == null)
			return new PoolData();
		if (obj instanceof PoolData)
			return new PoolData((PoolData)obj);
		return null;
	}
	
	public  PoolData(){
		
	}
	
	public PoolData(PoolData p){
		this.id = p.id;
		this.poolElement.addAll(p.getPoolElement());
	}
	
	public List<PoolElement> getPoolElement() {
		return poolElement;
	}

	public long getNextId() {
		return ++id;
	}
	
	
}
