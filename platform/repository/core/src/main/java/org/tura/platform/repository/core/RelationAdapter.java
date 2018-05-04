package org.tura.platform.repository.core;

import java.util.List;

public interface RelationAdapter {
	
	
	void connectRepositoryObjects (Object master, Object detail) throws Exception;
	
	List<Object> getListOfRepositoryObjects(Object repositoryObject) throws Exception;

	void disconnectRepositoryObject(Object repositoryObject, Object obj);

	String getMasterProperty();

	String getDetailProperty();

}
