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

package org.tura.platform.repository.proxy.access;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.tura.platform.repository.core.RelationType;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.cpa.storage.ObjectStatus;

public class EagerSingleObject<T> implements Serializable, Closeable {

	private static final long serialVersionUID = 9220223389787401790L;
	protected Class<T> objectType;
	protected CpaStorageProvider storageProvider;
	protected CpaRepository repository;
	protected RelationType cpaRelationType;

	
	public EagerSingleObject() {
		
	}
	
	
	public EagerSingleObject(Class<T> objectType, CpaStorageProvider storageProvider,CpaRepository repository,RelationType cpaRelationType) {
		this.objectType = objectType;
		this.storageProvider = storageProvider;
		this.repository = repository;
		this.cpaRelationType =  cpaRelationType;
		
	}

	@SuppressWarnings("unchecked")
	public T get(RepoKeyPath cpaPath, String relation) {
		try {
			Object obj = findObject(cpaPath, relation);
			if ( obj == null) {
				return null;
			}
			return (T) repository.factory(obj, obj.getClass().getName());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected T findObject(RepoKeyPath cpaPath, String relation) throws Exception {

		String[] ObjectStatuses = { ObjectStatus.Inserted.name(), ObjectStatus.Loaded.name(),
				ObjectStatus.Updated.name() };

		List<T> list = CpaHelper.toObjectList(storageProvider.getStorage().findDependencies(cpaPath, relation, 0,
				Long.MAX_VALUE, Arrays.asList(ObjectStatuses) ,this.cpaRelationType  ));

		if (list.size() == 0) {
			return null;
		}
		return list.get(0);
	}

	protected T findObject(RepoKeyPath cpaPath, Class<T>  objectType) throws Exception {

		T t= storageProvider.getStorage().getObject(cpaPath);

		return t;
	}	
	
	public Class<T> getObjectType() {
		return objectType;
	}

	public void setObjectType(Class<T> objectType) {
		this.objectType = objectType;
	}


	@Override
	public void close() throws IOException {
	}

}
