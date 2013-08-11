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

			case DomainTypesEditPart.VISUAL_ID:
				return new DomainTypesEditPart(view);

			case DomainTypesNameEditPart.VISUAL_ID:
				return new DomainTypesNameEditPart(view);

			case DomainApplicationsEditPart.VISUAL_ID:
				return new DomainApplicationsEditPart(view);

			case DomainApplicationsNameEditPart.VISUAL_ID:
				return new DomainApplicationsNameEditPart(view);

			case DomainApplicationEditPart.VISUAL_ID:
				return new DomainApplicationEditPart(view);

			case DomainApplicationNameEditPart.VISUAL_ID:
				return new DomainApplicationNameEditPart(view);

			case DomainApplicationsDomainApplicationsApplicationsCompartmentEditPart.VISUAL_ID:
				return new DomainApplicationsDomainApplicationsApplicationsCompartmentEditPart(
						view);

			case TypeExtensionEditPart.VISUAL_ID:
				return new TypeExtensionEditPart(view);

			case RecipeRecipeConfigEditPart.VISUAL_ID:
				return new RecipeRecipeConfigEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case ConfigurationConfigExtensionEditPart.VISUAL_ID:
				return new ConfigurationConfigExtensionEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

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
