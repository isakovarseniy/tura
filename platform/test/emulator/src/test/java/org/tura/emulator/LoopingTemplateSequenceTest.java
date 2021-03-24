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

package org.tura.emulator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.tura.emulator.lyfecycle.SessionType;

import objects.test.serialazable.jpa.Client;
import objects.test.serialazable.jpa.Person;
import objects.test.serialazable.jpa.PersonType;

public class LoopingTemplateSequenceTest extends AbstarctTest {

	@Test
	public void returnObject() {
		try {

			System.setProperty(Constants.BASE_PATH_PARAMETER, BASE_PATH);
			EmulatorControl control = new EmulatorControl("UsersManager", "getUser");
			control.initSession(SessionType.LooppingSequenceOfTemplates.name());

			Person person = new Person();
			person.setName("Person1");
			person.setGender(PersonType.MALE);

			Client client = new Client();
			client.setName("Client name1");
			client.setObjId(1L);
			client.setPerson(person);

			control.createReturnObjectCommand(1, client.getClass().getName(), writeToString(client));

			person = new Person();
			person.setName("Person2");
			person.setGender(PersonType.MALE);

			client = new Client();
			client.setName("Client name2");
			client.setObjId(2L);
			client.setPerson(person);

			control.createReturnObjectCommand(2, client.getClass().getName(), writeToString(client));

			Client client1 = (Client) control.getResponse();

			assertEquals("Client name1", client1.getName());

			Client client2 = (Client) control.getResponse();

			assertEquals("Client name2", client2.getName());


			client1 = (Client) control.getResponse();

			assertEquals("Client name1", client1.getName());

			client2 = (Client) control.getResponse();

			assertEquals("Client name2", client2.getName());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
}
