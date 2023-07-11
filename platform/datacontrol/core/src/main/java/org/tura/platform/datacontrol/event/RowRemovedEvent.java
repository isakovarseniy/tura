/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.datacontrol.event;

import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.repository.core.ObjectControl;

public class RowRemovedEvent  extends Event {

	private Object obj;
	private Object position;
	
	public RowRemovedEvent(IDataControl dc , Object obj){
		super(dc);
		ObjectControl oc = (ObjectControl) obj;
		if (obj  == null || oc.isRemoved()) {
			return;
		}
		this.obj=oc.clone();
		
	}

	
	public RowRemovedEvent(IDataControl dc , Object obj,Object position){
		super(dc);
		this.obj=obj;
		this.position = position;
	}	
	
	public Object getPosition() {
		return position;
	}


	public void setPosition(Object position) {
		this.position = position;
	}


	/**
	 * @return the obj
	 */
	public Object getObj() {
		return obj;
	}

	/**
	 * @param obj the obj to set
	 */
	public void setObj(Object obj) {
		this.obj = obj;
	}	
	
}
