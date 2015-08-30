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
package domain.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import domain.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DomainVisualIDRegistry.getVisualID(view)) {

			case DomainEditPart.VISUAL_ID:
				return new DomainEditPart(view);

			case DomainArtifactsEditPart.VISUAL_ID:
				return new DomainArtifactsEditPart(view);

			case DomainArtifactsNameEditPart.VISUAL_ID:
				return new DomainArtifactsNameEditPart(view);

			case DomainApplicationsEditPart.VISUAL_ID:
				return new DomainApplicationsEditPart(view);

			case DomainApplicationsNameEditPart.VISUAL_ID:
				return new DomainApplicationsNameEditPart(view);

			case DomainTypesEditPart.VISUAL_ID:
				return new DomainTypesEditPart(view);

			case DomainTypesNameEditPart.VISUAL_ID:
				return new DomainTypesNameEditPart(view);

			case ORMEntityEditPart.VISUAL_ID:
				return new ORMEntityEditPart(view);

			case ORMEntityNameEditPart.VISUAL_ID:
				return new ORMEntityNameEditPart(view);

			case JPAServiceEditPart.VISUAL_ID:
				return new JPAServiceEditPart(view);

			case JPAServiceNameEditPart.VISUAL_ID:
				return new JPAServiceNameEditPart(view);

			case EJBServiceEditPart.VISUAL_ID:
				return new EJBServiceEditPart(view);

			case EJBServiceNameEditPart.VISUAL_ID:
				return new EJBServiceNameEditPart(view);

			case ContinuousIintegrationEditPart.VISUAL_ID:
				return new ContinuousIintegrationEditPart(view);

			case ContinuousIintegrationNameEditPart.VISUAL_ID:
				return new ContinuousIintegrationNameEditPart(view);

			case DomainArtifactEditPart.VISUAL_ID:
				return new DomainArtifactEditPart(view);

			case DomainArtifactNameEditPart.VISUAL_ID:
				return new DomainArtifactNameEditPart(view);

			case DomainApplicationEditPart.VISUAL_ID:
				return new DomainApplicationEditPart(view);

			case DomainApplicationNameEditPart.VISUAL_ID:
				return new DomainApplicationNameEditPart(view);

			case DomainArtifactsDomainArtifactsDomainArtifactCompartmentEditPart.VISUAL_ID:
				return new DomainArtifactsDomainArtifactsDomainArtifactCompartmentEditPart(
						view);

			case DomainApplicationsDomainApplicationsApplicationsCompartmentEditPart.VISUAL_ID:
				return new DomainApplicationsDomainApplicationsApplicationsCompartmentEditPart(
						view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
