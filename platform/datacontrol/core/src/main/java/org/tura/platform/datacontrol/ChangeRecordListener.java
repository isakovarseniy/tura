package org.tura.platform.datacontrol;

import org.tura.platform.datacontrol.commons.TuraException;

public interface ChangeRecordListener {
	
	public void handleChangeRecord(IDataControl dc , Object newCurrentObject) throws TuraException;

}
