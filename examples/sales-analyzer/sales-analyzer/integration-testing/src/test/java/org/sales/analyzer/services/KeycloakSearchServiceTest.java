package org.sales.analyzer.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.h2.tools.Server;
import org.hibernate.cfg.Configuration;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.representations.idm.RoleRepresentation;
import org.sales.analyzer.process.TestCommons;
import org.sales.analyzer.services.impl.SPAAdapterLoader;
import org.sales.analyzer.services.impl.UUIPrimaryKeyStrategy;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.object.JpaTransactionAdapter;
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.jpa.operation.EntityManagerProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepository;
import org.tura.salesanalyzer.serialized.db.Permission;
import org.tura.salesanalyzer.serialized.db.PermissionReferences;
import org.tura.salesanalyzer.serialized.db.InitJPARepository;
import org.tura.salesanalyzer.serialized.db.ProxyRepository;
import org.tura.salesanalyzer.serialized.jbpm.InitSPARepository;
import org.tura.salesanalyzer.serialized.keycloak.Role;
import org.tura.salesanalyzer.serialized.keycloak.RoleReference;
import org.tura.salesanalyzer.serialized.keycloak.User;

import com.octo.java.sql.exp.Operator;

import sales.analyzer.process.commons.Constants;
import sales.analyzer.service.keycloak.KeyCloakCRUDService;
import sales.analyzer.service.keycloak.KeyCloakSearchService;

@RunWith(Arquillian.class)
public class KeycloakSearchServiceTest {

	private static Logger logger;
	private static Server server;

	private static EntityManager em;
	@SuppressWarnings("rawtypes")
	private static List commandStack;

	private Registry registry = new Registry();
	private SpaObjectRegistry spaRegistry = new SpaObjectRegistry();

	private static EntityManagerProvider emProvider = new EntityManagerProvider() {

		@Override
		public EntityManager getEntityManager() {
			return em;
		}

		@Override
		public void destroyEntityManager() {

		}
	};

	private ProxyCommadStackProvider stackProvider = new ProxyCommadStackProvider() {

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

	private ProxyRepository getRepository() throws Exception {

		registry.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
		Repository repository = new BasicRepository(registry);
		commandStack = new ArrayList<>();

		InitJPARepository initJpa = new InitJPARepository(new SpaRepository(), registry, spaRegistry);
		initJpa.initClassMapping();
		initJpa.initCommandProducer();
		initJpa.initProvider();
		initJpa.initEntityManagerProvider(emProvider);

		InitSPARepository initSpa = new InitSPARepository(new SpaRepository(), registry, spaRegistry);
		initSpa.initClassMapping();
		initSpa.initCommandProducer();
		initSpa.initProvider();

		Keycloak keycloak = KeycloakBuilder.builder()
						.serverUrl(TestCommons.KEYCLOAK_URL)
						.realm(TestCommons.KEYCLOAK_ADMIN_REALM)
						.clientId(TestCommons.KEYCLOAK_ADMIN_CLIENTID)
						.grantType(OAuth2Constants.PASSWORD)
						.clientSecret(TestCommons.CLIENT_SECRET)
						.username(TestCommons.ADMIN_USER)
						.password(TestCommons.ADMIN_PASSWORD)
						.build();
		RealmResource realmResource = keycloak.realm(TestCommons.KEYCLOAK_MANAGED_REALM);
		
		KeyCloakSearchService ks = new KeyCloakSearchService(realmResource);

		KeyCloakSearchService ks1 = new KeyCloakSearchService(realmResource);

		KeyCloakCRUDService crud = new KeyCloakCRUDService(realmResource);
		
		registry.setTransactrionAdapter(new JpaTransactionAdapter(em, registry));
		spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(org.tura.salesanalyzer.persistence.keycloak.User.class,crud);
		spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(RoleRepresentation.class,crud);
		
		spaRegistry.getRegistry("spa-persistence-repository").addSearchProvider(org.tura.salesanalyzer.persistence.keycloak.User.class, ks);
		spaRegistry.getRegistry("spa-persistence-repository").addSearchProvider(RoleRepresentation.class, ks1);

		spaRegistry.getRegistry("spa-persistence-repository")
				.addLoader(org.tura.salesanalyzer.persistence.keycloak.User.class.getName(), new SPAAdapterLoader(realmResource));
		spaRegistry.getRegistry("spa-persistence-repository")
		    .addLoader(org.tura.salesanalyzer.persistence.keycloak.RoleRef.class.getName(), new SPAAdapterLoader(realmResource));

		registry.addLoader(User.class.getName(), new SPAAdapterLoader(realmResource));

		return new ProxyRepository(repository, stackProvider);

	}

	@Test
	@RunAsClient
	public void t0000_searchUsers() {
		try {

			ProxyRepository repository = getRepository();
			@SuppressWarnings("unused")
			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, User.class.getName());

			System.out.println("");

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					Role.class.getName());

			System.out.println("");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}


