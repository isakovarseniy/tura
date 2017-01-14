package org.tura.platform.repository.test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.cfg.Configuration;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Repository;

import objects.test.serialazable.jpa.Client;
import objects.test.serialazable.jpa.File;
import objects.test.serialazable.jpa.JPATestPackageDataProvider;
import objects.test.serialazable.jpa.MailAddress;
import objects.test.serialazable.jpa.Person;
import objects.test.serialazable.jpa.Phone;

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
		
		Repository repository = new Repository();
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

			Repository repository = new Repository();
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
