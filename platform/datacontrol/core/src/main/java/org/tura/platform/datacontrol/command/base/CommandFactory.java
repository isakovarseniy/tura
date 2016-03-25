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

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.datacontrol.BeanWrapper;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.commons.Reflection;

public class CommandFactory {
	
	
	public static Command cloneCommand( DataControl<?> dc,  Command cmd , Object oldValue, Object newValue, Object wrappedObject, String property ) throws Exception{
		
		Object w = Reflection.call(wrappedObject, "getWrapper");
		Object obj = ((BeanWrapper)w).getObj();
		
		
		Command command  = cmd.getClass().newInstance();
		command.setProperty(property);
		command.setOldValue(oldValue);
		command.setNewValue(newValue);
		command.setObj(obj);
		command.setWrappedObject(wrappedObject);
		
		command.setDatacontrol(dc);
		command.setParameters(cloneParameters(cmd.getParameters()));
		command.setProviders(cmd.getProviders());
		
		return command;
		
	}
	
   private static  List<CallParameter> cloneParameters(List<CallParameter> parameters){
	   
	 ArrayList<CallParameter>  list = new ArrayList<>();
	 for (CallParameter param : parameters){
		 CallParameter newParam = new CallParameter();
	 
		 newParam.setName(param.getName());
		 newParam.setValue(param.getValue());
		 newParam.setClazz(param.getClazz());
		 newParam.setExpression(param.getExpression());
		 
		 list.add(newParam);
	 }
	 
	return list;
	   
   }
	
	

}
