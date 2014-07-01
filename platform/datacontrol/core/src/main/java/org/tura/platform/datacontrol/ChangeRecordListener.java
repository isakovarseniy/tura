package org.tura.platform.datacontrol;

public interface ChangeRecordListener {
	
	public void handleChangeRecord(DataControl<?> dc , Object newCurrentObject);

}
