package org.tura.platform.object.persistence.operation;

import java.lang.reflect.Method;

import javax.persistence.EntityManager;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.object.persistence.data.UpdateData;

public class UpdateOperation {
	
	
	EntityManager em;
	
	public UpdateOperation(EntityManager em){
		this.em=em;
	}
	public void execute (UpdateData data) throws Exception{
		Object object = em.find(Class.forName(data.getClassName()), data.getPk());
		String name = "set"+WordUtils.capitalize(data.getProperty());
		Method m = object.getClass().getDeclaredMethod(name, data.getValue().getClass());
		m.invoke(object, data.getValue());
	}
	
}
