package org.tura.platform.datacontrol.event;

import org.tura.platform.datacontrol.IDataControl;

public class Event {
	private IDataControl source;
	
	public Event(IDataControl source){
		this.setSource(source);
	}

	public IDataControl getSource() {
		return source;
	}

	public void setSource(IDataControl source) {
		this.source = source;
	}
	
}
