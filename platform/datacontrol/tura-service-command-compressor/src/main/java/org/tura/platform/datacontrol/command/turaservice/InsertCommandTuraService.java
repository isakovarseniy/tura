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

import java.util.HashMap;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.command.base.Command;
import org.tura.platform.datacontrol.command.base.InsertCommandBase;

public class InsertCommandTuraService extends InsertCommandBase{

	private HashMap <String,Object> context;
	
	
	public InsertCommandTuraService(DataControl<?> datacontrol) {
		super(datacontrol);
	}	
	
	public InsertCommandTuraService() {
	}		
	
	@Override
	public void compress(HashMap <String,Object> context){
		this.context=context;
		this.context.put("object", getObj());
	}
	
	@Override
	public boolean isCompressable(Command prevCommand){
		if (prevCommand == null)
			return true;
		return false;
	}	
	
	
	@Override
	public void delayedExecution() throws Exception {

		if (this.getDatacontrol().getPreInsertTrigger() != null)
			this.getDatacontrol().getPreInsertTrigger().execute(this);

		prepareCall();
		call.invoke(provider, new Object[] {context.get("object")});
	}
	
	
}
