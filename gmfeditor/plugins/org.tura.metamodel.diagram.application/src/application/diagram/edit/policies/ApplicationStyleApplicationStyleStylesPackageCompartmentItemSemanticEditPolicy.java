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
/*
* 
*/
package application.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import application.diagram.edit.commands.StylesPackageCreateCommand;
import application.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class ApplicationStyleApplicationStyleStylesPackageCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ApplicationStyleApplicationStyleStylesPackageCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.ApplicationStyle_802005);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.StylesPackage_803004 == req.getElementType()) {
			return getGEFWrapper(new StylesPackageCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
