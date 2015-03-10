package org.tura.platform.datacontrol.event;

import org.tura.platform.datacontrol.IDataControl;

public class RowRemovedEvent  extends Event {

	public RowRemovedEvent(IDataControl dc ){
		super(dc);
	}	
	
}
