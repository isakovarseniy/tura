/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import java.util.ArrayList;
import java.util.List;

import org.tura.platform.datacontrol.pool.PoolElement;

public class PoolData implements Serializable{

	private static final long serialVersionUID = -5130620387871430761L;
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
	
	public long getCurrentId() {
		return id;
	}
	
}
