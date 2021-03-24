/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.Helper;

import type.Type;
import type.Attribute;
import type.Operation;
import type.TypeElement;
import type.TypeGroup;

public class TypeElementProvider implements IWorkbenchAdapter  ,IReturnTypeProvider{

	@Override
	public Object[] getChildren(Object o) {
		ArrayList<Object> ls = new ArrayList<>();

		HashMap<String, Operation> operations = new HashMap<>();
		HashMap<String, Attribute> attributes = new HashMap<>();
		
		TypeElement typeElement = (TypeElement) o;
		new Helper().addOperations(operations,attributes,typeElement);

		ls.addAll(attributes.values());
		ls.addAll(operations.values());

		return ls.toArray();
	}

	
	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		TypeElement typeElement = (TypeElement) o;
		if (typeElement instanceof Type) {
			Type type = (Type) typeElement;
			TypeGroup pkg = (TypeGroup) type.eContainer();

			return pkg.getName() + "::"+ type.getName();
		}
		return typeElement.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}


	@Override
	public Object getReturnType(Object o) {
		return o;
	}

	@Override
	public Object getApplicationType(Object o) {
		return null;
	}	
	
}
