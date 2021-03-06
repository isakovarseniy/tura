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

package org.tura.platform.repository.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.repository.triggers.PostCreateTrigger;
import org.tura.platform.repository.triggers.PostQueryTrigger;
import org.tura.platform.repository.triggers.PreQueryTrigger;

public class Registry implements Serializable {

	private static final long serialVersionUID = 1L;

	private Map<String, String> providers = new HashMap<>();
	private Map<String, String> classMapper = new HashMap<>();
	private Map<String, PostCreateTrigger> postCreateTriggers = new HashMap<>();
	private Map<String, PreQueryTrigger> preQueryTriggers = new HashMap<>();
	private Map<String, PostQueryTrigger> postQueryTriggers = new HashMap<>();
	private Map<String, Mapper> mappers = new HashMap<>();
	private Map<String, Class<? extends CommandProducer>> commandProducers = new HashMap<>();
	private PrImaryKeyStrategy prImaryKeyStrategy;
	private TransactionAdapter transactrionAdapter;
	private Map<String, AdapterLoader> loaders = new HashMap<>();
	private CommandLifecycle commandLifecycle;
	private Map<String, ObjectGraphProfile> profiles = new HashMap<>();
	private List<Instantiator> instantiators = new ArrayList<>();

	public Registry() {

	}

	public void setPrImaryKeyStrategy(PrImaryKeyStrategy prImaryKeyStrategy) {
		this.prImaryKeyStrategy = prImaryKeyStrategy;
	}

	public PrImaryKeyStrategy getPrImaryKeyStrategy() {
		return prImaryKeyStrategy;
	}

	public void addInstantiator(Instantiator instantiator) {
		instantiators.add(instantiator);
	}

	public void addProfile(String profileName, ObjectGraphProfile profile) {
		profiles.put(profileName, profile);
	}

	public void addCommandProducer(String repository, Class<? extends CommandProducer> commandProducer) {
		commandProducers.put(repository, commandProducer);
	}

	public void addProvider(String persistanceClass, String provider) {
		providers.put(persistanceClass, provider);
	}

	public void addClassMapping(String repositoryClass, String persistanceClass) {
		classMapper.put(repositoryClass, persistanceClass);
		classMapper.put(persistanceClass, repositoryClass);
	}

	public void addTrigger(String repositoryClass, Object trigger) {
		if (trigger instanceof PostCreateTrigger) {
			postCreateTriggers.put(repositoryClass, (PostCreateTrigger) trigger);
		}
		if (trigger instanceof PreQueryTrigger) {
			preQueryTriggers.put(repositoryClass, (PreQueryTrigger) trigger);
		}

		if (trigger instanceof PostQueryTrigger) {
			postQueryTriggers.put(repositoryClass, (PostQueryTrigger) trigger);
		}
	}

	public void addTrigger(String parentClass, String childClass, Object trigger) {
		if (trigger instanceof PreQueryTrigger) {
			preQueryTriggers.put(parentClass + "2" + childClass, (PreQueryTrigger) trigger);
			return;
		}
		throw new RuntimeException("Only PreQueryTrigger allowed");
	}

	public void addMapper(String repositoryClass, String persistanceClass, Mapper mapper) {
		mappers.put(persistanceClass + "2" + repositoryClass, mapper);
	}

	public Repository findProvider(String repositoryClass) throws RepositoryException {
		String persistanceClass = classMapper.get(repositoryClass);
		if (persistanceClass == null) {
			throw new RepositoryException("Unsupporable class " + repositoryClass);
		}
		String provider = providers.get(persistanceClass);
		if (provider == null) {
			throw new RepositoryException("Unsupporable class " + repositoryClass);
		}
		return instantiateProvider(provider);
	}

	
	public StorageCommandProcessor getStorageCommandProcessor() {
		Instantiator inst = this.findInstantiator(StorageCommandProcessor.class);
		return  inst.newInstance(StorageCommandProcessor.class);
	}
	
	public String findProviderName(String repositoryClass) throws RepositoryException {
		String persistanceClass = classMapper.get(repositoryClass);
		if (persistanceClass == null) {
			throw new RepositoryException("Unsupporable class " + repositoryClass);
		}
		String provider = providers.get(persistanceClass);
		if (provider == null) {
			throw new RepositoryException("Unsupporable class " + repositoryClass);
		}
		return provider;
	}

	private Repository instantiateProvider(String provider) {
		Instantiator inst = this.findInstantiator(provider);
		Repository repository = inst.newInstance(provider);
		return repository;
	}

	public String findPersistanceClass(String repositoryClass) throws RepositoryException {
		String persistanceClass = classMapper.get(repositoryClass);
		if (persistanceClass == null) {
			throw new RepositoryException("Unsupporable class persistance class for " + repositoryClass);
		}
		return persistanceClass;

	}

	public CommandProducer findCommandProduce(String repositoryClass) throws RepositoryException {
		String repositoryName = findProviderName(repositoryClass);

		Instantiator inst = findInstantiator(repositoryName+".CommandProducer");
		CommandProducer commandProducer = inst.newInstance(repositoryName+".CommandProducer");
		return commandProducer;
	}

	public String findRepositoryClass(String persistanceClass) throws RepositoryException {
		String repositoryClass = classMapper.get(persistanceClass);
		if (repositoryClass == null) {
			throw new RepositoryException("Unsupporable class repository class for " + persistanceClass);
		}
		return repositoryClass;
	}

	public PostCreateTrigger findPostCreateTrigger(String repositoryClass) {
		return postCreateTriggers.get(repositoryClass);
	}

	public PreQueryTrigger findPreQueryTrigger(String parentClass, String childClass) {
		return preQueryTriggers.get(parentClass + "2" + childClass);
	}

	public PreQueryTrigger findPreQueryTrigger(String repositoryClass) {
		return preQueryTriggers.get(repositoryClass);
	}

	public PostQueryTrigger findPostQueryTrigger(String repositoryClass) {
		return postQueryTriggers.get(repositoryClass);
	}

	public Mapper findMapper(String persistanceClass, String repositoryClass) {
		return mappers.get(persistanceClass + "2" + repositoryClass);
	}

	public ObjectGraphProfile findProfile(String profileName) {
		return this.profiles.get(profileName);
	}

	public TransactionAdapter getTransactrionAdapter() {
		return transactrionAdapter;
	}

	public void setTransactrionAdapter(TransactionAdapter transactrionAdapter) {
		this.transactrionAdapter = transactrionAdapter;
	}

	public void addLoader(String className, AdapterLoader loader) {
		this.loaders.put(className, loader);
	}

	public AdapterLoader getLoader(String className) {
		return loaders.get(className);
	}

	public CommandLifecycle getCommandLifecycle() {
		if (commandLifecycle == null) {
			return new CommandLifecycle(this);
		}
		return commandLifecycle;
	}

	public void setCommandLifecycle(CommandLifecycle commandLifecycle) {
		this.commandLifecycle = commandLifecycle;
	}

	public Instantiator findInstantiator(Class<?> clazz) {
		return findInstantiator(clazz.getName());
	}

	public Instantiator findInstantiator(String className) {
		for (Instantiator init : instantiators) {
			if (init.check(className)) {
				return init;
			}
		}
		return null;
	}
}
