package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.DataControl;

public interface PostQueryTrigger {
	
	public void execute(DataControl<?> datacontrol, Object createdObject);
	
}
