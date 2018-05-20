package org.tura.platform.repository.test.spa;

import org.tura.platform.datacontrol.commons.Reflection;

import com.rits.cloning.Cloner;

public class AddObjectOperation {
	
	public void execute(AddObjectData data) throws Exception{
		Cloner c = new Cloner();
		Object object = c.deepClone(data.getObject());
		Long pk = (Long) Reflection.call(object, "getObjId");
		if (pk == null){
			throw new Exception("PK is null");
		}
		String toStrPk=pk.toString()+object.getClass().getName();
		if ( SPARepository.objectBase.get(toStrPk) != null ){
			throw new Exception("Object already exiest");
		}
		SPARepository.objectBase.put(toStrPk, object);
	}

}
