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

package org.tura.platform.repository.client.rest;

import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.tura.platform.datacontrol.commons.ObjectMapperBuilder;
import org.tura.platform.datacontrol.commons.ObjectProfileCriteria;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchRequest;
import org.tura.platform.repository.core.SearchResult;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RestClientRepository implements Repository {

	private static final long serialVersionUID = -1003783682499426763L;
	private URL base;
	private Client client;
	private  RequestCustomizer customizer;

	public RestClientRepository(URL base, RequestCustomizer customizer) {
		this.base = base;
		this.customizer = customizer;
	}

	public RestClientRepository(URL base) {
		this.base = base;
		this.customizer = null;
	}

	
	@Override
	public <T> T create(Class<T> objectClass) throws RepositoryException {
		try {
			client = ClientBuilder.newClient();
			ObjectMapper mapper = ObjectMapperBuilder.getObjectMapper();

			String context = base.getPath();
			
			 Invocation.Builder builder = client.target(new URL(base, context + "rest/repository/create").toExternalForm())
						.path("{id}").resolveTemplate("id", URLEncoder.encode(objectClass.getName(), "UTF-8"))
						.request(MediaType.APPLICATION_JSON);
			 if ( customizer != null) {
				 builder = customizer.process(builder);
			 }
			
			Response response = builder.get(Response.class);

			if (response.getStatus() == Response.Status.OK.getStatusCode()) {
				String json = response.readEntity(String.class);
				return mapper.readValue(json,objectClass );
			} else {
				throw new RepositoryException(response.readEntity(String.class));
			}
		} catch (Exception e) {
			throw new RepositoryException(e);
		}finally{
			client.close();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> SearchResult<T> find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, Class<T> objectClass) throws RepositoryException {

		try {
			client = ClientBuilder.newClient();

			SearchRequest request = new SearchRequest();
			request.setOrder(orderCriteria);
			request.setStartIndex(startIndex);
			request.setEndIndex(endIndex);
			request.setObjectClass(objectClass.getName());

			for( SearchCriteria  sc : searchCriteria ) {
				if ( sc instanceof ObjectProfileCriteria  ) {
					request.setProfile(((ObjectProfileCriteria) sc).getProfile());
				}else{
					request.getSearch().add(sc);
					sc.setClassName( sc.getValue().getClass().getName());
					sc.setValue(sc.getValue().toString());
				}
			}
			
			String context = base.getPath();
			 Invocation.Builder builder = client.target(new URL(base, context + "rest/repository/find").toExternalForm())
						.request(MediaType.APPLICATION_JSON);
			 if ( customizer != null) {
				 builder = customizer.process(builder);
			 }
			Response response = builder.post(Entity.entity(request, MediaType.APPLICATION_JSON));

			if (response.getStatus() != Response.Status.OK.getStatusCode()) {
				throw new RepositoryException(response.readEntity(String.class));
			}

			MultivaluedMap<String, String> map = response.readEntity(MultivaluedHashMap.class);
			
			ObjectMapper mapper = ObjectMapperBuilder.getObjectMapper();
		    List<T> list = new ArrayList<>();
		    
			for (int i  = 0; ;i++){
				String key =  Integer.valueOf(i).toString();
				if (map.get(key) == null){
					break;
				}
				String className = map.get(key+"_type").get(0);
				Class<?> clazz = Class.forName(className);
				list.add( (T) mapper.readValue(map.get(key).get(0),clazz));
			}
            Long size =  mapper.readValue(map.get("size").get(0),Long.class);
			
			SearchResult<T> result = new SearchResult<T>(list,size.longValue());
			
			return result;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}finally{
			client.close();
		}
		
	}

	@Override
	public <T>  void  insert(Object obj, Class<T> objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();

	}

	@Override
	public <T>  void remove(Object obj, Class<T> objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();

	}

	@Override
	public List<Object> applyChanges( List<Object> changes) throws RepositoryException {
		try {
			client = ClientBuilder.newClient();

			ObjectMapper mapper = ObjectMapperBuilder.getObjectMapper();
			mapper.enableDefaultTyping();

			MultivaluedMap<String, String> formData = new MultivaluedHashMap<String, String>();

			int index = 0;
			for (Object o : changes) {
				formData.add(Integer.valueOf(index).toString()+"_type", o.getClass().getName());
				formData.add(Integer.valueOf(index).toString(), mapper.writeValueAsString(o));
				index++;
			}

			String context = base.getPath();
			
			Invocation.Builder builder = client.target(new URL(base, context + "rest/repository/applyChanges").toExternalForm())
					.request(MediaType.APPLICATION_JSON);
			 if ( customizer != null) {
				 builder = customizer.process(builder);
			 }
			Response response = builder.post(Entity.form(formData));

			
			
			if (response.getStatus() != Response.Status.OK.getStatusCode()) {
				throw new RepositoryException(response.readEntity(String.class));
			}
			
			@SuppressWarnings("unchecked")
			MultivaluedMap<String, String> map = response.readEntity(MultivaluedHashMap.class);
		    ArrayList<Object> list = new ArrayList<>();
		    
			for (int i  = 0; ;i++){
				String key = Integer.valueOf(i).toString();
				if (map.get(key) == null){
					break;
				}
				String className = map.get(key+"_type").get(0);
				Class<?> clazz = Class.forName(className);
				list.add( mapper.readValue(map.get(key).get(0),clazz));
			}
			return list;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}finally{
			client.close();
		}
	}

	@Override
	public  <T> T find(Object pk, Class<T> objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	
	
}
