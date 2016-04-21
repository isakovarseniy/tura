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

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.pool.PoolCommand;

public class DeleteCommandBase extends Command{


	public DeleteCommandBase(DataControl<?> datacontrol) {
		super(datacontrol);
	}

	public DeleteCommandBase() {
	}

	@Override
	public Object execute() throws Exception {

		this.getDatacontrol().getShifter().remove(this.getDatacontrol().getCurrentPosition());
		this.getDatacontrol().putObjectToPool(getWrappedObject(), PoolCommand.R);
		this.getDatacontrol().getCommandStack().addTransaction( this);


		return null;
	}

	@Override
	public void delayedExecution() throws Exception {

		if (this.getDatacontrol().getPreDeleteTrigger() != null)
			this.getDatacontrol().getPreDeleteTrigger().execute(this);

	}

}