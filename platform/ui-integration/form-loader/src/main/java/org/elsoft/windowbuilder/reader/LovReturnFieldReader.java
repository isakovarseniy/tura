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

import org.apache.commons.lang.StringUtils;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.general.CommandDAO;
import org.elsoft.platform.metamodel.general.CreateOptionDescriptorDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateResultFieldSpecifier;

public class LovReturnFieldReader extends Reader {
	private String iterator;
	private String field;
	private String returnField;

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		iterator = xmlReader.getAttributeValue(null, "returnIterator");
		returnField = xmlReader.getAttributeValue(null, "returnField");
		field = xmlReader.getAttributeValue(null, "displayField");
		return this;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

        String formName = Reader.idMAP.get("formName");
        
		CreateOptionDescriptorDAO dispOption = new CreateOptionDescriptorDAO();
		dispOption.setCommandExecutor(CreateResultFieldSpecifier.class.getName());
		dispOption.setValue1(field);
		dispOption.setValue2(formName+"binding."+StringUtils.uncapitalize(iterator)+".currentRow."+returnField);
		dispOption.setParentUUID(parent.getUuid());
		program.add(dispOption);

	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

}
