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
package org.elsoft.platform.metamodel.processor.datasource.command;

import java.util.HashMap;

import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.datasource.CreateDataSourceDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.datasource.model.IndependentType;
import org.elsoft.platform.metamodel.types.TypeDefinitionHandler;

public class CreateDataSource {
	public static String CREATEDATASOURCE = "org.elsoft.platform.metamodel.objects.command.datasource.CreateDataSourceDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {
		CreateDataSourceDAO command = (CreateDataSourceDAO) cmd;

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler().cleanSearch().searchLong("objId", command.getRefType()).seek();
		IndependentType it = new IndependentType(tdh);
		
		context.put(it.getDomain()+"."+it.getFunctionalDomain()+"."+it.getApplication()+"."+it.getTypeName(),it);

		return Processor.COMMAND_COMPLITED;
	}

	public static void save(CommandHandler ch,
			IndependentType it) {
		ch.getMode().getElResolver()
				.setValue(SessionContext.COMMAND_TYPE, CREATEDATASOURCE);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateDataSourceDAO obj = (CreateDataSourceDAO) dc.createObject();
		obj.setRefType(it.getTypedao().getObjId());
		obj.setCommandExecutor(CreateDataSource.class.getName());
	}

}
