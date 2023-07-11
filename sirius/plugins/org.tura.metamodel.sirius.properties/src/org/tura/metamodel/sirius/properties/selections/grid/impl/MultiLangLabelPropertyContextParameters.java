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

package org.tura.metamodel.sirius.properties.selections.grid.impl;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.sirius.properties.selections.events.Bus;
import org.tura.metamodel.sirius.properties.selections.events.Event;
import org.tura.metamodel.sirius.properties.selections.events.EventListener;
import org.tura.metamodel.sirius.properties.selections.events.RecordChangeEvent;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;

import form.ContextParameter;
import type.Parameter;
import type.TypeElement;

public class MultiLangLabelPropertyContextParameters extends  ContextParameterPropertySelection {

	
	private SelectionListener listener = new SelectionListener();
	
	@Override
	public TypeElement contextRefTypeExtreactor(
			ContextParameter obj) {
		return ((Parameter) obj.getRefObj()).getTypeRef();
	}

	@Override
	protected DataSource getDS() {
		return new MultiLangLabelPropertyContextContextParametersDS(this);
	}

	
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		Bus.getInstance().addEventListner(listener);
		
	}
	
	
	private class SelectionListener implements EventListener {

		public SelectionListener() {
		}

		@Override
		public void handleEvent(Event event) {
			if (event instanceof RecordChangeEvent) {
				ds.cleanList();
				ds.getRows();
				refresh();
			}
		}
	}
	
	@Override
	public void dispose(){
		Bus.getInstance().removeEventListner(listener);
	}
	
	
}
