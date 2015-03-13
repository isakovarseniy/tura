package org.tura.platform.datacontrol.event;

import org.tura.platform.datacontrol.IDataControl;

public class RowRemovedEvent  extends Event {

	private Object obj;
	
	public RowRemovedEvent(IDataControl dc , Object obj){
		super(dc);
		this.obj=obj;
	}

	/**
	 * @return the obj
	 */
	public Object getObj() {
		return obj;
	}

	/**
	 * @param obj the obj to set
	 */
	public void setObj(Object obj) {
		this.obj = obj;
	}	
	
}
