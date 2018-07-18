package org.sales.analyzer.process;

import java.util.List;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.admin.client.resource.ClientsResource;
import org.keycloak.representations.idm.ClientRepresentation;

//@RunWith(Arquillian.class)
public class KeycloakSearchServiceTest {

	
	@Test
//	@RunAsClient
	public void t0000_runCase() {
		
		Keycloak keycloak = KeycloakBuilder.builder() //
				.serverUrl("http://localhost:8080/auth") //
				.realm("master") //
				.clientId("realm-management")
				.grantType("password")
				.clientSecret("8c0c15e2-eb8b-46d1-88eb-b81347e10546") //
				.username("admin") //
				.password("qwerty") //
				.build();
		
		ClientsResource clients = keycloak.realm("master").clients();
		List<ClientRepresentation> list=clients.findAll();
		for (ClientRepresentation r : list) {
			System.out.println(r.getName());
		}
		
	}	
	
}

