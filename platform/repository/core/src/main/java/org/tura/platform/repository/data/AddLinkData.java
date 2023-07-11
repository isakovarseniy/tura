/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.data;

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.repository.core.RepoKeyPath;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "@class")
public class AddLinkData  extends ProxyData {

	private static final long serialVersionUID = -69749975540199454L;
	private RepoKeyPath masterPk;
	private RepoKeyPath detailPk;
    private List<List<String>> links;;
	
	
	public List<List<String>> getLinks() {
		return links;
	}
	public void setLinks(List<List<String>> links) {
		this.links = links;
	}
	public RepoKeyPath getMasterPk() {
		return masterPk;
	}
	public void setMasterPk(RepoKeyPath masterPk) {
		this.masterPk = masterPk;
	}
	public RepoKeyPath getDetailPk() {
		return detailPk;
	}
	public void setDetailPk(RepoKeyPath detailPk) {
		this.detailPk = detailPk;
	}
	
	
	@Override
	public Object cloneCmd()  {
		
		AddLinkData cloned = new AddLinkData();
		cloned.relationType = this.relationType;
		cloned.masterProperty=this.masterProperty;
		cloned.detailProperty=this.detailProperty;
		cloned.params = this.params;
		cloned.masterPk  = this.masterPk.clone();
		cloned. detailPk = this.detailPk.clone();
		cloned.registry = this.registry;
		
		cloned.links = new ArrayList<>();
		
		for ( List<String> ls :  links) {
			List<String> clst = new ArrayList<>();
			clst.addAll(ls);
			cloned.links.add(clst); 
		}
		
		return cloned;
	}
	
}
