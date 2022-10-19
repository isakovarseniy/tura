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

package org.tura.platform.repository.cpa.storage;

import java.io.Serializable;

import org.tura.platform.repository.persistence.PersistanceMapper;


public class StorageControl implements Serializable, TimeStampAware{
	private static final long serialVersionUID = -9016186506092107083L;

	private ObjectStatus status;
	private Object object;
	private Class<?> type;
	private long timeStamp;
	private PersistanceMapper mapper;
	private long session;
	
	public StorageControl() {
		
	}
	
	public StorageControl(StorageControl s ) throws Exception {
		this.status = s.status;
		this.type = s.type;
		this.timeStamp =s.timeStamp ;
		this.mapper = s.mapper;
		this.session = s.session;
		if ( s.object != null) {
			this.object = s.mapper.copyFromRepository2Persistence(s.object);
		}
	}
	

	public StorageControl(Object object, Class<?> type, long timeStamp) {
		this.object = object;
		this.type = type;
		this.timeStamp = timeStamp;
	}	
	
	
	public long getStorageControlTimeStamp() {
		return getTimeStamp();
	}

	
	public long getTimeStamp() {
		return timeStamp;
	}

	public PersistanceMapper getMapper() {
		return mapper;
	}

	public void setMapper(PersistanceMapper mapper) {
		this.mapper = mapper;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public ObjectStatus getStatus() {
		return status;
	}

	public void setStatus(ObjectStatus status) {
		this.status = status;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public Class<?> getType() {
		return type;
	}

	public void setType(Class<?> type) {
		this.type = type;
	}

	public synchronized boolean isUpdatable() {
		if (ObjectStatus.Loaded.equals(status)  ) {
			return true;
		}else {
			return false;
		}
	}

	public long getSession() {
		return session;
	}

	public void setSession(long session) {
		this.session = session;
	}


}



