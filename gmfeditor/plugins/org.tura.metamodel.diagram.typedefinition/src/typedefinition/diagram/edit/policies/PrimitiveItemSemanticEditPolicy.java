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
package typedefinition.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import typedefinition.diagram.edit.commands.AssosiationCreateCommand;
import typedefinition.diagram.edit.commands.AssosiationReorientCommand;
import typedefinition.diagram.edit.commands.GeneralizationCreateCommand;
import typedefinition.diagram.edit.commands.GeneralizationReorientCommand;
import typedefinition.diagram.edit.commands.ReferencesCreateCommand;
import typedefinition.diagram.edit.commands.ReferencesReorientCommand;
import typedefinition.diagram.edit.parts.AssosiationEditPart;
import typedefinition.diagram.edit.parts.GeneralizationEditPart;
import typedefinition.diagram.edit.parts.ReferencesEditPart;
import typedefinition.diagram.part.DomainVisualIDRegistry;
import typedefinition.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class PrimitiveItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PrimitiveItemSemanticEditPolicy() {
		super(DomainElementTypes.Primitive_102004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (DomainVisualIDRegistry.getVisualID(incomingLink) == ReferencesEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DomainVisualIDRegistry.getVisualID(incomingLink) == GeneralizationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DomainVisualIDRegistry.getVisualID(incomingLink) == AssosiationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (DomainVisualIDRegistry.getVisualID(outgoingLink) == ReferencesEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DomainVisualIDRegistry.getVisualID(outgoingLink) == GeneralizationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DomainVisualIDRegistry.getVisualID(outgoingLink) == AssosiationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (DomainElementTypes.References_104006 == req.getElementType()) {
			return getGEFWrapper(new ReferencesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DomainElementTypes.Generalization_104005 == req.getElementType()) {
			return getGEFWrapper(new GeneralizationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DomainElementTypes.Assosiation_104007 == req.getElementType()) {
			return getGEFWrapper(new AssosiationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (DomainElementTypes.References_104006 == req.getElementType()) {
			return getGEFWrapper(new ReferencesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DomainElementTypes.Generalization_104005 == req.getElementType()) {
			return getGEFWrapper(new GeneralizationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DomainElementTypes.Assosiation_104007 == req.getElementType()) {
			return getGEFWrapper(new AssosiationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ReferencesEditPart.VISUAL_ID:
			return getGEFWrapper(new ReferencesReorientCommand(req));
		case GeneralizationEditPart.VISUAL_ID:
			return getGEFWrapper(new GeneralizationReorientCommand(req));
		case AssosiationEditPart.VISUAL_ID:
			return getGEFWrapper(new AssosiationReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
