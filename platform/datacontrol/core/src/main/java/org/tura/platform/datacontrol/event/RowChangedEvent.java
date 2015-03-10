package org.tura.platform.datacontrol.event;

import org.tura.platform.datacontrol.IDataControl;

public class RowChangedEvent extends Event{

	public RowChangedEvent(IDataControl source) {
		super(source);
	}
}
