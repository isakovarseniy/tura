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
package org.tura.platform.repository.client.rest;

import java.net.URL;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.DataProvider;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;

public class RestClientRepository implements Repository {

	private URL base;
	private Client client;

	public RestClientRepository(URL base)  {
		this.base = base;
		client = ClientBuilder.newClient();
	}

	@Override
	public void addProvider(DataProvider provider, String objectClass) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addCommand(DataProvider provider, String dataClass) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object create(String objectClass) throws RepositoryException {
		try {
//			Class<?> clazz = Class.forName(objectClass);
			
			String context = base.getPath();
			Response response = client.target(new URL(base, context+"rest/repository/create").toExternalForm())//.register(clazz)
					.path("{id}").resolveTemplate("id", objectClass).request(MediaType.APPLICATION_JSON)
					.get(Response.class);

			if (response.getStatus() == Response.Status.OK.getStatusCode()) {
				return response.getEntity();
			} else {
				throw new RepositoryException((String)response.getEntity());
			}
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	public SearchResult find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String objectClass) throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Object obj, String objectClass) throws RepositoryException {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Object obj, String objectClass) throws RepositoryException {
		// TODO Auto-generated method stub

	}

	@Override
	public void applyChanges(List changes) throws RepositoryException {
		// TODO Auto-generated method stub

	}

}
