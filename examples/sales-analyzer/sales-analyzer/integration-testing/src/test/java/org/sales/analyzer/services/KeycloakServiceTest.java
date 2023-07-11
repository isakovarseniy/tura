/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.h2.tools.Server;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.operation.AddLinkOperation;
import org.tura.salesanalyzer.serialized.db.City;
import org.tura.salesanalyzer.serialized.db.CityRefeence;
import org.tura.salesanalyzer.serialized.db.Country;
import org.tura.salesanalyzer.serialized.db.CountryReference;
import org.tura.salesanalyzer.serialized.db.Permission;
import org.tura.salesanalyzer.serialized.db.PermissionReferences;
import org.tura.salesanalyzer.serialized.db.State;
import org.tura.salesanalyzer.serialized.db.StateReference;
import org.tura.salesanalyzer.serialized.keycloak.Role;
import org.tura.salesanalyzer.serialized.keycloak.RoleReference;
import org.tura.salesanalyzer.serialized.keycloak.User;

import com.octo.java.sql.exp.Operator;

import sales.analyzer.commons.service.impl.UserPreferencesLoader;
import sales.analyzer.process.commons.Constants;
import sales.analyzer.user.UserPreferences;

public class KeycloakServiceTest {

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
	public void t0000_searchUsers() {
		try {
			Repository transport = repositoryProducer.getRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);

			@SuppressWarnings("unused")
			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, User.class);

			System.out.println("");

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					Role.class);

			System.out.println("");

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void t0000_createUsersAndRoles() {
		try {

			Repository transport = repositoryProducer.getRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);

			Role role = (Role) repository.create(Role.class);
			String roleName = "role_" + UUID.randomUUID().toString();
			role.setName(roleName);
			repository.insert(role, Role.class);
			repository.getStackProvider().get().commit();

			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, Role.class);
			boolean found = false;
			for (Object obj : result.getSearchResult()) {
				role = (Role) obj;
				if (role.getName().equals(roleName)) {
					found = true;
					break;
				}
			}
			assertTrue(found);

			User user = repository.create(User.class);
			String userName = UUID.randomUUID().toString();
			user.setUsername(userName);
			repository.insert(user, User.class);

			repository.getStackProvider().get().commit();

			ArrayList<SearchCriteria> search = new ArrayList<>();
			SearchCriteria sc = new SearchCriteria();
			sc.setName(Constants.VAR_USERNAME);
			sc.setComparator(Operator.EQ.name());
			sc.setValue(userName);
			search.add(sc);
			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100, User.class);
			assertEquals(1, result.getNumberOfRows());
			user = (User) result.getSearchResult().get(0);
			assertEquals(userName, user.getUsername());

			RoleReference roleref = (RoleReference) repository.create(RoleReference.class);
			user.getRoleReference().add(roleref);
			roleref.setRole(role);

			repository.getStackProvider().get().commit();

			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100, User.class);
			assertEquals(1, result.getNumberOfRows());
			user = (User) result.getSearchResult().get(0);
			assertEquals(userName, user.getUsername());

