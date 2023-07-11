/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.epsilon.model;

import java.util.HashMap;
import java.util.Map;

public abstract class TypeResolver {
	
	private Map<String, String>  model2java = new HashMap<>();
	private Map<String, String>  java2models = new HashMap<>();
	

	public  String convertFromMetaclassToRepositoryObject(String type) {
		return model2java.get(type);
	}
	public  String convertFromRepositoryObjectTosMetaclass(String type) {
		return java2models.get(type);
	}

	public void addMapping(String modelType, String javaType) {
		model2java.put(modelType, javaType);
		java2models.put(javaType, modelType);
	}
	
}
