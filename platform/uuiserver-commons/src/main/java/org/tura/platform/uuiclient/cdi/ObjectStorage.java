/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.uuiclient.cdi;

import java.io.Serializable;

public class ObjectStorage  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private BeanStorage beanStorage;
	private LockerSave lockerSave;
	
	public ObjectStorage(BeanStorage beanStorage, LockerSave lockerSave) {
		this.beanStorage = beanStorage;
		this.lockerSave = lockerSave;
		
	}
	
	public BeanStorage getBeanStorage() {
		return beanStorage;
	}
	public void setBeanStorage(BeanStorage beanStorage) {
		this.beanStorage = beanStorage;
	}
	public LockerSave getLockerSave() {
		return lockerSave;
	}
	public void setLockerSave(LockerSave lockerSave) {
		this.lockerSave = lockerSave;
	}
	
	
	
	

}
