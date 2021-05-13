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
import java.util.HashMap;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.MappersRoot;

import application.ApplicationMapper;
import mapper.Mappers;

public class MapperRootProvider  implements IWorkbenchAdapter ,IReturnTypeProvider{

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
		HashMap<String, ApplicationMapper> map = new HashMap<String, ApplicationMapper>();
		MappersRoot p = (MappersRoot) o;
		
		for( Mappers mappers  : p.getChildren()){
			map.put( mappers.getUid(), (ApplicationMapper) mappers.eContainer());
		}
		
		ArrayList<Object> ls = new ArrayList<>();
		ls.addAll(map.values());
		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return "Root";
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
