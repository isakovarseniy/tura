package org.tura.platform.repository.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.tura.platform.repository.RepositoryException;
import org.tura.platform.repository.triggers.PostCreateTrigger;
import org.tura.platform.repository.triggers.PostQueryTrigger;
import org.tura.platform.repository.triggers.PreQueryTrigger;
import org.tura.platform.repository.CommandProducer;
import org.tura.platform.repository.Mapper;
import org.tura.platform.repository.Repository;

public class Registry {

	private Map<String, Repository> providers = new HashMap<>();
	private Map<String, String> classMapper = new HashMap<>();
	private Map<String, PostCreateTrigger> postCreateTriggers = new HashMap<>();
	private Map<String, PreQueryTrigger> preQueryTriggers = new HashMap<>();
	private Map<String, PostQueryTrigger> postQueryTriggers = new HashMap<>();
	private Map<String, Mapper> mappers = new HashMap<>();
	private Map<String , Boolean> skipRelation = new HashMap<>();
	private Map<Repository , CommandProducer> commandProducers = new HashMap<>();

	
	
	private static Registry instance = new Registry();

	private Registry() {

	}

	public static Registry getInstance() {
		return instance;
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

	public void addMapper(String persistanceClass, String repositoryClass, Mapper mapper) {
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
		return persistanceClass;

	}
	
	

	public PostCreateTrigger findPostCreateTrigger(String repositoryClass) {
		return postCreateTriggers.get(repositoryClass);
	}

	public PreQueryTrigger findPreQueryTrigger(String repositoryClass) {
		return preQueryTriggers.get(repositoryClass);
	}

	public PostQueryTrigger findPostQueryTrigger(String repositoryClass) {
		return postQueryTriggers.get(repositoryClass);
	}

	public Mapper findMapper(String persistanceClass, String repositoryClass) {
		return mappers.get(persistanceClass + "2+" + repositoryClass);
	}

	public boolean skipRelation(Class<?> repositoryClass, Method method) {
		String relation = method.getName();
		relation = StringUtils.uncapitalize(relation.substring(2));
		Boolean skip = skipRelation.get(repositoryClass.getName() + "On" + relation);
		if (skip == null) {
			return false;
		}
		return skip;
	}
}
