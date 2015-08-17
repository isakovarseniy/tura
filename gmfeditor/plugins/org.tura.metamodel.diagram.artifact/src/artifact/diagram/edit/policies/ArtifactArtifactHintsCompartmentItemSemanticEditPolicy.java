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
package artifact.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import artifact.diagram.edit.commands.GenerationHintCreateCommand;
import artifact.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class ArtifactArtifactHintsCompartmentItemSemanticEditPolicy extends DomainBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ArtifactArtifactHintsCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Artifact_702001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.GenerationHint_703006 == req.getElementType()) {
			return getGEFWrapper(new GenerationHintCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
