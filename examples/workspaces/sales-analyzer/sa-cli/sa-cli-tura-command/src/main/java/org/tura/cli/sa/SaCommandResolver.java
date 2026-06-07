/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.cli.sa;

import java.util.List;

import org.tura.cli.ComponentLoader;
import org.tura.cli.ServiceAssertion;

public class SaCommandResolver {

	protected ISaCommand saCommand;
	protected IKieServerCommand kieServerCommand;
	

	public ISaCommand getSaCommand() {
		if (saCommand == null) {
			List<ISaCommand> array = ComponentLoader.findService(new ServiceAssertion<ISaCommand>() {
				@Override
				public boolean validate(ISaCommand t) {
                    return true;
				}
				
			}, ISaCommand.class);
			if (array.size() != 0 ){
				saCommand = array.get(0);
			}
		}
		return saCommand;
	}    


	public IKieServerCommand getKieServerCommand() {
		if (kieServerCommand == null) {
			List<IKieServerCommand> array = ComponentLoader.findService(new ServiceAssertion<IKieServerCommand>() {
				@Override
				public boolean validate(IKieServerCommand t) {
                    return true;
				}
				
			}, IKieServerCommand.class);
			if (array.size() != 0 ){
				kieServerCommand = array.get(0);
			}
		}
		return kieServerCommand;
	}


	
	

}
