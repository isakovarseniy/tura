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

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWTException;
import org.eclipse.ui.IWorkbenchPart;

public abstract class AbstractDependentEnumerationPropertySection extends
		AbstractEnumerationPropertySection {

	private AdapterImpl adapter;
	private boolean isFirstTime = true;
	private ISelection currentSelection;

	public void setFirstTime() {
		this.isFirstTime = true;
		if (adapter != null)
			getModel().eAdapters().remove(adapter);
	}

	public void refresh() {
		if (isFirstTime && getModel() != null) {

			AdapterImpl adapter = new AdapterImpl() {
				public void notifyChanged(Notification notification) {
					for (int j = 0; j < dropDownDataSupplier
							.getWatchPointFeature().length; j++) {
						if (notification.getFeatureID(dropDownDataSupplier
								.getExpectedClass()) == dropDownDataSupplier
								.getWatchPointFeature()[j].getFeatureID()
								&& getPart() != null) {
							values = null;

							EditingDomain editingDomain = ((DiagramEditor) getPart())
									.getEditingDomain();
							CompoundCommand compoundCommand = new CompoundCommand();
							EStructuralFeature[] features = getFeature();

							for (int i = 0; i < features.length; i++) {
								if (features[i].getFeatureID() != dropDownDataSupplier
										.getWatchPointFeature()[j]
										.getFeatureID())
									compoundCommand.append(SetCommand.create(
											editingDomain,
											getModel(features[i]), features[i],
											null));
							}
							editingDomain.getCommandStack().execute(
									compoundCommand);
							refresh();
						}
					}

				}

			};
			getModel().eAdapters().add(adapter);
		}
		if (getModel() != null)
			super.refresh();
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (currentSelection != null && !currentSelection.equals(selection)) {
			setFirstTime();
		}
		super.setInput(part, selection);
	}

	public void dispose() {
		try {
			if (getEObject() != null && getModel() != null)
				getModel().eAdapters().remove(adapter);
		} catch (SWTException e) {

		}
		super.dispose();
	}

}
