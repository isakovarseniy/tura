package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.DataControl;

public abstract class PostQueryTrigger {
	
	public abstract void execute(DataControl<?> datacontrol, Object createdObject);
	
}
