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
package org.tura.metamodel.sirius.properties.selections.adapters.dropdown;

import org.eclipse.emf.ecore.EObject;

import form.SourcesPointer;
import form.Table;
import form.Tree;

public class SourcesPointerValuePointerExternalIterator extends
		SourcesPointerValuePointer {

	public Object[] getWatchPointObject(Object eObject) {

		EObject eobj = (EObject) eObject;
		do {
			eobj = eobj.eContainer();
			if (eobj == null)
				return new Object[] {};
		} while (!(eobj instanceof Table) && !(eobj instanceof Tree));

		return new Object[] {
				((SourcesPointer) eobj).getSourcePointer(),
				((SourcesPointer) eObject).getSourceCast(),
				((SourcesPointer) eObject).getSourceCastDataControl()

		};
	}

}
