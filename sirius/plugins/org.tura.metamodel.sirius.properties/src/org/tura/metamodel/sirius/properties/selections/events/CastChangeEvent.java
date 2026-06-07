/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.selections.events;

import org.tura.metamodel.sirius.properties.selections.dropdown.Scope;

public class CastChangeEvent implements Event, ObjectPointer{

	String objectId;
	Scope scope;
	
	public CastChangeEvent(String objectId,Scope  scope ) {
		this.objectId = objectId;
		this.scope = scope;
	}
	
	
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	@Override
	public String getObjectId() {
		return objectId;
	}

	public Scope getScope() {
		return scope;
	}

	public void setScope(Scope scope) {
		this.scope = scope;
	}

	
}
