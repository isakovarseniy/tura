/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
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
		
		RelOperation operation =  RelEnum.valueOf(data.getRelation()).getOperation();
		operation.connect(master, detail, data.getMasterProperty());
		
	}

}
