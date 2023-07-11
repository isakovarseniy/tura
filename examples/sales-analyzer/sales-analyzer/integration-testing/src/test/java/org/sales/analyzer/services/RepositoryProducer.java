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

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;

import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.representations.idm.RoleRepresentation;
import org.sales.analyzer.process.PostDeployer;
import org.sales.analyzer.services.impl.OAuthCredentialsProvider;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.object.JpaTransactionAdapter;
import org.tura.platform.repository.core.AllowEverythingProfile;
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.CpaTransactionAdapter;
import org.tura.platform.repository.cpa.LocalCommadStackProvider;
import org.tura.platform.repository.cpa.storage.CpaServiceInstantiator;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.jpa.operation.EntityManagerProvider;
import org.tura.platform.repository.jpa.operation.ExternalQueryProcessor;
import org.tura.platform.repository.jpa.operation.query.Many2ManyQueryProcessor;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.salesanalyzer.serialized.db.repo.InitJPARepository;
import org.tura.salesanalyzer.serialized.proxy.InitCPARepository;
import org.tura.salesanalyzer.serialized.proxy.ProxyRepository;
import org.tura.salesanalyzer.serialized.proxy.ProxyRepositoryInstantiator;
import org.tura.salesanalyzer.serialized.repo.InitSPARepository;

import sales.analyzer.api.model.impl.AssignInfo;
import sales.analyzer.api.model.impl.ETLNodeInstanceLog;
import sales.analyzer.api.model.impl.ETLProcessInstance;
import sales.analyzer.api.model.impl.ETLTaskInstance;
import sales.analyzer.api.model.impl.EtlMLPMessage;
import sales.analyzer.api.model.impl.FileEntity;
import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstance;
import sales.analyzer.api.model.impl.SalesAnalyzerTaskInstance;
import sales.analyzer.api.model.impl.TaskComletion;
import sales.analyzer.api.model.impl.TerminateProcessEvent;
import sales.analyzer.commons.service.impl.JbpmServiceInstantiator;
import sales.analyzer.commons.service.impl.KeyCloakServicesInstantiator;
import sales.analyzer.commons.service.impl.SPAAdapterLoader;
import sales.analyzer.commons.service.impl.UUIPrimaryKeyStrategy;
import sales.analyzer.service.UserPreferencesProvider;
import sales.analyzer.service.file.FileSearchService;
import sales.analyzer.service.jbpm.JbpmCRUDService;
import sales.analyzer.service.jbpm.JbpmSearchService;
import sales.analyzer.service.jbpm.commands.AssignActorCommand;
import sales.analyzer.service.jbpm.commands.AssignActorsCaseProcessCommand;
import sales.analyzer.service.jbpm.commands.CloseWFCaseProcessCommand;
import sales.analyzer.service.jbpm.commands.CloseWFCommand;
import sales.analyzer.service.jbpm.commands.ETLCompleteTaskCommand;
import sales.analyzer.service.jbpm.commands.TaskCompletionCommand;
import sales.analyzer.service.keycloak.KeyCloakCRUDService;
import sales.analyzer.service.keycloak.KeyCloakSearchService;
import sales.analyzer.user.UserPreferences;
import uILayer.admin.AdministrationProfile;
import uILayer.analysis.CaseManagerProfile;

public class RepositoryProducer {

	public EntityManager em;
	public CpaStorageProvider cpaStorageProvider;
	public Registry registry;
	public  UserPreferences pref ;
	

	private EntityManagerProvider emProvider = new EntityManagerProvider() {

		@Override
		public EntityManager getEntityManager() {
			return em;
		}

		@Override
		public void destroyEntityManager() {

		}
	};
	
	class UserPeferencesProviderImpl implements UserPreferencesProvider{
		
		@Override
		public UserPreferences getUserPreferences(String userName) {
			return pref;
		}
		
	}	
	public CpaRepository getProxyRepository(Repository transport) throws Exception {
		return getProxyRepository( transport,false);
	}	
	
	public CpaRepository getProxyRepository(Repository transport, boolean inMemory) throws Exception {
		Registry cpaRegistry = new Registry();
		SpaObjectRegistry cpaSpaRegistry = new SpaObjectRegistry();

		ProxyCommadStackProvider stackProvider = new LocalCommadStackProvider();
		cpaStorageProvider = new ProxyCpaStorageProvider(stackProvider);

		InitCPARepository init = new InitCPARepository(cpaRegistry, cpaSpaRegistry);
		init.initClassMapping();
		init.initCommandProducer();
		init.initProvider();
		init.initRules();

		cpaSpaRegistry.getRegistry(InitCPARepository.SPA_REPOSITORY_NAME).addInstantiator(new CpaServiceInstantiator(
				cpaSpaRegistry, InitCPARepository.SPA_REPOSITORY_NAME, cpaRegistry, cpaStorageProvider));

		ProxyRepository proxyRepository = new ProxyRepository();
		proxyRepository.setStackProvider(stackProvider);
		proxyRepository.setTransport(transport);
		proxyRepository.setStorageProvider(cpaStorageProvider);
		proxyRepository.setRegistry(cpaRegistry);

		cpaRegistry.setTransactrionAdapter(new CpaTransactionAdapter(cpaRegistry));
		proxyRepository.setProfile(AllowEverythingProfile.class.getName());

		return proxyRepository;

	}

