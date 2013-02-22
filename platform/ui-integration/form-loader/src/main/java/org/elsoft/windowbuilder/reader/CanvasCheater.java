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

import org.elsoft.platform.metamodel.MetamodelObjectType;
import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUICanvasDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2UIElement;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUICanvas;

public class CanvasCheater extends Reader {

	private String name;
	private String type = MetamodelObjectType.StackableCanvas.name();
	private String cssStyle;
	private String cssStyleClass;
	private String viewPortName;

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		cssStyle = xmlReader.getAttributeValue(null, "cssStyle");
		cssStyleClass = xmlReader.getAttributeValue(null, "cssStyleClass");
		viewPortName = xmlReader.getAttributeValue(null, "viewPortName");
		return this;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		CreateUICanvasDAO createCanvas = new CreateUICanvasDAO();
		createCanvas.setCommandExecutor(CreateUICanvas.class.getName());
		createCanvas.setCanvasName(name);
		createCanvas.setCanvasType(type);
		createCanvas.setParentUUID(parent.getUuid());
		createCanvas.setUUID(name);
		createCanvas.setCss(cssStyle);
		createCanvas.setCssClass(cssStyleClass);

		program.add(createCanvas);

		if (viewPortName != null) {
			EventDAO event = new EventDAO();
			event.setCommandExecutor(CreateEventUIElement2UIElement.class
					.getName());
			event.setParentUUID(createCanvas.getUUID());
			event.setDstUUID(viewPortName);
			event.setEventType(MetamodelTriggerEventsType.CreateEventUIElement2UIElement
					.name());

			program.add(event);
		}

	}

	public String getUuid() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}
}
