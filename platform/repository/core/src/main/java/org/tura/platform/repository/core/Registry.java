package org.tura.platform.repository.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.tura.platform.repository.triggers.PostCreateTrigger;
import org.tura.platform.repository.triggers.PostQueryTrigger;
import org.tura.platform.repository.triggers.PreQueryTrigger;

public class Registry {

	private Map<String, PersistenceProvider> providers = new HashMap<>();
	private Map<String, String> classMapper = new HashMap<>();
	private Map<String, PostCreateTrigger> postCreateTriggers = new HashMap<>();
	private Map<String, PreQueryTrigger> preQueryTriggers = new HashMap<>();
	private Map<String, PostQueryTrigger> postQueryTriggers = new HashMap<>();
	private Map<String, Mapper> mappers = new HashMap<>();
	private Map<String , Boolean> skipRelation = new HashMap<>();

	private static Registry instance = new Registry();

	private Registry() {

	}

	public static Registry getInstance() {
		return instance;
	}

	public void addSkipRelationRule(Class<?> repositoryClass, String relation) {
		skipRelation.put(repositoryClass.getName() + "On" + relation, true);
	}

	public void addProvider(String persistanceClass, PersistenceProvider provider) {
		providers.put(persistanceClass, provider);
	}

	public void addClassMapping(String repositoryClass, String persistanceClass) {
		classMapper.put(repositoryClass, persistanceClass);
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

	public PersistenceProvider findProvider(String repositoryClass) throws RepositoryException {
		String persistanceClass = classMapper.get(repositoryClass);
		if (persistanceClass == null) {
			throw new RepositoryException("Unsupporable class " + repositoryClass);
		}
		PersistenceProvider provider = providers.get(persistanceClass);
		if (provider == null) {
			throw new RepositoryException("Unsupporable class " + repositoryClass);
		}
		return provider;
	}

	public String findPersistanceClass(String repositoryClass) throws RepositoryException {
		String persistanceClass = classMapper.get(repositoryClass);
		if (persistanceClass == null) {
			throw new RepositoryException("Unsupporable class " + repositoryClass);
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
