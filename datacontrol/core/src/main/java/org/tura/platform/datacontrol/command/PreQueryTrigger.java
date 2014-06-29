package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.DataControl;

public abstract class PreQueryTrigger {

	public abstract void execute(DataControl<?> datacontrol);
	
	
}
