package org.eclipse.wb.elsoft.components;

import org.eclipse.e4.xwt.elsoft.types.BusinessObjectProperty;
import org.eclipse.e4.xwt.elsoft.types.TriggerProperty;
import org.eclipse.swt.widgets.Composite;

public class DataControl extends Composite{

	private BusinessObjectProperty businessObject;
	private TriggerProperty triggerProperty;
	
	public DataControl(Composite parent, int style) {
		super(parent, style);
	}

	
	public BusinessObjectProperty getBusinessObject() {
		return businessObject;
	}


	public void setBusinessObject(BusinessObjectProperty businessObject) {
		this.businessObject = businessObject;
	}


	public TriggerProperty getTriggerProperty() {
		return triggerProperty;
	}


	public void setTriggerProperty(TriggerProperty triggerProperty) {
		this.triggerProperty = triggerProperty;
	}
}
