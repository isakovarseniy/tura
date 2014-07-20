package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.commons.TuraException;

public interface PostCreateTrigger {
	
	public void execute(DataControl<?> datacontrol, Object obj) throws TuraException;

}
