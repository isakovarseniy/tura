/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
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
 ******************************************************************************/
package org.elsoft.platform.metamodel.processor.infrastructure.model;

import org.elsoft.platform.metamodel.general.CreateAppServerDefinitionDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.infrastructure.command.CreateAppServerDefinition;

public class AppServerDefinition extends CreateAppServerDefinitionDAO {

	public AppServerDefinition(CreateAppServerDefinitionDAO command) {
		setHost(command.getHost());
		setHttpPort(command.getHttpPort());
		setManagementPort(command.getManagementPort());
		setPropertyName(command.getPropertyName());
	}

	protected void serialize(CommandHandler ch) throws Exception {
		CreateAppServerDefinition.save(ch, null, this);
	}

}
