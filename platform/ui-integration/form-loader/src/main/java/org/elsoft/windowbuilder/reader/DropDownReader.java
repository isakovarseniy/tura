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
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateOptionDescriptorDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIDropDownListDAO;
import org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2CastTypeDAO;
import org.elsoft.platform.metamodel.objects.type.PropertyDAO;
import org.elsoft.platform.metamodel.processor.Helper;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDataLink2CastType;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDisplayFieldSpecifier;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventGetCurrentRow;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventGetOptionsList;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2Field;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2UIElement;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIDropDownList;

public class DropDownReader extends ItemReader {

	private String optionDataControlId;
	private String labelField;
	private String valueField;
	private String label;
	private boolean tableContext = false;
	private String cssStyle;
	private String cssStyleClass;
	private String updateOnValueChanged;

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		super.reader(xmlReader, parent);

		String iterator = xmlReader.getAttributeValue(null, "optionIterator");
		optionDataControlId = Reader.idMAP.get(iterator);
		labelField = xmlReader.getAttributeValue(null, "optionLabel");
		valueField = xmlReader.getAttributeValue(null, "optionValue");
		setUpdateOnValueChanged(xmlReader.getAttributeValue(null,
				"updateOnValueChanged"));
		return this;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		EventDAO event = null;
		parent=setContext(parent);


		CreateUIDropDownListDAO createUIDropDownList = new CreateUIDropDownListDAO();
		createUIDropDownList.setCommandExecutor(CreateUIDropDownList.class
				.getName());
		createUIDropDownList.setParentUUID(parent.getUuid());
		createUIDropDownList.setLabel(label);
		createUIDropDownList.setUUID(getUuid());
		createUIDropDownList.setCss(cssStyle);
		createUIDropDownList.setCssClass(cssStyleClass);
		program.add(createUIDropDownList);

		event = new EventDAO();
		event.setCommandExecutor(CreateEventUIElement2Field.class.getName());
		event.setParentUUID(createUIDropDownList.getUUID());
		if (getCastObject() == null)
			event.setDstUUID(getDataControlId() + "." + getField());
		else {
			List<String> ls = this.expressionParser(getCastObject());
			Helper.findType(rf, ls.get(0), ls.get(1), ls.get(2), ls.get(3));
			PropertyDAO pr = rf.getTypeDefinitionHandler().getPropertyHandler()
					.cleanSearch().searchString("propertyName", getField())
					.getObject();

			if (pr == null)
				event.setDstUUID(getDataControlId() + "." + getField());
			else
				event.setDstUUID(getDataControlId() + "." + getCastObject()
						+ "." + getField());
		}
		program.add(event);

		if (getCastObject() != null) {
			CreateDataLink2CastTypeDAO cast = new CreateDataLink2CastTypeDAO();
			cast.setCommandExecutor(CreateDataLink2CastType.class.getName());
			cast.setParentUUID(getDataControlId());

			List<String> ls = this.expressionParser(getCastObject());
			cast.setDomain(ls.get(0));
			cast.setFunctionalDomain(ls.get(1));
			cast.setApplication(ls.get(2));
			cast.setTypeName(ls.get(3));

			program.add(cast);
		}

		if (!tableContext) {
			event = new EventDAO();
			event.setCommandExecutor(CreateEventGetCurrentRow.class.getName());
			event.setParentUUID(createUIDropDownList.getUUID());
			event.setDstUUID(getDataControlId());
			program.add(event);
		}
		event = new EventDAO();
		event.setParentUUID(createUIDropDownList.getUUID());
		event.setCommandExecutor(CreateEventGetOptionsList.class.getName());
		event.setDstUUID(optionDataControlId);
		program.add(event);

		CreateOptionDescriptorDAO dispOption = new CreateOptionDescriptorDAO();
		dispOption.setCommandExecutor(CreateDisplayFieldSpecifier.class
				.getName());
		dispOption.setValue1(labelField);
		dispOption.setValue2(valueField);
		dispOption.setParentUUID(createUIDropDownList.getUUID());
		program.add(dispOption);

		if (updateOnValueChanged != null) {
			StringTokenizer tokenizer = new StringTokenizer(
					updateOnValueChanged);
			while (tokenizer.hasMoreElements()) {
				String dst = tokenizer.nextToken();
				event = new EventDAO();
				event.setCommandExecutor(CreateEventUIElement2UIElement.class
						.getName());
				event.setParentUUID(createUIDropDownList.getUUID());
				event.setDstUUID(dst);
				event.setEventType(MetamodelTriggerEventsType.OnValueChanged
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

	public String getUpdateOnValueChanged() {
		return updateOnValueChanged;
	}

	public void setUpdateOnValueChanged(String updateOnValueChanged) {
		this.updateOnValueChanged = updateOnValueChanged;
	}

}
