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
package org.elsoft.platform.metamodel.processor;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;

public class Processor {
	public static int COMMAND_COMPLITED = 0;
	public static int COMMAND_POSTPONE = 1;

	RepositoryFactory rf;

	public HashMap<String, Object> executor(RepositoryFactory rf,
			Iterator<CommandDAO> itr) throws Exception {
		HashMap<String, Object> context = new HashMap<String, Object>();
		return executor(rf, context, itr);
	}

	private HashMap<String, Object> executor(RepositoryFactory rf,
			HashMap<String, Object> ctx, Iterator<CommandDAO> itr)
			throws Exception {
		HashMap<String, Object> context = new HashMap<String, Object>();
		ArrayList<CommandDAO> postponeCommand = new ArrayList<CommandDAO>();
		context.putAll(ctx);

System.out.println("+++++++++++++++++++++++++++++++");	

		while (itr.hasNext()) {
			CommandDAO command = itr.next();
System.out.println( command.getObjId()+" --- "+ command.getParentId()+" --- "+ command.getCommandExecutor());	
			Class<?> exec = Class.forName(command.getCommandExecutor());
			Method method = exec.getMethod("load", RepositoryFactory.class,
					HashMap.class, CommandDAO.class);
			int result = (Integer) method.invoke(null, rf, context, command);
			if (result == COMMAND_POSTPONE)
				postponeCommand.add(command);
		}

		if (postponeCommand.size() != 0) {
			context = executor(rf, context, postponeCommand.iterator());
		}
		return context;

	}

}
