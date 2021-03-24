/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.spa.test;

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RegistryAware;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.spa.AbstaractSearchService;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaObjectRegistry.SpaRegistry;
import org.tura.jpa.test.SPAObject1;


public class SearchService extends AbstaractSearchService implements RegistryAware{
	
	public static long MAX = 100000L;
	

	private String registryName;
	private SpaObjectRegistry spaRegistry;
	@SuppressWarnings("unused")
	private Registry registry;
	
	public SearchService(SpaObjectRegistry spaRegistry,String registryName,Registry registry) {
		this.registryName = registryName;
		this.spaRegistry = spaRegistry;
		this.registry = registry;
	}
	
	
	@Override
	protected SearchResult serviceCall(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, String objectClass) throws RepositoryException {

		try {
	        int pagesize = endIndex - startIndex;
	        int page = startIndex / pagesize;
	        
	        List<Object> ls = new ArrayList<Object>(); 
	        for ( int i = 0 ; i < pagesize; i++) {
	        	
	            int index =i+pagesize*page;
	            if ( index < MAX) {
	        	SPAObject1 obj = new SPAObject1 ();
	        	obj.setSpaObj1((long) index);
	        	ls.add(obj);
	            }
	        	
	        }
		   return new SearchResult(ls, MAX);

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	protected Object serviceCall(Object pk, String objectClass) {
		return null;
	}

	public String getRegistry() {
		return registryName;
	}

	public void setRegistry(String registry) {
		this.registryName = registry;
	}

	@Override
	protected SpaRegistry getSpaRegistry() {
		return spaRegistry.getRegistry(registryName);
	}

	
}

