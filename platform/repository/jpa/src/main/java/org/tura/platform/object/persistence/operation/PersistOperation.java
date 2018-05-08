package org.tura.platform.object.persistence.operation;

import javax.persistence.EntityManager;

import org.tura.platform.object.persistence.data.PersistData;

public class PersistOperation {
	
	EntityManager em;
	
	public PersistOperation(EntityManager em){
		this.em=em;
	}

	
	public void execute( PersistData data) throws Exception {
		em.persist(data.getObject());
	}
	
	
	

}
