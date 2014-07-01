package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.DataControl;

public interface PreQueryTrigger {

	public void execute(DataControl<?> datacontrol);
	
	
}
