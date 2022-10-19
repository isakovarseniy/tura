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

package org.tura.emulator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.tura.emulator.cmd.EmulatorException;
import org.tura.emulator.lyfecycle.SessionType;

import objects.test.serialazable.jpa.Client;
import objects.test.serialazable.jpa.Person;
import objects.test.serialazable.jpa.PersonType;

public class OneTepmlateTest extends AbstarctTest {

	@Test
	public void returnObject() {
		try {

			System.setProperty(Constants.BASE_PATH_PARAMETER, BASE_PATH);
			EmulatorControl control = new EmulatorControl("UsersManager", "getUser");
			control.initSession(SessionType.OneTemplate.name());

			Person person = new Person();
			person.setName("Person");
			person.setGender(PersonType.MALE);

			Client client = new Client();
			client.setName("Client name");
			client.setObjId(1L);
			client.setPerson(person);

			control.createReturnObjectCommand(1, client.getClass().getName(), writeToString(client),5);

			Client client1 = (Client) control.getResponse();

			assertEquals(client.getName(), client1.getName());

			Client client2 = (Client) control.getResponse();

			assertEquals(client.getName(), client2.getName());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void returnExteption() {
		try {

			System.setProperty(Constants.BASE_PATH_PARAMETER, BASE_PATH);
			EmulatorControl control = new EmulatorControl("UsersManager", "getUser");
			control.initSession(SessionType.OneTemplate.name());

			control.createExceptionObjectCommand(1, "200", "Exception");

			EmulatorException ex = null;
			try {
				control.getResponse();
				fail();
			}catch( EmulatorException e) {
				ex = e;
			}
			assertNotNull(ex);
			assertEquals(ex.getCode(), "200");
			assertEquals(ex.getMessage(), "Exception");
			
			ex = null;
			try {
				control.getResponse();
				fail();
			}catch( EmulatorException e) {
				ex = e;
			}
			assertNotNull(ex);
			assertEquals(ex.getCode(), "200");
			assertEquals(ex.getMessage(), "Exception");

			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

}
