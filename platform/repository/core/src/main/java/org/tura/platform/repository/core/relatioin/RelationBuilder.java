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

package org.tura.platform.repository.core.relatioin;

import java.lang.reflect.Method;
import java.util.Map;

import org.tura.platform.repository.core.RelationAdapter;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Internal;

public class RelationBuilder {
	public static String ONE2ONE = "One2One";
	public static String ONE2MANY = "One2Many";
	public static String MANY2MANY = "Many2Many";

	public static RelationAdapter build( Class<?> clazz, Method method , Map<String, Object> context) {

		Association assosiation = method.getAnnotation(Association.class);
		String type = null;
		if (assosiation == null) {
			Internal internal = method.getAnnotation(Internal.class);
			if (internal == null){
				return null;
			}else{
				type = internal.type();
			}
		}else{
			type = assosiation.type();
		}
		if (ONE2ONE.equals(type)) {
			return new One2OneRelationAdapter(clazz,method, context);
		}

		if (ONE2MANY.equals(type)) {
			return new One2ManyRelationAdapter(clazz,method, context);
		}
		if (MANY2MANY.equals(type)) {
			return new Many2ManyRelationAdapter(clazz,method, context);
		}

		return null;

	}

}
