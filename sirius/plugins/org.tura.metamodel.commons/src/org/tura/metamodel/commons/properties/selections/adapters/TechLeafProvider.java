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

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.properties.selections.adapters.helper.ConfigurationHashesHolder;
import org.tura.metamodel.commons.properties.selections.adapters.helper.ConfigurationVariablesHolder;
import org.tura.metamodel.commons.properties.selections.adapters.helper.GenerationHintsHolder;

import artifact.TechLeaf;


public class TechLeafProvider  implements IWorkbenchAdapter ,IReturnTypeProvider{

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
		TechLeaf p = (TechLeaf) o;
		ArrayList<Object> ls = new ArrayList<>();
		ls.addAll(p.getTechLeafs());
		ls.add(new ConfigurationHashesHolder(p));
		ls.add(new ConfigurationVariablesHolder(p));
		ls.add(new GenerationHintsHolder(p));

		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		TechLeaf p = (TechLeaf) o;
		return p.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
