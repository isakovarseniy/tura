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
package canvas.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import canvas.diagram.edit.commands.Column2CreateCommand;
import canvas.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class TreeTreeColsCompartment2ItemSemanticEditPolicy extends DomainBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TreeTreeColsCompartment2ItemSemanticEditPolicy() {
		super(DomainElementTypes.Tree_1603016);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.Column_1603026 == req.getElementType()) {
			return getGEFWrapper(new Column2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}