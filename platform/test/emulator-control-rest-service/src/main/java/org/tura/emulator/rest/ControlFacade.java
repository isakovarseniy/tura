/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import org.tura.emulator.EmulatorControl;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;


@Path("control")
public class ControlFacade {

	@GET
	@Path("initSession")
	public Response initSession(@QueryParam("serviceName") String serviceName,
			@QueryParam("methodName") String methodName, @QueryParam("sessionType") String sessionType)
			throws Exception {
		EmulatorControl control = new EmulatorControl(serviceName, methodName);
		control.initSession(sessionType);
		return Response.ok().build();
	}

	@POST
	@Consumes("application/json")
	@Path("createReturnObjectCommand")
	public Response createReturnObjectCommand(CreateReturnObject object) throws Exception {
		EmulatorControl control = new EmulatorControl(object.getServiceName(), object.getMethodName());
		control.createReturnObjectCommand(object.getSequence(), object.getType(), object.getPayload(),
				object.getDalay());
		return Response.ok().build();
	}

	@POST
	@Consumes("application/json")
	@Path("createExceptionObjectCommand")
	public Response createExceptionObjectCommand(CreateExceptionObject object) throws Exception {
		EmulatorControl control = new EmulatorControl(object.getServiceName(), object.getMethodName());
		control.createExceptionObjectCommand(object.getSequence(), object.getCode(), object.getMessage());
		return Response.ok().build();

	}

}
