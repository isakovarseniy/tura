package org.tura.platform.datacontrol;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.tura.platform.datacontrol.annotations.DCProxy;

@Interceptor
@DCProxy
public class DataControlProxy {

	@AroundInvoke
    public Object proxy(InvocationContext ctx) throws Exception {
        IDataControl target = (IDataControl) ctx.getTarget();
        IDataControl saveTreeContex = null;
        
        if (  target.getTreeContext() != null ){
             saveTreeContex = target.getTreeContext().getCurrentControl();
             target.getTreeContext().setCurrentControl(target);
        }
        
		Object result =  ctx.proceed();
		if (saveTreeContex != null ){
            target.getTreeContext().setCurrentControl(saveTreeContex);
		}
		return result;
	}	
}
