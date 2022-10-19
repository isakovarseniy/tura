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

package org.tura.metamodel.commons.properties.selections.adapters.helper;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;

public class TreeRoot implements IAdaptable{
	@SuppressWarnings("rawtypes")
	private ArrayList children = new ArrayList();
	
	@SuppressWarnings("unchecked")
	public void addChild(Object obj){
		children.add(obj);
	}
	 
    @SuppressWarnings("rawtypes")
	public List getChildren(){
    	return children;
    }

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	 public Object getAdapter(Class adapter) {
	     return Platform.getAdapterManager().getAdapter(this, adapter);
	  }
}
