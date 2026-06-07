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

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import objects.test.serialazable.jpa.Client;


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
