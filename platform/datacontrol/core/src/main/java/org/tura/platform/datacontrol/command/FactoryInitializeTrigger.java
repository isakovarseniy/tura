package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.commons.TuraException;

public interface FactoryInitializeTrigger {
	public void execute(Object obj) throws TuraException;
}
