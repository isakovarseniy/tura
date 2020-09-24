/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.core.SearchResult;

public class ClientSearchProvider  implements SearchProvider{

	private Map<String, ObjectControl> hash = new HashMap<>();
	
	
	public void addKnownObject(ObjectControl oc) {
		hash.put(oc.getKey(), oc);
	}
	
	@Override
	public SearchResult find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object find(Object pk, String objectClass) throws RepositoryException {
		if ( hash.get(pk) == null) {
			throw new RepositoryException(" Unknown pk   " + pk);
		}
		return hash.get(pk).getWrappedObject();
	}

	@Override
	public void setAdapterLoader(AdapterLoader loader) {
		
	}

}
