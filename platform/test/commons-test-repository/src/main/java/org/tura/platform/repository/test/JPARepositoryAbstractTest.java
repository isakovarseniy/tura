/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.repository.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.SearchResult;

import objects.test.serialazable.jpa.Client;
import objects.test.serialazable.jpa.File;
import objects.test.serialazable.jpa.MailAddress;
import objects.test.serialazable.jpa.Person;
import objects.test.serialazable.jpa.Phone;
import objects.test.serialazable.jpa.ProxyRepository;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public abstract class JPARepositoryAbstractTest {

	public abstract EntityManager getEntityManager();
	public abstract ProxyRepository getRepository();

	@Test
	public void t0000_saveObject() {
		try {
			ProxyRepository repository = getRepository();

			getEntityManager().getTransaction().begin();

			MailAddress address = (MailAddress) repository.create(MailAddress.class.getName());
			address.setAddress("Address 1");
			repository.insert(address, MailAddress.class.getName());

			Client client = (Client) repository.create(Client.class.getName());
			client.setName("Client name 1");

			Person person = (Person) repository.create(Person.class.getName());
			person.setName("Person name 1");

			Phone phone = (Phone) repository.create(Phone.class.getName());
			phone.setPhone("111-111");

			Phone phone1 = (Phone) repository.create(Phone.class.getName());
			phone1.setPhone("222-222");

			File dir1 = (File) repository.create(File.class.getName());
			dir1.setFileName("Dir1");

			File dir2 = (File) repository.create(File.class.getName());
			dir2.setFileName("Dir2");

			dir1.getFile().add(dir2);

			client.setPerson(person);
			person.getMailAddress().add(address);
			person.getPhone().add(phone);
			person.getPhone().add(phone1);
			person.setFile(dir1);

			repository.insert(client, Client.class.getName());

			client = (Client) repository.create(Client.class.getName());
			client.setName("Client name 2");

			person = (Person) repository.create(Person.class.getName());
			person.setName("Person name 2");

			client.setPerson(person);
			person.getMailAddress().add(address);

			repository.insert(client, Client.class.getName());

			repository.applyChanges(null);

			getEntityManager().getTransaction().commit();

			getEntityManager().getTransaction().begin();

			List<OrderCriteria> orderby = new ArrayList<OrderCriteria>();
			OrderCriteria citeria = new OrderCriteria();
			citeria.setName("name");
			citeria.setOrder("ASC");
			orderby.add(citeria);

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), orderby, 0, 100,
					Client.class.getName());
			List<?> list = result.getSearchResult();
			client = (Client) list.get(0);
			assertEquals("Client name 1", client.getName());

			person = client.getPerson();
			assertEquals("Person name 1", person.getName());

			assertEquals(1, person.getMailAddress().size());
			assertEquals("Address 1", person.getMailAddress().get(0).getAddress());

			assertEquals(2, person.getPhone().size());
			HashMap<String, String> h = new HashMap<>();
			String[] expectedNumbers = new String[] { "111-111", "222-222" };
			for (Phone p : person.getPhone()) {
				if (Arrays.asList(expectedNumbers).contains(p.getPhone())) {
					h.put(p.getPhone(), p.getPhone());
				}
			}
			assertEquals(2, h.values().size());

			dir1 = person.getFile();
			assertEquals("Dir1", dir1.getFileName());

			assertEquals(1, dir1.getFile().size());
			assertEquals("Dir2", dir1.getFile().get(0).getFileName());

			client = (Client) list.get(1);
			assertEquals("Client name 2", client.getName());

			person = client.getPerson();
			assertEquals("Person name 2", person.getName());

			assertEquals(1, person.getMailAddress().size());
			assertEquals("Address 1", person.getMailAddress().get(0).getAddress());

			assertEquals(0, person.getPhone().size());
			assertNull(person.getFile());

			getEntityManager().getTransaction().commit();

		} catch (Exception e) {
			if (getEntityManager().getTransaction().isActive()) {
				getEntityManager().getTransaction().rollback();
			}
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t0001_removeUpdateObject() {
		try {

			ProxyRepository repository = getRepository();

			getEntityManager().getTransaction().begin();

			List<OrderCriteria> orderby = new ArrayList<OrderCriteria>();
			OrderCriteria citeria = new OrderCriteria();
			citeria.setName("name");
			citeria.setOrder("ASC");
			orderby.add(citeria);

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), orderby, 0, 100,
					Client.class.getName());
			List<?> list = result.getSearchResult();
			Client client = (Client) list.get(0);
			client.getPerson().setFile(null);
			client.setName("Client name 3");

			repository.applyChanges(null);

			getEntityManager().getTransaction().commit();

			getEntityManager().getTransaction().begin();

			result = repository.find(new ArrayList<SearchCriteria>(), orderby, 0, 100, Client.class.getName());
			list = result.getSearchResult();
			// Should be on second position because ordering by name
			client = (Client) list.get(1);
			assertEquals("Client name 3", client.getName());
			assertNull(client.getPerson().getFile());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					File.class.getName());
			list = result.getSearchResult();
			assertEquals(0, list.size());

			getEntityManager().getTransaction().commit();

		} catch (Exception e) {
			if (getEntityManager().getTransaction().isActive()) {
				getEntityManager().getTransaction().rollback();
			}
			e.printStackTrace();
			fail();
		}

	}


}
