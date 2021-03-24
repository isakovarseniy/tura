/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
 */

package org.tura.platform.repository.priority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.tura.platform.repository.spa.SpaControl;

public class RelationNode {

	private String id = UUID.randomUUID().toString();
	private String pk;
	private List<RelationNode> incoming = new ArrayList<RelationNode>();
	private List<RelationNode> outcoming = new ArrayList<RelationNode>();
	private SpaControl command;
	private Map<String,LinkControl> map = new HashMap<>();

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SpaControl getCommand() {
		return command;
	}

	public void setCommand(SpaControl command) {
		this.command = command;
	}

	public RelationNode(String pk) {
		this.pk = pk;
	}

	public Object getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public List<RelationNode> getIncoming() {
		return incoming;
	}

	public List<RelationNode> getOutcoming() {
		return outcoming;
	}

	public void addIncoming(RelationNode in, LinkControl control, String linkName) {
		this.incoming.add(in);
		in.getOutcoming().add(this);
		in.map.put(linkName,control);
	}

	public void removeIncoming(RelationNode in,String linkName) {
		this.incoming.remove(in);
		in.getOutcoming().remove(this);
		in.map.remove(linkName);
	}
	
	public void addOutcoming(RelationNode out, LinkControl control, String linkName) {
		this.outcoming.add(out);
		out.getIncoming().add(this);
		this.map.put(linkName,control);
	}
	
	public void removeOutcoming(RelationNode out,String linkName) {
		this.outcoming.remove(out);
		out.getIncoming().remove(this);
		this.map.remove(linkName);
	}
	
	
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("id="+id);
		buffer.append("pk="+pk);
		return buffer.toString();
	}

	public Collection<LinkControl> getLinks() {
		return this.map.values();
	}
	

}
