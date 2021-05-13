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
import java.util.Arrays;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.properties.selections.adapters.helper.ExtendedType;

public class ExtendedTypeProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return null;
	}

	@Override
	public Object getApplicationType(Object o) {
		return null;
	}	
	
	@Override
	public Object[] getChildren(Object o) {
		ExtendedType ex = (ExtendedType) o;
		TypeElementProvider provider = new TypeElementProvider();
		
		ArrayList<Object> children = new ArrayList<>();
		children.addAll(Arrays.asList(provider.getChildren(ex.getType())));
		children.addAll(ex.getLs());

		return children.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		ExtendedType ex = (ExtendedType) o;
		TypeElementProvider provider = new TypeElementProvider();
		return provider.getLabel(ex.getType());
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
