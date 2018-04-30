package org.tura.platform.repository.core;

import java.util.List;

public interface RelationAdapter {
	
	void process (Object master, Object detail);
	
	List<?> getListOfRepositoryObjects(Object repositoryObject);

}
