package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.commons.TuraException;

public interface PreDeleteTrigger {

	public void execute(DeleteCommand cmd) throws TuraException;
}
