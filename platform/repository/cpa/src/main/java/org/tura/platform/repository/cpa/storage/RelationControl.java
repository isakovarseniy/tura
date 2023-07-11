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

public class RelationControl implements Serializable {

	private static final long serialVersionUID = 255242829876633760L;
	private String relation;
	private boolean lazy = false ;

	public RelationControl(String relation) {
		this.relation = relation;
	}

	
	public RelationControl(String relation,boolean lazy) {
		this.relation = relation;
		this.lazy = lazy;
	}
	

	public RelationControl(RelationControl r) {
		this.relation = r.relation;
		this.lazy = r.lazy;
	}


	public boolean isLazy() {
		return lazy;
	}

	public void setLazy(boolean lazy) {
		this.lazy = lazy;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof RelationControl)) {
			return false;
		}
		RelationControl otherRef = (RelationControl) o;
		EqualsBuilder builder = new EqualsBuilder();
//		builder.append(lazy, otherRef.lazy);
		builder.append(relation, otherRef.relation);
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder =  new  ToStringBuilder(this);
		builder.append("lazy",lazy);
		builder.append("relation", relation);
		return  builder.toString();
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
//		builder.append(lazy, otherRef.lazy);
		builder.append(relation);
		return builder.toHashCode();
		
	}
}

