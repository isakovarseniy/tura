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

package org.tura.metamodel.sirius.properties.selections.grid.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.sirius.properties.selections.events.Bus;
import org.tura.metamodel.sirius.properties.selections.events.Event;
import org.tura.metamodel.sirius.properties.selections.events.EventListener;
import org.tura.metamodel.sirius.properties.selections.events.FlexFieldChangeEvent;

import form.FlexField;

public class FlexFieldCategorizedPropertySelection extends CategorizedPropertySelection {

	private FlexField model;
	private SelectionListener listener = new SelectionListener();

	@Override
	public void createControls(Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		Bus.getInstance().addEventListner(listener);
	}

	@Override
	public EObject getModel() {
		if (model == null) {
			tableViewer.getTable().clearAll();
			tableViewer.getTable().setItemCount(0);
			return null;
		}
		return model;
	}


	private class SelectionListener implements EventListener {

		@Override
		public void handleEvent(Event event) {
			if (event instanceof FlexFieldChangeEvent) {
				model = (FlexField) ((FlexFieldChangeEvent)event).getModel();
				ds.cleanList();
				ds.getRows();
				refresh();
			}
		}
	}

}
