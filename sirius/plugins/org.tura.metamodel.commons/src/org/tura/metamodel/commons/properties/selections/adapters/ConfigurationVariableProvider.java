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

package org.tura.metamodel.commons.properties.selections.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import artifact.ConfigVariable;

public class ConfigurationVariableProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return o;
	}

	@Override
	public Object getApplicationType(Object o) {
		return null;
	}	
	
	@Override
	public Object[] getChildren(Object o) {
		return new Object[]{};
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		ConfigVariable p = (ConfigVariable) o;
		return p.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
