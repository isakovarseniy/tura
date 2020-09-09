/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.selections.dropdown;

import org.tura.metamodel.sirius.properties.selections.adapters.dropdown.SourcesPointerSourceCastExternalIterator;

public class SourceCastPropertySelectionExternalIterator extends AbstractCastPropertySelection{

	protected String getLabelText() {
		return "Cast :";//$NON-NLS-1$
	}	

	protected void init(){
		dropDownDataSupplier = new SourcesPointerSourceCastExternalIterator();
	}
}