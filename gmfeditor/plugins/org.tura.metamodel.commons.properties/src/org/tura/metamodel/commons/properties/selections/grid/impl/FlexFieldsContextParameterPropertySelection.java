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
package org.tura.metamodel.commons.properties.selections.grid.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.properties.FlexFieldNameSelectionEvent;
import org.tura.metamodel.commons.properties.FlexFieldSelectionEvent;
import org.tura.metamodel.commons.properties.selections.AbstractTuraPropertySection;
import org.tura.metamodel.commons.properties.selections.grid.DataSource;


public class FlexFieldsContextParameterPropertySelection extends
		ContextParameterPropertySelection {

	private domain.FlexField model;
	private SelectionListener listener = new SelectionListener(this);

	@Override
	public void createControls(Composite parent,
			final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		aTabbedPropertySheetPage.getControl().addListener(SWT.Selection,
				listener);
		enableParametersEntry();
	}

	@Override
	public EObject getModel() {
		if (model == null) {
			tableViewer.setInput(null);
			domain.FlexFields fields = (domain.FlexFields) getEObject();
			if (fields == null || !fields.getFields().iterator().hasNext())
				return null;
			return fields.getFields().iterator().next();
		}
		return model;
	}

	private class SelectionListener implements Listener {
		private AbstractTuraPropertySection property;

		public SelectionListener(AbstractTuraPropertySection property) {
			this.setProperty(property);
		}

		public void setProperty(AbstractTuraPropertySection property) {
			this.property = property;
		}

		@Override
		public void handleEvent(Event event) {
			if (event instanceof FlexFieldSelectionEvent) {
				model = ((FlexFieldSelectionEvent) event).getField();
				enableParametersEntry();
				ds.cleanList();
				ds.getRows();
				property.refresh();
			}
			if (event instanceof FlexFieldNameSelectionEvent) {
				enableParametersEntry();
				ds.cleanList();
				ds.getRows();
				property.refresh();
			}
		}
	}

	@Override
	public domain.TypeElement contextRefTypeExtreactor(
			domain.ContextParameter obj) {
		return ((domain.Parameter) obj.getRefObj()).getTypeRef();
	}

	@Override
	protected DataSource getDS() {
		return new FlexFieldParameterDS(this);
	}

	private void enableParametersEntry() {
		domain.ContextValue cnt = model;
		try {
			this.table.setVisible(false);
			if (model != null && !cnt.isConstant()) {
				if (cnt.getExpression() != null
						&& cnt.getExpression().size() != 0) {
					domain.ExpressionPart eobj = cnt.getExpression().get(
							cnt.getExpression().size() - 1);
					if (eobj.getObjRef() != null
							&& eobj.getObjRef() instanceof domain.Operation) {
						this.table.setVisible(true);
					}
				}
			}

		} catch (org.eclipse.swt.SWTException e) {

		}
	}

}
