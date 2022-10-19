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

package org.tura.platform.repository.jpa.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.h2.tools.Server;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.RepositoryProducer;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.cpa.storage.ObjectStatus;
import org.tura.platform.repository.cpa.storage.StorageControl;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.test.suite.RepositoryTestSuite;

import objects.test.serialazable.jpa.Client;
import objects.test.serialazable.jpa.Customer;
import objects.test.serialazable.jpa.File;
import objects.test.serialazable.jpa.FileProxy;
import objects.test.serialazable.jpa.Location;
import objects.test.serialazable.jpa.MailAddress;
import objects.test.serialazable.jpa.Order;
import objects.test.serialazable.jpa.Person;
import objects.test.serialazable.jpa.Phone;
import objects.test.serialazable.jpa.Vehicle;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JPARepositoryTest {

	private static Logger logger;
	private static Server server;
	private static RepositoryProducer repositoryProducer;

	@AfterClass
	public static void afterClass() throws Exception {
		server.stop();
	}

	@BeforeClass
	public static void beforeClass() throws Exception {
		repositoryProducer = new RepositoryProducer();
		server = Server.createTcpServer().start();

		logger = Logger.getLogger("InfoLogging");
		logger.setUseParentHandlers(false);

		// ConsoleHandler handler = new ConsoleHandler();
		// handler.setFormatter(new LogFormatter());
		// logger.addHandler(handler);
		// logger.setLevel(Level.INFO);

		Configuration config = new Configuration();
		config.addResource("META-INF/persistence.xml");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPARepository", config.getProperties());
		repositoryProducer.em = emf.createEntityManager();

	}

	@Test
	public void t0000_saveObject() {
		try {
			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider  = repositoryProducer.cpaStorageProvider;

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

			List<StorageControl> array = cpaStorageProvider.getStorage().find(File.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}))	;		
			assertEquals(2, array.size());
			
			array = cpaStorageProvider.getStorage().find(Phone.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}))	;		
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

			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);

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

			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider  = repositoryProducer.cpaStorageProvider;

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
			
			List<StorageControl> array = cpaStorageProvider.getStorage().find(File.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			client.getPerson().setFile(null);
			client.setName("Client name 3");

			array = cpaStorageProvider.getStorage().find(File.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Removed.name()}) );
			assertEquals(2, array.size());
			
			array = cpaStorageProvider.getStorage().find(Client.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Updated.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(Person.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Updated.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(MailAddress.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			if ( RepositoryTestSuite.lazyObjectRepository) {
			   assertEquals(0, array.size());
			}else {
			   assertEquals(1, array.size());
			}

			stackProvider.get().commit();

			array = cpaStorageProvider.getStorage().find(File.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(0, array.size());

			array = cpaStorageProvider.getStorage().find(File.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Removed.name()}) );
			assertEquals(0, array.size());

			array = cpaStorageProvider.getStorage().find(Person.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			if ( RepositoryTestSuite.lazyObjectRepository) {
			   assertEquals(1, array.size());
			}else {
				assertEquals(2, array.size());
			}
			
			array = cpaStorageProvider.getStorage().find(MailAddress.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
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

	@SuppressWarnings({ "unchecked"})
	@Test
	public void t0003_insertIndependentObject() {
		try {

			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();

			Customer customer = (Customer) repository.create(Customer.class);
			customer.setCustomerName("Customer 1");
			repository.insert(customer, Customer.class);

			Location location = (Location) repository.create(Location.class);
			location.setCity("City");
			location.setStreet("Street");
			repository.insert(location, Location.class);

			customer.getLocation().add(location);

			Vehicle vehicle = (Vehicle) repository.create(Vehicle.class);
			vehicle.setModel("Honda");
			repository.insert(vehicle, Vehicle.class);

			Order order = (Order) repository.create(Order.class);
			order.setCustomer(customer);
			order.setVehicle(vehicle);

			stackProvider.get().commit();

			Query query = repositoryProducer.em.createQuery("from Location");
			List<org.tura.jpa.test.Location> listLocatioin = query.getResultList();
			org.tura.jpa.test.Location loc = listLocatioin.iterator().next();
			assertEquals(1, loc.getCustomer().size());

			query = repositoryProducer.em.createQuery("from Customer");
			List<org.tura.jpa.test.Customer> listCustomer = query.getResultList();
			org.tura.jpa.test.Customer ctr = listCustomer.iterator().next();
			assertEquals(1, ctr.getLocation().size());


			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, Customer.class);
			List<Customer> cList = (List<Customer>) result.getSearchResult();
			assertEquals(1, cList.size());
			customer = cList.iterator().next();
			repository.remove(customer, Customer.class);

			stackProvider.get().commit();

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					Order.class);
			List<Order> oList = (List<Order>) result.getSearchResult();
			assertEquals(0, oList.size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

}
