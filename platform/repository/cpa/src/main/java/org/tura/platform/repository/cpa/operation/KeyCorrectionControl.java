/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.cpa.operation;

import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;

public class KeyCorrectionControl extends SpaControl{

	private Object master;
	private  PersistanceMapper masterMapper;
	
	public KeyCorrectionControl(Object object, Object key, OperationLevel level, String registryName) {
		super(object, key, level, registryName);
	}

	public Object getMaster() {
		return master;
	}

	public void setMaster(Object master) {
		this.master = master;
	}

	public PersistanceMapper getMasterMapper() {
		return masterMapper;
	}

	public void setMasterMapper(PersistanceMapper masterMapper) {
		this.masterMapper = masterMapper;
	}


}
