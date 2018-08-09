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
package org.tura.platform.repository.core;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.tura.platform.repository.triggers.PostCreateTrigger;
import org.tura.platform.repository.triggers.PostQueryTrigger;
import org.tura.platform.repository.triggers.PreQueryTrigger;

public class Registry implements Serializable{

	private static final long serialVersionUID = 1L;

	private Map<String, Repository> providers = new HashMap<>();
	private Map<String, String> classMapper = new HashMap<>();
	private Map<String, PostCreateTrigger> postCreateTriggers = new HashMap<>();
	private Map<String, PreQueryTrigger> preQueryTriggers = new HashMap<>();
	private Map<String, PostQueryTrigger> postQueryTriggers = new HashMap<>();
	private Map<String, Mapper> mappers = new HashMap<>();
	private Map<String , Boolean> skipRelation = new HashMap<>();
	private Map<Repository , CommandProducer> commandProducers = new HashMap<>();
	private PrImaryKeyStrategy prImaryKeyStrategy;
	private TransactionAdapter transactrionAdapter;
	private Map<String, AdapterLoader> loaders = new HashMap<>();

	public Registry() {

	}

	public void setPrImaryKeyStrategy(PrImaryKeyStrategy prImaryKeyStrategy){
		this.prImaryKeyStrategy = prImaryKeyStrategy;
	}
	
	public PrImaryKeyStrategy getPrImaryKeyStrategy(){
		return prImaryKeyStrategy;
	}
	
	
	public void addCommandProducer(Repository repository, CommandProducer commandProducer){
		commandProducers.put(repository, commandProducer);
	}
	
	public void addSkipRelationRule(Class<?> repositoryClass, String relation) {
		skipRelation.put(repositoryClass.getName() + "On" + relation, true);
	}

	public void addProvider(String persistanceClass, Repository provider) {
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

	public void addTrigger(String parentClass,  String childClass,  Object trigger) {
		if (trigger instanceof PreQueryTrigger) {
			preQueryTriggers.put(parentClass+"2"+childClass, (PreQueryTrigger) trigger);
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
		Repository provider = providers.get(persistanceClass);
		if (provider == null) {
			throw new RepositoryException("Unsupporable class " + repositoryClass);
		}
		return provider;
	}

	public String findPersistanceClass(String repositoryClass) throws RepositoryException {
		String persistanceClass = classMapper.get(repositoryClass);
		if (persistanceClass == null) {
			throw new RepositoryException("Unsupporable class persistance class for " + repositoryClass);
		}
		return persistanceClass;

	}
	
	
	public CommandProducer findCommandProduce(String repositoryClass) throws RepositoryException{
		Repository repository  = findProvider(repositoryClass);
		CommandProducer commandProducer =  commandProducers.get(repository);
		if(commandProducer == null){
			throw new RepositoryException("Unsupporable command producer for  " + repositoryClass);
		}
		return commandProducer;
	}
	
	public String findRepositoryClass(String persistanceClass) throws RepositoryException {
		String repositoryClass = classMapper.get(persistanceClass);
		if (repositoryClass == null) {
			throw new RepositoryException("Unsupporable class repository class for  " + persistanceClass);
		}
		return repositoryClass;
	}
	
    Set<Repository> getListOfRepositories(){
    	return commandProducers.keySet();
    }

	public PostCreateTrigger findPostCreateTrigger(String repositoryClass) {
		return postCreateTriggers.get(repositoryClass);
	}

	public PreQueryTrigger findPreQueryTrigger(String parentClass,  String childClass) {
		return preQueryTriggers.get( parentClass+"2"+childClass);
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

	public boolean skipRelation(Class<?> repositoryClass, Method method) {
		String relation = method.getName();
		relation = StringUtils.uncapitalize(relation.substring(3));
		Boolean skip = skipRelation.get(repositoryClass.getName() + "On" + relation);
		if (skip == null) {
			return false;
		}
		return skip;
	}
	
	public TransactionAdapter getTransactrionAdapter() {
		return transactrionAdapter;
	}

	public void setTransactrionAdapter(TransactionAdapter transactrionAdapter) {
		this.transactrionAdapter = transactrionAdapter;
	}
	
	public void addLoader( String className, AdapterLoader loader) {
		this.loaders.put(className, loader);
	}
	
   
	public AdapterLoader getLoader( String className) {
		return loaders.get(className);
	}
	
}
