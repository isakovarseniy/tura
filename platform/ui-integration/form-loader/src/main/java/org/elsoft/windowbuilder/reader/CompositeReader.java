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
import org.elsoft.platform.metamodel.general.CreateUICellDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUICell;

public class CompositeReader extends Reader {

	private String numColumns = "1";
	private String cssStyle;
	private String cssStyleClass;

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		cssStyle = xmlReader.getAttributeValue(null, "cssStyle");
		cssStyleClass = xmlReader.getAttributeValue(null, "cssStyleClass");
		return this;
	}

	public void setNumColumns(String numColumns) {
		this.numColumns = numColumns;
	}

	@Override
	public void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent,List<CommandDAO> program) {
		CreateUICellDAO createUICell = new CreateUICellDAO();
		createUICell.setCommandExecutor(CreateUICell.class.getName());
		createUICell.setColumnNumber(new Integer(numColumns));
		createUICell.setParentUUID(parent.getUuid());
		createUICell.setUUID(getUuid());
		createUICell.setCss(cssStyle);
		createUICell.setCssClass(cssStyleClass);
		
		program.add(createUICell);

	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

}
