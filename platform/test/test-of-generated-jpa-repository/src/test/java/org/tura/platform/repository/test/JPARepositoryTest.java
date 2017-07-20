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
import java.util.logging.Logger;

import javax.persistence.EntityManager;
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
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

import objects.test.serialazable.jpa.AddCustomer2LocationOnNoAssosiationCustomerData;
import objects.test.serialazable.jpa.Client;
import objects.test.serialazable.jpa.Customer;
import objects.test.serialazable.jpa.File;
import objects.test.serialazable.jpa.JPATestPackageDataProvider;
import objects.test.serialazable.jpa.Location;
import objects.test.serialazable.jpa.MailAddress;
import objects.test.serialazable.jpa.Order;
import objects.test.serialazable.jpa.Person;
import objects.test.serialazable.jpa.Phone;
import objects.test.serialazable.jpa.ProxyRepository;
import objects.test.serialazable.jpa.Vehicle;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JPARepositoryTest {

	private static EntityManager em;
	@SuppressWarnings("rawtypes")
	private static List commandStack;
	private ProxyCommadStackProvider stackProvider = new ProxyCommadStackProvider(){

		@SuppressWarnings("unchecked")
		@Override
		public void addCommand(Object cmd) throws Exception {
			commandStack.add(cmd);
			
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Object> getListOfCommand() throws Exception {
			return commandStack;
		}

		@Override
		public void clear() throws Exception {
			commandStack.clear();
			
		}
		
	};	
	

	private static Logger logger;
	private static Server server;

	
	@AfterClass
	public static void afterClass() throws Exception {
		server.stop();
	}
	
	
	@BeforeClass
	public static void beforeClass() throws Exception {
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
		em = emf.createEntityManager();

	}

	private ProxyRepository getRepository() {
		Repository repository = new BasicRepository();
		commandStack = new ArrayList<>();
		
		JPATestPackageDataProvider dataProvider = new JPATestPackageDataProvider();
		dataProvider.setEntityManager(em);
		dataProvider.setRepository(repository);
		dataProvider.setPkStrategy(new UUIPrimaryKeyStrategy());
		dataProvider.init();
		
		
		return  new ProxyRepository(repository,stackProvider);
		
	}

	@Test
	public void t0000_saveObject() {
		try {
			ProxyRepository repository = getRepository();

			em.getTransaction().begin();

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

			em.getTransaction().commit();

			em.getTransaction().begin();

			List<OrderCriteria> orderby = new ArrayList<OrderCriteria>();
			OrderCriteria citeria = new OrderCriteria();
			citeria.setName("name");
			citeria.setOrder("ASC");
			orderby.add(citeria);

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), orderby, 0, 100, Client.class.getName());
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

			em.getTransaction().commit();

		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t0001_removeUpdateObject() {
		try {

			ProxyRepository repository = getRepository();

			em.getTransaction().begin();

			List<OrderCriteria> orderby = new ArrayList<OrderCriteria>();
			OrderCriteria citeria = new OrderCriteria();
			citeria.setName("name");
			citeria.setOrder("ASC");
			orderby.add(citeria);

			SearchResult result  = repository.find(new ArrayList<SearchCriteria>(), orderby, 0, 100, Client.class.getName());
			List<?> list = result.getSearchResult();
			Client client = (Client) list.get(0);
			client.getPerson().setFile(null);
			client.setName("Client name 3");

			repository.applyChanges(null);


			em.getTransaction().commit();

			em.getTransaction().begin();

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

			em.getTransaction().commit();

		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
			fail();
		}

	}

	@SuppressWarnings("unchecked")
	@Test
	public void t0002_insertIndependentObject() {
		try {

			ProxyRepository repository = getRepository();

			em.getTransaction().begin();

			Customer customer = (Customer) repository.create(Customer.class.getName());
			customer.setCustomerName("Customer 1");
			repository.insert(customer, Customer.class.getName());

			Location location = (Location) repository.create(Location.class.getName());
			location.setCity("City");
			location.setStreet("Street");
			repository.insert(location, Location.class.getName());

			AddCustomer2LocationOnNoAssosiationCustomerData m2m =new AddCustomer2LocationOnNoAssosiationCustomerData();
			
			m2m.setCustomerCustomerId(customer.getCustomerId());
			m2m.setLocationObjId(location.getObjId());
			stackProvider.addCommand(m2m);

			Vehicle vehicle = (Vehicle) repository.create(Vehicle.class.getName());
			vehicle.setModel("Honda");
			repository.insert(vehicle, Vehicle.class.getName());

			Order order = (Order) repository.create(Order.class.getName());
			order.setCustomer(customer.getCustomerId());
			order.setModel(vehicle.getModel());
			order.setVehicleId(vehicle.getObjId());
			repository.insert(order, Order.class.getName());

			repository.applyChanges(null);
			
			em.getTransaction().commit();

			em.getTransaction().begin();
			Query query = em.createQuery("from Location");
			List<org.tura.jpa.test.Location> listLocatioin = query.getResultList();
			org.tura.jpa.test.Location loc = listLocatioin.iterator().next();
			assertEquals(1, loc.getCustomer().size());

			query = em.createQuery("from Customer");
			List<org.tura.jpa.test.Customer> listCustomer = query.getResultList();
			org.tura.jpa.test.Customer ctr = listCustomer.iterator().next();
			assertEquals(1, ctr.getLocation().size());

			em.getTransaction().commit();

			commandStack.clear();
			
			em.getTransaction().begin();

			SearchResult result =  repository.find(new ArrayList<SearchCriteria>(),
					new ArrayList<OrderCriteria>(), 0, 100, Customer.class.getName());
			List <Customer> cList =(List<Customer>) result.getSearchResult();
			assertEquals(1, cList.size());
			customer = cList.iterator().next();
			repository.remove(customer, Customer.class.getName());
			
			repository.applyChanges(null);
			

			result = repository.find(new ArrayList<SearchCriteria>(),
					new ArrayList<OrderCriteria>(), 0, 100, Order.class.getName());
			List<Order> oList = (List<Order>) result.getSearchResult();
			assertEquals(1, oList.size());

			em.getTransaction().commit();

		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
			fail();
		}

	}

}
