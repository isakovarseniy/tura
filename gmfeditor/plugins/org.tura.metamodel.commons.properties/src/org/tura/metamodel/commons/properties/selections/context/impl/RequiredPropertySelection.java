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

import java.util.UUID;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

import domain.DomainFactory;
import domain.DomainPackage;

public class RequiredPropertySelection extends
		AbstractBooleanPropertySelection {

	@Override
	public EObject getModel() {

		domain.Uielement el = ((domain.Uielement) getEObject());
		if (el.getRequired() == null) {

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el,
							DomainPackage.eINSTANCE.getEnabledUIItem_Enabled(),
							DomainFactory.eINSTANCE.createContext()));

		}

		if (el.getRequired().getUid() == null) {

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el.getRequired(),
							DomainPackage.eINSTANCE.getContextValue_Uid(), UUID
									.randomUUID().toString()));

		}


		return el.getRequired();
	}
}
