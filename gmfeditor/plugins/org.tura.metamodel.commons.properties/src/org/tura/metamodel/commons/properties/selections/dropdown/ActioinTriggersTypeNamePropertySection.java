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
package org.tura.metamodel.commons.properties.selections.dropdown;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.properties.ActioinTriggersMethodNameSelectionEvent;
import org.tura.metamodel.commons.properties.ActionTriggerSelectionEvent;
import org.tura.metamodel.commons.properties.selections.AbstractTuraPropertySection;

import domain.ActioinTriggers;

public class ActioinTriggersTypeNamePropertySection extends TypeRefTypeNamePropertySection {

	private domain.ActionTrigger model;
	private SelectionListener listener = new SelectionListener(this);

	@Override
	public void createControls(Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		aTabbedPropertySheetPage.getControl().addListener(SWT.Selection, listener);
	}

	@Override
	protected void handleComboModified(){
		super.handleComboModified();
		propertySheetPage.getControl().notifyListeners(SWT.Selection, new ActioinTriggersMethodNameSelectionEvent());
	}
	
	@Override
	public EObject getModel() {
		if (model == null) {
			this.combo.setItems(new String[]{});
			this.combo.select(-1);
			domain.ActioinTriggers trs = (ActioinTriggers) getEObject();
			if (trs == null || !trs.getTriggers().iterator().hasNext())
				return null;
			return trs.getTriggers().iterator().next();
		}
		return model;
	}

	
	@Override
	public EObject getModel(EStructuralFeature feature) {
		return getModel();
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
				((ActioinTriggersTypeNamePropertySection)property).setFirstTime();
				property.refresh();
			}
		}
	}
}