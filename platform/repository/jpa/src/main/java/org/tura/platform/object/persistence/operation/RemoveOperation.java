package org.tura.platform.object.persistence.operation;

import javax.persistence.EntityManager;

import org.tura.platform.object.persistence.data.RemoveData;

public class RemoveOperation {
	
	EntityManager em;
	
	public RemoveOperation(EntityManager em){
		this.em=em;
	}
	
	public void execute(RemoveData data) throws Exception {
		em.remove(data.getObject());
	}
	
	

}
