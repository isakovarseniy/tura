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
package org.tura.platform.datacontrol.command;

import java.lang.reflect.Method;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.command.base.CallParameter;
import org.tura.platform.datacontrol.command.base.UpdateCommandBase;

public class UpdateCommand extends UpdateCommandBase {

	protected static String METHOD = "update";
	
	
	public UpdateCommand(DataControl<?> datacontrol) {
		super(datacontrol);
	}

	public UpdateCommand() {
	}		
	
	
	@Override
	public Object execute() throws Exception {
		
		/*
		 * Add additional parameter to pass type of object to reposiroty service
		 * 
		 * */
		CallParameter parameter = new CallParameter();
		parameter.setName("objectClass");
		parameter.setClazz(String.class);
		parameter.setExpression(null);
		parameter.setObj(this.getObj().getClass().getName());
		parameter.setValue(this.getObj().getClass().getName());
		getParameters().add(parameter);

		
		prepareParameters();
		super.execute();
		
		return null;
	}	
	
	@Override
	public void delayedExecution() throws Exception {
		super.delayedExecution();
		
		/*
		 * This is simple option with one data provider per command and predefined name of method
		 * oriented on TuraService 
		 * 
		 * */
		Object provider = getProviders().values().iterator().next();
		
		Method m = this.prepareCall( provider, METHOD);
		callMethod(m,provider, getParameters());
		
		
	}	
	
	
}