	public Repository getRepository() throws Exception {
		
		registry = new Registry();
		SpaObjectRegistry spaRegistry = new SpaObjectRegistry();
		
		registry.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
		registry.addProfile(AllowEverythingProfile.class.getName(), new AllowEverythingProfile());
		registry.addInstantiator(new ProxyRepositoryInstantiator(new LocalProxyRepositoryProvider()));
		registry.setTransactrionAdapter(new JpaTransactionAdapter(em, registry));
    	
        
		Map<String, ExternalQueryProcessor<?>> queryProcessorRegistry = new HashMap<String, ExternalQueryProcessor<?>>();
		queryProcessorRegistry.put(Constants.MANY2MANY_QUERY, new Many2ManyQueryProcessor<>());
        
        InitJPARepository init = new InitJPARepository( registry, spaRegistry);
        
        init.initCommandProducer(emProvider,queryProcessorRegistry);
        init.initProvider();
		init.initRules();
        init.initClassMapping();
		init.initFeldsMapping();

        InitSPARepository initSpa = new InitSPARepository( registry, spaRegistry);
        initSpa.initCommandProducer();
        initSpa.initRules();
        initSpa.initProvider();
        initSpa.initClassMapping();

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

KeyCloakServicesInstantiator initK = new KeyCloakServicesInstantiator(
		                                                 PostDeployer.KEYCLOAK_URL,
		                                                 PostDeployer.KEYCLOAK_ADMIN_REALM,
		                                                 PostDeployer.KEYCLOAK_ADMIN_CLIENTID,
		                                                 PostDeployer.CLIENT_SECRET,
		                                                 PostDeployer.ADMIN_USER,
		                                                 PostDeployer.ADMIN_PASSWORD,
		                                                 PostDeployer.KEYCLOAK_MANAGED_REALM,
		                                                 registry, spaRegistry, "spa-persistence-repository"
														);

        spaRegistry.getRegistry("spa-persistence-repository").addInstantiator(initK);

        spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(org.tura.salesanalyzer.persistence.keycloak.User.class, KeyCloakCRUDService.class);
        spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(RoleRepresentation.class,KeyCloakCRUDService.class);
        spaRegistry.getRegistry("spa-persistence-repository").addSearchProvider(org.tura.salesanalyzer.persistence.keycloak.User.class, KeyCloakSearchService.class);
        spaRegistry.getRegistry("spa-persistence-repository").addSearchProvider(RoleRepresentation.class,KeyCloakSearchService.class);
        spaRegistry.getRegistry("spa-persistence-repository").addLoader(org.tura.salesanalyzer.persistence.keycloak.User.class.getName(),new SPAAdapterLoader(realmResource));
        spaRegistry.getRegistry("spa-persistence-repository").addLoader(org.tura.salesanalyzer.persistence.keycloak.RoleRef.class.getName(),new SPAAdapterLoader(realmResource));

		JbpmServiceInstantiator initJ = new JbpmServiceInstantiator( PostDeployer.KIE_SERVER_URL , new OAuthCredentialsProvider(new PostDeployer().getToken()),new UserPeferencesProviderImpl(),registry,spaRegistry,"spa-persistence-repository");

        spaRegistry.getRegistry("spa-persistence-repository").addInstantiator(initJ);
        spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(SalesAnalyzerProcessInstance.class,JbpmCRUDService.class);
        spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(SalesAnalyzerTaskInstance.class,JbpmCRUDService.class);
        spaRegistry.getRegistry("spa-persistence-repository").addSearchProvider(SalesAnalyzerProcessInstance.class,JbpmSearchService.class);
        spaRegistry.getRegistry("spa-persistence-repository").addSearchProvider(SalesAnalyzerTaskInstance.class,JbpmSearchService.class);
        spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(AssignInfo.class,JbpmCRUDService.class);
        spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(TaskComletion.class,JbpmCRUDService.class);
        spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(TerminateProcessEvent.class,JbpmCRUDService.class);
        spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(ETLProcessInstance.class,JbpmCRUDService.class);
        spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(ETLTaskInstance.class,JbpmCRUDService.class);
        spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(ETLNodeInstanceLog.class,JbpmCRUDService.class);
        spaRegistry.getRegistry("spa-persistence-repository").addSearchProvider(ETLProcessInstance.class,JbpmSearchService.class);
        spaRegistry.getRegistry("spa-persistence-repository").addSearchProvider(ETLTaskInstance.class,JbpmSearchService.class);
        spaRegistry.getRegistry("spa-persistence-repository").addSearchProvider(ETLNodeInstanceLog.class,JbpmSearchService.class);
        spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(EtlMLPMessage.class,JbpmCRUDService.class);
        spaRegistry.getRegistry("spa-persistence-repository").addSearchProvider(FileEntity.class,FileSearchService.class);
        

        spaRegistry.getRegistry("spa-persistence-repository").addExternalCommand(AssignActorCommand.class);
        spaRegistry.getRegistry("spa-persistence-repository").addExternalCommand(AssignActorsCaseProcessCommand.class);
        spaRegistry.getRegistry("spa-persistence-repository").addExternalCommand(CloseWFCommand.class);
        spaRegistry.getRegistry("spa-persistence-repository").addExternalCommand(CloseWFCaseProcessCommand.class);
        spaRegistry.getRegistry("spa-persistence-repository").addExternalCommand(TaskCompletionCommand.class);
        spaRegistry.getRegistry("spa-persistence-repository").addExternalCommand(ETLCompleteTaskCommand.class);
        
        
        AdministrationProfile p = new AdministrationProfile();
        registry.addProfile(p.getProfileName(), p);
        CaseManagerProfile p1 = new CaseManagerProfile();
        registry.addProfile(p1.getProfileName(), p1);
        
        registry.addProfile(AllowEverythingProfile.class.getName(), new  AllowEverythingProfile());

        
		Repository repository = new BasicRepository(registry);
		
		return   repository;
        
	}

}
