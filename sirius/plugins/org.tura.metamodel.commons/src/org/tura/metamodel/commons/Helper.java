/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.commons;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import type.Assosiation;
import type.Attribute;
import type.Generalization;
import type.Operation;
import type.Parameter;
import type.Type;
import type.TypeElement;
import type.TypeReference;

public class Helper {


	
	public void addOperations(Map<String, Operation> operations, Map<String, Attribute> attributes,TypeElement typeElement) {

		if (typeElement instanceof TypeReference) {
			typeElement = ((TypeReference) typeElement).getTypeRef();
		}

		if (typeElement instanceof Type) {
			Type type = (Type) typeElement;

			for (Operation operation : type.getOperations()) {
				String key = getOperationKey(operation);
				if (operations.get(key) == null)
					operations.put(key, operation);
			}

			for (Attribute attribute : type.getAttributes()) {
				String key = getAttributeKey(attribute);
				if (attributes.get(key) == null)
					attributes.put(key, attribute);
			}

			for (Generalization ext :  new QueryHelper().getTypeExtension(type)) {
				addOperations(operations, attributes, ext.getTarget());
			}
		}

	}
	
	public void getRelatedObjects(Map<String, TypeElement> relatedObjects,TypeElement typeElement){
		if (typeElement instanceof TypeReference) {
			typeElement = ((TypeReference) typeElement).getTypeRef();
		}
		
		if (typeElement instanceof Type) {
			Type type = (Type) typeElement;
			
			Collection<Assosiation> [] result =  new QueryHelper().getAssosiation(type);
			
			for (Assosiation rel :  result[0]  ) {
				if (rel.getTarget() != null){
				   relatedObjects.put(rel.getTarget().getName(), rel.getTarget());
				}
			}

			for (Assosiation rel :  result[1]  ) {
				if (rel.getSource() != null){
				   relatedObjects.put(rel.getSource().getName(), rel.getSource());
				}
			}
		}
	}
	

	public void getRelatedAssosiations(Map<String, TypeElement> relatedObjects, HashMap<String,Assosiation > hash,TypeElement typeElement){
		if (typeElement instanceof TypeReference) {
			typeElement = ((TypeReference) typeElement).getTypeRef();
		}
		if (typeElement instanceof Type) {
			Type type = (Type) typeElement;
			
			Collection<Assosiation> [] result =  new QueryHelper().getAssosiation(type);
			
			for (Assosiation rel :  result[0]  ) {
				if (rel.getTarget() != null){
				   relatedObjects.put(rel.getTarget().getUid(), rel.getTarget());
				   hash .put(rel.getTarget().getUid(), rel);
				}
			}

			for (Assosiation rel :  result[1]  ) {
				if (rel.getSource() != null){
				   relatedObjects.put(rel.getSource().getUid(), rel.getSource());
				   hash .put(rel.getSource().getUid(), rel);
				}
			}
		}

	}
	
	private String getOperationKey(Operation operation) {

		String key = "";

		for (Parameter param : operation.getParameters()) {
			if (param.getTypeRef() != null)
				key = key + param.getTypeRef().getUid();
		}
		if (operation.getReturnValue() != null
				&& operation.getReturnValue().getTypeRef() != null)
			key = operation.getReturnValue().getTypeRef().getUid() + key;

		key = operation.getName() + key;

		return key;
	}

	private String getAttributeKey(Attribute attribute) {
		String key = "";

		if (attribute.getTypeRef() != null)
			key = attribute.getTypeRef().getUid();

		return attribute.getName() + key;
	}

	
	
	
}
