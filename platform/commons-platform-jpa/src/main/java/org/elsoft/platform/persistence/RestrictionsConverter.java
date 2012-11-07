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
package org.elsoft.platform.persistence;

import java.lang.reflect.Method;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public enum RestrictionsConverter {

	GT("gt"),
	GTEQ("ge"),
	LT("lt"), 
	LTEQ("le"),
	EQ("eq"),
	LIKE("like");

	private String comp;

	RestrictionsConverter(String comp) {
		this.comp = comp;
	}

	public Criterion getRestriction(String field, Object value) throws Exception{
		Method m = Restrictions.class.getDeclaredMethod(comp, String.class,Object.class);
		m.setAccessible(true); 
		return (Criterion) m.invoke(null, field,value);
		
	}
}
