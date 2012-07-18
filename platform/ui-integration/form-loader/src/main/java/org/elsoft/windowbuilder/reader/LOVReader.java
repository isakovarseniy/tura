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

import javax.xml.stream.XMLStreamReader;

import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.general.CommandDAO;
import org.elsoft.platform.metamodel.general.CreateUILovDAO;
import org.elsoft.platform.metamodel.general.EventDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventGetCurrentRow;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventGetOptionsList;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2Field;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUILov;

public class LOVReader extends ItemReader {

	private String optionDataControlId;
	private String label;
	private boolean tableContext = false;

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		super.reader(xmlReader, parent);

		String iterator = xmlReader.getAttributeValue(null, "optionIterator");
		optionDataControlId = Reader.idMAP.get(iterator);

		return this;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		EventDAO event = null;
		if (parent instanceof TableColumnReader) {
			label = ((TableColumnReader) parent).getLabel();
			tableContext = true;
			parent = ((TableColumnReader) parent).getParent();
			setDataControlId(((TableReader) parent).getDataControlId());
		}
		CreateUILovDAO createUILov = new CreateUILovDAO();
		createUILov.setCommandExecutor(CreateUILov.class.getName());
		createUILov.setParentUUID(parent.getUuid());
		createUILov.setLabel(label);
		createUILov.setUUID(getUuid());
		createUILov.setCss(getCssStyle());
		createUILov.setCssClass(getCssStyleClass());
		
		program.add(createUILov);

		event = new EventDAO();
		event.setParentUUID(createUILov.getUUID());
		event.setCommandExecutor(CreateEventUIElement2Field.class.getName());
		event.setDstUUID(getDataControlId() + "." + getField());
		program.add(event);

		if (!tableContext) {
			event = new EventDAO();
			event.setCommandExecutor(CreateEventGetCurrentRow.class.getName());
			event.setParentUUID(createUILov.getUUID());
			event.setDstUUID(getDataControlId());
			program.add(event);
		}
		event = new EventDAO();
		event.setParentUUID(createUILov.getUUID());
		event.setCommandExecutor(CreateEventGetOptionsList.class.getName());
		event.setDstUUID(optionDataControlId);
		program.add(event);

	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

}
