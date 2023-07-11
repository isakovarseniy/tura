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

package org.tura.platform.repository.cdi.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.tura.platform.datacontrol.commons.IdDeserializationProblemHandler;
import org.tura.platform.datacontrol.commons.ObjectMapperBuilder;
import org.tura.platform.repository.cdi.ServerRepo;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchRequest;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.core.UpdateRequest;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;



@Path("repository")
@RequestScoped
public class RestRepository {

	@Inject
	@ServerRepo
	private Repository repository;

	@GET
	@Path("create/{id}")
	public Response create(@PathParam("id") String objectClass) {
		try {
			ObjectMapper mapper = ObjectMapperBuilder.getObjectMapper();
			Object obj = repository.create(Class.forName(objectClass));
			return Response.status(Response.Status.OK).entity(mapper.writeValueAsString(obj)).build();
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
		}
	}

	@POST
	@Path("find")
	public Response find(String map) {
		try {
			ObjectMapper mapper = ObjectMapperBuilder.getObjectMapper();
			mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE,
					JsonTypeInfo.As.PROPERTY);
		    SearchRequest request = mapper.readValue(map.getBytes(), SearchRequest.class);

			SearchResult <?> result = repository.find(request.getSearch(), request.getOrder(), request.getStartIndex(), request.getEndIndex(), Class.forName(  request.getObjectClass()));

			return Response.status(Response.Status.OK).entity(mapper.writeValueAsString(result)).build();
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
		}
	}

	@POST
	@Path("insert")
	public Response insert(Object obj, String objectClass) throws RepositoryException {
		return Response.status(Response.Status.BAD_REQUEST).entity("UnsupportedOperationException").build();
	}

	@POST
	@Path("remove")
	public Response remove(Object obj, String objectClass) throws RepositoryException {
		return Response.status(Response.Status.BAD_REQUEST).entity("UnsupportedOperationException").build();
	}

	@POST
	@Path("applyChanges")
	public Response applyChanges(String map) {
		try {
			ObjectMapper mapper = ObjectMapperBuilder.getObjectMapper();
			mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE,
					JsonTypeInfo.As.PROPERTY);
			mapper.addHandler(new IdDeserializationProblemHandler());
		    
		    UpdateRequest request = mapper.readValue(map.getBytes(), UpdateRequest.class);
		    
			List<Object> changes = repository.applyChanges(request.getChange());
			UpdateRequest response = new UpdateRequest();
			response.setChange(changes);
			
			return Response.status(Response.Status.OK).entity(mapper.writeValueAsBytes(response)).build();
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
		}
	}
	

	
	
}
