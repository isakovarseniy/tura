package org.tura.platform.repository.core.relatioin;

import java.lang.reflect.Method;

import org.tura.platform.repository.core.Rule;

public class One2OneRepositoryRuleObject implements Rule{
	
	private Object master;
	private Object detail;
	private Method masterMethod;
	private Method detailMethod;
	
	
	public One2OneRepositoryRuleObject(Object master, Object detail, Method masterMethod,Method detailMethod){
		this.master = master;
		this.detail = detail;
		this.masterMethod = masterMethod;
		this.detailMethod = detailMethod;
	}


	@Override
	public void execute() throws Exception {
		masterMethod.invoke(master, detail);
		detailMethod.invoke(detail, master);
	}
	
	

}
