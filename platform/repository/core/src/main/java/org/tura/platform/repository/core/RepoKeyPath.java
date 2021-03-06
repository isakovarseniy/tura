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

package org.tura.platform.repository.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RepoKeyPath implements Serializable{

	private static final long serialVersionUID = -3032337403865330881L;
	private List<RepoObjectKey>  path = new ArrayList<>();
	
	
	public void addRepoObjectKey (String relation , RepoObjectKey key){
		key.setRelation(relation);
		path.add(key);
	}


	public List<RepoObjectKey> getPath() {
		return path;
	}


	public void setPath(List<RepoObjectKey> path) {
		this.path = path;
	}
	
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		for ( RepoObjectKey k : path) {
			buffer.append(k.toString());
		}
		return buffer.toString();
	}
}
