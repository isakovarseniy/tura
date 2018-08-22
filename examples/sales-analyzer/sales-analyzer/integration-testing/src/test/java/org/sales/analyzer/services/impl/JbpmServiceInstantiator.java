package org.sales.analyzer.services.impl;

import java.util.Arrays;

import org.kie.server.client.KieServicesClient;
import org.tura.platform.repository.core.Instantiator;

import sales.analyzer.service.UserReferencesProvider;
import sales.analyzer.service.jbpm.JbpmCRUDService;
import sales.analyzer.service.jbpm.JbpmSearchService;

public class JbpmServiceInstantiator implements Instantiator{

	private KieServicesClient client;
	private UserReferencesProvider prefRef;
	
	public JbpmServiceInstantiator(KieServicesClient client,UserReferencesProvider prefRef) {
		this.client = client;
		this.prefRef = prefRef;
	}
	
	
	private static String[] knownObjects = new String[] {
			JbpmCRUDService.class.getName(),
			JbpmSearchService.class.getName()
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

