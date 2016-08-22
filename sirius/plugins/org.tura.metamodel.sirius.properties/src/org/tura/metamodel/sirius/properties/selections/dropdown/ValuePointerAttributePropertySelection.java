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
package org.tura.metamodel.sirius.properties.selections.dropdown;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.sirius.properties.selections.adapters.dropdown.SourcesPointerValuePointer;
import org.tura.metamodel.sirius.properties.selections.events.Bus;

public class ValuePointerAttributePropertySelection extends DependentAbstractAttributePropertySelection{

	private SelectionListener listener = new SelectionListener();
	
	
	@Override
	public void createControls(Composite parent,
			final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		Bus.getInstance().addEventListner(listener);
		
	}


	
	protected void init(){
		dropDownDataSupplier = new SourcesPointerValuePointer();
	}
	
	@Override
	public void dispose(){
		Bus.getInstance().removeEventListner(listener);
	}
	
}
