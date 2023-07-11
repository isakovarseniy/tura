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

import java.util.Map.Entry;

import org.tura.epsilon.model.TypeResolver;
import org.tura.model.designer.repository.proxy.MetamodelMapper;

public class MeamodelTypeResolver extends TypeResolver{
	
	public MeamodelTypeResolver() {
		
		MetamodelMapper  mapper =  new MetamodelMapper();
		mapper.init();
		for (  Entry<String , String> entry  : mapper.getData().entrySet()   ) {
			this.addMapping(entry.getKey(), entry.getValue());
		}
		
	}

}
