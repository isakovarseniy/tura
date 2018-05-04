package org.tura.platform.repository.core;

import java.util.List;
import java.util.Map;

public abstract class RelationAdapter {
	
	protected static String MASTER_PROPERTY = "masterProperty";
	protected static String DETAIL_PROPERTY = "detailProperty";

	
	public abstract void connectRepositoryObjects (Object master, Object detail) throws Exception;
	
	public abstract List<Object> getListOfRepositoryObjects(Object repositoryObject) throws Exception;

	public abstract void disconnectRepositoryObject(Object repositoryObject, Object obj) throws Exception;

	public abstract Map<String,String> getProperty(Object obj1, Object obj2) throws Exception;

	
	public String getMasterProperty(Object obj1, Object obj2) throws Exception {
		return getProperty(obj1,obj2).get(MASTER_PROPERTY);
	}
	
	public String getDetailProperty(Object obj1, Object obj2) throws Exception {
		return getProperty(obj1,obj2).get(DETAIL_PROPERTY);
	}
	

	
	

}

