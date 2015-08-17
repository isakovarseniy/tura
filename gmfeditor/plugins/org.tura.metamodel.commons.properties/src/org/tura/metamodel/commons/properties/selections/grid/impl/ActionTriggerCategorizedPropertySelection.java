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
import org.tura.metamodel.commons.properties.selections.AbstractTuraPropertySection;
import org.tura.metamodel.commons.properties.selections.grid.impl.ActioinTriggersPropertySelectioin.ActionTriggerSelectionEvent;

import domain.ActioinTriggers;

public class ActionTriggerCategorizedPropertySelection extends CategorizedPropertySelection	{
	
private domain.ActionTrigger model;
private SelectionListener listener = new SelectionListener(this);

@Override
public void createControls(Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
	super.createControls(parent, aTabbedPropertySheetPage);
	aTabbedPropertySheetPage.getControl().addListener(SWT.Selection, listener);
}


@Override
public EObject getModel() {
	if (model == null) {
		tableViewer.setInput(null);
		domain.ActioinTriggers trs = (ActioinTriggers) getEObject();
		if (trs == null || !trs.getTriggers().iterator().hasNext())
			return null;
		return trs.getTriggers().iterator().next();
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
		if (event instanceof ActionTriggerSelectionEvent) {
			model = ((ActionTriggerSelectionEvent) event).getTrigger();
			property.refresh();
		}
	}
}


}
