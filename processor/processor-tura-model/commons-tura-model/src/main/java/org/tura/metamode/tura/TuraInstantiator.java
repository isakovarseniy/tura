/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamode.tura;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;

import org.tura.epsilon.model.TuraModel;
import org.tura.epsilon.model.TypeResolver;
import org.tura.model.designer.repository.jpa.InitJPARepository;
import org.tura.model.designer.repository.proxy.InitCPARepository;
import org.tura.model.designer.repository.proxy.ProxyRepository;
import org.tura.model.designer.repository.proxy.ProxyRepositoryInstantiator;
import org.tura.model.designer.repository.serialized.type.Attribute;
import org.tura.model.designer.repository.serialized.type.Type;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.object.JpaTransactionAdapter;
import org.tura.platform.repository.core.AllowEverythingProfile;
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.cpa.CachedRepository;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.CpaTransactionAdapter;
import org.tura.platform.repository.cpa.LocalCommadStackProvider;
import org.tura.platform.repository.cpa.RefreshRule;
import org.tura.platform.repository.cpa.storage.CpaServiceInstantiator;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.cpa.storage.StorageControl;
import org.tura.platform.repository.jpa.operation.EntityManagerProvider;
import org.tura.platform.repository.jpa.operation.ExternalQueryProcessor;
import org.tura.platform.repository.jpa.operation.query.Many2ManyQueryProcessor;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.spa.SpaObjectRegistry;


public class TuraInstantiator {

	public EntityManager em;
	public CpaStorageProvider cpaStorageProvider;
	public Registry registry;

	private EntityManagerProvider emProvider = new EntityManagerProvider() {

		@Override
		public EntityManager getEntityManager() {
			return em;
		}

		@Override
		public void destroyEntityManager() {

		}
	};
	
	public TuraModel createTuraModel(EntityManager em) throws Exception {
		this.em  =  em;
		PlatformConfig.READ_WRITE_MODE = false;
		Repository transport = getJpaRepository();
		CachedRepository cachedTransport = new CachedRepository(transport);
		CpaRepository repository = getProxyRepository(cachedTransport);
		repository.addReadOnlyRefreshRule(Type.class,  new TypeElementRefreshRule());
		TuraModel model = new TuraModel();
		model.setRepository(repository);
		
		TypeResolver typeResolver = new MeamodelTypeResolver();
		model.setTypeResolver(typeResolver);

		return model;
    }
	
	
	public TuraModel createTuraModel(CpaRepository repository) throws Exception {
		TuraModel model = new TuraModel();
		model.setRepository(repository);
		TypeResolver typeResolver = new MeamodelTypeResolver();
		model.setTypeResolver(typeResolver);
		return model;
	}	
	
	public CpaRepository getProxyRepository(Repository transport) throws Exception {
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

	public Repository getJpaRepository() throws Exception {
		registry = new Registry();
		SpaObjectRegistry spaRegistry = new SpaObjectRegistry();

		registry.setPrImaryKeyStrategy(new MetamodelPrimaryKeyStrategy());
		registry.addProfile(AllowEverythingProfile.class.getName(), new AllowEverythingProfile());
		registry.addInstantiator(new ProxyRepositoryInstantiator(new LocalProxyRepositoryProvider()));

		Repository repository = new BasicRepository(registry);

		
		Map<String, ExternalQueryProcessor<?>> queryProcessorRegistry = new HashMap<String, ExternalQueryProcessor<?>>();
		queryProcessorRegistry.put(Constants.MANY2MANY_QUERY, new Many2ManyQueryProcessor<>());
		
		InitJPARepository init = new InitJPARepository(registry, spaRegistry);
		init.initClassMapping();
		init.initFeldsMapping();
		init.initCommandProducer(emProvider,queryProcessorRegistry);
		init.initProvider();
		init.initRules();

		registry.setTransactrionAdapter(new JpaTransactionAdapter(em, registry));

		return repository;
	}

	public class TypeElementRefreshRule implements RefreshRule{

		private static final long serialVersionUID = 1L;

		@Override
		public boolean shouldRefresh(CpaRepository repository, StorageControl sc) throws RepositoryException {
            if (sc.getLoadedBy() != null && sc.getLoadedBy().getName().equals(Attribute.class.getName())) {
            	return true;
            }
			return false;
		}
		
	}

}
