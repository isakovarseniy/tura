package org.eclipse.wb.elsoft.components;

import org.eclipse.e4.xwt.elsoft.types.MethodProperty;
import org.eclipse.e4.xwt.elsoft.types.ServiceProperty;
import org.eclipse.e4.xwt.elsoft.types.TriggerType;
import org.eclipse.swt.widgets.Composite;

public class Trigger extends Composite{
	
	private TriggerType triggerType;
	private ServiceProperty service;
	private MethodProperty method;
	
	public Trigger(Composite parent, int style) {
		super(parent, style);
	}

	public TriggerType getTriggerType() {
		return triggerType;
	}

	public void setTriggerType(TriggerType triggerType) {
		this.triggerType = triggerType;
	}

	public ServiceProperty getService() {
		return service;
	}

	public void setService(ServiceProperty service) {
		this.service = service;
	}

	public MethodProperty getMethod() {
		return method;
	}

	public void setMethod(MethodProperty method) {
		this.method = method;
	}

}
