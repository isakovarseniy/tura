/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package sales.analyzer.commons.service.impl;

import java.util.Arrays;

import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.admin.client.resource.RealmResource;
import org.tura.platform.repository.core.Instantiator;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.spa.SpaObjectRegistry;

import sales.analyzer.service.keycloak.KeyCloakCRUDService;
import sales.analyzer.service.keycloak.KeyCloakSearchService;

public class KeyCloakServicesInstantiator implements Instantiator{

	private RealmResource realmResource;
    private Registry registry;
    private SpaObjectRegistry spaRegistry;
    private String registryName;

	public KeyCloakServicesInstantiator(String serverUrl, String adminRealm, String adminClientId, String clientSecret,
						String adminUser, String adminPassword , String managedRealm,Registry registry,SpaObjectRegistry spaRegistry,String registryName) {
		
		Keycloak keycloak = KeycloakBuilder.builder()
				.serverUrl(serverUrl)
				.realm(adminRealm)
				.clientId(adminClientId)
				.grantType(OAuth2Constants.PASSWORD)
				.clientSecret(clientSecret)
				.username(adminUser)
				.password(adminPassword)
				.build();
         realmResource = keycloak.realm(managedRealm);
         
         this.registry=registry;
         this.spaRegistry=spaRegistry;
         this.registryName = registryName;

	}
	
	
	private static String[] knownObjects = new String[] { 
			KeyCloakCRUDService.class.getName(),
			KeyCloakSearchService.class.getName()
			};

	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T newInstance(String className) {
		try {
			return (T) newInstance(Class.forName(className));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T newInstance(Class<T> clazz) {
		if (KeyCloakCRUDService.class.equals(clazz)){
			return (T) new KeyCloakCRUDService(realmResource,spaRegistry,registryName,registry);
		}
		if (KeyCloakSearchService.class.equals(clazz)) {
			return (T) new KeyCloakSearchService(realmResource, spaRegistry, registryName, registry);
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
