package org.tura.platform.object.persistence.operation;

import javax.persistence.EntityManager;

import org.tura.platform.object.persistence.data.DisconnectData;

public class DisconnectOperation {
	
	EntityManager em;
	
	public DisconnectOperation(EntityManager em){
		this.em=em;
	}
	
	public void execute(DisconnectData data) throws Exception{
		Object master = em.find(Class.forName(data.getMasterClassName()), data.getMasterPk());
		Object detail = em.find(Class.forName(data.getDetailClassName()), data.getDetailPk());
		
		RelOperation operation =  RelEnul.valueOf(data.getRelation()).getOperation();
		operation.disconnect(master, detail, data.getMasterProperty());
		
	}


}
