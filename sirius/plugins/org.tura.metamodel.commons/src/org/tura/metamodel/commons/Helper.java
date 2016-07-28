package org.tura.metamodel.commons;

import java.util.Map;

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
