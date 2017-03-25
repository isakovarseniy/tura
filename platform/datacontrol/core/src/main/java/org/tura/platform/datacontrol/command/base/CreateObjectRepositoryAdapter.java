/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
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
package org.tura.platform.datacontrol.command.base;

import org.tura.platform.datacontrol.Util;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.pool.PoolCommand;

public class CreateObjectRepositoryAdapter extends RepositoryAdapter{

	private CallParameter objectType;
	
	public Object create() throws Exception {
		/*
		 * Fix objectType parameter convert if from Class to String
		 * 
		 * */
		if (objectType.getName().equals("objectType") &&   !(objectType.getClazz().isAssignableFrom(String.class))  ){
			
			String className = objectType.getExpression();
			objectType.setClazz(String.class);
			objectType.setExpression(null);
			objectType.setObj(className);
			objectType.setValue(className);
		}	

		prepareParameter(objectType);
		
		Object proxy = getRepository().create((String) objectType.getObj());
		Object obj = proxy;

		if (proxy != null){
			proxy = Util.convertobject(proxy, getDatacontrol(),true);
			this.getDatacontrol().getShifter().add(this.getDatacontrol().getCurrentPosition(), proxy);
			this.getDatacontrol().putObjectToPool(proxy, PoolCommand.C);
			this.getDatacontrol().getCommandStack().registerForCleaningDataControl(this.getDatacontrol());
		}

		if (obj != null && this.getDatacontrol().getPostCreateTrigger() != null){
			// Do not track any changes on created object !!!!!
			Object o = Reflection.call(obj, "getWrapper");
			this.getDatacontrol().getPostCreateTrigger().execute(this.getDatacontrol(), o);
		}

		return proxy;
	}

	public CallParameter getObjectType() {
		return objectType;
	}

	public void setObjectType(CallParameter objectType) {
		this.objectType = objectType;
	}


}
