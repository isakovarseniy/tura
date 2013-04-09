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
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateOptionDescriptorDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDisplayFieldSpecifier;

public class LovDisplayFieldReader extends Reader {

	private String fieldLabel;
	private String field;
	private String cssStyle;
	private String cssStyleClass;
	
	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		fieldLabel = xmlReader.getAttributeValue(null, "fieldLabel");
		field = xmlReader.getAttributeValue(null, "displayField");
		cssStyle = xmlReader.getAttributeValue(null, "cssStyle");
		cssStyleClass = xmlReader.getAttributeValue(null, "cssStyleClass");
		return this;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		CreateOptionDescriptorDAO dispOption = new CreateOptionDescriptorDAO();
		dispOption.setCommandExecutor(CreateDisplayFieldSpecifier.class.getName());
		dispOption.setValue1(fieldLabel);
		dispOption.setValue2(field);
		dispOption.setParentUUID(parent.getUuid());
		dispOption.setCss(cssStyle);
		dispOption.setCssClass(cssStyleClass);
		program.add(dispOption);
		
	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

}
