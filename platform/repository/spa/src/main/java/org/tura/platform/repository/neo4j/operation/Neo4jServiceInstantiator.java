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

package org.tura.platform.repository.neo4j.operation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.tura.platform.repository.core.Instantiator;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.spa.SpaObjectRegistry;

public class Neo4jServiceInstantiator implements Instantiator {

	private SpaObjectRegistry spaRegistry;
	private String registryName;
	private Registry registry;
	private Neo4jSessionProvider neo4jSessionProvider;
	private Map<String, ExternalQueryProcessor<?>> queryProcessorRegistry = new HashMap<>();
	private SequenceProvider sequenceProvider;

	private static String[] knownObjects = new String[] { Neo4jCRUDService.class.getName(),
			Neo4jSearchService.class.getName(), };

	public Neo4jServiceInstantiator(SpaObjectRegistry spaRegistry, String registryName, Registry registry,
			Neo4jSessionProvider neo4jSessionProvider) {
		this.spaRegistry = spaRegistry;
		this.registryName = registryName;
		this.registry = registry;
		this.neo4jSessionProvider = neo4jSessionProvider;

	}

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
		if (Neo4jSearchService.class.equals(clazz)) {
			Neo4jSearchService service = new Neo4jSearchService(spaRegistry, registryName, registry,
					neo4jSessionProvider);
			service.addExternalQueryProcessor(queryProcessorRegistry);
			return (T) service;
		}
		if (Neo4jCRUDService.class.equals(clazz)) {
			return (T) new Neo4jCRUDService(spaRegistry, registryName, registry, neo4jSessionProvider,sequenceProvider);
		}

		throw new RuntimeException("Unknown class " + clazz);
	}

	@Override
	public boolean check(Class<?> clazz) {
		return check(clazz.getName());
	}

	@Override
	public boolean check(String clazzName) {
		return Arrays.asList(knownObjects).contains(clazzName);
	}

	public <T> void addExternalQueryProcessor(String queryName, ExternalQueryProcessor<T> processor) {
		this.queryProcessorRegistry.put(queryName, processor);
	}

	public <T> void addExternalQueryProcessor(Map<String, ExternalQueryProcessor<?>> queryProcessorRegistry) {
		if (queryProcessorRegistry == null) {
			return;
		}
		this.queryProcessorRegistry.putAll(queryProcessorRegistry);
	}

	public SequenceProvider getSequenceProvider() {
		return sequenceProvider;
	}

	public void setSequenceProvider(SequenceProvider sequenceProvider) {
		this.sequenceProvider = sequenceProvider;
	}

}
