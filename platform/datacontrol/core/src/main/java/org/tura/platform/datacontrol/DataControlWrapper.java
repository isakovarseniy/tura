package org.tura.platform.datacontrol;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.tura.platform.datacontrol.commons.Reflection;

import net.sf.cglib.core.Signature;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InterfaceMaker;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.NoOp;

public class DataControlWrapper implements MethodInterceptor {

	private IDataControl obj;
	
	@Override
	public Object intercept(Object proxy, Method m, Object[] args,
			MethodProxy arg3) throws Throwable {
		
		if (m.getName().equals("getWrapper")) {
			return this;
		}
		
        IDataControl target = (IDataControl) obj;
        IDataControl saveTreeContex = null;
        
        if (  target.getTreeContext() != null ){
             saveTreeContex = target.getTreeContext().getCurrentControl();
             target.getTreeContext().setCurrentControl(target);
        }
        
		Object result = m.invoke(obj, args);
		if (saveTreeContex != null ){
            target.getTreeContext().setCurrentControl(saveTreeContex);
		}
		return result;		
	}
	
	public static IDataControl newInstance(IDataControl datacontrol)
			throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		
		if (datacontrol == null || datacontrol instanceof TreeDataControl)
			return datacontrol;
		
		// Create a dynamice interface
		InterfaceMaker im = new InterfaceMaker();

		// Define a getter method to get Wrapper object
		org.objectweb.asm.Type[] parameters = new org.objectweb.asm.Type[] {};
		Signature signature = new Signature("getWrapper",
				org.objectweb.asm.Type.getType(DataControlWrapper.class), parameters);
		im.add(signature, parameters);

		// Finish creating the interface
		Class<?> myInterface = im.create();
		
		
		DataControlWrapper interceptor = new DataControlWrapper();
		Enhancer e = new Enhancer();
		e.setSuperclass(datacontrol.getClass());
		e.setInterfaces(new Class[] { myInterface });
		e.setCallbackFilter(new MethodFilter());
		e.setCallbacks(new Callback[] { interceptor, NoOp.INSTANCE });
		
		IDataControl dc = (IDataControl) e.create();
		DataControlWrapper w = (DataControlWrapper) Reflection.call(dc, "getWrapper");
		w.setObj(datacontrol);
		return dc;
	}

	/**
	 * @return the obj
	 */
	public IDataControl getObj() {
		return obj;
	}

	/**
	 * @param obj the obj to set
	 */
	public void setObj(IDataControl obj) {
		this.obj = obj;
	}	

}
