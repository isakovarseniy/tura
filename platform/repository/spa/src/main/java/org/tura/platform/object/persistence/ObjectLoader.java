package org.tura.platform.object.persistence;

public class ObjectLoader {
	
	public <T> T newInstance(Class<T> clazz) throws Exception {
		return clazz.newInstance();
	}
	
	public boolean isLoadProperty(Class<?> clazz , String property, Class<?> type){
		return true;
	}
	
	public boolean isLoadRelation(Class<?> src , Class<?> trg, String property, String relationType){
		return false;
	}
	
	public Object getValue(Class<?> clazz , String property, Class<?> type){
		return null;
	}


	public void startObjectLoading(Class<?> clazz,Object ob){
		
	}

	public void endObjectLoading(Class<?> clazz,Object ob){
		
	}
	
	public void endPropertiesLoading(Class<?> clazz,Object ob){
		
	}
	
	public void endLoadRelation(Class<?> src , Class<?> trg, String property, String relationType,Object ob){
	}

	public void startLoadRelation(Class<?> src , Class<?> trg, String property, String relationType,Object ob){
	}
	
	
}
