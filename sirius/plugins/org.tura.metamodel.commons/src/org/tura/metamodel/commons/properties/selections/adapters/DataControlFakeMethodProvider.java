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

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.Util;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlFakeMethod;
import org.tura.metamodel.commons.properties.selections.adapters.helper.ExtendedType;

import form.ArtificialField;
import type.TypeElement;

public class DataControlFakeMethodProvider  implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		DataControlFakeMethod a = (DataControlFakeMethod) o;
		return a.getType();
	}

	@Override
	public Object getApplicationType(Object o) {
		return null;
	}	
	
	@Override
	public Object[] getChildren(Object o) {
		DataControlFakeMethod attr = (DataControlFakeMethod) o;
		TypeElement type = attr.getType();
	    if (attr.getType().getUid().equals(new QueryHelper().findBaseType(attr.getDc()  ).getUid() ) ){
	    	type = Util.getBase(attr.getDc());
	    }
		ExtendedType  ex = new ExtendedType(type);
		for (ArtificialField f : attr.getDc().getArtificialFields()){
			ex.getLs().add(f);
		}
		return new Object[]{ex};
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		DataControlFakeMethod attr = (DataControlFakeMethod) o;
		return attr.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}
	
}
