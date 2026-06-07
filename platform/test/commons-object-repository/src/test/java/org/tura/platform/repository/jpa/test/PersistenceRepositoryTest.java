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

package org.tura.platform.repository.jpa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.cpa.storage.ObjectStatus;
import org.tura.platform.repository.cpa.storage.StorageControl;
import org.tura.platform.repository.init.StorageFactory;
import org.tura.platform.repository.init.StorageProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.test.suite.RepositoryTestSuite;

import objects.test.serialazable.jpa.Client;
import objects.test.serialazable.jpa.File;
import objects.test.serialazable.jpa.FileProxy;
import objects.test.serialazable.jpa.MailAddress;
import objects.test.serialazable.jpa.Person;
import objects.test.serialazable.jpa.Phone;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class PersistenceRepositoryTest {

	private static StorageProvider storageProvider = StorageFactory.getStorage();

	@AfterAll
	public static void afterClass() throws Exception {
		storageProvider.stopServer();
	}

	@BeforeAll
	public static void beforeClass() throws Exception {
		storageProvider.startServer();
		storageProvider.initSession();

	}

	@Test
	public void t0000_saveObject() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider  = storageProvider.getCpaStorageProvider();

			MailAddress address = (MailAddress) repository.create(MailAddress.class);
			address.setAddress("Address 1");
			
			repository.insert(address, MailAddress.class);

			Client client = (Client) repository.create(Client.class);
			client.setName("Client name 1");
			
			Person person = (Person) repository.create(Person.class);
			person.setName("Person name 1");
			
			Phone phone = (Phone) repository.create(Phone.class);
			phone.setPhone("111-111");

			Phone phone1 = (Phone) repository.create(Phone.class);
			phone1.setPhone("222-222");

			File dir1 = (File) repository.create(File.class);
			dir1.setFileName("Dir1");
			
			File dir2 = (File) repository.create(File.class);
			dir2.setFileName("Dir2");

			dir1.getFile().add(dir2);

			person.getPhone().add(phone);
			person.getPhone().add(phone1);
			person.setFile(dir1);
			client.setPerson(person);

			List<StorageControl> array = cpaStorageProvider.get().find(File.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}))	;		
			assertEquals(2, array.size());
			
			array = cpaStorageProvider.get().find(Phone.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}))	;		
			assertEquals(2, array.size());
			
			assertEquals(2, person.getPhone().size());
			assertNotNull(person.getFile());
			assertEquals(1, person.getFile().getFile().size());
			
			repository.insert(client, Client.class);
			person.getMailAddress().add(address);
			assertEquals(1, person.getMailAddress().size());
			

			client = (Client) repository.create(Client.class);
			client.setName("Client name 2");

			person = (Person) repository.create(Person.class);
			person.setName("Person name 2");

			client.setPerson(person);
			repository.insert(client, Client.class);
			person.getMailAddress().add(address);

			stackProvider.get().commit();
			
			List<OrderCriteria> orderby = new ArrayList<OrderCriteria>();
			OrderCriteria citeria = new OrderCriteria();
			citeria.setName("name");
			citeria.setOrder("ASC");
			orderby.add(citeria);

			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), orderby, 0, 100, Client.class);
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

			person.setName(null);
			stackProvider.get().commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
	
	@Test
	public void t0001_removeObject() {
		try {

			CpaRepository repository = storageProvider.getRepository();

			List<OrderCriteria> orderby = new ArrayList<OrderCriteria>();
			OrderCriteria citeria = new OrderCriteria();
			citeria.setName("name");
			citeria.setOrder("ASC");
			orderby.add(citeria);

			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), orderby, 0, 100, Client.class);
			List<?> list = result.getSearchResult();
			Client client = (Client) list.get(0);

			FileProxy dir1 = (FileProxy) client.getPerson().getFile();
			dir1.getFile().get(0);

			for (File f : dir1.getFileEager()) {
				f.getObjId();
			}
			client.getPerson().setFile(null);

			try {
				dir1.getFileEager();
				fail();
			} catch (RuntimeException e) {

			}

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
	

	@Test
	public void t0002_removeUpdateObject() {
		try {

			CpaRepository repository = storageProvider.getRepository();
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider  = storageProvider.getCpaStorageProvider();

			List<OrderCriteria> orderby = new ArrayList<OrderCriteria>();
			OrderCriteria citeria = new OrderCriteria();
			citeria.setName("name");
			citeria.setOrder("ASC");
			orderby.add(citeria);

			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), orderby, 0, 100, Client.class);
			
			List<?> list = result.getSearchResult();
			Client client = (Client) list.get(0);
			FileProxy dir1 = (FileProxy) client.getPerson().getFile();
			dir1.getFile().get(0);

			for (File f : dir1.getFileEager()) {
				f.getObjId();
			}
			
			List<StorageControl> array = cpaStorageProvider.get().find(File.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			client.getPerson().setFile(null);
			client.setName("Client name 3");

			array = cpaStorageProvider.get().find(File.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Removed.name()}) );
			assertEquals(2, array.size());
			
			array = cpaStorageProvider.get().find(Client.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Updated.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(Person.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Updated.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.get().find(MailAddress.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			if ( RepositoryTestSuite.lazyObjectRepository) {
			   assertEquals(0, array.size());
			}else {
			   assertEquals(1, array.size());
			}

			stackProvider.get().commit();

			array = cpaStorageProvider.get().find(File.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(0, array.size());

			array = cpaStorageProvider.get().find(File.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Removed.name()}) );
			assertEquals(0, array.size());

			array = cpaStorageProvider.get().find(Person.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			if ( RepositoryTestSuite.lazyObjectRepository) {
			   assertEquals(1, array.size());
			}else {
				assertEquals(2, array.size());
			}
			
			array = cpaStorageProvider.get().find(MailAddress.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			if ( RepositoryTestSuite.lazyObjectRepository) {
				assertEquals(0, array.size());
			}else {
				assertEquals(1, array.size());
			}

			
			result = repository.find(new ArrayList<SearchCriteria>(), orderby, 0, 100, Client.class);
			list = result.getSearchResult();
			// Should be on second position because ordering by name
			client = (Client) list.get(1);
			assertEquals("Client name 3", client.getName());
			assertNull(client.getPerson().getFile());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					File.class);
			list = result.getSearchResult();
			assertEquals(0, list.size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

}
