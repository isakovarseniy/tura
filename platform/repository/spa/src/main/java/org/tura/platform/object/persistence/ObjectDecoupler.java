package org.tura.platform.object.persistence;

public class ObjectDecoupler {

	public void startObjectDecouple(Class<?> clazz,Object ob){
		
	}

	public void endObjectDecouple(Class<?> clazz,Object ob){
		
	}

	public boolean isSaveProperty(Class<?> clazz , String property, Class<?> type){
		return true;
	}
	
	
	public void setValue(Class<?> clazz , String property, Object value){
	}

	public void endPropertiesSavings(Class<?> clazz,Object ob){
		
	}

	public boolean isSaveRelation(Class<?> src , Class<?> trg, String property, String relationType){
		return false;
	}
	
	
	public void endSavingRelation(Class<?> src , Class<?> trg, String property, String relationType,Object ob){
	}

	public void startSavingRelation(Class<?> src , Class<?> trg, String property, String relationType,Object ob){
	}
	
	
}
