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

package org.tura.platform.repository.proxy.access;

import org.tura.platform.repository.core.RelationType;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;

public  class EagerInternalSingleObject<T> extends EagerSingleObject<T> {

	private static final long serialVersionUID = 5196626137879198794L;
	
	public EagerInternalSingleObject() {
		
	}
	
	public EagerInternalSingleObject(Class<T> objectType, CpaStorageProvider storageProvider, CpaRepository repository,
			RelationType cpaRelationType) {
		super(objectType, storageProvider, repository, cpaRelationType);
	}

	@SuppressWarnings("unchecked")
	public T get(RepoKeyPath cpaPath, String relation) {
		try {
			String className = cpaPath.getPath().get(0).getType();
			Class<T> clazz = (Class<T>) Class.forName(className);
			Object obj = findObject(cpaPath, clazz);
			if (obj == null) {
				return null;
			}
			Object result =  InternalObjectHelper.getValue(obj,relation);
			if ( result == null) {
				return null;
			}
			return (T) repository.factory(result, result.getClass().getName());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	@SuppressWarnings("unchecked")
	public T getTop(RepoKeyPath cpaPath) {
		try {
			Object obj = findObject(cpaPath, this.objectType);
			if (obj == null) {
				return null;
			}
			return (T) repository.factory(obj, obj.getClass().getName());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	
}
