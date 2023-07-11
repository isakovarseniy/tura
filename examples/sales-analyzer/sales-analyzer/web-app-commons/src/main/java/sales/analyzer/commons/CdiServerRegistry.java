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

 package sales.analyzer.commons;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.representations.idm.RoleRepresentation;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.repository.cdi.ServerRegistry;
import org.tura.platform.repository.cdi.starter.CdiServerProxyRepositoryProvider;
import org.tura.platform.repository.core.AllowEverythingProfile;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.jpa.operation.ExternalQueryProcessor;
import org.tura.platform.repository.jpa.operation.query.Many2ManyQueryProcessor;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.salesanalyzer.serialized.db.repo.InitJPARepository;
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
import sales.analyzer.commons.service.impl.SPAAdapterLoader;
import sales.analyzer.commons.service.impl.UUIPrimaryKeyStrategy;
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
import uILayer.admin.AdministrationProfile;
import uILayer.analysis.CaseManagerProfile;


@ApplicationScoped
@ServerRegistry
public class CdiServerRegistry extends Registry {

    private static final long serialVersionUID = 1L;


    @PostConstruct
    public void init() {
        try {
        	
			SpaObjectRegistry spaRegistry = new SpaObjectRegistry();
			
			this.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
			this.addProfile(AllowEverythingProfile.class.getName(), new AllowEverythingProfile());
			this.addInstantiator(new ProxyRepositoryInstantiator(new CdiServerProxyRepositoryProvider()));
			this.setTransactrionAdapter(new CdiServerTransactionAdapter(this));
        	
            
			Map<String, ExternalQueryProcessor<?>> queryProcessorRegistry = new HashMap<String, ExternalQueryProcessor<?>>();
			queryProcessorRegistry.put(Constants.MANY2MANY_QUERY, new Many2ManyQueryProcessor<>());
            
            InitJPARepository init = new InitJPARepository( this, spaRegistry);
            init.initCommandProducer(new CdiEntityManagerProvider(),queryProcessorRegistry);
            init.initProvider();
			init.initRules();
            init.initClassMapping();
			init.initFeldsMapping();

            InitSPARepository initSpa = new InitSPARepository( this, spaRegistry);
            initSpa.initCommandProducer();
            initSpa.initRules();
            initSpa.initProvider();
            initSpa.initClassMapping();

            String keycloakUrl = System.getProperty( sales.analyzer.commons.Constants.KEYCLOAK_URL);
            String keycloakAdminRealm = System.getProperty( sales.analyzer.commons.Constants.KEYCLOAK_ADMIN_REALM);
            String keycloakAdminClientid = System.getProperty( sales.analyzer.commons.Constants.KEYCLOAK_ADMIN_CLIENTID);
            String clientSecret = System.getProperty( sales.analyzer.commons.Constants.CLIENT_SECRET);
            String keycloakAdminUser = System.getProperty( sales.analyzer.commons.Constants.KEYCLOAK_ADMIN_USER);
            String keycloakAdminPassword = System.getProperty( sales.analyzer.commons.Constants.KEYCLOAK_ADMIN_PASSWORD);
            String keycloakManagedRealm = System.getProperty( sales.analyzer.commons.Constants.KEYCLOAK_MANAGED_REALM);
            String kieserverUrl = System.getProperty( sales.analyzer.commons.Constants.KIE_SERVER_URL);
            
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
                    ,this 
                    , spaRegistry
                    ,"spa-persistence-repository"
                    );

            spaRegistry.getRegistry("spa-persistence-repository").addInstantiator(initK);

            spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(org.tura.salesanalyzer.persistence.keycloak.User.class, KeyCloakCRUDService.class);
            spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(RoleRepresentation.class,KeyCloakCRUDService.class);
            spaRegistry.getRegistry("spa-persistence-repository").addSearchProvider(org.tura.salesanalyzer.persistence.keycloak.User.class, KeyCloakSearchService.class);
            spaRegistry.getRegistry("spa-persistence-repository").addSearchProvider(RoleRepresentation.class,KeyCloakSearchService.class);
            spaRegistry.getRegistry("spa-persistence-repository").addLoader(org.tura.salesanalyzer.persistence.keycloak.User.class.getName(),new SPAAdapterLoader(realmResource));
            spaRegistry.getRegistry("spa-persistence-repository").addLoader(org.tura.salesanalyzer.persistence.keycloak.RoleRef.class.getName(),new SPAAdapterLoader(realmResource));

            JbpmServiceInstantiator initJ = new JbpmServiceInstantiator(kieserverUrl, new OAuthCredentialsProvider(), new CdiUserPeferencesProviderImpl(),this, spaRegistry,"spa-persistence-repository");
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
            this.addProfile(p.getProfileName(), p);
            CaseManagerProfile p1 = new CaseManagerProfile();
            this.addProfile(p1.getProfileName(), p1);
            
            this.addProfile(AllowEverythingProfile.class.getName(), new  AllowEverythingProfile());
            

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}