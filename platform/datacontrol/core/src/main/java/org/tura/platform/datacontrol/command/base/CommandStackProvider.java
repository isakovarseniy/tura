/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
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

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

public class CommandStackProvider implements ProxyCommadStackProvider{

	private CommandStack commandStack;
	@SuppressWarnings("rawtypes")
	private DataControl  dataControl;
	
	private Collection<DataControl<?>> listForCleaning;
	
	@Override
	public void addCommand(Object cmd) throws Exception {
		DataControlCommand command = new DataControlCommand();
		command.setRepositoryCommand(cmd);
		command.setDataControl(dataControl);
		commandStack.addTransaction(command);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> getListOfCommand() throws Exception {
		Object [] array = commandStack.getListOfCommand();
		listForCleaning = ((Map<String, DataControl<?>>) array[1]).values();
		return (List<Object>) array[0];
	}

	@Override
	public void clear() throws Exception {
		commandStack.clean(listForCleaning);
	}

	public CommandStack getCommandStack() {
		return commandStack;
	}

	public void setCommandStack(CommandStack commandStack) {
		this.commandStack = commandStack;
	}

	@SuppressWarnings("rawtypes")
	public DataControl getDataControl() {
		return dataControl;
	}

	@SuppressWarnings("rawtypes")
	public void setDataControl(DataControl dataControl) {
		this.dataControl = dataControl;
	}

}
