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

package org.tura.metamodel.sirius.properties.selections.context.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import form.FormFactory;
import form.FormPackage;
import form.OptionSelection;

public class InitialOptionMessagePropertySelection extends MultiLangLabelPropertySelection{

	
	@Override
	public EObject getModel() {

		DRepresentationElement element = (DRepresentationElement) getEObject();
		OptionSelection el = (OptionSelection) element.getTarget();
		
		if (el.getInitialOptionMessage() == null) {

			EditingDomain editingDomain = ((DiagramEditor) getPart()).getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el,
							FormPackage.eINSTANCE.getOptionSelection_InitialOptionMessage(),
							FormFactory.eINSTANCE.createContext()));

		}
		return el.getInitialOptionMessage();
	}	
	
}