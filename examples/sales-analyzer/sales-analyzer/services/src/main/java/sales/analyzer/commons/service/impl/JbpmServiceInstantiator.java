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

package sales.analyzer.commons.service.impl;

import java.util.Arrays;

import org.kie.server.client.CredentialsProvider;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.tura.platform.repository.core.Instantiator;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.spa.SpaObjectRegistry;

import sales.analyzer.api.model.impl.ExtraClasses;
import sales.analyzer.process.commons.Constants;
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

public class JbpmServiceInstantiator implements Instantiator{

    private UserPreferencesProvider prefRef;
    private Registry registry;
    private SpaObjectRegistry spaRegistry;
    private KieServicesClient client;
    private String registryName;
    
    
    public JbpmServiceInstantiator(String kieserverUrl, CredentialsProvider credentialsProvider  ,UserPreferencesProvider prefRef,Registry registry,SpaObjectRegistry spaRegistry,String registryName ) {
        this.prefRef = prefRef;
        this.registry=registry;
        this.spaRegistry=spaRegistry;
        this.registryName = registryName;
        
        KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(kieserverUrl, null,null);
        config.setCredentialsProvider(credentialsProvider);
        config.addExtraClasses(ExtraClasses.list);
        client = KieServicesFactory.newKieServicesClient(config);

    }
    
    
    private static String[] knownObjects = new String[] {
            JbpmCRUDService.class.getName(),
            JbpmSearchService.class.getName(),
            AssignActorCommand.class.getName(),
            CloseWFCommand.class.getName(),
            AssignActorsCaseProcessCommand.class.getName(),
            CloseWFCaseProcessCommand.class.getName(),
            TaskCompletionCommand.class.getName(),
            ETLCompleteTaskCommand.class.getName(),
            FileSearchService.class.getName()
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
        
        if (JbpmCRUDService.class.equals(clazz)){
            return (T) new JbpmCRUDService(client,spaRegistry,registryName,registry);
        }
        if (JbpmSearchService.class.equals(clazz)) {
            return (T) new JbpmSearchService(client,prefRef, spaRegistry, registryName, registry);
        }
        
        if (FileSearchService.class.equals(clazz)) {
            return (T) new FileSearchService(System.getProperty(Constants.FILE_IMPORT_DIRECTORY), spaRegistry, registryName, registry);
        }
        
        
        if (AssignActorCommand.class.equals(clazz)) {
            return (T) new AssignActorCommand(registry,spaRegistry);
        }

        if (AssignActorsCaseProcessCommand.class.equals(clazz)) {
            return (T) new AssignActorsCaseProcessCommand(registry,spaRegistry);
        }

        if (CloseWFCommand.class.equals(clazz)) {
            return (T) new CloseWFCommand(registry,spaRegistry);
        }
        
        if (CloseWFCaseProcessCommand.class.equals(clazz)) {
            return (T) new CloseWFCaseProcessCommand(registry,spaRegistry);
        }
        if (TaskCompletionCommand.class.equals(clazz)) {
            return (T) new TaskCompletionCommand(registry,spaRegistry);
        }
        if (ETLCompleteTaskCommand.class.equals(clazz)) {
            return (T) new ETLCompleteTaskCommand(registry,spaRegistry);
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