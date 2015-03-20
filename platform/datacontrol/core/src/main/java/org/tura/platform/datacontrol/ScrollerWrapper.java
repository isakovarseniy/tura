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

public class ScrollerWrapper<T> implements MethodInterceptor{

	private Scroller<?> obj;
	
	@Override
	public Object intercept(Object proxy, Method m, Object[] args,
			MethodProxy arg3) throws Throwable {
		
		if (m.getName().equals("getWrapper")) {
			return this;
		}
		
        IDataControl target = (IDataControl) obj.getPager().getDataControl();
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
	
	@SuppressWarnings("rawtypes")
	public static Scroller<?> newInstance(Scroller<?> scroller)
			throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		
		
		// Create a dynamice interface
		InterfaceMaker im = new InterfaceMaker();

		// Define a getter method to get Wrapper object
		org.objectweb.asm.Type[] parameters = new org.objectweb.asm.Type[] {};
		Signature signature = new Signature("getWrapper",
				org.objectweb.asm.Type.getType(ScrollerWrapper.class), parameters);
		im.add(signature, parameters);

		// Finish creating the interface
		Class<?> myInterface = im.create();
		
		
		ScrollerWrapper interceptor = new ScrollerWrapper();
		Enhancer e = new Enhancer();
		e.setSuperclass(Scroller.class);
		e.setInterfaces(new Class[] { myInterface });
		e.setCallbackFilter(new MethodFilter());
		e.setCallbacks(new Callback[] { interceptor, NoOp.INSTANCE });
		
		Scroller<?> scrol = (Scroller<?>) e.create(new Class<?>[]{Pager.class},  new Object[]{null}  );
		ScrollerWrapper<?> w = (ScrollerWrapper<?>) Reflection.call(scrol, "getWrapper");
		w.setObj(scroller);
		return scrol;
	}

	public Scroller<?> getObj() {
		return obj;
	}

	public void setObj(Scroller<?> obj) {
		this.obj = obj;
	}	
	
	
}
