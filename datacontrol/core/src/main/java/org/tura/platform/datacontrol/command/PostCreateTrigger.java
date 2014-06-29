package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.DataControl;

public abstract class PostCreateTrigger {
	
	public abstract void execute(DataControl<?> datacontrol, Object createdObject);

}
