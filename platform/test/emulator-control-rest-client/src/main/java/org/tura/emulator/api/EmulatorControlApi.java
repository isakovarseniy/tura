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

package org.tura.emulator.api;

import java.text.SimpleDateFormat;

import org.tura.emulator.generated.ApiClient;
import org.tura.emulator.generated.client.ControlFacadeApi;
import org.tura.emulator.generated.model.CreateExceptionObject;
import org.tura.emulator.generated.model.CreateReturnObject;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EmulatorControlApi {

	private ControlFacadeApi fasade;
	
	public static String OneTemplate = "OneTemplate";
	public static String SequenceOfTemplates = "SequenceOfTemplates";
	public static String LooppingSequenceOfTemplates = "LooppingSequenceOfTemplates";

	private String serviceName;
	private String methodName;
	

	
	public EmulatorControlApi(String serviceName, String methodName,String basePath) {
		
		this.serviceName = serviceName;
		this.methodName = methodName;
				
		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath(basePath);
		fasade = new ControlFacadeApi(apiClient);
	}

	public void initSession( String sessionType) throws Exception {
		fasade.initSession(serviceName, methodName, sessionType);
	}

	public void createExceptionObjectCommand( Integer sequence, String code,
			String message) throws Exception {
		
		CreateExceptionObject model = new CreateExceptionObject();
		model.setSequence(sequence);
		model.setServiceName(serviceName);
		model.setMethodName(methodName);
		model.setCode(code);
		model.setMessage(message);

		fasade.createExceptionObjectCommand(model);
	}

	public void createReturnObjectCommand( Integer sequence, Object obj)
			throws Exception {
		createReturnObjectCommand(sequence,obj,0L);
		
	}

	public void createReturnObjectCommand( Integer sequence, Object obj, Long dalay)
			throws Exception {
		createReturnObjectCommand(sequence,obj, dalay,obj.getClass().getName());
	}
	
	
	public void createReturnObjectCommand( Integer sequence, Object obj, Long dalay, String type)
			throws Exception {
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
		
		String payload = mapper.writeValueAsString(obj);
		CreateReturnObject model = new CreateReturnObject();
		model.setSequence(sequence);
		model.setServiceName(serviceName);
		model.setMethodName(methodName);
		model.setDalay(dalay);
		model.setPayload(payload);
		model.setType(type);
		
		fasade.createReturnObjectCommand(model);

		
	}
	
}
