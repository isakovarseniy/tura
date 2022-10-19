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

import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;


public class TopLazyList<T> extends LazyList<T> {

	private static final long serialVersionUID = -1801686816138325861L;

	public TopLazyList() {
	}

	public TopLazyList(Class<T> objectType, CpaStorageProvider storageProvider, CpaRepository repository) {
		super(objectType, storageProvider, repository, null);
	}

	public List<OrderCriteria> getLazyObjectOrderCriteria() {
		return null;
	}

	public List<SearchCriteria> getLazyObjectSearchCriteria() {
		return null;
	}

	@Override
	public RepoKeyPath getParentKeyPath() {
		return null;
	}

	@Override
	public String getProperty() {
		return null;
	}

	@Override
	public void add(int index, T element) {
		try {
			ObjectControl obj = (ObjectControl) element;
			getRepository().insert(element, obj.getProxyClazz());
			super.add(index, element);
		} catch (Exception e) {
               throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) {
		try {
			ObjectControl obj = (ObjectControl) get(index);
			getRepository().remove(obj, obj.getProxyClazz());
			super.remove(index);
			return (T) obj;
		} catch (Exception e) {
               throw new RuntimeException(e);
		}
		
	}

}
