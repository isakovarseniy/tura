package org.tura.platform.repository.core.relatioin.processor;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.tura.platform.repository.core.RelationAdapter;

public class Many2ManyRelationAdapter implements RelationAdapter {

	private Method method; 
	private Map<String,Object> context;
	
	public Many2ManyRelationAdapter(Method method , Map<String,Object> context){
		this.method = method;
		this.context = context;

	}
	
	
	@Override
	public void process(Object master, Object detail) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<?> getListOfRepositoryObjects(Object repositoryObject) {
		// TODO Auto-generated method stub
		return null;
	}

}
