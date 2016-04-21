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
package org.tura.platform.datacontrol.command.turaservice;

import java.lang.reflect.Method;
import java.util.HashMap;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.command.UpdateCommand;
import org.tura.platform.datacontrol.command.base.Command;
import org.tura.platform.datacontrol.command.base.InsertCommandBase;
import org.tura.platform.datacontrol.command.base.UpdateCommandBase;
import org.tura.platform.datacontrol.commons.TuraException;

public class UpdateCommandTuraService extends UpdateCommand{

	private HashMap <String,Object> context;
	
	public UpdateCommandTuraService(DataControl<?> datacontrol) {
		super(datacontrol);
	}	
	
	public UpdateCommandTuraService() {
	}			
	
	
	@Override
	public void compress(HashMap <String,Object> context){
		this.context=context;
		this.context.put("object", getObj());
	}
	
	@Override
	public boolean isCompressable(Command prevCommand) throws TuraException{
		if ( prevCommand == null)
			return true;
		if ( prevCommand instanceof InsertCommandBase || prevCommand instanceof UpdateCommandBase){
			if ( prevCommand.getDatacontrol().getObjectKey(prevCommand.getObj()).equals(getDatacontrol().getObjectKey(getObj()))) {
					return true;
			}
		}
		return false;
	}	
	
	
	@Override
	public void delayedExecution() throws Exception {

		if (this.getDatacontrol().getPreUpdateTrigger() != null)
			this.getDatacontrol().getPreUpdateTrigger().execute(this);

		Object provider = getProviders().values().iterator().next();
		
		Method m = this.prepareCall( provider, METHOD);
		
		 m.invoke(provider, new Object[] {context.get("object"),context.get("object").getClass().getName() });
	
       }
	
}