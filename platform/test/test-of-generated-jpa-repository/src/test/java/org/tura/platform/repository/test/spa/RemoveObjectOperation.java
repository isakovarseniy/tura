package org.tura.platform.repository.test.spa;

import org.tura.platform.datacontrol.commons.Reflection;

public class RemoveObjectOperation {
	
	public void execute(RemoveObjectData data) throws Exception{
		Long pk = (Long) Reflection.call(data.getObject(), "getObjId");
		if (pk == null){
			throw new Exception("PK is null");
		}
		String toStrPk=pk.toString()+data.getObject().getClass().getName();
		if ( SPARepository.objectBase.get(toStrPk) != null ){
			throw new Exception("Object already exiest");
		}
		SPARepository.objectBase.remove(toStrPk);
	}

}
