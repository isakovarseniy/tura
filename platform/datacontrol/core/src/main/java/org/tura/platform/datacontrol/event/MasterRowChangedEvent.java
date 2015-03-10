package org.tura.platform.datacontrol.event;

import org.tura.platform.datacontrol.IDataControl;

public class MasterRowChangedEvent extends Event{
	
	public MasterRowChangedEvent(IDataControl dc , Object row ){
		super(dc);
		this.row=row;
	}
	
	private Object row;

	public Object getRow() {
		return row;
	}

	public void setRow(Object row) {
		this.row = row;
	}
}
