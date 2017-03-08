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

import objects.test.serialazable.jpa.AddMany2Many1B2Many2Many1AOnMany2Many1BData;
import objects.test.serialazable.jpa.Customer;
import objects.test.serialazable.jpa.JPATestPackageDataProvider;
import objects.test.serialazable.jpa.Many2Many1A;
import objects.test.serialazable.jpa.Many2Many1B;
import objects.test.serialazable.jpa.Order;
import objects.test.serialazable.jpa.ProxyRepository;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Many2ManyNoContainmentTest {


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

		return new ProxyRepository(repository) {
			@SuppressWarnings("rawtypes")
			public List getCommandStack() {
				return commandStack;
			}

		};

	}
	@SuppressWarnings("unchecked")
	@Test
	public void t0000_One2Many() {
		try {
			ProxyRepository repository = getRepository();

			em.getTransaction().begin();

			Many2Many1A o1 = (Many2Many1A) repository.create(Many2Many1A.class.getName());
			repository.insert(o1, Many2Many1A.class.getName());

			Many2Many1B o2 = (Many2Many1B) repository.create(Many2Many1B.class.getName());
			repository.insert(o2, Many2Many1B.class.getName());
			
			AddMany2Many1B2Many2Many1AOnMany2Many1BData m2m = new AddMany2Many1B2Many2Many1AOnMany2Many1BData();
			m2m.setMany2Many1AObjId(o1.getObjId());
			m2m.setMany2Many1BObjId(o2.getObjId());
			repository.getCommandStack().add(m2m);
			
			repository.applyChanges(null);
			em.getTransaction().commit();
			
			em.getTransaction().begin();

			SearchResult result =  repository.find(new ArrayList<SearchCriteria>(),
					new ArrayList<OrderCriteria>(), 0, 100, Many2Many1A.class.getName());

			assertEquals(1, result.getSearchResult().size());

			result =  repository.find(new ArrayList<SearchCriteria>(),
					new ArrayList<OrderCriteria>(), 0, 100, Many2Many1B.class.getName());
			
			assertEquals(1, result.getSearchResult().size());


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
