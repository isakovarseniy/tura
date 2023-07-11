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

package org.tura.platform.repository.cpa.storage;

import java.io.Serializable;

import org.tura.platform.repository.core.PathHelper;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.persistence.PersistanceMapper;

public class StorageControlWrapper extends StorageControl implements Serializable {

	private static final long serialVersionUID = -638630631942138063L;

	private RepoKeyPath detailPath;
	private StorageControl sc;

	public StorageControlWrapper() {

	}

	public StorageControlWrapper(StorageControl sc, RepoKeyPath detailPath) throws Exception {
		this.sc = sc;
		this.detailPath = detailPath;
	}

	@Override
	public long getTimeStamp() {
		return sc.getTimeStamp();
	}

	@Override
	public PersistanceMapper getMapper() {
		return sc.getMapper();
	}

	@Override
	public void setMapper(PersistanceMapper mapper) {
		sc.setMapper(mapper);
	}

	@Override
	public void setTimeStamp(long timeStamp) {
		sc.setTimeStamp(timeStamp);
	}

	@Override
	public ObjectStatus getStatus() {
		return sc.getStatus();
	}

	@Override
	public void setStatus(ObjectStatus status) {
		sc.setStatus(status);
	}

	public Object getInternalObject() {
		try {
			if (detailPath == null) {
				return sc.getObject();
			}
			return PathHelper.getPathValue(detailPath, 1, sc.getObject());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Object getObject() {
		return sc.getObject();
	}

	@Override
	public void setObject(Object object) {
		sc.setObject(object);
	}

	@Override
	public Class<?> getType() {
		return sc.getType();
	}

	@Override
	public void setType(Class<?> type) {
		sc.setType(type);
	}

	@Override
	public boolean isUpdatable() {
		return sc.isUpdatable();
	}

	@Override
	public long getSession() {
		return sc.getSession();
	}

	@Override
	public void setSession(long session) {
		this.sc.setSession(session);
	}

}
