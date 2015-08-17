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
package domain.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import domain.diagram.edit.commands.ContinuousIintegrationCreateCommand;
import domain.diagram.edit.commands.DomainArtifactCreateCommand;
import domain.diagram.edit.commands.EJBServiceCreateCommand;
import domain.diagram.edit.commands.JPAServiceCreateCommand;
import domain.diagram.edit.commands.ORMEntityCreateCommand;
import domain.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DomainArtifactsDomainArtifactsDomainArtifactCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DomainArtifactsDomainArtifactsDomainArtifactCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.DomainArtifacts_502001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.ORMEntity_503003 == req.getElementType()) {
			return getGEFWrapper(new ORMEntityCreateCommand(req));
		}
		if (DomainElementTypes.JPAService_503004 == req.getElementType()) {
			return getGEFWrapper(new JPAServiceCreateCommand(req));
		}
		if (DomainElementTypes.EJBService_503005 == req.getElementType()) {
			return getGEFWrapper(new EJBServiceCreateCommand(req));
		}
		if (DomainElementTypes.ContinuousIintegration_503006 == req.getElementType()) {
			return getGEFWrapper(new ContinuousIintegrationCreateCommand(req));
		}
		if (DomainElementTypes.DomainArtifact_503002 == req.getElementType()) {
			return getGEFWrapper(new DomainArtifactCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
