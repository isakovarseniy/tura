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


import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIOutputTextDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventGetCurrentRow;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2Field;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIOutputText;

public class OutputTextReader extends ItemReader {


	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		EventDAO event = null;

		parent=setContext(parent);
		
		CreateUIOutputTextDAO createUIOutputText = new CreateUIOutputTextDAO();
		createUIOutputText.setCommandExecutor(CreateUIOutputText.class.getName());
		createUIOutputText.setParentUUID(parent.getUuid());
		createUIOutputText.setUUID(getUuid());
		createUIOutputText.setLabel(getLabel());
		createUIOutputText.setCss(getCssStyle());
		createUIOutputText.setCssClass(getCssStyleClass());
		program.add(createUIOutputText);

		event = new EventDAO();
		event.setCommandExecutor(CreateEventUIElement2Field.class.getName());
		event.setParentUUID(createUIOutputText.getUUID());
		event.setDstUUID(getDataControlId() + "." + getField());
		program.add(event);

		if (!isTableContext()) {
			event = new EventDAO();
			event.setCommandExecutor(CreateEventGetCurrentRow.class.getName());
			event.setParentUUID(createUIOutputText.getUUID());
			event.setDstUUID(getDataControlId());
			program.add(event);
		}

	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

}
