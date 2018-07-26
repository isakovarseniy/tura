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
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Connection;

public class PersistanceRelationBuilder {

	
	public static RelOperation build(String relation) throws Exception {
		return RelEnum.valueOf(relation).operation;
	}
	
	public static RelOperation build(Class<?> masterClazz, String masterProperty, Class<?> detailClazz,
			String detailProperty) throws Exception {

		String masterMethodName = "get" + WordUtils.capitalize(masterProperty);
		Method masterMethod = masterClazz.getMethod(masterMethodName);

		String detailMethodName = "get" + WordUtils.capitalize(detailProperty);
		Method detailMethod = detailClazz.getMethod(detailMethodName);

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
			return new One2One();
		}

		if (masterIsListResult && !detailIsListResult) {
			return new One2Many();
		}

		if (!masterIsListResult && detailIsListResult) {
			return new Many2One();
		}

		if (masterIsListResult && detailIsListResult) {
			return new Many2Many();
		}

		return null;

	}

	public static RelOperation build(Class<?> masterClazz, String masterProperty) throws Exception {
		
		String masterMethodName = "get" + WordUtils.capitalize(masterProperty);
		Method masterMethod = masterClazz.getMethod(masterMethodName);
		Connection connection = masterMethod.getAnnotation(Connection.class);
		Association association = masterMethod.getAnnotation(Association.class);
		if (connection != null ){
				 return new ConnectionProcessor(connection,association);
		}
		return null;
	}	
	
	
	private enum RelEnum {

		One2One(new One2One()),
		One2Many(new One2Many()),
		Many2One(new Many2One()),
		Many2Many(new Many2Many());
		
		
		RelOperation operation ;
		RelEnum(RelOperation operation){
			this.operation = operation;
		}
		
		@SuppressWarnings("unused")
		public RelOperation getOperation(){
			return operation;
		}
		
		
	}
	
}
