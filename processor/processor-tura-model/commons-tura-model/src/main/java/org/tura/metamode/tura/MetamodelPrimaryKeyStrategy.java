/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamode.tura;

import java.util.UUID;

import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.repository.core.PrImaryKeyStrategy;

public class MetamodelPrimaryKeyStrategy implements PrImaryKeyStrategy{

	private static final long serialVersionUID = -8674066159162319557L;
	public static long sequence;

	public MetamodelPrimaryKeyStrategy() {
		
	}
	
	@Override
	public void generatePk(Object o) {
		try{
			
			Reflection.callTyped(o, "setUid", String.class,UUID.randomUUID().toString());
		
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		
	}

}
