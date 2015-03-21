package org.tura.platform.datacontrol.event;

import org.tura.platform.datacontrol.IDataControl;

public class ControlRallbackEvent extends Event{

	public ControlRallbackEvent(IDataControl source) {
		super(source);
	}

}
