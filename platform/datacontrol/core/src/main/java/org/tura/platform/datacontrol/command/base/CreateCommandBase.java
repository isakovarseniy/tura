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


import org.tura.platform.datacontrol.BeanWrapper;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.Util;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.pool.PoolCommand;

public class CreateCommandBase extends Command {

	public CreateCommandBase(DataControl<?> datacontrol) {
		super(datacontrol);
	}
	
	public CreateCommandBase() {
	}
	

	@Override
	public Object execute() throws Exception {
		
      Object obj = getObj();

		if (obj != null){
			obj = Util.convertobject(obj, getDatacontrol(),true);
			this.getDatacontrol().getShifter().add(this.getDatacontrol().getCurrentPosition(), obj);
			this.getDatacontrol().putObjectToPool(obj, PoolCommand.C);
			this.getDatacontrol().getCommandStack().registerForCleaningDataControl(this.getDatacontrol());
		}

		if (obj != null && this.getDatacontrol().getPostCreateTrigger() != null){
			// Do not track any changes on created object !!!!!
			BeanWrapper w = (BeanWrapper) Reflection.call(obj, "getWrapper");
			w.setChangesTracking(false);
			this.getDatacontrol().getPostCreateTrigger().execute(this.getDatacontrol(), obj);
			w.setChangesTracking(true);
		}

		return obj;

	}

	@Override
	public void delayedExecution() throws Exception {
	}

}
