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

import org.tura.platform.repository.core.CopyFrom;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "@class")
public class RemoveTopObjectData  extends ProxyData{
	
	private static final long serialVersionUID = 645542891118749752L;
	public Object object;
	private RepoKeyPath pk;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public RepoKeyPath getPk() {
		return pk;
	}
	public void setPk(RepoKeyPath pk) {
		this.pk = pk;
	}
	
	@Override
	public  Object cloneCmd()  {
		RemoveTopObjectData cloned = new RemoveTopObjectData();
		cloned.relationType = this.relationType;
		cloned.masterProperty=this.masterProperty;
		cloned.detailProperty=this.detailProperty;
		cloned.params = this.params;
		cloned.registry = this.registry;
		if ( this.pk != null) {
			cloned.pk = this.pk.clone();
		}
		
		RepositoryHelper helper = new RepositoryHelper(registry);
		try {
			CopyFrom cloner = (CopyFrom) helper.findMapper(object.getClass());
			cloned.object = cloner.deepCopyFromRepository2Persistence(this.object);
		} catch (RepositoryException e) {
			throw new RuntimeException(e);
		}
		return cloned;
	}
	
}
