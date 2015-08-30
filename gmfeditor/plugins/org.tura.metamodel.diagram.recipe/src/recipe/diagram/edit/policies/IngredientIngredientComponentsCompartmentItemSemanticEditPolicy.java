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
package recipe.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import recipe.diagram.edit.commands.JavaComponentCreateCommand;
import recipe.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class IngredientIngredientComponentsCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IngredientIngredientComponentsCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Ingredient_303001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.JavaComponent_303002 == req.getElementType()) {
			return getGEFWrapper(new JavaComponentCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
