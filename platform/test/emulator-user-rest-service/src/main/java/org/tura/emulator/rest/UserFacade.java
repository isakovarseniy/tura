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

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.tura.emulator.EmulatorControl;

import io.swagger.annotations.Api;
import objects.test.serialazable.jpa.Client;

@Api("UserFacade")
@Path("user")
public class UserFacade {

	@GET
	@Path("getUser")
	@Produces({"application/json"})
	public Client getUser(@QueryParam("userName") String userName) throws Exception {
		EmulatorControl control = new EmulatorControl("UsersManager", "getUser");
		return (Client) control.getResponse();
	}

	
}