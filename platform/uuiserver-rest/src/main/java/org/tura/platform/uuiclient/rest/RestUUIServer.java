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

package org.tura.platform.uuiclient.rest;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.commons.ObjectMapperBuilder;
import org.tura.platform.uuiclient.cdi.Scope;
import org.tura.platform.uuiclient.cdi.ScopeStorage;
import org.tura.platform.uuiclient.cdi.StorageNotFountException;
import org.tura.platform.uuiclient.cdi.UUIClientScopeContext;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Path("uuiserver")
public class RestUUIServer {

	private transient Logger logger = Logger.getLogger(RestUUIServer.class.getName());

	@Inject
	RequestProcessor processor;

	@Inject
	ELResolver elResolver;

	@Inject
	SessionHolder sessionHolder;

	@Inject
	ResponseState responseState;
	
	@Inject
	@Named("storage")
	ScopeStorage scopeStorage;
	
	@Inject
	KeyHolder keyHolder;
	
	
	@POST
	@Path("update/file")
	@Consumes("multipart/form-data")
	public Response uploadFile(MultipartFormDataInput input) {
		try {

			String fileName = "";
			HashMap<String, InputStream> files = new HashMap<>();

			Map<String, List<InputPart>> uploadForm = input.getFormDataMap();
			List<InputPart> inputParts = uploadForm.get("uploadedFile");

			for (InputPart inputPart : inputParts) {
				MultivaluedMap<String, String> header = inputPart.getHeaders();
				fileName = getFileName(header);

				InputStream inputStream = inputPart.getBody(InputStream.class, null);
				files.put(fileName, inputStream);
			}

			inputParts = uploadForm.get("turaRequest");
			if (inputParts == null || inputParts.size() == 0) {
				throw new Exception("No tura request found");
			} else {
				String json = "";
				for (InputPart inputPart : inputParts) {
					InputStream inputStream = inputPart.getBody(InputStream.class, null);
					byte[] bytes = toByteArray(inputStream);
					json += new String(bytes);
				}
				ObjectMapper mapper = ObjectMapperBuilder.getObjectMapper();
				mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
				DataUpdateRequest request = mapper.readValue(json, DataUpdateRequest.class);
				return executeRequesr(request, files);

			}

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
			return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
		}
	}

	@POST
	@Path("update")
	public Response update(DataUpdateRequest dataUpdateRequest) {
		return executeRequesr(dataUpdateRequest, null);
	}

	public Response executeRequesr(DataUpdateRequest dataUpdateRequest, HashMap<String, InputStream> files) {

		try {
			sessionHolder.setScopeStorage(scopeStorage);
			scopeStorage.setSecretKey(keyHolder.getSecretKey());

			scopeStorage.setState(dataUpdateRequest.getSessionState());
			sessionHolder.setSessionId(dataUpdateRequest.getSessionId());
			
			UUIClientScopeContext ctx = new UUIClientScopeContext();
			ctx.setStorage(scopeStorage);
			Scope scope = new Scope(dataUpdateRequest.getFormSelector(), sessionHolder.getSessionId());
			ctx.activate(scope, dataUpdateRequest.isInitSession());

			elResolver.setValue("#{requestLocale}", dataUpdateRequest.getBrowserLanguage());
			if (files != null) {
				elResolver.setValue("#{turaFiles}", files);
			}

			DataUpdateResponse object = processor.process(dataUpdateRequest);
			object.setTopUpdateElementIds(dataUpdateRequest.getTopUpdateElementIds());


			elResolver.setValue("#{requestLocale}", null);
			elResolver.setValue("#{turaFiles}", null);

			ctx.passivate(scope);

			object.setSessionState(scopeStorage.getState());
			MultivaluedMap<String, String> formData = prepareResponse(object);

			return Response.status(Response.Status.OK).entity(formData).build();

		} catch (StorageNotFountException ex) {
			logger.log(Level.INFO, ExceptionUtils.getFullStackTrace(ex), ex);
			try {
				responseState.addFatalError(ex, dataUpdateRequest);
				DataUpdateResponse object = responseState.getResponse();
				MultivaluedMap<String, String> formData = prepareResponse(object);
				return Response.status(Response.Status.OK).entity(formData).build();
			} catch (Exception e) {
				logger.log(Level.INFO, ExceptionUtils.getFullStackTrace(e), e);
				return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
			}
		} catch (Exception e) {
			logger.log(Level.INFO, ExceptionUtils.getFullStackTrace(e), e);
			return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
		}
	}

	private String getFileName(MultivaluedMap<String, String> header) {

		String[] contentDisposition = header.getFirst("Content-Disposition").split(";");

		for (String filename : contentDisposition) {
			if ((filename.trim().startsWith("filename"))) {

				String[] name = filename.split("=");

				String finalFileName = name[1].trim().replaceAll("\"", "");
				return finalFileName;
			}
		}
		return "unknown";
	}

	public byte[] toByteArray(InputStream initialStream) throws IOException {
		byte[] targetArray = new byte[initialStream.available()];
		initialStream.read(targetArray);
		return targetArray;
	}

	private MultivaluedMap<String, String> prepareResponse(DataUpdateResponse object) throws JsonProcessingException {
		MultivaluedMap<String, String> formData = new MultivaluedHashMap<String, String>();

		ObjectMapper mapper = ObjectMapperBuilder.getObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		formData.add("response", encode(mapper.writeValueAsString(object)));
		return formData;

	}

	
	private String encode( String message) {
		return message.replaceAll(" ", "(_)");
	}
	
	
}