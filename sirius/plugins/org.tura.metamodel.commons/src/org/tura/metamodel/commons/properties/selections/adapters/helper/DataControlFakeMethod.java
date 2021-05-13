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

package org.tura.metamodel.commons.properties.selections.adapters.helper;

import form.DataControl;
import type.TypeElement;

public class DataControlFakeMethod {

	private String name;
	private TypeElement type;
	private DataControl dc;
	
	public DataControlFakeMethod(String name,TypeElement type,DataControl dc){
		this.name=name;
		this.type=type;
		this.dc=dc;
	}

	public DataControl getDc() {
		return dc;
	}

	public void setDc(DataControl dc) {
		this.dc = dc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TypeElement getType() {
		return type;
	}

	public void setType(TypeElement type) {
		this.type = type;
	}
	
}
