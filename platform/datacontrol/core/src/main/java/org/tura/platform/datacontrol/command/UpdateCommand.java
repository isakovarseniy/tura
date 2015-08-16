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

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.Util;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.pool.PoolCommand;

public class UpdateCommand extends Command {

	private Object obj;

	public UpdateCommand(DataControl<?> datacontrol) {
		super(datacontrol);
	}

	public UpdateCommand() {
	}

	@Override
	public Object execute() throws Exception {

		UpdateCommand cmd = new UpdateCommand(this.getDatacontrol());
		cmd.provider = this.provider;
		cmd.parameters = this.prepareParameters();
		this.prepareCall();
		cmd.call = this.call;

		if (obj != null) {
			try {
				 Reflection.call(obj,"getWrapper");
			} catch (Exception e) {
				obj = Util.convertobject(obj, getDatacontrol());
			}
			this.getDatacontrol().getShifter().update(this.getDatacontrol().getCurrentPosition(), obj);
			this.getDatacontrol().putObjectToPool(obj, PoolCommand.U);
			this.getDatacontrol().getCommandStack().addTransaction(cmd);
		}
		return null;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	@Override
	public void delayedExecution() throws Exception {

		if (this.getDatacontrol().getPreUpdateTrigger() != null)
			this.getDatacontrol().getPreUpdateTrigger().execute(this);

		callMethod();
	}

}
