package org.tura.platform.datacontrol.event;

import org.tura.platform.datacontrol.IDataControl;

public class ControlRefreshedEvent extends Event{

	public ControlRefreshedEvent(IDataControl source) {
		super(source);
	}

}
