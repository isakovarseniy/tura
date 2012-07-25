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
import org.elsoft.platform.ComparatorType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDefaultSearchDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDefaultSearch;

public class DefaultSearchReader extends Reader {
	private String fieldProperty;
	private String experssionProperty;
	private String value;
	private String reftype;

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		fieldProperty = xmlReader.getAttributeValue(null, "fieldsProperty");
		experssionProperty = xmlReader.getAttributeValue(null,
				"expressionProperty");
		value = xmlReader.getAttributeValue(null, "value");
		reftype = xmlReader.getAttributeValue(null, "refType");

		return this;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		CreateDefaultSearchDAO defaultSearch = new CreateDefaultSearchDAO();
		defaultSearch.setCommandExecutor(CreateDefaultSearch.class.getName());
		defaultSearch.setParentUUID(((DataControlReader) parent)
				.getDatacontrolUid());
		defaultSearch.setUUID(getUuid());
		defaultSearch.setColumnName(fieldProperty);
		defaultSearch.setTypeName(reftype);
		defaultSearch.setComparator(ComparatorType.EQ.name());
		defaultSearch.setValue(value);

		if (experssionProperty != null) {
			List<String> ls = this.expressionParser(experssionProperty);
			defaultSearch.setExpression(((DataDefinitionReader)(((DataControlReader) parent).getParent()))
					.getFormName()
					+ "binding."
					+ StringUtils.uncapitalize(ls.get(0))
					+ ".currentRow."
					+ StringUtils.uncapitalize(ls.get(1)));
		}
		program.add(defaultSearch);
	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}
}
