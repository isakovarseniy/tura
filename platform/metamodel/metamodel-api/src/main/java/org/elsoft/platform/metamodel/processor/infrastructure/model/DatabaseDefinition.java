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

import org.elsoft.platform.metamodel.objects.command.infrastructure.CreateDatabaseDefinitionDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.infrastructure.command.CreateDatabaseDefinition;

public class DatabaseDefinition extends CreateDatabaseDefinitionDAO {

	public DatabaseDefinition(CreateDatabaseDefinitionDAO command) {
		setDatabaseType(command.getDatabaseType());
		setHost(command.getHost());
		setPort(command.getPort());
		setPropertyName(command.getPropertyName());
	}

	protected void serialize(CommandHandler ch) throws Exception {
		CreateDatabaseDefinition.save(ch, null, this);
	}

}
