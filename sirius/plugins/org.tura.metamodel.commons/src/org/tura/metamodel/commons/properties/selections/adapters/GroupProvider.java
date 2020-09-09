/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.QueryHelper;

import permission.Group;

public class GroupProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object[] getChildren(Object o) {
		return new Object[]{};
	}
	
	@Override
	public Object getApplicationType(Object o) {
		try{
			  return new QueryHelper().findGroupType((EObject) o);
			}catch(Exception e){
				LogUtil.log(e);
				return null;
			}
	}	

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		Group opr = (Group) o;
		return "g-"+opr.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

	@Override
	public Object getReturnType(Object o) {
		return o;
	}

}
