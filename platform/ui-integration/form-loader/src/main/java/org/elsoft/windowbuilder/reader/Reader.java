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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.UUID;

import javax.xml.stream.XMLStreamReader;

import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;

public abstract class Reader {

	public static HashMap<String, String> idMAP;
    public static String formid;	
	public static HashMap<String, MetamodelTriggerEventsType> eventConverter;

	public ArrayList<Reader> children = new ArrayList<Reader>();
	private String uuid = UUID.randomUUID().toString();

	public abstract Reader reader(XMLStreamReader xmlReader, Reader parent);
	protected abstract boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception;

	protected abstract void build(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception;

	public boolean checkAll(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {
		Reader newParent;
		if (parent instanceof ShellReader)
			newParent = parent;
		else
			newParent = this;

		boolean result = check(context, rf, parent, program);

		Iterator<Reader> itr = children.iterator();
		while (itr.hasNext()) {
			Reader reader = itr.next();
			result = reader.checkAll(context, rf, newParent, program)||result;
		}
		return result;
	}
	
	public void buildAll(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {
		Reader newParent;
		
		if (parent instanceof ShellReader)
			newParent = parent;
		else
			newParent = this;

		build(context, rf, parent, program);

		Iterator<Reader> itr = children.iterator();
		while (itr.hasNext()) {
			Reader reader = itr.next();
			reader.buildAll(context, rf, newParent, program);
		}
	}

	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public ArrayList<Reader> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<Reader> children) {
		this.children = children;
	}

	public List<String> expressionParser(String expression) {
		if (expression == null) return null;

		ArrayList<String> result = new ArrayList<String>();

		StringTokenizer token = new StringTokenizer(expression, ".");
		while (token.hasMoreTokens())
			result.add(token.nextToken());
		return result;
	}

}
