/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.representations.idm.RoleRepresentation;
import org.sales.analyzer.process.PostDeployer;
import org.sales.analyzer.services.impl.AllowEverythingProfile;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.object.JpaTransactionAdapter;
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.ClientObjectProcessor;
import org.tura.platform.repository.jpa.operation.EntityManagerProvider;
import org.tura.platform.repository.operation.AddLinkOperation;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepository;
import org.tura.platform.test.ClientSearchProvider;
import org.tura.salesanalyzer.serialized.db.City;
import org.tura.salesanalyzer.serialized.db.CityRefeence;
import org.tura.salesanalyzer.serialized.db.Country;
import org.tura.salesanalyzer.serialized.db.CountryReference;
import org.tura.salesanalyzer.serialized.db.Permission;
import org.tura.salesanalyzer.serialized.db.PermissionReferences;
import org.tura.salesanalyzer.serialized.db.State;
import org.tura.salesanalyzer.serialized.db.StateReference;
import org.tura.salesanalyzer.serialized.db.repo.InitJPARepository;
import org.tura.salesanalyzer.serialized.keycloak.Role;
import org.tura.salesanalyzer.serialized.keycloak.RoleReference;
import org.tura.salesanalyzer.serialized.keycloak.User;
import org.tura.salesanalyzer.serialized.proxy.ProxyRepository;
import org.tura.salesanalyzer.serialized.proxy.ProxyRepositoryInstantiator;
import org.tura.salesanalyzer.serialized.repo.InitSPARepository;

import com.octo.java.sql.exp.Operator;

import sales.analyzer.commons.service.impl.KeyCloakServicesInstantiator;
import sales.analyzer.commons.service.impl.SPAAdapterLoader;
import sales.analyzer.commons.service.impl.UUIPrimaryKeyStrategy;
import sales.analyzer.commons.service.impl.UserPreferencesLoader;
import sales.analyzer.process.commons.Constants;
import sales.analyzer.service.keycloak.KeyCloakCRUDService;
import sales.analyzer.service.keycloak.KeyCloakSearchService;
import sales.analyzer.user.UserPreferences;

public class KeycloakServiceTest {

	private static Logger logger;
	private static Server server;

	private static EntityManager em;
	@SuppressWarnings("rawtypes")
	private static List commandStack;

	private Registry registry;
	private SpaObjectRegistry spaRegistry;

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


		private static final long serialVersionUID = -5210875124561974007L;

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
		SpaRepository.SPA_REPOSITORY_DATA_THREAD_LOCAL.get() .set(null);
		registry = new Registry();
		spaRegistry = new SpaObjectRegistry();

		registry.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
		Repository repository = new BasicRepository(registry);
		commandStack = new ArrayList<>();

		InitJPARepository initJpa = new InitJPARepository(registry, spaRegistry);
		initJpa.initClassMapping();
		initJpa.initCommandProducer();
		initJpa.initProvider();
		initJpa.initEntityManagerProvider(emProvider);

		InitSPARepository initSpa = new InitSPARepository( registry, spaRegistry);
		initSpa.initClassMapping();
		initSpa.initCommandProducer();
		initSpa.initProvider();

		Keycloak keycloak = KeycloakBuilder.builder()
						.serverUrl(PostDeployer.KEYCLOAK_URL)
						.realm(PostDeployer.KEYCLOAK_ADMIN_REALM)
						.clientId(PostDeployer.KEYCLOAK_ADMIN_CLIENTID)
						.grantType(OAuth2Constants.PASSWORD)
						.clientSecret(PostDeployer.CLIENT_SECRET)
						.username(PostDeployer.ADMIN_USER)
						.password(PostDeployer.ADMIN_PASSWORD)
						.build();
		RealmResource realmResource = keycloak.realm(PostDeployer.KEYCLOAK_MANAGED_REALM);
		
