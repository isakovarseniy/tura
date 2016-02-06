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
package org.tura.metamodel.commons.properties.selections.context.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWTException;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.views.properties.tabbed.view.TabbedPropertyComposite;
import org.tura.metamodel.commons.properties.selections.grid.impl.ContextParameterPropertySelection;

import domain.ContextValue;
import domain.DomainPackage;

public abstract class DependentContextParameterPropertySelection extends
		ContextParameterPropertySelection {

	private AdapterImpl adapter;
	private boolean isFirstTime = true;

	public void refresh() {
		try {
			enableParametersEntry();
			super.refresh();
		} catch (org.eclipse.swt.SWTException e) {

		}
	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		if (isFirstTime) {

			AdapterImpl adapter = new AdapterImpl() {
				public void notifyChanged(Notification notification) {

					if (notification.getFeatureID(domain.ContextValue.class) == DomainPackage.eINSTANCE
							.getContextValue_Expression().getFeatureID()) {
						ds.cleanList();
						enableParametersEntry();
						((TabbedPropertyComposite) (getPropertySheetPage()
								.getControl())).getTabComposite()
								.layout(true, true);
			
						try{
						   tableViewer.refresh();
						}catch(SWTException e){
							
						}
					}

				}

			};
			getModel().eAdapters().add(adapter);
		}

	}

	private void enableParametersEntry() {
		domain.ContextValue cnt = (ContextValue) getModel();
		try{
		  this.table.setVisible(false);
		}catch( SWTException e){
			
		}
		if (!cnt.isConstant()) {
			if (cnt.getExpression() != null && cnt.getExpression().size() != 0) {
				domain.ExpressionPart eobj = cnt.getExpression().get(
						cnt.getExpression().size() - 1);
				if (eobj.getObjRef() != null
						&& eobj.getObjRef() instanceof domain.Operation) {
					try{
					 this.table.setVisible(true);
					}catch( SWTException e){
						
					}
				}
			}
		}
	}

	public void dispose() {
		super.dispose();
		if (getEObject() != null && getModel() != null)
			getModel().eAdapters().remove(adapter);
	}

}
