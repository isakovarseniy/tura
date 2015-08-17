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
package org.tura.metamodel.commons.properties.selections.adapters.dropdown;

import org.eclipse.emf.ecore.EObject;

public class SourcesPointerSourceCastExternalIterator extends
		SourcesPointerSourceCast {

	public Object[] getWatchPointObject(Object eObject) {

		EObject eobj = (EObject) eObject;
		do {
			eobj = eobj.eContainer();
			if (eobj == null)
				return new Object[] {};
		} while (!(eobj instanceof domain.Table)
				&& !(eobj instanceof domain.Tree));

		return new Object[] { ((domain.SourcesPointer) eobj).getSourcePointer() };
	}

}
