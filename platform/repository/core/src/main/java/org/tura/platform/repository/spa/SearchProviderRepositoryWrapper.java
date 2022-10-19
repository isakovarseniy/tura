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

package org.tura.platform.repository.spa;

import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.core.SearchResult;

public class SearchProviderRepositoryWrapper implements SearchProvider {
	private SpaRepository repository;
	private SpaObjectRegistry spaRegistry;
	private SpaRepositoryData spaRepositoryData;


	public SearchProviderRepositoryWrapper(Repository repository,SpaObjectRegistry spaRegistry) {
		this.repository = (SpaRepository) repository;
		this.spaRegistry = spaRegistry;
	}


	public SpaRepositoryData getSpaRepositoryData() {
		return spaRepositoryData;
	}



	public void setSpaRepositoryData(SpaRepositoryData spaRepositoryData) {
		this.spaRepositoryData = spaRepositoryData;
	}


	
	@Override
	public <T>SearchResult<T> find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, Class<T> objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	@Override
	public  <T>T find(Object pk, Class<T> objectClass) throws RepositoryException {
		try {
			SearchProvider provider = spaRegistry.getRegistry(repository.getRegistryName())
					.findSearchProvider(objectClass);
			
			if (provider instanceof AbstaractSearchService){
				((AbstaractSearchService)provider).setCache(spaRepositoryData.getCache().get(objectClass.getName()));
			}
			
			return provider.find(pk, objectClass);
		} catch (Exception e) {
			throw new RepositoryException(e);

		}
	}

	@Override
	public void setAdapterLoader(AdapterLoader loader) {
	}

}
