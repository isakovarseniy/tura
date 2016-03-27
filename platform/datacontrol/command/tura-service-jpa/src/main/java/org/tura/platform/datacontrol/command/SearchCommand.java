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
import org.tura.platform.datacontrol.command.base.SearchCommandBase;

public class SearchCommand extends SearchCommandBase{

	private static String METHOD = "find";

	
	public SearchCommand(DataControl<?> datacontrol) {
		super(datacontrol);
	}

	public SearchCommand() {
	}			
	
	
	@Override
	public Object execute() throws Exception {

		
		super.execute();
		
		/*
		 * Fix objectType parameter convert if from Class to String
		 * 
		 * */
		CallParameter parameter = getParameters().get(4);
		if (parameter.getName().equals("objectType") &&   !(parameter.getClazz().isAssignableFrom(String.class))  ){
			
			String className = parameter.getExpression();
			parameter.setClazz(String.class);
			parameter.setExpression(null);
			parameter.setObj(className);
			parameter.setValue(className);
		}
		
		this.prepareParameters();

		/*
		 * This is simple option with one data provider per command and predefined name of method
		 * oriented on TuraService 
		 * 
		 * */
		Object provider = getProviders().values().iterator().next();
		
		Method m = this.prepareCall( provider, METHOD);
		return callMethod(m,provider, getParameters());
		
	}	
	
}