		KeyCloakServicesInstantiator init = new KeyCloakServicesInstantiator(
				                                                 PostDeployer.KEYCLOAK_URL,
				                                                 PostDeployer.KEYCLOAK_ADMIN_REALM,
				                                                 PostDeployer.KEYCLOAK_ADMIN_CLIENTID,
				                                                 PostDeployer.CLIENT_SECRET,
				                                                 PostDeployer.ADMIN_USER,
				                                                 PostDeployer.ADMIN_PASSWORD,
				                                                 PostDeployer.KEYCLOAK_MANAGED_REALM,
				                                                 registry, spaRegistry, "spa-persistence-repository"
																);
		
		
		registry.addInstantiator(new ProxyRepositoryInstantiator());
		registry.setTransactrionAdapter(new JpaTransactionAdapter(em, registry));
		spaRegistry.getRegistry("spa-persistence-repository").addInstantiator(init);
		
		spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(org.tura.salesanalyzer.persistence.keycloak.User.class,KeyCloakCRUDService.class);
		spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(RoleRepresentation.class,KeyCloakCRUDService.class);
		
		spaRegistry.getRegistry("spa-persistence-repository").addSearchProvider(org.tura.salesanalyzer.persistence.keycloak.User.class, KeyCloakSearchService.class);
		spaRegistry.getRegistry("spa-persistence-repository").addSearchProvider(RoleRepresentation.class, KeyCloakSearchService.class);

		spaRegistry.getRegistry("spa-persistence-repository")
				.addLoader(org.tura.salesanalyzer.persistence.keycloak.User.class.getName(), new SPAAdapterLoader(realmResource));
		spaRegistry.getRegistry("spa-persistence-repository")
		 .addLoader(org.tura.salesanalyzer.persistence.keycloak.RoleRef.class.getName(), new SPAAdapterLoader(realmResource));

		registry.addLoader(User.class.getName(), new SPAAdapterLoader(realmResource));
		registry.addProfile(AllowEverythingProfile.class.getName(), new AllowEverythingProfile());

		ProxyRepository proxy = new ProxyRepository(repository, stackProvider);
		proxy.setProfile(AllowEverythingProfile.class.getName());
		
		return proxy;

	}

	@Test
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
			
