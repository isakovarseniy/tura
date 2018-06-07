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
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchRequest;
import org.tura.platform.repository.core.SearchResult;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RestClientRepository implements Repository {

	private URL base;
	private Client client;

	public RestClientRepository(URL base) {
		this.base = base;
	}

	@Override
	public Object create(String objectClass) throws RepositoryException {
		try {
			client = ClientBuilder.newClient();
			Class<?> clazz = Class.forName(objectClass);

			String context = base.getPath();
			Response response = client.target(new URL(base, context + "rest/repository/create").toExternalForm())
					.path("{id}").resolveTemplate("id", URLEncoder.encode(objectClass, "UTF-8"))
					.request(MediaType.APPLICATION_JSON).get(Response.class);

			if (response.getStatus() == Response.Status.OK.getStatusCode()) {
				return response.readEntity(clazz);
			} else {
				throw new RepositoryException(response.readEntity(String.class));
			}
		} catch (Exception e) {
			throw new RepositoryException(e);
		}finally{
			client.close();
		}
	}

	@Override
	public SearchResult find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String objectClass) throws RepositoryException {

		try {
			client = ClientBuilder.newClient();

			SearchRequest request = new SearchRequest();
			request.setSearch(searchCriteria);
			request.setOrder(orderCriteria);
			request.setStartIndex(startIndex);
			request.setEndIndex(endIndex);
			request.setObjectClass(objectClass);

			for( SearchCriteria  sc : searchCriteria ) {
				sc.setClassName( sc.getValue().getClass().getName());
				sc.setValue(sc.getValue().toString());
			}
			
			String context = base.getPath();
			Response response = client.target(new URL(base, context + "rest/repository/find").toExternalForm())
					.request(MediaType.APPLICATION_JSON).post(Entity.entity(request, MediaType.APPLICATION_JSON));

			if (response.getStatus() != Response.Status.OK.getStatusCode()) {
				throw new RepositoryException(response.readEntity(String.class));
			}

			@SuppressWarnings("unchecked")
			MultivaluedMap<String, String> map = response.readEntity(MultivaluedHashMap.class);
			
			ObjectMapper mapper = new ObjectMapper();
		    ArrayList<Object> list = new ArrayList<>();
		    
			for (int i  = 0; ;i++){
				String key = new Integer(i).toString();
				if (map.get(key) == null){
					break;
				}
				String className = map.get(key+"_type").get(0);
				Class<?> clazz = Class.forName(className);
				list.add( mapper.readValue(map.get(key).get(0),clazz));
			}
            Long size =  mapper.readValue(map.get("size").get(0),Long.class);
			
			SearchResult result = new SearchResult(list,size.longValue());
			
			return result;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}finally{
			client.close();
		}
		
	}

	@Override
	public void insert(Object obj, String objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();

	}

	@Override
	public void remove(Object obj, String objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();

	}

	@Override
	public void applyChanges(@SuppressWarnings("rawtypes") List changes) throws RepositoryException {
		try {
			client = ClientBuilder.newClient();

			ObjectMapper mapper = new ObjectMapper();

			MultivaluedMap<String, String> formData = new MultivaluedHashMap<String, String>();

			int index = 0;
			for (Object o : changes) {
				formData.add(new Integer(index).toString()+"_type", o.getClass().getName());
				formData.add(new Integer(index).toString(), mapper.writeValueAsString(o));
				index++;
			}

			String context = base.getPath();
			Response response = client.target(new URL(base, context + "rest/repository/applyChanges").toExternalForm())
					.request(MediaType.APPLICATION_JSON).post(Entity.form(formData));

			if (response.getStatus() != Response.Status.OK.getStatusCode()) {
				throw new RepositoryException(response.readEntity(String.class));
			}
		} catch (Exception e) {
			throw new RepositoryException(e);
		}finally{
			client.close();
		}
	}

	@Override
	public Object find(Object pk, String objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

}
