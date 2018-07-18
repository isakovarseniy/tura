package org.sales.analyzer.process;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;

import sales.analyzer.service.keycloak.KeyCloakSearchService;

@RunWith(Arquillian.class)
public class KeycloakSearchServiceTest {

	
	@Test
	@RunAsClient
	public void t0000_searchUsers() {
		try {
		KeyCloakSearchService ks =new KeyCloakSearchService(TestCommons.KEYCLOAK_URL, TestCommons.KEYCLOAK_ADMIN_REALM, TestCommons.KEYCLOAK_ADMIN_CLIENTID, TestCommons.CLIENT_SECRET, TestCommons.ADMIN_USER, TestCommons.ADMIN_PASSWORD , TestCommons.KEYCLOAK_MANAGED_REALM);
		ks.setMapper(new UserRepresentationMapper());
		
		SearchResult result = ks.find(new ArrayList<>(), new ArrayList<>(), 0, 100, UserRepresentation.class.getName());
		assertNotEquals(0, result.getNumberOfRows());
		
		UserRepresentation r = (UserRepresentation) result.getSearchResult().get(0);
		
		UserRepresentation obj = (UserRepresentation) ks.find(r.getId(), UserRepresentation.class.getName());
		assertNotNull(obj);
		assertEquals(obj.getId(), r.getId());
		
		
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}	
	
	@Test
	@RunAsClient
	public void t0000_searchRoles() {
		try {
		KeyCloakSearchService ks =new KeyCloakSearchService(TestCommons.KEYCLOAK_URL, TestCommons.KEYCLOAK_ADMIN_REALM, TestCommons.KEYCLOAK_ADMIN_CLIENTID, TestCommons.CLIENT_SECRET, TestCommons.ADMIN_USER, TestCommons.ADMIN_PASSWORD , TestCommons.KEYCLOAK_MANAGED_REALM);
		ks.setMapper(new RoleRepresentationMapper());
		
		SearchResult result = ks.find(new ArrayList<>(), new ArrayList<>(), 0, 100, RoleRepresentation.class.getName());
		assertNotEquals(0, result.getNumberOfRows());

		
		RoleRepresentation r = (RoleRepresentation) result.getSearchResult().get(1);
		
		RoleRepresentation obj = (RoleRepresentation) ks.find(r.getName(), RoleRepresentation.class.getName());
		assertNotNull(obj);
		assertEquals(obj.getId(), r.getId());
		
		
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}	
	
	
	
	public class UserRepresentationMapper implements Mapper{

		@Override
		public Object getPrimaryKey(Object persistenceObject) throws RepositoryException {
			return ((UserRepresentation )persistenceObject).getId();
		}

		@Override
		public Object getPrimaryKeyFromRepositoryObject(Object repositoryObject) throws RepositoryException {
			return null;
		}

		@Override
		public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject) {
			return null;
		}
		
	}
	
	public class RoleRepresentationMapper implements Mapper{

		@Override
		public Object getPrimaryKey(Object persistenceObject) throws RepositoryException {
			return ((RoleRepresentation )persistenceObject).getId();
		}

		@Override
		public Object getPrimaryKeyFromRepositoryObject(Object repositoryObject) throws RepositoryException {
			return null;
		}

		@Override
		public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject) {
			return null;
		}
		
	}
	
}