// 3 roles because keycloak assign 2 roles automatically( offline_access, uma_authorisation )			
			assertEquals(3, user.getRoleReference().size());
			
			String[] rolesArray = new String[] { "uma_authorization", "offline_access", roleName};
			List<String> arrayList = Arrays.asList(rolesArray);

			int i =0;
			for (RoleReference rf : user.getRoleReference() ) {
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
	
	@SuppressWarnings("rawtypes")
	@Test
	public void rolePermitionTest() {
		try {
			ProxyRepository repository = getRepository();
			ClientSearchProvider searchProvider = new ClientSearchProvider();
			ClientObjectProcessor processor = new ClientObjectProcessor(searchProvider);
			
			
			Role role = (Role) repository.create(Role.class.getName());
			String roleName = "role_"+UUID.randomUUID().toString();
			role.setName(roleName);
			repository.insert(role, Role.class.getName());
			
			searchProvider.addKnownObject((ObjectControl) role);
			List list =  repository.applyChanges(null);
			processor.process(list);

			ArrayList<SearchCriteria> search = new ArrayList<>();
			SearchCriteria sc = new SearchCriteria();
			sc.setName(Constants.VAR_ROLE_NAME);
			sc.setComparator(Operator.EQ.name());
			sc.setValue(roleName);
			search.add(sc);
			SearchResult result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100,Role.class.getName());
			role = (Role) result.getSearchResult().get(0);
			
			
			
			Permission perm1 = (Permission) repository.create(Permission.class.getName());
			perm1.setName("Perm1");
			repository.insert(perm1, Permission.class.getName());
			
			Permission perm2 = (Permission) repository.create(Permission.class.getName());
			perm2.setName("Perm2");
			repository.insert(perm2, Permission.class.getName());
			
			searchProvider.addKnownObject((ObjectControl) perm1);
			searchProvider.addKnownObject((ObjectControl) perm2);
			 list =  repository.applyChanges(null);
			processor.process(list);
			
			PermissionReferences permRef = (PermissionReferences) repository.create(PermissionReferences.class.getName());
			role.getPermissionReferences().add(permRef);
			permRef.setPermission(perm1);
			
			permRef = (PermissionReferences) repository.create(PermissionReferences.class.getName());
			role.getPermissionReferences().add(permRef);
			permRef.setPermission(perm2);
			
			repository.applyChanges(null);
			
			search = new ArrayList<>();
			sc = new SearchCriteria();
			sc.setName(Constants.VAR_ROLE_NAME);
			sc.setComparator(Operator.EQ.name());
			sc.setValue(roleName);
			search.add(sc);
			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100,Role.class.getName());
			assertEquals(1, result.getNumberOfRows());
			
			role = (Role) result.getSearchResult().get(0);
			
			assertEquals(2, role.getPermissionReferences().size());
			
			
			String[] permArray = new String[] { "Perm1", "Perm2"};
			List<String> arrayList = Arrays.asList(permArray);

			int i = 0;
			for (PermissionReferences ref : role.getPermissionReferences()) {
				if (arrayList.contains(ref.getPermission().getName())) {
					i++;
				}
			}
		
			assertEquals(i, 2);

			repository.remove(role, Role.class.getName());
			repository.applyChanges(null);
			
			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100,Role.class.getName());
			assertEquals(0, result.getNumberOfRows());
			
			search = new ArrayList<>();
			sc = new SearchCriteria();
			sc.setName("roleId");
			sc.setComparator(Operator.EQ.name());
			sc.setValue(roleName);
			search.add(sc);

			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100,PermissionReferences.class.getName());
			assertEquals(0, result.getNumberOfRows());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,Permission.class.getName());
			assertEquals(2, result.getNumberOfRows());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
	
	@SuppressWarnings("rawtypes")
	@Test
	public void userPreferencesTest() {
		try {
			ProxyRepository repository = getRepository();
			ClientSearchProvider searchProvider = new ClientSearchProvider();
			ClientObjectProcessor processor = new ClientObjectProcessor(searchProvider);
			
			User user = (User) repository.create(User.class.getName());
			String userName = UUID.randomUUID().toString();
			user.setUsername(userName);
			repository.insert(user, User.class.getName());
			
			searchProvider.addKnownObject((ObjectControl) user);
			List list =  repository.applyChanges(null);
			processor.process(list);

			ArrayList<SearchCriteria>search = new ArrayList<>();
			SearchCriteria sc = new SearchCriteria();
			sc.setName(Constants.VAR_USERNAME);
			sc.setComparator(Operator.EQ.name());
			sc.setValue(userName);
			search.add(sc);
			SearchResult result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100,User.class.getName());
			assertEquals(1, result.getNumberOfRows());
			user = (User) result.getSearchResult().get(0);
			
			
			
			Country country = (Country) repository.create(Country.class.getName());
			repository.insert(country, Country.class.getName());
			
			CountryReference cntRef = (CountryReference) repository.create(CountryReference.class.getName());
			cntRef.setCountryId(country.getObjId());
			user.getCountryReference().add(cntRef);
			
			State state = (State) repository.create(State.class.getName());
			repository.insert(state, State.class.getName());
			
			StateReference stateRef = (StateReference) repository.create(StateReference.class.getName());
			user.getStateReference().add(stateRef);
			stateRef.setStateId(state.getObjId());
			
			
			City city = (City) repository.create(City.class.getName());
			repository.insert(city, City.class.getName());
			
			CityRefeence cityRef = (CityRefeence) repository.create(CityRefeence.class.getName());
			user.getCityRefeence().add(cityRef);
			cityRef.setCityId(city.getObjId());
			
			searchProvider.addKnownObject((ObjectControl) country);
			searchProvider.addKnownObject((ObjectControl) cntRef);
			searchProvider.addKnownObject((ObjectControl) state);
			searchProvider.addKnownObject((ObjectControl) stateRef);
			searchProvider.addKnownObject((ObjectControl) city);
			searchProvider.addKnownObject((ObjectControl) cityRef);
			list =  repository.applyChanges(null);
			processor.process(list);
			
			search = new ArrayList<>();
			sc = new SearchCriteria();
			sc.setName(Constants.VAR_USERNAME);
			sc.setComparator(Operator.EQ.name());
			sc.setValue(userName);
			search.add(sc);
			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100,User.class.getName());
			assertEquals(1, result.getNumberOfRows());
			user = (User) result.getSearchResult().get(0);
			assertEquals(userName,user.getUsername());
			
			assertEquals(1,user.getCountryReference().size());
			CountryReference _cntRef = user.getCountryReference().get(0);
			assertEquals(cntRef.getObjId(),_cntRef.getObjId());
			

			assertEquals(1,user.getCityRefeence().size());
			CityRefeence _cityRef = user.getCityRefeence().get(0);
			assertEquals(cityRef.getObjId(),_cityRef.getObjId());
			
			assertEquals(1,user.getStateReference().size());
			StateReference _stateRef = user.getStateReference().get(0);
			assertEquals(stateRef.getObjId(),_stateRef.getObjId());
			
			repository.remove(user, User.class.getName());
			repository.applyChanges(null);
			
			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100,User.class.getName());
			assertEquals(0, result.getNumberOfRows());
			
			search = new ArrayList<>();
			sc = new SearchCriteria();
			sc.setName("userId");
			sc.setComparator(Operator.EQ.name());
			sc.setValue(user.getId());
			search.add(sc);

			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100,CountryReference.class.getName());
			assertEquals(0, result.getNumberOfRows());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,Country.class.getName());
			assertEquals(1, result.getNumberOfRows());
			
			
			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100,StateReference.class.getName());
			assertEquals(0, result.getNumberOfRows());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,State.class.getName());
			assertEquals(1, result.getNumberOfRows());
			

			
			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100,CityRefeence.class.getName());
			assertEquals(0, result.getNumberOfRows());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,City.class.getName());
			assertEquals(1, result.getNumberOfRows());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	
	@SuppressWarnings("rawtypes")
	@Test
	public void loadPreferencesTest() {
		try {
	
			ProxyRepository repository = getRepository();
			ClientSearchProvider searchProvider = new ClientSearchProvider();
			ClientObjectProcessor processor = new ClientObjectProcessor(searchProvider);
			
			User user = (User) repository.create(User.class.getName());
			String userName = UUID.randomUUID().toString();
			user.setUsername(userName);
			repository.insert(user, User.class.getName());
			
			
			searchProvider.addKnownObject((ObjectControl) user);
			List list =  repository.applyChanges(null);
			processor.process(list);

			ArrayList<SearchCriteria> search = new ArrayList<>();
			SearchCriteria sc = new SearchCriteria();
			sc.setName(Constants.VAR_USERNAME);
			sc.setComparator(Operator.EQ.name());
			sc.setValue(userName);
			search.add(sc);
			SearchResult result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100,User.class.getName());
			assertEquals(1, result.getNumberOfRows());
			user = (User) result.getSearchResult().get(0);
			
			Country country = (Country) repository.create(Country.class.getName());
			repository.insert(country, Country.class.getName());
			
			CountryReference cntRef = (CountryReference) repository.create(CountryReference.class.getName());
			cntRef.setCountryId(country.getObjId());
			AddLinkOperation lo =  new AddLinkOperation();
			lo.setMaster((ObjectControl) country);
			lo.addLink("objId", "countryId");
			((ObjectControl) cntRef).setLinkOperation(lo);
			user.getCountryReference().add(cntRef);
			

			Country countryAdm = (Country) repository.create(Country.class.getName());
			repository.insert(countryAdm, Country.class.getName());
			
			CountryReference cntRefAdm = (CountryReference) repository.create(CountryReference.class.getName());
			cntRefAdm.setCountryId(countryAdm.getObjId());
			cntRefAdm.setAdmin(true);
			lo =  new AddLinkOperation();
			lo.setMaster((ObjectControl) countryAdm);
			lo.addLink("objId", "countryId");
			((ObjectControl) cntRefAdm).setLinkOperation(lo);
			user.getCountryReference().add(cntRefAdm);
			
			
			State state = (State) repository.create(State.class.getName());
			repository.insert(state, State.class.getName());
			
			StateReference stateRef = (StateReference) repository.create(StateReference.class.getName());
			stateRef.setStateId(state.getObjId());
			lo = new AddLinkOperation();
			lo.addLink("objId", "stateId");
			lo.setMaster((ObjectControl) state);
			((ObjectControl)stateRef).setLinkOperation(lo);
			user.getStateReference().add(stateRef);
			

			State stateAdm = (State) repository.create(State.class.getName());
			repository.insert(stateAdm, State.class.getName());
			
			StateReference stateRefAdm = (StateReference) repository.create(StateReference.class.getName());
			stateRefAdm.setStateId(stateAdm.getObjId());
			stateRefAdm.setAdmin(true);
			lo = new AddLinkOperation();
			lo.addLink("objId", "stateId");
			lo.setMaster((ObjectControl) stateAdm);
			((ObjectControl)stateRefAdm).setLinkOperation(lo);
			user.getStateReference().add(stateRefAdm);
			

			
			City city = (City) repository.create(City.class.getName());
			repository.insert(city, City.class.getName());
			
			CityRefeence cityRef = (CityRefeence) repository.create(CityRefeence.class.getName());
			cityRef.setCityId(city.getObjId());
			lo = new AddLinkOperation();
			lo.addLink("objId", "cityId");
			lo.setMaster((ObjectControl) city);
			((ObjectControl)cityRef).setLinkOperation(lo);
			user.getCityRefeence().add(cityRef);

			
			City cityAdm = (City) repository.create(City.class.getName());
			repository.insert(cityAdm, City.class.getName());
			
			CityRefeence cityRefAdm = (CityRefeence) repository.create(CityRefeence.class.getName());
			cityRefAdm.setCityId(cityAdm.getObjId());
			cityRefAdm.setAdmin(true);
			lo = new AddLinkOperation();
			lo.addLink("objId", "cityId");
			lo.setMaster((ObjectControl) cityAdm);
			((ObjectControl)cityRefAdm).setLinkOperation(lo);
			user.getCityRefeence().add(cityRefAdm);
			
			
			searchProvider.addKnownObject((ObjectControl) countryAdm );
			searchProvider.addKnownObject((ObjectControl) cntRefAdm  );
			searchProvider.addKnownObject((ObjectControl) stateAdm );
			searchProvider.addKnownObject((ObjectControl) stateRefAdm  );
			searchProvider.addKnownObject((ObjectControl) cityAdm );
			searchProvider.addKnownObject((ObjectControl) cityRefAdm  );
			searchProvider.addKnownObject((ObjectControl) cntRef);
			searchProvider.addKnownObject((ObjectControl) country);
			searchProvider.addKnownObject((ObjectControl) cntRef);
			searchProvider.addKnownObject((ObjectControl) state);
			searchProvider.addKnownObject((ObjectControl) stateRef);
			searchProvider.addKnownObject((ObjectControl) city);
			searchProvider.addKnownObject((ObjectControl) cityRef);
			list =  repository.applyChanges(null);
			processor.process(list);
			
			Role role = (Role) repository.create(Role.class.getName());
			String roleName = "role_"+UUID.randomUUID().toString();
			role.setName(roleName);
			repository.insert(role, Role.class.getName());
			
			searchProvider.addKnownObject((ObjectControl) role);
			list =  repository.applyChanges(null);
			processor.process(list);
			
			search = new ArrayList<>();
			sc = new SearchCriteria();
			sc.setName(Constants.VAR_ROLE_NAME);
			sc.setComparator(Operator.EQ.name());
			sc.setValue(roleName);
			search.add(sc);
			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100,Role.class.getName());
			role = (Role) result.getSearchResult().get(0);
			
			
			
			Permission perm1 = (Permission) repository.create(Permission.class.getName());
			perm1.setName("Perm1");
			repository.insert(perm1, Permission.class.getName());
			
			Permission perm2 = (Permission) repository.create(Permission.class.getName());
			perm2.setName("Perm2");
			repository.insert(perm2, Permission.class.getName());
			
			searchProvider.addKnownObject((ObjectControl) perm1);
			searchProvider.addKnownObject((ObjectControl) perm2);
			list =  repository.applyChanges(null);
			processor.process(list);
			
			PermissionReferences permRef1 = (PermissionReferences) repository.create(PermissionReferences.class.getName());
			role.getPermissionReferences().add(permRef1);
			permRef1.setPermission(perm1);
			
			PermissionReferences permRef2 = (PermissionReferences) repository.create(PermissionReferences.class.getName());
			role.getPermissionReferences().add(permRef2);
			permRef2.setPermission(perm2);
			
			searchProvider.addKnownObject((ObjectControl) permRef1);
			searchProvider.addKnownObject((ObjectControl) permRef2);
			list =  repository.applyChanges(null);
			processor.process(list);
			
			RoleReference roleref = (RoleReference) repository.create(RoleReference.class.getName());
			user.getRoleReference().add(roleref);
			roleref.setRole(role);
			
			
			searchProvider.addKnownObject((ObjectControl) roleref);
			list =  repository.applyChanges(null);
			processor.process(list);
			
			UserPreferencesLoader prefLoader = new UserPreferencesLoader();
			prefLoader.setRepository(repository);
			
			UserPreferences pref = prefLoader.getUserPreferences(userName);
			
			Integer[] cityArray = new Integer[] {city.getObjId(), cityAdm.getObjId() };
			List<Integer> cityList = Arrays.asList(cityArray);

			int i = 0;
			for (Integer c : pref.getCities()) {
				if (cityList.contains(c)) {
					i++;
				}
			}
		
			assertEquals(2, i);
			

			Integer[] countriesArray = new Integer[] {country.getObjId(), countryAdm.getObjId() };
			List<Integer> countryList = Arrays.asList(countriesArray);

			i = 0;
			for (Integer c : pref.getCountries()) {
				if (countryList.contains(c)) {
					i++;
				}
			}
		
			assertEquals(2, i);
			

			Integer[] stateArray = new Integer[] {state.getObjId(), stateAdm.getObjId() };
			List<Integer> stateList = Arrays.asList(stateArray);

			i = 0;
			for (Integer c : pref.getStates()) {
				if (stateList.contains(c)) {
					i++;
				}
			}
		
			assertEquals(2, i);

			
			
			assertEquals(cityAdm.getObjId(), pref.getCitiesForAdmin().get(0));
			assertEquals(countryAdm.getObjId(), pref.getCountriesForAdmin().get(0));
			assertEquals(stateAdm.getObjId(), pref.getStatesForAdmin().get(0));
			
			
			String[] permArray = new String[] { "Perm1", "Perm2"};
			List<String> arrayList = Arrays.asList(permArray);

			i = 0;
			for (String perm : pref.getPermissions()) {
				if (arrayList.contains(perm)) {
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

