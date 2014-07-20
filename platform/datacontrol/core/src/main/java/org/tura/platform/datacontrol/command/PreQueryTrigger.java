package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.commons.TuraException;

public interface PreQueryTrigger {

	public void execute(DataControl<?> datacontrol) throws TuraException;
	
	
}
