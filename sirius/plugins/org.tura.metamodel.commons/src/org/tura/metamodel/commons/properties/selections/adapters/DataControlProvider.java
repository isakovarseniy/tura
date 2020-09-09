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

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.Helper;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlFakeAttribute;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlFakeMethod;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TriggerHolder;

import form.DataControl;
import type.Attribute;
import type.Operation;

public class DataControlProvider implements IWorkbenchAdapter,IReturnTypeProvider {

	@Override
	public Object[] getChildren(Object o) {
		ArrayList<Object> ls = new ArrayList<>();
		DataControl ctr = (DataControl) o;

		QueryHelper qh = new QueryHelper();

		HashMap<String, Operation> operations = new HashMap<>();
		HashMap<String, Attribute> attributes = new HashMap<>();
		(new Helper()).addOperations(operations, attributes,qh.findDataControlType(ctr));

		for (Attribute attr : attributes.values()) {
			if (attr.getName() != null)
				ls.add(new DataControlFakeAttribute(attr.getName(), attr
						.getTypeRef(), ctr));
		}

		for (Operation opr : operations.values()) {
			if (opr.getReturnValue() != null)
				ls.add(new DataControlFakeMethod(opr.getName(), opr
						.getReturnValue().getTypeRef(), ctr));
		}

		if (ctr.getCreate() != null && ctr.getCreate().getMethodRef() != null)
			ls.add(new TriggerHolder("CreateTrigger", ctr.getCreate()));

		if (ctr.getSearch() != null && ctr.getSearch().getMethodRef() != null)
			ls.add(new TriggerHolder("SearchTrigger", ctr.getSearch()));

		if (ctr.getPostCreateTrigger() != null
				&& ctr.getPostCreateTrigger().getMethodRef() != null)
			ls.add(new TriggerHolder("PostCreateTrigger", ctr
					.getPostCreateTrigger()));

		if (ctr.getPostQueryTrigger() != null
				&& ctr.getPostQueryTrigger().getMethodRef() != null)
			ls.add(new TriggerHolder("PostQueryTrigger", ctr
					.getPostQueryTrigger()));

		if (ctr.getPreDeleteTrigger() != null
				&& ctr.getPreDeleteTrigger().getMethodRef() != null)
			ls.add(new TriggerHolder("PreDeleteTrigger", ctr
					.getPreDeleteTrigger()));

		if (ctr.getPreInsertTrigger() != null
				&& ctr.getPreInsertTrigger().getMethodRef() != null)
			ls.add(new TriggerHolder("PreInsertTrigger", ctr
					.getPreInsertTrigger()));

		if (ctr.getPreQueryTrigger() != null
				&& ctr.getPreQueryTrigger().getMethodRef() != null)
			ls.add(new TriggerHolder("PreQueryTrigger", ctr
					.getPreQueryTrigger()));

		if (ctr.getPreUpdateTrigger() != null
				&& ctr.getPreUpdateTrigger().getMethodRef() != null)
			ls.add(new TriggerHolder("PreUpdateTrigger", ctr
					.getPreUpdateTrigger()));

		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		DataControl ctr = (DataControl) o;
		return ctr.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

	@Override
	public Object getReturnType(Object o) {
		return new QueryHelper().findDataControlType(o);
	}
	
	@Override
	public Object getApplicationType(Object o) {
		return new QueryHelper().findDataControlType(o);
	}	

}
