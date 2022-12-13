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

package org.tura.jpa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.tura.emulator.api.EmulatorControlApi;
import org.tura.emulator.users.generated.ApiClient;
import org.tura.emulator.users.generated.ApiException;
import org.tura.emulator.users.generated.client.UserFacadeApi;

import objects.test.serialazable.jpa.Client;
import objects.test.serialazable.jpa.Person;
import objects.test.serialazable.jpa.PersonType;

public class EmulatorTest {
	String basePath = "http://127.0.0.1:8080/emulator-control/rest";

	String userBasePath = "http://127.0.0.1:8080/emulator-user/rest";

	@Test
	public void createTemplateTest() {
		try {

			EmulatorControlApi api = new EmulatorControlApi("UsersManager", "getUser", basePath);
			api.initSession(EmulatorControlApi.OneTemplate);

			Person person = new Person();
			person.setName("Person");
			person.setGender(PersonType.MALE);

			Client client = new Client();
			client.setName("Client name");
			client.setObjId(1L);
			client.setPerson(person);

			api.createReturnObjectCommand(1, client);

			ApiClient apiClient = new ApiClient();
			apiClient.setBasePath(userBasePath);
			UserFacadeApi userApi = new UserFacadeApi(apiClient);
			org.tura.emulator.users.generated.model.Client client1 = userApi.getUser("qwerty");

			assertEquals(client.getName(), client1.getName());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void returnExteption() {
		try {

			EmulatorControlApi api = new EmulatorControlApi("UsersManager", "getUser", basePath);
			api.initSession(EmulatorControlApi.OneTemplate);

			Integer code = Integer.valueOf(439);
			String message =  "Emulated Exception";
			api.createExceptionObjectCommand(1, code.toString(), message);

			ApiClient apiClient = new ApiClient();
			apiClient.setBasePath(userBasePath);
			UserFacadeApi userApi = new UserFacadeApi(apiClient);
			try {
				userApi.getUserWithHttpInfo("qwerty");
				fail();
			} catch (ApiException e) {
				assertEquals(message, e.getResponseBody());
				assertEquals( code, Integer.valueOf( e.getCode()));
			}

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

}
