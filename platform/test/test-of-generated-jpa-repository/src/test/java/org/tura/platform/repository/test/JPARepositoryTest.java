package org.tura.platform.repository.test;

import static org.junit.Assert.fail;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.cfg.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tura.platform.repository.core.Repository;

import objects.test.serialazable.jpa.Client;
import objects.test.serialazable.jpa.JPATestPackageDataProvider;
import objects.test.serialazable.jpa.MailAddress;
import objects.test.serialazable.jpa.Person;

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
	public void saveObject(){
		try{
		
		Repository repository = new Repository();
		JPATestPackageDataProvider  dataProvider = new JPATestPackageDataProvider(repository);
		dataProvider.setEntityManager(em);
		dataProvider.setPkStrategy(new UUIPrimaryKeyStrategy());

		em.getTransaction().begin();
		
		MailAddress address  = 	(MailAddress)	repository.create(MailAddress.class.getName());
		
		Client client = (Client) repository.create(Client.class.getName());
		client.setName("Client name 1");
		client.setOperation("I");
		
		Person person = (Person) repository.create(Person.class.getName());
		person.setName("Person name 1");
		
		client.setPerson(person);
		person.getMailAddress().add(address);
		
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
		
		}catch(Exception e){
			if (em.getTransaction().isActive()){
			    em.getTransaction().rollback();
			}
			e.printStackTrace();
			fail();
		}
		
	}
	
}
