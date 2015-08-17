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
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.commons.properties.selections.adapters.dropdown.SelectionValueOptionPointer;

import domain.DomainFactory;
import domain.DomainPackage;
import domain.DropDownSelection;

public class ValueOptionPointerAttributePropertySelection extends
		AbstractAttributePropertySelection {

	protected String getLabelText() {
		return "Option value";
	}

	protected void init() {
		dropDownDataSupplier = new SelectionValueOptionPointer();
	}

	@Override
	public EObject getModel() {
		domain.DropDownSelection dd = (DropDownSelection) getEObject();
		domain.Selection selection = dd.getSelection();
		if (selection == null) {
			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();

			selection = DomainFactory.eINSTANCE.createSelection();

			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, dd,
							DomainPackage.eINSTANCE
									.getDropDownSelection_Selection(),
							selection));
		}

		return dd;
	}

	@Override
	public EObject getModel(EStructuralFeature feature) {
		return ((DropDownSelection) getEObject()).getSelection();
	}

}