/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.example.ui.commons.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.uuiclient.annotations.FatalError;
import org.tura.platform.uuiclient.cdi.StorageNotFountException;
import org.tura.platform.uuiclient.rest.DataUpdateRequest;
import org.tura.platform.uuiclient.rest.client.commands.ClientCommand;
import org.tura.platform.uuiclient.rest.client.commands.ProgramSource;
import org.tura.platform.uuiclient.rest.client.commands.SwitchWindow;

@FatalError
public class FatallErrorProcessor implements ProgramSource {

	@Inject
	ELResolver elResolver;

	@Override
	public List<ClientCommand> generateProgram(Object... obj) {
		ArrayList<ClientCommand> program = new ArrayList<ClientCommand>();
		Object exception = obj[0];
		DataUpdateRequest dataUpdateRequest = null;
		String formName = null;
		if (obj.length > 1) {
			for (int i = 1; i < obj.length; i++) {
				if (obj[i] instanceof DataUpdateRequest) {
					dataUpdateRequest = (DataUpdateRequest) obj[i];
					formName = dataUpdateRequest.getFormSelector();
				}
			}
		}
		if (dataUpdateRequest != null) {
			if (exception instanceof StorageNotFountException && "hrmanager.hrcontroller".equals(formName)) {
				SwitchWindow cmd = new SwitchWindow();
				cmd.setTarget("/hrmanager/hrcontroller/hrController");
				program.add(cmd);
				return program;
			}

			if (exception instanceof StorageNotFountException && "hrmanager.simpleform".equals(formName)) {
				SwitchWindow cmd = new SwitchWindow();
				cmd.setTarget("/hrmanager/simpleform/simpleView");
				program.add(cmd);
				return program;
			}

			if (exception instanceof StorageNotFountException && "hrmanager.testform1".equals(formName)) {
				SwitchWindow cmd = new SwitchWindow();
				cmd.setTarget("/hrmanager/testform1/testForm1");
				program.add(cmd);
				return program;
			}

			if (exception instanceof StorageNotFountException && "hrmanager.testform2".equals(formName)) {
				SwitchWindow cmd = new SwitchWindow();
				cmd.setTarget("/hrmanager/testform2/testFormWindow");
				program.add(cmd);
				return program;
			}

			if (exception instanceof StorageNotFountException && "hrmanager.tree2tree".equals(formName)) {
				SwitchWindow cmd = new SwitchWindow();
				cmd.setTarget("/hrmanager/tree2tree/tree2TreeRelations");
				program.add(cmd);
				return program;
			}
		}

		SwitchWindow cmd = new SwitchWindow();
		cmd.setTarget("/hrmanager/simpleform/fatalErrorPage");
		program.add(cmd);

		return program;
	}

}