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

package org.tura.emulator.rest;

import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.StatusType;
import javax.ws.rs.core.Response.Status.Family;

import org.tura.emulator.cmd.EmulatorException;

@Provider
public class EmulatorExceptionMapper implements ExceptionMapper<EmulatorException> {

	public Response toResponse(EmulatorException exception) {
		StatusType statusType = new StatusType() {
			
			@Override
			public int getStatusCode() {
				return Integer.parseInt(exception.getCode());
			}
			
			@Override
			public String getReasonPhrase() {
				return exception.getMessage();
			}
			
			@Override
			public Family getFamily() {
				return null;
			}
		};
		
		return Response.status(statusType).entity(exception.getMessage()).type("text/plain").build();
	}

	
	
	
}
