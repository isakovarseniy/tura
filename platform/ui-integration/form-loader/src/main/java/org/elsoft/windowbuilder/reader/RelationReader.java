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

public class RelationReader extends Reader {

	private String dstDataControl;
	private Reader parent;
	private Boolean treeRelation = new Boolean(false); 

	public Boolean getTreeRelation() {
		return treeRelation;
	}

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		dstDataControl = xmlReader.getAttributeValue(null, "dstDataControl");
		String treeRel = xmlReader.getAttributeValue(null, "treeRelation");
		if ((treeRel != null)&&(treeRel.equals("true")))
			treeRelation = new Boolean(true);

		return this;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {
		this.parent=parent;
	}

	public String getDstDataControl() {
		return dstDataControl;
	}

	public Reader getParent() {
		return parent;
	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

}
