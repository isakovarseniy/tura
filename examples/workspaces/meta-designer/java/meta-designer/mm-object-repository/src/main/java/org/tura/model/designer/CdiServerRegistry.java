/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.model.designer;

import java.util.HashMap;
import java.util.Map;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

import org.tura.model.designer.profiles.GraphAwareProfile;
import org.tura.model.designer.repository.domain.InitSPARepository;
import org.tura.model.designer.repository.neo4j.InitNEO4JRepository;
import org.tura.model.designer.repository.proxy.ProxyRepositoryInstantiator;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.repository.cdi.ServerRegistry;
import org.tura.platform.repository.cdi.starter.CdiServerProxyRepositoryProvider;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.neo4j.operation.ExternalQueryProcessor;
import org.tura.platform.repository.neo4j.operation.query.Many2ManyQueryProcessor;
import org.tura.platform.repository.spa.SpaObjectRegistry;


@ApplicationScoped
@ServerRegistry
public class CdiServerRegistry extends Registry {

	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void init() {
		try {

			SpaObjectRegistry spaRegistry = new SpaObjectRegistry();

			this.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
			this.addProfile(GraphAwareProfile.class.getName(),  GraphAwareProfile.class);
			this.addInstantiator(new ProxyRepositoryInstantiator(new CdiServerProxyRepositoryProvider()));
			this.setTransactrionAdapter(new CdiServerTransactionAdapter(this));

			Map<String, ExternalQueryProcessor<?>> queryProcessorRegistry = new HashMap<String, ExternalQueryProcessor<?>>();
			queryProcessorRegistry.put(Constants.MANY2MANY_QUERY, new Many2ManyQueryProcessor<>());

			InitNEO4JRepository init = new InitNEO4JRepository(this, spaRegistry);
			init.initCommandProducer(new CdiNeo4jSessionProvider(), queryProcessorRegistry,null);
			init.initProvider();
			init.initRules();
			init.initClassMapping();
			init.initFeldsMapping();
			

			InitSPARepository initspa = new InitSPARepository(this, spaRegistry);
			initspa.initClassMapping();
			initspa.initCommandProducer();
			initspa.initProvider();
			initspa.initRules();

			spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addInstantiator(
					new DomainServicesInstantiator(this, spaRegistry, InitSPARepository.SPA_REPOSITORY_NAME));

			spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider(org.tura.model.designer.repository.domain.metabase.ConfigHashAggregator.class,
					DomainCRUDService.class);
			spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addSearchProvider(org.tura.model.designer.repository.domain.metabase.ConfigHashAggregator.class,
					DomainSearchService.class);

			spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider(org.tura.model.designer.repository.domain.metabase.ConfigVariableAggregator.class,
					DomainCRUDService.class);
			spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addSearchProvider(org.tura.model.designer.repository.domain.metabase.ConfigVariableAggregator.class,
					DomainSearchService.class);
			

			spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider(org.tura.model.designer.repository.domain.metabase.GenerationHintAggregator.class,
					DomainCRUDService.class);
			spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addSearchProvider(org.tura.model.designer.repository.domain.metabase.GenerationHintAggregator.class,
					DomainSearchService.class);
			

			spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider( org.tura.model.designer.repository.domain.metabase.RootST. class,
					DomainCRUDService.class);
			spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addSearchProvider(org.tura.model.designer.repository.domain.metabase.RootST.class,
					DomainSearchService.class);
			

			spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider( org.tura.model.designer.repository.domain.metabase.TypesAggregator. class,
					DomainCRUDService.class);
			spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addSearchProvider(org.tura.model.designer.repository.domain.metabase.TypesAggregator.class,
					DomainSearchService.class);

			
			

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

}