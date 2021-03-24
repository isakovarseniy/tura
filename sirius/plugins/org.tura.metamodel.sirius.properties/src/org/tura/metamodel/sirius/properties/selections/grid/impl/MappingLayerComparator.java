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

package org.tura.metamodel.sirius.properties.selections.grid.impl;

import java.util.Comparator;

import mapper.MappingLayer;

public class MappingLayerComparator implements Comparator<MappingLayer> {

	@Override
	public int compare(MappingLayer o1, MappingLayer o2) {
		if (o1.getOrder() > o2.getOrder()){
			return -1;
		}else{
			if (o1.getOrder() < o2.getOrder()){
				return 1;
			}else{
				return 0;
			}
		}
	}
}