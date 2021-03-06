/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.selections.dropdown;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.sirius.properties.selections.adapters.dropdown.SelectionDisplayOptionPointer;
import org.tura.metamodel.sirius.properties.selections.events.Bus;

import form.FormFactory;
import form.FormPackage;
import form.OptionSelection;
import form.Selection;

public class DisplayOptionPointerAttributePropertySelection extends DependentAbstractAttributePropertySelection {

	private SelectionListener listener = new SelectionListener();
	
	
	protected String getLabelText() {
		return "Display value";
	}

	
	@Override
	public void createControls(Composite parent,
			final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		Bus.getInstance().addEventListner(listener);
		
	}
	
	protected void init() {
		dropDownDataSupplier = new SelectionDisplayOptionPointer();
	}

	@Override
	public EObject getModel() {
		OptionSelection dd = (OptionSelection) super.getModel();
		Selection selection = dd.getSelection();
		if (selection == null) {
			EditingDomain editingDomain = ((DiagramEditor) getPart()).getEditingDomain();

			selection = FormFactory.eINSTANCE.createSelection();

			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, dd,
							FormPackage.eINSTANCE.getOptionSelection_Selection(),
							selection));
		}

		return dd;
	}

	@Override
	public EObject getModel(EStructuralFeature feature) {
		return ((OptionSelection)super.getModel()).getSelection();
	}

	@Override
	public void dispose(){
		Bus.getInstance().removeEventListner(listener);
	}
	
}