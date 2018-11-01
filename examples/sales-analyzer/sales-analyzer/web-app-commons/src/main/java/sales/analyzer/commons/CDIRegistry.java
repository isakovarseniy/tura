/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package sales.analyzer.commons;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.representations.idm.RoleRepresentation;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepository;
import org.tura.salesanalyzer.serialized.db.repo.InitJPARepository;
import org.tura.salesanalyzer.serialized.repo.InitSPARepository;

import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstance;
import sales.analyzer.api.model.impl.SalesAnalyzerTaskInstance;
import sales.analyzer.commons.service.impl.JbpmServiceInstantiator;
import sales.analyzer.commons.service.impl.SPAAdapterLoader;
import sales.analyzer.commons.service.impl.UUIPrimaryKeyStrategy;
import sales.analyzer.service.jbpm.JbpmCRUDService;
import sales.analyzer.service.jbpm.JbpmSearchService;
import sales.analyzer.service.keycloak.KeyCloakCRUDService;
import sales.analyzer.service.keycloak.KeyCloakSearchService;
import uILayer.admin.AdministrationProfile;
import uILayer.analysis.CaseManagerProfile;

@ApplicationScoped
public class CDIRegistry extends Registry {

	private static final long serialVersionUID = 1L;

	@Inject
	SpaObjectRegistry spaRegistry;

	@PostConstruct
	public void init() {
		try {
			this.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());

			InitJPARepository init = new InitJPARepository(new SpaRepository(), this, spaRegistry);
			init.initClassMapping();
			init.initCommandProducer();
			init.initProvider();
			init.initEntityManagerProvider(new CDIEntityManagerProvider());
			this.setTransactrionAdapter(new CDITransactionAdapter(this));

			InitSPARepository initSpa = new InitSPARepository(new SpaRepository(), this, spaRegistry);
			initSpa.initClassMapping();
			initSpa.initCommandProducer();
			initSpa.initProvider();

			String keycloakUrl = System.getProperty( Constants.KEYCLOAK_URL);
			String keycloakAdminRealm = System.getProperty( Constants.KEYCLOAK_ADMIN_REALM);
			String keycloakAdminClientid = System.getProperty( Constants.KEYCLOAK_ADMIN_CLIENTID);
			String clientSecret = System.getProperty( Constants.CLIENT_SECRET);
			String keycloakAdminUser = System.getProperty( Constants.KEYCLOAK_ADMIN_USER);
			String keycloakAdminPassword = System.getProperty( Constants.KEYCLOAK_ADMIN_PASSWORD);
			String keycloakManagedRealm = System.getProperty( Constants.KEYCLOAK_MANAGED_REALM);
			String kieserverUrl = System.getProperty( Constants.KIE_SERVER_URL);
			
			Keycloak keycloak = KeycloakBuilder.builder()
					.serverUrl(keycloakUrl)
					.realm(keycloakAdminRealm)
					.clientId(keycloakAdminClientid)
					.grantType(OAuth2Constants.PASSWORD)
					.clientSecret(clientSecret)
					.username(keycloakAdminUser)
					.password(keycloakAdminPassword)
					.build();
			RealmResource realmResource = keycloak.realm(keycloakManagedRealm);

			KeyCloakServicesServletInstantiator initK = new KeyCloakServicesServletInstantiator(
					 keycloakUrl
					,keycloakAdminRealm
					,keycloakAdminClientid
					,clientSecret
					,keycloakAdminUser
					,keycloakAdminPassword
					,keycloakManagedRealm
					);

			spaRegistry.getRegistry("spa-persistence-repository").addInstantiator(initK);

			spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(org.tura.salesanalyzer.persistence.keycloak.User.class, KeyCloakCRUDService.class);
			spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(RoleRepresentation.class,KeyCloakCRUDService.class);
			spaRegistry.getRegistry("spa-persistence-repository").addSearchProvider(org.tura.salesanalyzer.persistence.keycloak.User.class, KeyCloakSearchService.class);
			spaRegistry.getRegistry("spa-persistence-repository").addSearchProvider(RoleRepresentation.class,KeyCloakSearchService.class);
			spaRegistry.getRegistry("spa-persistence-repository").addLoader(org.tura.salesanalyzer.persistence.keycloak.User.class.getName(),new SPAAdapterLoader(realmResource));
			spaRegistry.getRegistry("spa-persistence-repository").addLoader(org.tura.salesanalyzer.persistence.keycloak.RoleRef.class.getName(),new SPAAdapterLoader(realmResource));

			JbpmServiceInstantiator initJ = new JbpmServiceInstantiator(kieserverUrl, new OAuthCredentialsProvider(), new CDIUserPeferencesProviderImpl());
			spaRegistry.getRegistry("spa-persistence-repository").addInstantiator(initJ);
			spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(SalesAnalyzerProcessInstance.class,JbpmCRUDService.class);
			spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(SalesAnalyzerTaskInstance.class,JbpmCRUDService.class);
			spaRegistry.getRegistry("spa-persistence-repository").addSearchProvider(SalesAnalyzerProcessInstance.class,JbpmSearchService.class);
			spaRegistry.getRegistry("spa-persistence-repository").addSearchProvider(SalesAnalyzerTaskInstance.class,JbpmSearchService.class);

			AdministrationProfile p = new AdministrationProfile();
			this.addProfile(p.getProfileName(), p);
			CaseManagerProfile p1 = new CaseManagerProfile();
			this.addProfile(p1.getProfileName(), p1);
			
			this.addProfile(AllowEverythingProfile.class.getName(), new  AllowEverythingProfile());
			

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

}
