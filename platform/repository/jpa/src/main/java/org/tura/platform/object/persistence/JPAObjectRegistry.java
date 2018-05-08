package org.tura.platform.object.persistence;

import java.util.HashMap;
import java.util.Map;

import org.tura.platform.repository.triggers.PostCreateTrigger;
import org.tura.platform.repository.triggers.PostQueryTrigger;
import org.tura.platform.repository.triggers.PreQueryTrigger;

public class JPAObjectRegistry {

	private Map<String, PostCreateTrigger> postCreateTriggers = new HashMap<>();
	private Map<String, PreQueryTrigger> preQueryTriggers = new HashMap<>();
	private Map<String, PostQueryTrigger> postQueryTriggers = new HashMap<>();

	private static JPAObjectRegistry instance = new JPAObjectRegistry();

	private JPAObjectRegistry() {

	}

	public static JPAObjectRegistry getInstance() {
		return instance;
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

	public PostCreateTrigger findPostCreateTrigger(String repositoryClass) {
		return postCreateTriggers.get(repositoryClass);
	}

	public PreQueryTrigger findPreQueryTrigger(String repositoryClass) {
		return preQueryTriggers.get(repositoryClass);
	}

	public PostQueryTrigger findPostQueryTrigger(String repositoryClass) {
		return postQueryTriggers.get(repositoryClass);
	}
	
	
	
}
