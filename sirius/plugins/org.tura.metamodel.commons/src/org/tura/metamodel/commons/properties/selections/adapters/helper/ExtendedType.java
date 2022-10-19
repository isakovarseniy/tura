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

import form.ArtificialField;
import type.TypeElement;

public class ExtendedType {
	
	private TypeElement type;
	private ArrayList<ArtificialField> ls = new ArrayList<>();
	
	public ExtendedType(TypeElement type){
		this.type = type;
	}

	public ArrayList<ArtificialField> getLs() {
		return ls;
	}

	public TypeElement getType() {
		return type;
	}
	
	
}
