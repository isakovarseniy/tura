package org.tura.platform.datacontrol;

import java.lang.reflect.InvocationTargetException;

import org.tura.platform.datacontrol.commons.Reflection;

public class Util {
	
	@SuppressWarnings({ "rawtypes" })
	public static Object convertobject(Object obj, DataControl datacontrol) throws NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Object wrapper = BeanWrapper.newInstance(obj.getClass(),
				datacontrol);
		BeanWrapper w = (BeanWrapper) Reflection.call(wrapper, "getWrapper");

		w.setObj(obj);
		w.setDatacontrol(datacontrol);

		return  wrapper;

	}	

}
