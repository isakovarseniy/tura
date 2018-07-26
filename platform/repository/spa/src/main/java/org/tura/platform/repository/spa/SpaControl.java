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
package org.tura.platform.repository.spa;

import org.tura.platform.repository.core.Adapter;

public class SpaControl implements Comparable<SpaControl>{
	
	private OperationLevel level;
	private String type;
	private Object key;
	private Object object;
	private int priority = 100;
	private int sequence;
	
	public SpaControl(Object object,Object key, OperationLevel level){
		this.object = object;
		this.key = key;
		this.level = level;
		this.type = object.getClass().getName();
		if (object instanceof Adapter){
			this.type = ((Adapter)object).getObjectType();
		}
	}
	
	
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public OperationLevel getLevel() {
		return level;
	}
	public void setLevel(OperationLevel level) {
		this.level = level;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Object getKey() {
		return key;
	}
	public void setKey(Object key) {
		this.key = key;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	@Override
	public int compareTo(SpaControl o) {
		return this.sequence-o.getSequence();
	}

}
