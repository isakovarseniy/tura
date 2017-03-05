package org.tura.platform.repository.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;

import objects.test.serialazable.jpa.JPATestPackageDataProvider;
import objects.test.serialazable.jpa.One2One4A;
import objects.test.serialazable.jpa.One2One4B;
import objects.test.serialazable.jpa.ProxyRepository;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.cfg.Configuration;
import org.junit.BeforeClass;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class One2OneNoAssosiationTest {

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
	public void t0000_One2One1() {
		try {
			ProxyRepository repository = getRepository();

			em.getTransaction().begin();
			
			One2One4A o1 = (One2One4A) repository.create(One2One4A.class.getName());
			
			One2One4B o2 = (One2One4B) repository.create(One2One4B.class.getName());
			
			repository.insert(o2, One2One4B.class.getName());
			repository.insert(o1, One2One4A.class.getName());
			o2.setRef(o1.getObjId());
			repository.applyChanges(null);
			
			em.getTransaction().commit();
			
			em.getTransaction().begin();

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One4A.class.getName());
			assertEquals(1,result.getSearchResult().size());
			o1 = (One2One4A) result.getSearchResult().get(0);
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One4B.class.getName());
			assertEquals(1,result.getSearchResult().size());

			o2 = (One2One4B) result.getSearchResult().get(0);
			assertEquals( o1.getObjId(),  o2.getRef());
			
			em.getTransaction().commit();
			
			em.getTransaction().begin();

			o1 = (One2One4A) repository.create(One2One4A.class.getName());
			repository.insert(o1, One2One4A.class.getName());
			o2.setRef(o1.getObjId());
			
			repository.applyChanges(null);
			
			em.getTransaction().commit();
			
			em.getTransaction().begin();

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One4A.class.getName());
			assertEquals(2,result.getSearchResult().size());
			o1 = (One2One4A) result.getSearchResult().get(0);
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One4B.class.getName());
			assertEquals(1,result.getSearchResult().size());

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
