package org.tura.platform.repository.core.relatioin.processor;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.repository.core.RelationAdapter;
import org.tura.platform.repository.core.RepositoryObjectLoader;
import org.tura.platform.repository.core.Rule;
import org.tura.platform.repository.core.annotation.Assosiation;

public class One2ManyRelationAdapter implements RelationAdapter {

	private Method method;
	private Class<?> clazz;
	private Map<String, Object> context;

	public One2ManyRelationAdapter(Class<?> clazz, Method method, Map<String, Object> context) {
		this.method = method;
		this.context = context;
		this.clazz = clazz;
	}

	@Override
	public void connectRepositoryObjects(Object obj1, Object obj2) throws Exception {
		Method masterMethod = null;
		Method detailMethod = null;
		Object  master = null;
		Object detail= null;

		if (findAnnotationType(master)){
			master = obj1;
			detail = obj2;
		}else{
			master = obj2;
			detail = obj1;
		}
		masterMethod = getMasterMethod();
		detailMethod = getDetailMethod();

		Rule rule = new One2ManyRepositoryRuleObject(master, detail, masterMethod, detailMethod);

		@SuppressWarnings("unchecked")
		List<Rule> list = (List<Rule>) context.get(RepositoryObjectLoader.RULES_LIST);
		list.add(rule);
		
		

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Object> getListOfRepositoryObjects(Object repositoryObject) throws Exception{
		Object obj = method.invoke(repositoryObject);
		if (obj instanceof List){
			return (List<Object>) obj;
		}else{
			List list = new ArrayList<>();
			list.add(obj);
			return list;
		}
	}
	
	private boolean findAnnotationType(Object master){
		boolean  one2many = true;
		Type returnType = method.getGenericReturnType();
		if (returnType instanceof ParameterizedType) {
			ParameterizedType type = (ParameterizedType) returnType;
			if ( type.getRawType().getClass().getName().equals(List.class.getName())){
				  one2many = true;
			}else{
				  one2many = false;
			}
		}else{
			  one2many = false;
		}
		if (master.getClass().equals(clazz)){
			return one2many;
		}else{
			return !one2many;
		}
		
		
	}
	

	private Method getMasterMethod() throws Exception {
		Type returnType = method.getGenericReturnType();
		if (returnType instanceof ParameterizedType) {
			ParameterizedType type = (ParameterizedType) returnType;
			if ( type.getRawType().getClass().getName().equals(List.class.getName())){
				return method;
			}
		}
		Assosiation assosiation = method.getAnnotation(Assosiation.class);
		Class <?> remoteClass = assosiation.mappedBy();
		Method remoteMethod = remoteClass.getMethod("get"+ WordUtils.capitalize(assosiation.property()) ,  List.class );
		return remoteMethod;
	}

	private Method getDetailMethod() throws Exception {
		Type returnType = method.getGenericReturnType();
		if (returnType instanceof ParameterizedType) {
			Type[] args =   ((ParameterizedType) returnType).getActualTypeArguments();
			Type arg = args[0];

			Assosiation assosiation = method.getAnnotation(Assosiation.class);
			Class <?> remoteClass = assosiation.mappedBy();
			Method remoteMethod = remoteClass.getMethod("set"+ WordUtils.capitalize(assosiation.property()) , (Class<?>) arg );
			return remoteMethod;
		}else{
			return method;
		}
	}

}