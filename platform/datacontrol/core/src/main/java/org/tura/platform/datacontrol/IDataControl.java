package org.tura.platform.datacontrol;

import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.metainfo.Relation;

public interface IDataControl extends IMetaInfoHolder{

	public void addChageRecordLiteners(ChangeRecordListener listener);

	public void handleChangeMusterCurrentRecordNotification(
			Object newCurrentObject) throws TuraException;

	public Object getCurrentObject() throws TuraException ;

	public Object createObject() throws TuraException;

	public void removeObject() throws Exception;

	public void removeAll() throws Exception;
	
	public  void createChild(IDataControl dc, Relation relation);
	

}
