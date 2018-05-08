package org.tura.platform.repository.core.relatioin;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.repository.Rule;
import org.tura.platform.repository.core.RelationAdapter;
import org.tura.platform.repository.core.RepositoryObjectLoader;
import org.tura.platform.repository.core.annotation.Assosiation;

public class Many2ManyRelationAdapter extends RelationAdapter {

	private Method method;
	private Class<?> clazz;
	private Map<String, Object> context;

	public Many2ManyRelationAdapter(Class<?> clazz, Method method, Map<String, Object> context) {
		this.method = method;
		this.context = context;
		this.clazz = clazz;
	}
	
	
	@Override
	public void connectRepositoryObjects(Object obj1, Object obj2) throws Exception {
		Method masterMethod = null;
		Method detailMethod = null;
		Object master = null;
		Object detail= null;

		if (obj1.getClass().equals(clazz)){
			masterMethod = method;
			detailMethod = getRemoteGetMethod();
		}else{
			masterMethod = getRemoteGetMethod();
			detailMethod = method;
			
		}
		master = obj1;
		detail = obj2;
		
		Rule rule = new Many2ManyRepositoryRuleObject(master, detail, masterMethod, detailMethod);

		@SuppressWarnings("unchecked")
		List<Rule> list = (List<Rule>) context.get(RepositoryObjectLoader.RULES_LIST);
		list.add(rule);

	}



	private Method getRemoteGetMethod() throws Exception {
		Assosiation assosiation = method.getAnnotation(Assosiation.class);
		Class<?> remoteClass = assosiation.mappedBy();

		String remoteSetName = "get" + WordUtils.capitalize(assosiation.property());
		return remoteClass.getMethod(remoteSetName);
	}
	
	

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Object> getListOfRepositoryObjects(Object repositoryObject) throws Exception {
		List list = (List) method.invoke(repositoryObject);
		if (list == null){
			return new ArrayList<>();
		}
		return list;
	}


	@SuppressWarnings("rawtypes")
	@Override
	public void disconnectRepositoryObject(Object obj1, Object obj2) throws Exception {
		Method masterMethod = null;
		Method detailMethod = null;
		Object master = null;
		Object detail= null;

		if (obj1.getClass().equals(clazz)){
			masterMethod = method;
			detailMethod = getRemoteGetMethod();
		}else{
			masterMethod = getRemoteGetMethod();
			detailMethod = method;
		}
		master = obj1;
		detail = obj2;

		List list = (List) masterMethod.invoke(master);
		list.remove(detail);

		list = (List) detailMethod.invoke(detail);
		list.remove(master);
		
	}


	@Override
	public Map<String,String> getProperty(Object obj1, Object obj2) throws Exception {
		String masterProperty = null;
		String detailProperty = null;

		if (obj1.getClass().equals(clazz)){
			masterProperty = WordUtils.uncapitalize( method.getName().substring(2));
			detailProperty = WordUtils.uncapitalize( getRemoteGetMethod().getName().substring(2));
		}else{
			detailProperty = WordUtils.uncapitalize( method.getName().substring(2));
			masterProperty = WordUtils.uncapitalize( getRemoteGetMethod().getName().substring(2));
		}

		
		Map<String,String> map = new HashMap<>();
		map.put(MASTER_PROPERTY, masterProperty);
		map.put(DETAIL_PROPERTY, detailProperty);

		return map;
		
	}



}

