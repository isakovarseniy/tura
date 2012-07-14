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
package org.elsoft.platform.metamodel.processor.uicontainer.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

import org.elsoft.platform.metamodel.PersistentInterface;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDataLink2DataLink;

public class Relation extends PersistentInterface {

	private String uuid = UUID.randomUUID().toString();
	private String relationName;
	private DataLink master;
	private DataLink detail;
	private Boolean treeRelation;
	
	private ArrayList<Field2field> links = new ArrayList<Field2field>();

	public ArrayList<Field2field> getLinks() {
		return links;
	}

	public Relation(String relationName, DataLink master, DataLink detail,Boolean treeRelation) {
		this.master = master;
		this.detail = detail;
		this.relationName = relationName;
		this.treeRelation=treeRelation;
	}

	public void addLink(Field2field link) {
		link.setParentUuid(uuid);
		links.add(link);
	}

	public DataLink getMaster() {
		return master;
	}

	public void setMaster(DataLink master) {
		this.master = master;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public DataLink getDetail() {
		return detail;
	}

	public void setDetail(DataLink detail) {
		this.detail = detail;
	}

	public String getRelationName() {
		return relationName;
	}

	public void setRelationName(String relationName) {
		this.relationName = relationName;
	}

	@Override
	protected void serialize(CommandHandler ch) throws Exception {
		Iterator<Field2field> itr = links.iterator();
		while (itr.hasNext()) {
			Field2field f2f = itr.next();
			CreateDataLink2DataLink.save(ch,
					master.getUuid(), detail.getUuid(), relationName,
					f2f.getMasterField(), f2f.getDetailField(),treeRelation);
		}
	}

	public Boolean getTreeRelation() {
		return treeRelation;
	}

	public void setTreeRelation(Boolean treeRelation) {
		this.treeRelation = treeRelation;
	}


}
