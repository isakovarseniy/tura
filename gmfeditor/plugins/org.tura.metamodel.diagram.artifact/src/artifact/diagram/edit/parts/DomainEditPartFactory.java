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
package artifact.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import artifact.diagram.part.DomainVisualIDRegistry;

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

			case ArtifactsEditPart.VISUAL_ID:
				return new ArtifactsEditPart(view);

			case ArtifactEditPart.VISUAL_ID:
				return new ArtifactEditPart(view);

			case ArtifactNameEditPart.VISUAL_ID:
				return new ArtifactNameEditPart(view);

			case ConfigVariableEditPart.VISUAL_ID:
				return new ConfigVariableEditPart(view);

			case ConfigVariableNameEditPart.VISUAL_ID:
				return new ConfigVariableNameEditPart(view);

			case ConfigHashEditPart.VISUAL_ID:
				return new ConfigHashEditPart(view);

			case ConfigHashNameEditPart.VISUAL_ID:
				return new ConfigHashNameEditPart(view);

			case ModelQueryEditPart.VISUAL_ID:
				return new ModelQueryEditPart(view);

			case ModelQueryNameEditPart.VISUAL_ID:
				return new ModelQueryNameEditPart(view);

			case SpecifierEditPart.VISUAL_ID:
				return new SpecifierEditPart(view);

			case SpecifierNameEditPart.VISUAL_ID:
				return new SpecifierNameEditPart(view);

			case GenerationHintEditPart.VISUAL_ID:
				return new GenerationHintEditPart(view);

			case GenerationHintNameEditPart.VISUAL_ID:
				return new GenerationHintNameEditPart(view);

			case ArtifactArtifactConfigVariablesCompartmentEditPart.VISUAL_ID:
				return new ArtifactArtifactConfigVariablesCompartmentEditPart(
						view);

			case ArtifactArtifactConfigHashesCompartmentEditPart.VISUAL_ID:
				return new ArtifactArtifactConfigHashesCompartmentEditPart(view);

			case ArtifactArtifactModelQueryCompartmentEditPart.VISUAL_ID:
				return new ArtifactArtifactModelQueryCompartmentEditPart(view);

			case ArtifactArtifactSpecifiersCompartmentEditPart.VISUAL_ID:
				return new ArtifactArtifactSpecifiersCompartmentEditPart(view);

			case ArtifactArtifactHintsCompartmentEditPart.VISUAL_ID:
				return new ArtifactArtifactHintsCompartmentEditPart(view);
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
