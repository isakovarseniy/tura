/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import type.Type;
import type.Attribute;

public class AttributeProvider implements IWorkbenchAdapter, IReturnTypeProvider {

	@Override
	public Object[] getChildren(Object o) {
		ArrayList<Object> ls = new ArrayList<>();
		Attribute attr = (Attribute) o;
		if (attr.getTypeRef() != null && attr.getTypeRef() instanceof Type) {

			Type typeElement = (Type) attr.getTypeRef();
			if (typeElement instanceof Type) {
				ls.addAll(typeElement.getOperations());
				ls.addAll(typeElement.getAttributes());
			}
		}
		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		Attribute attr = (Attribute) o;
		return attr.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

	@Override
	public Object getReturnType(Object o) {
		Attribute attr = (Attribute) o;
		
		return attr.getTypeRef();
	}

	@Override
	public Object getApplicationType(Object o) {
		return null;
	}	
}
