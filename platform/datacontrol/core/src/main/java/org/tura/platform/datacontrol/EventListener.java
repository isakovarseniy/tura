package org.tura.platform.datacontrol;

import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.event.Event;

public interface EventListener {
	
	public void handleEventListenr(Event event) throws TuraException;

}
