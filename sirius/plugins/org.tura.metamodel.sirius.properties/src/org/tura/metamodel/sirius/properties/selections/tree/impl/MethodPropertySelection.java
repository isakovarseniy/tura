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

package org.tura.metamodel.sirius.properties.selections.tree.impl;

import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.MethodPointerMethodName;
import org.tura.metamodel.sirius.properties.selections.events.Bus;
import org.tura.metamodel.sirius.properties.selections.events.TriggerMethodChangeEvent;
import org.tura.metamodel.sirius.properties.selections.tree.TreePropertySelectioin;

import type.Operation;

public class MethodPropertySelection extends TreePropertySelectioin{

	@Override
	public String getLabelText() {
		return "Method:";
	}

	@Override
	public TreeRoot getContextRoot() {
		TreeRoot rootOfTree = new TreeRoot();
		try {
			rootOfTree.addChild(  new QueryHelper().getTypesRepository(getModel()));
		} catch (Exception e) {
			// ignore
		}
		return rootOfTree;
	}


	@Override
	protected void showError() {
		
	}

	public void afterUpdate(){
		Bus.getInstance().notify(new TriggerMethodChangeEvent());
	}	
	
	@Override
	protected TextDataAdapter getDataAdapter() {
		return new MethodPointerMethodName();
	}

	@Override
	protected  Class<?> getComaringClass() {
		return Operation.class;
	}

}
