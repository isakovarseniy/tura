package org.tura.platform.datacontrol;

import java.util.Collection;

import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.metainfo.Relation;

public interface IDataControl {

	public void addChageRecordLiteners(ChangeRecordListener listener);

	public void handleChangeMusterCurrentRecordNotification(
			Object newCurrentObject) throws TuraException;

	public Object getCurrentObject() throws TuraException ;

	public Object createObject() throws TuraException;

	public void removeObject() throws Exception;

	public void removeAll() throws Exception;
	
	public  void createChild(IDataControl dc, String  relName, Relation relation) throws TuraException;

	public void setParent(Relation relation);
	
	public boolean setCurrentPosition(Object obj) throws TuraException;
	
	public Collection<String> getRelationsName();
	
	public Relation getChild(String relationName);
	

}
