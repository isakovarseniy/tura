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

package org.tura.platform.repository.cpa.storage;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.tura.platform.repository.core.RelationType;

public class Ref implements Serializable {
	private static final long serialVersionUID = -4345177031356712640L;
	private Object pk;
	private Object extPk;
	private Class<?> type;
	private RelationType cpaRelationType;

	public Ref(Object pk, Object extPk, Class<?> type,RelationType cpaRelationType) {
		this.pk = pk;
		this.extPk  = extPk;
		this.type = type;
		this.cpaRelationType  = cpaRelationType;
	}
	

	public RelationType getCpaRelationType() {
		return cpaRelationType;
	}

	public void setCpaRelationType(RelationType cpaRelationType) {
		this.cpaRelationType = cpaRelationType;
	}


	public Object getExtPk() {
		return extPk;
	}


	public void setExtPk(Object extPk) {
		this.extPk = extPk;
	}


	public Ref(Ref r) {
		this.pk = r.pk;
		this.extPk  = r.extPk;
		this.type = r.type;
		this.cpaRelationType = r.cpaRelationType;
	}
	
	
	public Object getPk() {
		return pk;
	}

	public void setPk(Object pk) {
		this.pk = pk;
	}

	public Class<?> getType() {
		return type;
	}

	public void setType(Class<?> type) {
		this.type = type;
	}

	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Ref)) {
			return false;
		}
		Ref otherRef = (Ref) o;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(pk, otherRef.pk);
		builder.append(extPk,otherRef.extPk);
		builder.append(type, otherRef.type);
		builder.append(cpaRelationType, otherRef.cpaRelationType);
		return builder.isEquals();
	}
	
	@Override
	public String toString() {
		ToStringBuilder builder =  new  ToStringBuilder(this);
		builder.append("pk",pk);
		builder.append("extPk",extPk);
		builder.append("type", type);
		builder.append("cpaRelationType",cpaRelationType);
		return  builder.toString();
	}
	

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
}