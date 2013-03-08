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
package org.elsoft.platform.metamodel.processor.uicontainer.command;

import java.util.HashMap;
import java.util.Iterator;

import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.links.CreateMethodParameterExpressionDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.datasource.model.Parameter;
import org.elsoft.platform.metamodel.processor.datasource.model.RemoteMethod;

public class CreateMethodParameterExpression {
	public static String CREATEMETHODPARAMETEREXPRESSION = "org.elsoft.platform.metamodel.objects.command.links.CreateMethodParameterExpressionDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {
		CreateMethodParameterExpressionDAO command = (CreateMethodParameterExpressionDAO) cmd;

		RemoteMethod rmi = (RemoteMethod) context.get(command.getParentUUID());
		if (rmi.getParamClass() != null) {
			Iterator<Parameter> itr = rmi.getParamClass().iterator();
			while (itr.hasNext()) {
				Parameter param = itr.next();
				if (param.getName().equals(command.getParamName())) {
					param.setExpression(command.getExpression());
					param.setValue(command.getValue());
					break;
				}
			}
		}
		return Processor.COMMAND_COMPLITED;

	}

	public static void save(CommandHandler ch, RemoteMethod rmi) {

		ch.getMode()
				.getElResolver()
				.setValue(SessionContext.COMMAND_TYPE,
						CREATEMETHODPARAMETEREXPRESSION);
		DataControl<CommandDAO> dc = ch.getMode().getControl();

		if (rmi.getParamClass() != null) {
			Iterator<Parameter> itr = rmi.getParamClass().iterator();
			while (itr.hasNext()) {
				Parameter param = itr.next();
				CreateMethodParameterExpressionDAO obj = (CreateMethodParameterExpressionDAO) dc
						.createObject();
				obj.setParentUUID(rmi.getUuid());
				obj.setCommandExecutor(CreateMethodParameterExpression.class
						.getName());
				obj.setExpression(param.getExpression());
				obj.setValue(param.getValue());
				obj.setParamName(param.getName());
			}
		}
	}
}
