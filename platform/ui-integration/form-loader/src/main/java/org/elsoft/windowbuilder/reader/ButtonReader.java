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
import java.util.StringTokenizer;

import javax.xml.stream.XMLStreamReader;

import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIButtonDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventTrigger;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2UIElement;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIButton;

public class ButtonReader extends ItemReader {

	private String label;
	private String cssStyle;
	private String cssStyleClass;
	private String updateOnButtonPressed;

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {

		cssStyle = xmlReader.getAttributeValue(null, "cssStyle");
		cssStyleClass = xmlReader.getAttributeValue(null, "cssStyleClass");
		updateOnButtonPressed = xmlReader.getAttributeValue(null,
				"updateOnButtonPressed");

		String dataSrcField = xmlReader.getAttributeValue(null,
				"expressionProperty");
		List<String> ls = this.expressionParser(dataSrcField);
		setDataControlId(Reader.idMAP.get(ls.get(0)));
		setField((String) ls.get(1));
		label = xmlReader.getAttributeValue(null, "text");
		return this;
	}

	@Override
	public void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		if ((getIdObject() != null) && (!getIdObject().equals(""))) {
			setUuid( getIdObject());
		}

		CreateUIButtonDAO createUIButton = new CreateUIButtonDAO();
		createUIButton.setCommandExecutor(CreateUIButton.class.getName());
		createUIButton.setLabel(label);
		createUIButton.setParentUUID(parent.getUuid());
		createUIButton.setUUID(getUuid());
		createUIButton.setCss(cssStyle);
		createUIButton.setCssClass(cssStyleClass);
		program.add(createUIButton);

		if (eventConverter.get(getField()) != null) {
			EventDAO event = new EventDAO();
			event.setCommandExecutor(CreateEventTrigger.class.getName());
			event.setParentUUID(createUIButton.getUUID());
			event.setDstUUID(getDataControlId());
			event.setEventType(eventConverter.get(getField()).name());
			program.add(event);
		}
		if (updateOnButtonPressed != null) {
			StringTokenizer tokenizer = new StringTokenizer(
					updateOnButtonPressed);
			while (tokenizer.hasMoreElements()) {
				String dst = tokenizer.nextToken();
				EventDAO event = new EventDAO();
				event.setCommandExecutor(CreateEventUIElement2UIElement.class
						.getName());
				event.setParentUUID(createUIButton.getUUID());
				event.setDstUUID(dst);
				event.setEventType(MetamodelTriggerEventsType.OnButtonPressed
						.name());
				program.add(event);
			}

		}

	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

}
