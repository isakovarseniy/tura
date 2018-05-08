package org.tura.platform.object.persistence.operation;

import java.lang.reflect.Method;
import java.util.List;

import org.apache.commons.lang.WordUtils;

public class One2Many implements RelOperation{

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void connect(Object master, Object detail, String property) throws Exception {
		String name = "get"+WordUtils.capitalize(property);
		Method m = master.getClass().getDeclaredMethod(name, new Class<?>[]{} );
		List list = (List) m.invoke(master, new Object[]{});
		list.add(detail);
		
	}

	@SuppressWarnings({  "rawtypes" })
	@Override
	public void disconnect(Object master, Object detail, String property) throws Exception {
		String name = "get"+WordUtils.capitalize(property);
		Method m = master.getClass().getDeclaredMethod(name, new Class<?>[]{} );
		List list = (List) m.invoke(master, new Object[]{});
		list.remove(detail);
		
	}

}
