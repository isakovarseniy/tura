package org.tura.platform.object.persistence.operation;

import javax.persistence.EntityManager;

import org.tura.platform.object.persistence.data.ConnectData;

public class ConnectOperation {
	
	EntityManager em;
	
	public ConnectOperation(EntityManager em){
		this.em=em;
	}
	
	public void execute(ConnectData data) throws Exception{
		Object master = em.find(Class.forName(data.getMasterClassName()), data.getMasterPk());
		Object detail = em.find(Class.forName(data.getDetailClassName()), data.getDetailPk());
		
		RelOperation operation =  RelEnul.valueOf(data.getRelation()).getOperation();
		operation.connect(master, detail, data.getMasterProperty());
		
	}

}
