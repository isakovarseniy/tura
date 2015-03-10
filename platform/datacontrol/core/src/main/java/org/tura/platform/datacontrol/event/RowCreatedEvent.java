package org.tura.platform.datacontrol.event;

import org.tura.platform.datacontrol.IDataControl;

public class RowCreatedEvent extends Event{
	private Object row;

	public RowCreatedEvent(IDataControl dc , Object row ){
		super(dc);
		this.row=row;
	}	
	
	
	public Object getRow() {
		return row;
	}

	public void setRow(Object row) {
		this.row = row;
	}

}
