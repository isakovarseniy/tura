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

public class RepoObjectKey implements Serializable {

	private static final long serialVersionUID = -4545215428786037286L;
	private List<FieldValue> key = new ArrayList<>();
	private String type;
	private String relation;

	public void addValue(FieldValue value) {
		key.add(value);
	}

	public List<FieldValue> getKey() {
		return key;
	}

	public void setKey(List<FieldValue> key) {
		this.key = key;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(type);
		buffer.append(relation);

		for (FieldValue k : key) {
			buffer.append(k.toString());
		}
		return buffer.toString();
	}

}