	@Test
	@RunAsClient
	public void t0000_createUsersAndRoles() {
		try {

			ProxyRepository repository = getRepository();
			Role role = (Role) repository.create(Role.class.getName());
			String roleName = "role_"+UUID.randomUUID().toString();
			role.setName(roleName);
			repository.insert(role, Role.class.getName());
			repository.applyChanges(null);
			
			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					Role.class.getName());
			boolean found = false;
			for (Object obj : result.getSearchResult()) {
				role = (Role) obj;
				if (role.getName().equals(roleName)) {
					found = true;
					break;
				}
			}
			assertTrue(found);
			
			User user = (User) repository.create(User.class.getName());
			String userName = UUID.randomUUID().toString();
			user.setUsername(userName);
			repository.insert(user, User.class.getName());
			repository.applyChanges(null);

			ArrayList<SearchCriteria> search = new ArrayList<>();
			SearchCriteria sc = new SearchCriteria();
			sc.setName(Constants.VAR_USERNAME);
			sc.setComparator(Operator.EQ.name());
			sc.setValue(userName);
			search.add(sc);
			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100,User.class.getName());
			assertEquals(1, result.getNumberOfRows());
			user = (User) result.getSearchResult().get(0);
			assertEquals(userName,user.getUsername());
			
			RoleReference roleref = (RoleReference) repository.create(RoleReference.class.getName());
			user.getRoleReference().add(roleref);
			roleref.setRole(role);
			repository.applyChanges(null);
			
			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100,User.class.getName());
			assertEquals(1, result.getNumberOfRows());
			user = (User) result.getSearchResult().get(0);
			assertEquals(userName,user.getUsername());
			
// 3 roles becouse keycloak assign 2 roles automaticaly(  offline_access, uma_authorisation )			
			assertEquals(3, user.getRoleReference().size());
			
			String[] rolesArray = new String[] {  "uma_authorization", "offline_access",   roleName};
			List<String>  arrayList = Arrays.asList(rolesArray);

			int i =0;
			for (RoleReference rf : user.getRoleReference()  ) {
				Role role0 = rf.getRole();
				if ( arrayList.contains(role0.getName())) {
					i++;
				}
			}
			assertEquals(i, 3);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void userProfileTest() {
		try {
			ProxyRepository repository = getRepository();
			Role role = (Role) repository.create(Role.class.getName());
			String roleName = "role_"+UUID.randomUUID().toString();
			role.setName(roleName);
			repository.insert(role, Role.class.getName());
			repository.applyChanges(null);
			
			
			Permission perm1 = (Permission) repository.create(Permission.class.getName());
			perm1.setName("Perm1");
			repository.insert(perm1, Permission.class.getName());
			
			Permission perm2 = (Permission) repository.create(Permission.class.getName());
			perm2.setName("Perm2");
			repository.insert(perm2, Permission.class.getName());
			
			repository.applyChanges(null);
			
			PermissionReferences permRef = (PermissionReferences) repository.create(PermissionReferences.class.getName());
			role.getPermissionReferences().add(permRef);
			permRef.setPermission(perm1);
			
			permRef = (PermissionReferences) repository.create(PermissionReferences.class.getName());
			role.getPermissionReferences().add(permRef);
			permRef.setPermission(perm2);
			
			repository.applyChanges(null);
			
			
			ArrayList<SearchCriteria> search = new ArrayList<>();
			SearchCriteria sc = new SearchCriteria();
			sc.setName(Constants.VAR_ROLE_NAME);
			sc.setComparator(Operator.EQ.name());
			sc.setValue(roleName);
			search.add(sc);
			SearchResult result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100,Role.class.getName());
			assertEquals(1, result.getNumberOfRows());
			
			role = (Role) result.getSearchResult().get(0);
			
			assertEquals(2, role.getPermissionReferences().size());
			
			
			String[] permArray = new String[] {  "Perm1", "Perm2"};
			List<String>  arrayList = Arrays.asList(permArray);

			int i = 0;
			for (PermissionReferences ref : role.getPermissionReferences()) {
				if (arrayList.contains(ref.getPermission().getName())) {
					i++;
				}
			}
		
			assertEquals(i, 2);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
	
}

