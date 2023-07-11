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

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.properties.selections.adapters.IReturnTypeProvider;
import org.tura.metamodel.sirius.properties.selections.events.Bus;
import org.tura.metamodel.sirius.properties.selections.events.Event;
import org.tura.metamodel.sirius.properties.selections.events.EventListener;
import org.tura.metamodel.sirius.properties.selections.events.FlexFieldChangeEvent;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;

import form.ContextParameter;
import form.FlexField;
import form.FlexFields;
import type.Parameter;
import type.TypeElement;


public class FlexFieldsContextParameterPropertySelection extends ContextParameterPropertySelection {

	private form.FlexField model;
	private SelectionListener listener = new SelectionListener();

	@Override
	public void createControls(Composite parent,
			final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		Bus.getInstance().addEventListner(listener);
		
	}

	
	
	@Override
	public EObject getModel() {
		if (model == null) {
			tableViewer.setInput(null);
			FlexFields fields = (FlexFields) model;
			if (fields == null || !fields.getFields().iterator().hasNext())
				return null;
			return fields.getFields().iterator().next();
		}
		return model;
	}

	@Override
	public TypeElement contextRefTypeExtreactor(ContextParameter obj) {
		return ((Parameter) obj.getRefObj()).getTypeRef();
	}

	@Override
	protected DataSource getDS() {
		return new FlexFieldParameterDS(this);
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
	
	@Override
	public void dispose(){
		Bus.getInstance().removeEventListner(listener);
	}
	
	protected TypeElement getType(Object obj){
		IReturnTypeProvider provider = (IReturnTypeProvider) Platform.getAdapterManager().getAdapter(obj,
				IReturnTypeProvider.class);

		TypeElement type = null;
		if (provider != null && provider.getApplicationType(obj) != null)
			type = (TypeElement) provider.getApplicationType(obj);
		
		return type;

	}
	
	
}
