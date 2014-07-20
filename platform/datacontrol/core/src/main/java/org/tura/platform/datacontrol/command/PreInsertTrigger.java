package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.commons.TuraException;


public interface PreInsertTrigger {
	public void execute(InsertCommand cmd) throws TuraException;

}
