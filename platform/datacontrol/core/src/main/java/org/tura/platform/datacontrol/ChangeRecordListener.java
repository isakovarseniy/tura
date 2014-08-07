package org.tura.platform.datacontrol;

public interface ChangeRecordListener {
	
	public void handleChangeRecord(IDataControl dc , Object newCurrentObject);

}
