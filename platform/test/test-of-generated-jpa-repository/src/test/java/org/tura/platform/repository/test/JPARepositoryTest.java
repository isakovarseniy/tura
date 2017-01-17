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

import org.hibernate.cfg.Configuration;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.Repository;

import objects.test.serialazable.jpa.Client;
import objects.test.serialazable.jpa.Customer;
import objects.test.serialazable.jpa.File;
import objects.test.serialazable.jpa.JPATestPackageDataProvider;
import objects.test.serialazable.jpa.Location;
import objects.test.serialazable.jpa.LocationMany2ManyCustomerRelation;
import objects.test.serialazable.jpa.MailAddress;
import objects.test.serialazable.jpa.Order;
import objects.test.serialazable.jpa.Person;
import objects.test.serialazable.jpa.Phone;
import objects.test.serialazable.jpa.Vehicle;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JPARepositoryTest {

	private static EntityManager em;

	private static Logger logger;
	
	
	@BeforeClass
	public static void beforeClass() throws Exception{
		logger = Logger.getLogger("InfoLogging");
		logger.setUseParentHandlers(false);
//		ConsoleHandler handler = new ConsoleHandler();
//		handler.setFormatter(new LogFormatter());
//		logger.addHandler(handler);
//		logger.setLevel(Level.INFO);

		Configuration config = new Configuration();
		config.addResource("META-INF/persistence.xml");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPARepository", config.getProperties());
		em = emf.createEntityManager();
		
	}

	@Test
	public void t0000_saveObject(){
		try{
		
		Repository repository = new BasicRepository();
		JPATestPackageDataProvider  dataProvider = new JPATestPackageDataProvider(repository);
		dataProvider.setEntityManager(em);
		dataProvider.setPkStrategy(new UUIPrimaryKeyStrategy());

		em.getTransaction().begin();
		
		MailAddress address  = 	(MailAddress)	repository.create(MailAddress.class.getName());
		address.setAddress("Address 1");
		
		Client client = (Client) repository.create(Client.class.getName());
		client.setName("Client name 1");
		client.setOperation("I");
		
		Person person = (Person) repository.create(Person.class.getName());
		person.setName("Person name 1");
		
		Phone phone = (Phone)repository.create(Phone.class.getName());
		phone.setPhone("111-111");
		
		Phone phone1 = (Phone)repository.create(Phone.class.getName());
		phone1.setPhone("222-222");
		
		File dir1 = (File)repository.create(File.class.getName());
		dir1.setFileName("Dir1");
		
		File dir2 = (File)repository.create(File.class.getName());
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
		client.setOperation("I");
		
		person = (Person) repository.create(Person.class.getName());
		person.setName("Person name 2");
		
		client.setPerson(person);
		person.getMailAddress().add(address);

		repository.insert(client, Client.class.getName());
		
		em.getTransaction().commit();
		
		
		em.getTransaction().begin();
		
		List<OrderCriteria> orderby = new ArrayList<OrderCriteria>();
		OrderCriteria citeria = new OrderCriteria();
		citeria.setName("name");
		citeria.setOrder("ASC");
		orderby.add(citeria);
		
		
		List<?> list =  repository.find(new ArrayList<SearchCriteria>(), orderby, 0, 100, Client.class.getName());
		client = (Client) list.get(0);
		assertEquals("Client name 1",client.getName());
		
		person  = client.getPerson();
		assertEquals("Person name 1",person.getName());
		
		assertEquals(1,person.getMailAddress().size());
		assertEquals("Address 1", person.getMailAddress().get(0).getAddress());
		
		assertEquals(2,person.getPhone().size());
		HashMap<String,String> h = new HashMap<>(); 
		String[] expectedNumbers = new String[]{"111-111","222-222"};
		for(Phone p : person.getPhone()){
			if (Arrays.asList(expectedNumbers).contains(p.getPhone())){
				h.put(p.getPhone(), p.getPhone());
			}
		}
		assertEquals(2,h.values().size());
		
		dir1 = person.getFile();
		assertEquals("Dir1", dir1.getFileName());
		
		assertEquals(1, dir1.getFile().size());  
		assertEquals("Dir2", dir1.getFile().get(0).getFileName());
		
		
		client = (Client) list.get(1);
		assertEquals("Client name 2",client.getName());

		person  = client.getPerson();
		assertEquals("Person name 2",person.getName());
		
		assertEquals(1,person.getMailAddress().size());
		assertEquals("Address 1", person.getMailAddress().get(0).getAddress());
		
		assertEquals(0,person.getPhone().size());
		assertNull(person.getFile());
		
		em.getTransaction().commit();
		
		}catch(Exception e){
			if (em.getTransaction().isActive()){
			    em.getTransaction().rollback();
			}
			e.printStackTrace();
			fail();
		}
		
	}

	@Test
	public void t0001_removeUpdateObject(){
		try{

			Repository repository = new BasicRepository();
			JPATestPackageDataProvider  dataProvider = new JPATestPackageDataProvider(repository);
			dataProvider.setEntityManager(em);
			dataProvider.setPkStrategy(new UUIPrimaryKeyStrategy());

			em.getTransaction().begin();
			
			List<OrderCriteria> orderby = new ArrayList<OrderCriteria>();
			OrderCriteria citeria = new OrderCriteria();
			citeria.setName("name");
			citeria.setOrder("ASC");
			orderby.add(citeria);
			
			
			List<?> list =  repository.find(new ArrayList<SearchCriteria>(), orderby, 0, 100, Client.class.getName());
			Client client = (Client) list.get(0);
			client.getPerson().getFile().setOperation("R");
			client.setName("Client name 3");
			client.setOperation("U");
			
			repository.update(client, Client.class.getName());
			
			em.getTransaction().commit();
			
			em.getTransaction().begin();
	
			list =  repository.find(new ArrayList<SearchCriteria>(), orderby, 0, 100, Client.class.getName());
		//Should be on second position because ordering by name	
			client = (Client) list.get(1);
			assertEquals("Client name 3",client.getName());
			assertNull(client.getPerson().getFile());
			
			list =  repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, File.class.getName());
			assertEquals(0, list.size());
			
			em.getTransaction().commit();
			
			
			
		}catch(Exception e){
			if (em.getTransaction().isActive()){
			    em.getTransaction().rollback();
			}
			e.printStackTrace();
			fail();
		}
		
	}	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t0002_insertIndependentObject(){
		try{

			Repository repository = new BasicRepository();
			JPATestPackageDataProvider  dataProvider = new JPATestPackageDataProvider(repository);
			dataProvider.setEntityManager(em);
			dataProvider.setPkStrategy(new UUIPrimaryKeyStrategy());

			em.getTransaction().begin();

			Customer customer = (Customer) repository.create(Customer.class.getName());
			customer.setCustomerName("Customer 1");
			customer.setOperation("I");
			repository.insert(customer, Customer.class.getName());
			
			
			Location location = (Location) repository.create(Location.class.getName());
			location.setCity("City");
			location.setStreet("Street");
			location.setOperation("I");
			repository.insert(location, Location.class.getName());
			
			
			LocationMany2ManyCustomerRelation m2m = (LocationMany2ManyCustomerRelation)repository.create(LocationMany2ManyCustomerRelation.class.getName());
			m2m.setCustomerCustomerId(customer.getCustomerId());
			m2m.setLocationObjId(location.getObjId());
			m2m.setOperation("I");
			repository.insert(m2m, LocationMany2ManyCustomerRelation.class.getName());
			
			
			Vehicle vehicle = (Vehicle) repository.create(Vehicle.class.getName());
			vehicle.setModel("Honda");
			vehicle.setOperation("I");
			repository.insert(vehicle, Vehicle.class.getName());
			
			
			Order order = (Order) repository.create(Order.class.getName());
			order.setCustomer(customer.getCustomerId());
			order.setModel(vehicle.getModel());
			order.setVehicleId(vehicle.getObjId());
			order.setOperation("I");
			repository.insert(vehicle, Vehicle.class.getName());
			
			em.getTransaction().commit();
			
			em.getTransaction().begin();
			Query query = em.createQuery("from Location");
			List <org.tura.jpa.test.Location >  listLocatioin =  query.getResultList();
			org.tura.jpa.test.Location loc = listLocatioin.iterator().next();
			assertEquals (1, loc.getCustomer().size());

			query = em.createQuery("from Customer");
			List <org.tura.jpa.test.Customer >  listCustomer =  query.getResultList();
			org.tura.jpa.test.Customer ctr = listCustomer.iterator().next();
			assertEquals (1, ctr.getLocation().size());
			
			em.getTransaction().commit();
			
			em.getTransaction().begin();
			
			List<Customer> cList =  (List<Customer>) repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, Customer.class.getName());
			assertEquals(1, cList.size());
			customer = cList.iterator().next();
			customer.setOperation("R");
			repository.remove(customer, Customer.class.getName());
			
			List<Order> oList =  (List<Order>) repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, Order.class.getName());
			assertEquals(0,oList.size());
			
			em.getTransaction().commit();
			
			
		}catch(Exception e){
			if (em.getTransaction().isActive()){
			    em.getTransaction().rollback();
			}
			e.printStackTrace();
			fail();
		}
			
		}	
	
}
