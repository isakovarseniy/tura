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

import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIViewPortDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2UIElement;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIViewPort;

public class ViewPortReader extends Reader {
	private String name;
	private String canvas;
	private String cssStyle;
	private String cssStyleClass;

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		cssStyle = xmlReader.getAttributeValue(null, "cssStyle");
		cssStyleClass = xmlReader.getAttributeValue(null, "cssStyleClass");

		name = xmlReader
				.getAttributeValue(null, "viewPortName");
		canvas = xmlReader.getAttributeValue(null, "canvasName");
		return this;
	}

	@Override
	public void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent,List<CommandDAO> program) {
		CreateUIViewPortDAO createUIViewPort = new CreateUIViewPortDAO();
		createUIViewPort.setCommandExecutor(CreateUIViewPort.class.getName());
		createUIViewPort.setParentUUID(parent.getUuid());
		createUIViewPort.setUUID(name);
		createUIViewPort.setViewPortName(name);
		createUIViewPort.setCss(cssStyle);
		createUIViewPort.setCssClass(cssStyleClass);
		program.add(createUIViewPort);

		EventDAO event = new EventDAO();
		event.setCommandExecutor(CreateEventUIElement2UIElement.class.getName());
		event.setParentUUID(createUIViewPort.getUUID());
		event.setDstUUID(canvas);
		event.setEventType(MetamodelTriggerEventsType.CreateEventUIElement2UIElement
				.name());
		program.add(event);

	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}
	
	
	public String getUuid() {
		return name;
	}


}
