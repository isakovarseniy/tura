package org.sales.analyzer.services.impl;

import java.util.Arrays;

import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.admin.client.resource.RealmResource;
import org.sales.analyzer.process.TestCommons;
import org.tura.platform.repository.core.Instantiator;

import sales.analyzer.service.keycloak.KeyCloakCRUDService;
import sales.analyzer.service.keycloak.KeyCloakSearchService;

public class KeyCloakServicesInstantiator implements Instantiator{

	private RealmResource realmResource;
	
	public KeyCloakServicesInstantiator(String serverUrl, String adminRealm, String adminClientId, String clientSecret,
						String adminUser, String adminPassword , String managedRealm) {
		
		Keycloak keycloak = KeycloakBuilder.builder()
				.serverUrl(serverUrl)
				.realm(adminRealm)
				.clientId(adminClientId)
				.grantType(OAuth2Constants.PASSWORD)
				.clientSecret(clientSecret)
				.username(adminUser)
				.password(adminPassword)
				.build();
         realmResource = keycloak.realm(TestCommons.KEYCLOAK_MANAGED_REALM);
	}
	
	
	private static String[] knownObjects = new String[] { 
			KeyCloakCRUDService.class.getName(),
			KeyCloakSearchService.class.getName()
			};

	
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T newInstance(Class<T> clazz) {
		if (KeyCloakCRUDService.class.equals(clazz)){
			return (T) new KeyCloakCRUDService(realmResource);
		}
		if (KeyCloakSearchService.class.equals(clazz)) {
			return (T) new KeyCloakSearchService(realmResource);
		}

		return null;
	}

	@Override
	public boolean check(Class<?> clazz) {
		return check(clazz.getName());
	}

	@Override
	public boolean check(String clazzName) {
		return Arrays.asList(knownObjects).contains(clazzName);
	}

}
