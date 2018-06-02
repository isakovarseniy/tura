/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.repository.persistence;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang.WordUtils;

public class PersistanceRelationBuilder {

	public static RelEnum build(Class<?> masterClazz, String masterProperty, Class<?> detailClazz,
			String detailProperty) throws Exception {

		String masterMethodName = "get" + WordUtils.capitalize(masterProperty);
		Method masterMethod = masterClazz.getDeclaredMethod(masterMethodName);

		String detailMethodName = "get" + WordUtils.capitalize(detailProperty);
		Method detailMethod = detailClazz.getDeclaredMethod(detailMethodName);

		boolean masterIsListResult = false;
		Type returnType = masterMethod.getGenericReturnType();
		if (returnType instanceof ParameterizedType) {
			ParameterizedType type = (ParameterizedType) returnType;
			if (((Class<?>) type.getRawType()).getName().equals(List.class.getName())
					|| ((Class<?>) type.getRawType()).getName().equals(Collection.class.getName())) {
				masterIsListResult = true;
			}
		}

		boolean detailIsListResult = false;
		returnType = detailMethod.getGenericReturnType();
		if (returnType instanceof ParameterizedType) {
			ParameterizedType type = (ParameterizedType) returnType;
			if (((Class<?>) type.getRawType()).getName().equals(List.class.getName())
					|| ((Class<?>) type.getRawType()).getName().equals(Collection.class.getName())) {
				detailIsListResult = true;
			}
		}

		if (!masterIsListResult && !detailIsListResult) {
			return RelEnum.One2One;
		}

		if (masterIsListResult && !detailIsListResult) {
			return RelEnum.One2Many;
		}

		if (!masterIsListResult && detailIsListResult) {
			return RelEnum.Many2One;
		}

		if (masterIsListResult && detailIsListResult) {
			return RelEnum.Many2Many;
		}

		return null;

	}

}
