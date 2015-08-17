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


public class TypeNamePropertySection extends AbstractTypeNamePropertySection{

	@Override
	protected String getQuery() {
		return "domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).uid='$1').oclAsType(domain::Package).typedefinition.types->"
				+"select(r|(r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).name <> null)  " 
				+"or (r.oclIsKindOf(domain::Primitive) and  r.oclAsType(domain::Primitive).name <> null)"
				+"or (r.oclIsKindOf(domain::Enumarator) and  r.oclAsType(domain::Enumarator).name <> null)"
				+")->sortedBy(r|r.name)";
	}

}
