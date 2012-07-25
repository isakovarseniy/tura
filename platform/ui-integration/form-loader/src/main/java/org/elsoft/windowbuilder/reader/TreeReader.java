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
package org.elsoft.windowbuilder.reader;

import java.util.HashMap;
import java.util.List;


import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUITreeDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventGetTreeRoot;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUITree;

public class TreeReader extends ItemReader{

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		CreateUITreeDAO createTree = new CreateUITreeDAO();
		createTree.setCommandExecutor(CreateUITree.class.getName());
		createTree.setParentUUID(parent.getUuid());
		createTree.setUUID(getUuid());
		createTree.setCss(getCssStyle());
		createTree.setCssClass(getCssStyleClass());
		program.add(createTree);
		
		EventDAO event = new EventDAO();
		event.setCommandExecutor(CreateEventGetTreeRoot.class.getName());
		event.setParentUUID(createTree.getUUID());
		event.setDstUUID(getDataControlId());
		event.setEventType(MetamodelTriggerEventsType.CreateEventGetTreeRoot.name());
		program.add(event);
	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

}
