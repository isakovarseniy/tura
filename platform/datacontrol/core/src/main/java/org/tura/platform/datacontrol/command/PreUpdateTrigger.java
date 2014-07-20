package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.commons.TuraException;

public interface PreUpdateTrigger {
	public void execute(UpdateCommand cmd) throws TuraException;
}
