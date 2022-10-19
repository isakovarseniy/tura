/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.cpa.storage;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public  class ObjectRef  implements Serializable{
	private static final long serialVersionUID = 7252647327755329152L;
	
	private String cpaId;
	private String  extCpaId;
	
	public ObjectRef (String cpaId, String  extCpaId){
		this.cpaId  = cpaId;
		this.extCpaId  = extCpaId;
	}
	
	ObjectRef (ObjectRef ref){
		this.cpaId  = ref.cpaId;
		this.extCpaId  = ref.extCpaId;
	}
	
	public String getCpaId() {
		return cpaId;
	}
	public void setCpaId(String cpaId) {
		this.cpaId = cpaId;
	}
	public String getExtCpaId() {
		return extCpaId;
	}
	public void setExtCpaId(String extCpaId) {
		this.extCpaId = extCpaId;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ObjectRef)) {
			return false;
		}
		ObjectRef otherRef = (ObjectRef) o;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(cpaId, otherRef.cpaId);
		builder.append(extCpaId, otherRef.extCpaId);
		return builder.isEquals();
	}
	
	@Override
	public String toString() {
		ToStringBuilder builder =  new  ToStringBuilder(this);
		builder.append("cpaId",cpaId);
		builder.append("extCpaId", extCpaId);
		return  builder.toString();
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
}