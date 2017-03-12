package org.tura.platform.repository.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
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
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;

import objects.test.serialazable.jpa.IndepObject1;
import objects.test.serialazable.jpa.IndepObject2;
import objects.test.serialazable.jpa.JPATestPackageDataProvider;
import objects.test.serialazable.jpa.ProxyRepository;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BusinessObjectTest {

	private static EntityManager em;
	@SuppressWarnings("rawtypes")
	private static List commandStack;

	private static Logger logger;

	@BeforeClass
	public static void beforeClass() throws Exception {
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

		return new ProxyRepository(repository){
			@SuppressWarnings("rawtypes")
			public List getCommandStack(){
				   return commandStack ;
			   }

		};

	}
	@Test
	public void t0000_loadObject() {
		try {
			ProxyRepository repository = getRepository();

			em.getTransaction().begin();
			
			IndepObject1 o1 = (IndepObject1) repository.create(IndepObject1.class.getName());
			repository.insert(o1, IndepObject1.class.getName());
			
			IndepObject2 o2 =(IndepObject2) repository.create(IndepObject2.class.getName());
			repository.insert(o2, IndepObject2.class.getName());
			
			o1.getIndepObject2().add(o2);
			
			repository.applyChanges(null);
			
			em.getTransaction().commit();
			
			em.getTransaction().begin();
			
			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, IndepObject1.class.getName());
			assertEquals(1,result.getSearchResult().size());
			o1 = (IndepObject1) result.getSearchResult().get(0); 
			
			assertEquals(1,o1.getIndepObject2().size());
			
			o2 = o1.getIndepObject2().get(0); 
			
			em.getTransaction().commit();
			
			em.getTransaction().begin();
			repository.remove(o1, IndepObject1.class.getName());
			repository.remove(o2, IndepObject2.class.getName());
			
			repository.applyChanges(null);

			em.getTransaction().commit();
			
			em.getTransaction().begin();
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, IndepObject1.class.getName());
			assertEquals(0,result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, IndepObject2.class.getName());
			assertEquals(0,result.getSearchResult().size());
			
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
	public void t0001_loadObject() {
		try {
			ProxyRepository repository = getRepository();

			em.getTransaction().begin();
			
			IndepObject1 o1 = (IndepObject1) repository.create(IndepObject1.class.getName());
			repository.insert(o1, IndepObject1.class.getName());
			
			IndepObject2 o2 =(IndepObject2) repository.create(IndepObject2.class.getName());
			repository.insert(o2, IndepObject2.class.getName());
			
			repository.applyChanges(null);
			
			em.getTransaction().commit();
			
			em.getTransaction().begin();
			
			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, IndepObject1.class.getName());
			assertEquals(1,result.getSearchResult().size());
			o1 = (IndepObject1) result.getSearchResult().get(0); 
			
			assertEquals(0,o1.getIndepObject2().size());
			
			
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