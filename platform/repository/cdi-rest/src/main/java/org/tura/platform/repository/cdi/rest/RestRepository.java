/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.repository.cdi.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.DataProvider;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;

public class RestRepository {

	
	@Inject
	private Repository repository;
	
	public void addProvider(DataProvider provider, String objectClass) {
		
	}

	public void addCommand(DataProvider provider, String dataClass) {
		
	}

	
	@GET
    @Path("create")
	public Object create(String objectClass) throws RepositoryException {
		
		return null;
	}

	@POST
    @Path("find")
	public SearchResult find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String objectClass) throws RepositoryException {
		
		SearchResult result = repository.find(searchCriteria, orderCriteria, startIndex, endIndex, objectClass);
		return result;
	}

	@POST
    @Path("insert")
	public void insert(Object obj, String objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	@POST
    @Path("remove")
	public void remove(Object obj, String objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	@POST
    @Path("applyChanges")
	public void applyChanges(List<?> changes) throws RepositoryException {
		repository.applyChanges(changes);
	}

}