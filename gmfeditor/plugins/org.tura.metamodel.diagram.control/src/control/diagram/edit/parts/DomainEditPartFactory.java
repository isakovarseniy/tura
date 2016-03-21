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
package control.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import control.diagram.part.DomainVisualIDRegistry;

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

			case ControlsEditPart.VISUAL_ID:
				return new ControlsEditPart(view);

			case RootEditPart.VISUAL_ID:
				return new RootEditPart(view);

			case RootNameEditPart.VISUAL_ID:
				return new RootNameEditPart(view);

			case DataControlEditPart.VISUAL_ID:
				return new DataControlEditPart(view);

			case DataControlNameEditPart.VISUAL_ID:
				return new DataControlNameEditPart(view);

			case PREFormTriggerEditPart.VISUAL_ID:
				return new PREFormTriggerEditPart(view);

			case PREFormTriggerFakeMethodEditPart.VISUAL_ID:
				return new PREFormTriggerFakeMethodEditPart(view);

			case FormVariableEditPart.VISUAL_ID:
				return new FormVariableEditPart(view);

			case FormVariableNameEditPart.VISUAL_ID:
				return new FormVariableNameEditPart(view);

			case CreateTriggerEditPart.VISUAL_ID:
				return new CreateTriggerEditPart(view);

			case CreateTriggerFakeMethodEditPart.VISUAL_ID:
				return new CreateTriggerFakeMethodEditPart(view);

			case InsertTriggerEditPart.VISUAL_ID:
				return new InsertTriggerEditPart(view);

			case InsertTriggerFakeMethodEditPart.VISUAL_ID:
				return new InsertTriggerFakeMethodEditPart(view);

			case UpdateTriggerEditPart.VISUAL_ID:
				return new UpdateTriggerEditPart(view);

			case UpdateTriggerFakeMethodEditPart.VISUAL_ID:
				return new UpdateTriggerFakeMethodEditPart(view);

			case DeleteTriggerEditPart.VISUAL_ID:
				return new DeleteTriggerEditPart(view);

			case DeleteTriggerFakeMethodEditPart.VISUAL_ID:
				return new DeleteTriggerFakeMethodEditPart(view);

			case SearchTriggerEditPart.VISUAL_ID:
				return new SearchTriggerEditPart(view);

			case SearchTriggerFakeMethodEditPart.VISUAL_ID:
				return new SearchTriggerFakeMethodEditPart(view);

			case PREQueryTriggerEditPart.VISUAL_ID:
				return new PREQueryTriggerEditPart(view);

			case PREQueryTriggerFakeMethodEditPart.VISUAL_ID:
				return new PREQueryTriggerFakeMethodEditPart(view);

			case POSTQueryTriggerEditPart.VISUAL_ID:
				return new POSTQueryTriggerEditPart(view);

			case POSTQueryTriggerFakeMethodEditPart.VISUAL_ID:
				return new POSTQueryTriggerFakeMethodEditPart(view);

			case PREInsertTriggerEditPart.VISUAL_ID:
				return new PREInsertTriggerEditPart(view);

			case PREInsertTriggerFakeMethodEditPart.VISUAL_ID:
				return new PREInsertTriggerFakeMethodEditPart(view);

			case PREDeleteTriggerEditPart.VISUAL_ID:
				return new PREDeleteTriggerEditPart(view);

			case PREDeleteTriggerFakeMethodEditPart.VISUAL_ID:
				return new PREDeleteTriggerFakeMethodEditPart(view);

			case POSTCreateTriggerEditPart.VISUAL_ID:
				return new POSTCreateTriggerEditPart(view);

			case POSTCreateTriggerFakeMethodEditPart.VISUAL_ID:
				return new POSTCreateTriggerFakeMethodEditPart(view);

			case PREUpdateTriggerEditPart.VISUAL_ID:
				return new PREUpdateTriggerEditPart(view);

			case PREUpdateTriggerFakeMethodEditPart.VISUAL_ID:
				return new PREUpdateTriggerFakeMethodEditPart(view);

			case ArtificialFieldEditPart.VISUAL_ID:
				return new ArtificialFieldEditPart(view);

			case ArtificialFieldNameEditPart.VISUAL_ID:
				return new ArtificialFieldNameEditPart(view);

			case RootRootPreFormTriggerCompartmentEditPart.VISUAL_ID:
				return new RootRootPreFormTriggerCompartmentEditPart(view);

			case RootRootVariablesCompartmentEditPart.VISUAL_ID:
				return new RootRootVariablesCompartmentEditPart(view);

			case DataControlDataControlPreQueryTriggerCompartmentEditPart.VISUAL_ID:
				return new DataControlDataControlPreQueryTriggerCompartmentEditPart(
						view);

			case DataControlDataControlPostQueryTriggerCompartmentEditPart.VISUAL_ID:
				return new DataControlDataControlPostQueryTriggerCompartmentEditPart(
						view);

			case DataControlDataControlPreInsertTriggerCompartmentEditPart.VISUAL_ID:
				return new DataControlDataControlPreInsertTriggerCompartmentEditPart(
						view);

			case DataControlDataControlPreDeleteTriggerCompartmentEditPart.VISUAL_ID:
				return new DataControlDataControlPreDeleteTriggerCompartmentEditPart(
						view);

			case DataControlDataControlPostCreateTriggerCompartmentEditPart.VISUAL_ID:
				return new DataControlDataControlPostCreateTriggerCompartmentEditPart(
						view);

			case DataControlDataControlPreUpdateTriggerCompartmentEditPart.VISUAL_ID:
				return new DataControlDataControlPreUpdateTriggerCompartmentEditPart(
						view);

			case DataControlDataControlCreateCompartmentEditPart.VISUAL_ID:
				return new DataControlDataControlCreateCompartmentEditPart(view);

			case DataControlDataControlInsertCompartmentEditPart.VISUAL_ID:
				return new DataControlDataControlInsertCompartmentEditPart(view);

			case DataControlDataControlUpdateCompartmentEditPart.VISUAL_ID:
				return new DataControlDataControlUpdateCompartmentEditPart(view);

			case DataControlDataControlRemoveCompartmentEditPart.VISUAL_ID:
				return new DataControlDataControlRemoveCompartmentEditPart(view);

			case DataControlDataControlSearchCompartmentEditPart.VISUAL_ID:
				return new DataControlDataControlSearchCompartmentEditPart(view);

			case DataControlDataControlArtificialFieldsCompartmentEditPart.VISUAL_ID:
				return new DataControlDataControlArtificialFieldsCompartmentEditPart(
						view);

			case RelationEditPart.VISUAL_ID:
				return new RelationEditPart(view);

			case DependencyEditPart.VISUAL_ID:
				return new DependencyEditPart(view);

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
