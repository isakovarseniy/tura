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
import sales.analyzer.service.UserPreferencesProvider;
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
	
	
	
	public JbpmServiceInstantiator(String kieserverUrl, CredentialsProvider credentialsProvider  ,UserPreferencesProvider prefRef,Registry registry,SpaObjectRegistry spaRegistry) {
		this.prefRef = prefRef;
		this.registry=registry;
		this.spaRegistry=spaRegistry;
		
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
			ETLCompleteTaskCommand.class.getName()
			};
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T newInstance(Class<T> clazz) {
		
		if (JbpmCRUDService.class.equals(clazz)){
			return (T) new JbpmCRUDService(client);
		}
		if (JbpmSearchService.class.equals(clazz)) {
			return (T) new JbpmSearchService(client,prefRef);
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

