package org.tura.platform.repository.test;

import java.util.UUID;

import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.repository.core.PrImaryKeyStrategy;

public class UUIPrimaryKeyStrategy implements PrImaryKeyStrategy{

	@Override
	public void generatePk(Object o) {
		try{
		Reflection.callTyped(o, "setObjId", long.class,UUID.randomUUID().getMostSignificantBits());
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		
	}

}
