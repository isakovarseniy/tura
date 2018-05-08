package org.tura.platform.object.persistence.operation;

import java.lang.reflect.Method;

import org.apache.commons.lang.WordUtils;

public class One2One implements RelOperation {

	@Override
	public void connect(Object master, Object detail, String property) throws Exception {
		String name = "set"+WordUtils.capitalize(property);
		Method m = master.getClass().getDeclaredMethod(name, detail.getClass());
		m.invoke(master, detail);
	}

	@Override
	public void disconnect(Object master, Object detail, String property) throws Exception {
		String name = "set"+WordUtils.capitalize(property);
		Method m = master.getClass().getDeclaredMethod(name, detail.getClass());
		m.invoke(master, new Object[]{});
	}

}
