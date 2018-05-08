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

public class One2OneRelationAdapter extends RelationAdapter {

	private Method method;
	private Class<?> clazz;
	private Map<String, Object> context;

	public One2OneRelationAdapter(Class<?> clazz, Method method, Map<String, Object> context) {
		this.method = method;
		this.context = context;
		this.clazz = clazz;
	}

	@Override
	public void connectRepositoryObjects(Object obj1, Object obj2) throws Exception {
		Method masterMethod = null;
		Method detailMethod = null;
		Object master = obj1;
		Object detail = obj2;
		

		if (clazz.getName().equals(obj1.getClass().getName())) {
			masterMethod = method;
			detailMethod = getRemoteSetMethod();
		} else {
			masterMethod = getRemoteSetMethod();
			detailMethod = method;
		}
		Rule rule = new One2OneRepositoryRuleObject(master, detail, masterMethod, detailMethod);

		@SuppressWarnings("unchecked")
		List<Rule> list = (List<Rule>) context.get(RepositoryObjectLoader.RULES_LIST);
		list.add(rule);
	}


	private Method getRemoteSetMethod() throws Exception {
		Assosiation assosiation = method.getAnnotation(Assosiation.class);
		Class<?> remoteClass = assosiation.mappedBy();

		String remoteSetName = "set" + WordUtils.capitalize(assosiation.property());
		return remoteClass.getMethod(remoteSetName, new Class[] { clazz });
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Object> getListOfRepositoryObjects(Object repositoryObject) throws Exception {
		List list = new ArrayList<>();
		Object obj = method.invoke(repositoryObject);
		if (obj != null){
			list.add(obj);
		}
		return list;
	}

	@Override
	public void disconnectRepositoryObject(Object obj1, Object obj2) throws Exception {
		Method masterMethod = null;
		Method detailMethod = null;
		Object master = obj1;
		Object detail = obj2;
		

		if (clazz.getName().equals(obj1.getClass().getName())) {
			masterMethod = method;
			detailMethod = getRemoteSetMethod();
		} else {
			masterMethod = getRemoteSetMethod();
			detailMethod = method;
		}
		
		masterMethod.invoke(master, (Object[]) null);
		detailMethod.invoke(detail, (Object[]) null);
		
	}

	@Override
	public Map<String, String> getProperty(Object obj1, Object obj2) throws Exception {
		String masterProperty = null;
		String detailProperty = null;
		
		if (obj1.getClass().equals(clazz)){
			masterProperty = WordUtils.uncapitalize( method.getName().substring(2));
			detailProperty = WordUtils.uncapitalize( getRemoteSetMethod().getName().substring(2));
		}else{
			detailProperty = WordUtils.uncapitalize( method.getName().substring(2));
			masterProperty = WordUtils.uncapitalize( getRemoteSetMethod().getName().substring(2));
		}

		Map<String,String> map = new HashMap<>();
		map.put(MASTER_PROPERTY, masterProperty);
		map.put(DETAIL_PROPERTY, detailProperty);

		return map;

	
	}

}