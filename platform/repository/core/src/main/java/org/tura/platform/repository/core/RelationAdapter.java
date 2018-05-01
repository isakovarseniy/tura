package org.tura.platform.repository.core;

import java.util.List;

public interface RelationAdapter {
	
	static String RULES_LIST = "RULES_LIST";
	
	void process (Object master, Object detail) throws Exception;
	
	List<?> getListOfRepositoryObjects(Object repositoryObject) throws Exception;

}
