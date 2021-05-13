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

import org.tura.metamodel.commons.Helper;
import org.tura.metamodel.commons.Util;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlFakeAttribute;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlFakeMethod;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeDataControl;

import type.Attribute;
import type.Operation;
import type.TypeElement;

public class TreeDataControlProvider implements IWorkbenchAdapter,
		IReturnTypeProvider {

	@Override
	public Object getReturnType(Object o) {
//Must return null !!!!!!!!!!		
		return null;
	}

	@Override
	public Object getApplicationType(Object o) {
		return null;
	}	
	
	
	@Override
	public Object[] getChildren(Object o) {
		ArrayList<Object> ls = new ArrayList<>();
		try {
			TreeDataControl tdc = (TreeDataControl) o;
			QueryHelper qh = new QueryHelper();
			qh.getTreeLeafs(ls, tdc.getDc());
			TypeElement ctr = qh.findTreeDataControlType(tdc.getDc());

			HashMap<String, Operation> operations = new HashMap<>();
			HashMap<String, Attribute> attributes = new HashMap<>();
			(new Helper()).addOperations(operations, attributes, ctr);

			for (Attribute attr : attributes.values()) {
				if (attr.getName() != null)
					ls.add(new DataControlFakeAttribute(attr.getName(), attr
							.getTypeRef(), tdc.getDc()));
			}

			for (Operation opr : operations.values()) {
				if (opr.getReturnValue() != null)
					ls.add(new DataControlFakeMethod(opr.getName(), opr
							.getReturnValue().getTypeRef(), tdc.getDc()));
			}

		} catch (Exception e) {
			return new Object[] {};
		}
		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		TreeDataControl tdc = (TreeDataControl) o;
		return "Tree" + Util.mergeAndCapitalize(tdc.getDc().getName());
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
