/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.tura.metamodel.commons.properties.selections.dropdown;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.dropdown.DataControlBaseType;

import domain.DataControl;
import domain.Type;

public class BaseTypePropertySelection extends AbstractDependentEnumerationPropertySection{

	protected void init(){
		dropDownDataSupplier = new DataControlBaseType();
	}
	
	
	protected String getLabelText() {
		return "Cast type";//$NON-NLS-1$
	}

	protected HashMap<String, Object> getEnumerationFeatureValues() {
		if (dropDownDataSupplier == null)
			init();

		if (values == null) {
			values = new LinkedHashMap<String, Object>();

			if (dropDownDataSupplier.getWatchPointObject(getModel()) == null)
				return values;

			domain.DataControl dc = (DataControl) dropDownDataSupplier
					.getWatchPointObject(getModel())[0];
			if (dc == null || dc.getCreate() == null)
				return values;

			if (dc.getCreate().getMethodRef() == null
					|| dc.getCreate().getMethodRef().getReturnValue() == null
					|| dc.getCreate().getMethodRef().getReturnValue()
							.getTypeRef() == null)
				return values;

			domain.Type type = (Type) dc.getCreate().getMethodRef()
					.getReturnValue().getTypeRef();

			ArrayList<domain.Type> typeTree = new ArrayList<>();
			new QueryHelper().getInheritTypes(typeTree, type);
//add basetype
			typeTree.add(type);

			for (Iterator<domain.Type> itr = typeTree.iterator(); itr.hasNext();) {
				domain.Type p = itr.next();
				if (p.getName() != null)
					values.put(p.getName(), p);
			}
		}
		return values;
	}

	@Override
	public EObject getModel() {
		return getEObject();
	}

	@Override
	public EObject getModel(EStructuralFeature feature) {
		return getEObject();
	}
	
	
}