// 3 roles because keycloak assign 2 roles automatically( offline_access, uma_authorisation )			
			assertEquals(3, user.getRoleReference().size());

			String[] rolesArray = new String[] { "uma_authorization", "offline_access", roleName };
			List<String> arrayList = Arrays.asList(rolesArray);

			int i = 0;
			for (RoleReference rf : user.getRoleReference()) {
				Role role0 = rf.getRole();
				if (arrayList.contains(role0.getName())) {
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
	public void rolePermitionTest() {
		try {
			Repository transport = repositoryProducer.getRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);

			Role role = (Role) repository.create(Role.class);
			String roleName = "role_" + UUID.randomUUID().toString();
			role.setName(roleName);
			repository.insert(role, Role.class);

			repository.getStackProvider().get().commit();

			ArrayList<SearchCriteria> search = new ArrayList<>();
			SearchCriteria sc = new SearchCriteria();
			sc.setName(Constants.VAR_ROLE_NAME);
			sc.setComparator(Operator.EQ.name());
			sc.setValue(roleName);
			search.add(sc);
			SearchResult<?> result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100, Role.class);
			role = (Role) result.getSearchResult().get(0);

			Permission perm1 = (Permission) repository.create(Permission.class);
			perm1.setName("Perm1");
			repository.insert(perm1, Permission.class);

			Permission perm2 = (Permission) repository.create(Permission.class);
			perm2.setName("Perm2");
			repository.insert(perm2, Permission.class);

			repository.getStackProvider().get().commit();

			PermissionReferences permRef = (PermissionReferences) repository.create(PermissionReferences.class);
			role.getPermissionReferences().add(permRef);
			permRef.setPermission(perm1);

			permRef = (PermissionReferences) repository.create(PermissionReferences.class);
			role.getPermissionReferences().add(permRef);
			permRef.setPermission(perm2);

			repository.getStackProvider().get().commit();;

			search = new ArrayList<>();
			sc = new SearchCriteria();
			sc.setName(Constants.VAR_ROLE_NAME);
			sc.setComparator(Operator.EQ.name());
			sc.setValue(roleName);
			search.add(sc);
			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100, Role.class);
			assertEquals(1, result.getNumberOfRows());

			role = (Role) result.getSearchResult().get(0);

			assertEquals(2, role.getPermissionReferences().size());

			String[] permArray = new String[] { "Perm1", "Perm2" };
			List<String> arrayList = Arrays.asList(permArray);

			int i = 0;
			for (PermissionReferences ref : role.getPermissionReferences()) {
				if (arrayList.contains(ref.getPermission().getName())) {
					i++;
				}
			}

			assertEquals(i, 2);

			repository.remove(role, Role.class);
			repository.getStackProvider().get().commit();

			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100, Role.class);
			assertEquals(0, result.getNumberOfRows());

			search = new ArrayList<>();
			sc = new SearchCriteria();
			sc.setName("roleId");
			sc.setComparator(Operator.EQ.name());
			sc.setValue(roleName);
			search.add(sc);

			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100, PermissionReferences.class);
			assertEquals(0, result.getNumberOfRows());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					Permission.class);
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
			Repository transport = repositoryProducer.getRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);

			User user = (User) repository.create(User.class);
			String userName = UUID.randomUUID().toString();
			user.setUsername(userName);
			repository.insert(user, User.class);

			repository.getStackProvider().get().commit();

			ArrayList<SearchCriteria> search = new ArrayList<>();
			SearchCriteria sc = new SearchCriteria();
			sc.setName(Constants.VAR_USERNAME);
			sc.setComparator(Operator.EQ.name());
			sc.setValue(userName);
			search.add(sc);
			SearchResult result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100, User.class);
			assertEquals(1, result.getNumberOfRows());
			user = (User) result.getSearchResult().get(0);

			Country country = (Country) repository.create(Country.class);
			repository.insert(country, Country.class);

			CountryReference cntRef = (CountryReference) repository.create(CountryReference.class);
			cntRef.setCountryId(country.getObjId());
			user.getCountryReference().add(cntRef);

			State state = (State) repository.create(State.class);
			repository.insert(state, State.class);

			StateReference stateRef = (StateReference) repository.create(StateReference.class);
			user.getStateReference().add(stateRef);
			stateRef.setStateId(state.getObjId());

			City city = (City) repository.create(City.class);
			repository.insert(city, City.class);

			CityRefeence cityRef = (CityRefeence) repository.create(CityRefeence.class);
			user.getCityRefeence().add(cityRef);
			cityRef.setCityId(city.getObjId());

			repository.getStackProvider().get().commit();

			search = new ArrayList<>();
			sc = new SearchCriteria();
			sc.setName(Constants.VAR_USERNAME);
			sc.setComparator(Operator.EQ.name());
			sc.setValue(userName);
			search.add(sc);
			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100, User.class);
			assertEquals(1, result.getNumberOfRows());
			user = (User) result.getSearchResult().get(0);
			assertEquals(userName, user.getUsername());

			assertEquals(1, user.getCountryReference().size());
			CountryReference _cntRef = user.getCountryReference().get(0);
			assertEquals(cntRef.getObjId(), _cntRef.getObjId());

			assertEquals(1, user.getCityRefeence().size());
			CityRefeence _cityRef = user.getCityRefeence().get(0);
			assertEquals(cityRef.getObjId(), _cityRef.getObjId());

			assertEquals(1, user.getStateReference().size());
			StateReference _stateRef = user.getStateReference().get(0);
			assertEquals(stateRef.getObjId(), _stateRef.getObjId());

			String userId  =  user.getId();
			repository.remove(user, User.class);
			repository.getStackProvider().get().commit();

			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100, User.class);
			assertEquals(0, result.getNumberOfRows());

			search = new ArrayList<>();
			sc = new SearchCriteria();
			sc.setName("userId");
			sc.setComparator(Operator.EQ.name());
			sc.setValue(userId);
			search.add(sc);

			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100, CountryReference.class);
			assertEquals(0, result.getNumberOfRows());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					Country.class);
			assertEquals(1, result.getNumberOfRows());

			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100, StateReference.class);
			assertEquals(0, result.getNumberOfRows());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					State.class);
			assertEquals(1, result.getNumberOfRows());

			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100, CityRefeence.class);
			assertEquals(0, result.getNumberOfRows());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					City.class);
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

			Repository transport = repositoryProducer.getRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);

			User user = (User) repository.create(User.class);
			String userName = UUID.randomUUID().toString();
			user.setUsername(userName);
			repository.insert(user, User.class);

			repository.getStackProvider().get().commit();

			ArrayList<SearchCriteria> search = new ArrayList<>();
			SearchCriteria sc = new SearchCriteria();
			sc.setName(Constants.VAR_USERNAME);
			sc.setComparator(Operator.EQ.name());
			sc.setValue(userName);
			search.add(sc);
			SearchResult result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100, User.class);
			assertEquals(1, result.getNumberOfRows());
			user = (User) result.getSearchResult().get(0);

			Country country = (Country) repository.create(Country.class);
			repository.insert(country, Country.class);

			CountryReference cntRef = (CountryReference) repository.create(CountryReference.class);
			cntRef.setCountryId(country.getObjId());
			AddLinkOperation lo = new AddLinkOperation();
			lo.setMaster((ObjectControl) country);
			lo.addLink("objId", "countryId");
			((ObjectControl) cntRef).setLinkOperation(lo);
			user.getCountryReference().add(cntRef);

			Country countryAdm = (Country) repository.create(Country.class);
			repository.insert(countryAdm, Country.class);

			CountryReference cntRefAdm = (CountryReference) repository.create(CountryReference.class);
			cntRefAdm.setCountryId(countryAdm.getObjId());
			cntRefAdm.setAdmin(true);
			lo = new AddLinkOperation();
			lo.setMaster((ObjectControl) countryAdm);
			lo.addLink("objId", "countryId");
			((ObjectControl) cntRefAdm).setLinkOperation(lo);
			user.getCountryReference().add(cntRefAdm);

			State state = (State) repository.create(State.class);
			repository.insert(state, State.class);

			StateReference stateRef = (StateReference) repository.create(StateReference.class);
			stateRef.setStateId(state.getObjId());
			lo = new AddLinkOperation();
			lo.addLink("objId", "stateId");
			lo.setMaster((ObjectControl) state);
			((ObjectControl) stateRef).setLinkOperation(lo);
			user.getStateReference().add(stateRef);

			State stateAdm = (State) repository.create(State.class);
			repository.insert(stateAdm, State.class);

			StateReference stateRefAdm = (StateReference) repository.create(StateReference.class);
			stateRefAdm.setStateId(stateAdm.getObjId());
			stateRefAdm.setAdmin(true);
			lo = new AddLinkOperation();
			lo.addLink("objId", "stateId");
			lo.setMaster((ObjectControl) stateAdm);
			((ObjectControl) stateRefAdm).setLinkOperation(lo);
			user.getStateReference().add(stateRefAdm);

			City city = (City) repository.create(City.class);
			repository.insert(city, City.class);

			CityRefeence cityRef = (CityRefeence) repository.create(CityRefeence.class);
			cityRef.setCityId(city.getObjId());
			lo = new AddLinkOperation();
			lo.addLink("objId", "cityId");
			lo.setMaster((ObjectControl) city);
			((ObjectControl) cityRef).setLinkOperation(lo);
			user.getCityRefeence().add(cityRef);

			City cityAdm = (City) repository.create(City.class);
			repository.insert(cityAdm, City.class);

			CityRefeence cityRefAdm = (CityRefeence) repository.create(CityRefeence.class);
			cityRefAdm.setCityId(cityAdm.getObjId());
			cityRefAdm.setAdmin(true);
			lo = new AddLinkOperation();
			lo.addLink("objId", "cityId");
			lo.setMaster((ObjectControl) cityAdm);
			((ObjectControl) cityRefAdm).setLinkOperation(lo);
			user.getCityRefeence().add(cityRefAdm);

			repository.getStackProvider().get().commit();

			Role role = (Role) repository.create(Role.class);
			String roleName = "role_" + UUID.randomUUID().toString();
			role.setName(roleName);
			repository.insert(role, Role.class);

			repository.getStackProvider().get().commit();

			search = new ArrayList<>();
			sc = new SearchCriteria();
			sc.setName(Constants.VAR_ROLE_NAME);
			sc.setComparator(Operator.EQ.name());
			sc.setValue(roleName);
			search.add(sc);
			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100, Role.class);
			role = (Role) result.getSearchResult().get(0);

			Permission perm1 = (Permission) repository.create(Permission.class);
			perm1.setName("Perm1");
			repository.insert(perm1, Permission.class);

			Permission perm2 = (Permission) repository.create(Permission.class);
			perm2.setName("Perm2");
			repository.insert(perm2, Permission.class);

			repository.getStackProvider().get().commit();

			PermissionReferences permRef1 = (PermissionReferences) repository.create(PermissionReferences.class);
			role.getPermissionReferences().add(permRef1);
			permRef1.setPermission(perm1);

			PermissionReferences permRef2 = (PermissionReferences) repository.create(PermissionReferences.class);
			role.getPermissionReferences().add(permRef2);
			permRef2.setPermission(perm2);

			repository.getStackProvider().get().commit();

			RoleReference roleref = (RoleReference) repository.create(RoleReference.class);
			user.getRoleReference().add(roleref);
			roleref.setRole(role);

			repository.getStackProvider().get().commit();

			UserPreferencesLoader prefLoader = new UserPreferencesLoader();
			prefLoader.setRepository(repository);

			UserPreferences pref = prefLoader.getUserPreferences(userName);

			Integer[] cityArray = new Integer[] { city.getObjId(), cityAdm.getObjId() };
			List<Integer> cityList = Arrays.asList(cityArray);

			int i = 0;
			for (Integer c : pref.getCities()) {
				if (cityList.contains(c)) {
					i++;
				}
			}

			assertEquals(2, i);

			Integer[] countriesArray = new Integer[] { country.getObjId(), countryAdm.getObjId() };
			List<Integer> countryList = Arrays.asList(countriesArray);

			i = 0;
			for (Integer c : pref.getCountries()) {
				if (countryList.contains(c)) {
					i++;
				}
			}

			assertEquals(2, i);

			Integer[] stateArray = new Integer[] { state.getObjId(), stateAdm.getObjId() };
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

			String[] permArray = new String[] { "Perm1", "Perm2" };
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
