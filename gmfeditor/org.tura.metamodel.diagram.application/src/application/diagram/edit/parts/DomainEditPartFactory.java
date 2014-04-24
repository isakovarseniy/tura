/*
 * 
 */
package application.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import application.diagram.part.DomainVisualIDRegistry;

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

			case ApplicationEditPart.VISUAL_ID:
				return new ApplicationEditPart(view);

			case ApplicationRecipesEditPart.VISUAL_ID:
				return new ApplicationRecipesEditPart(view);

			case ApplicationRecipesNameEditPart.VISUAL_ID:
				return new ApplicationRecipesNameEditPart(view);

			case ApplicationMappersEditPart.VISUAL_ID:
				return new ApplicationMappersEditPart(view);

			case ApplicationMappersNameEditPart.VISUAL_ID:
				return new ApplicationMappersNameEditPart(view);

			case ApplicationUILayerEditPart.VISUAL_ID:
				return new ApplicationUILayerEditPart(view);

			case ApplicationUILayerNameEditPart.VISUAL_ID:
				return new ApplicationUILayerNameEditPart(view);

			case ApplicationInfrastructureLayerEditPart.VISUAL_ID:
				return new ApplicationInfrastructureLayerEditPart(view);

			case ApplicationInfrastructureLayerNameEditPart.VISUAL_ID:
				return new ApplicationInfrastructureLayerNameEditPart(view);

			case ApplicationStyleEditPart.VISUAL_ID:
				return new ApplicationStyleEditPart(view);

			case ApplicationStyleNameEditPart.VISUAL_ID:
				return new ApplicationStyleNameEditPart(view);

			case ApplicationRoleEditPart.VISUAL_ID:
				return new ApplicationRoleEditPart(view);

			case ApplicationRoleNameEditPart.VISUAL_ID:
				return new ApplicationRoleNameEditPart(view);

			case ApplicationRecipeEditPart.VISUAL_ID:
				return new ApplicationRecipeEditPart(view);

			case ApplicationRecipeNameEditPart.VISUAL_ID:
				return new ApplicationRecipeNameEditPart(view);

			case ApplicationMapperEditPart.VISUAL_ID:
				return new ApplicationMapperEditPart(view);

			case ApplicationMapperNameEditPart.VISUAL_ID:
				return new ApplicationMapperNameEditPart(view);

			case ApplicationUIPackageEditPart.VISUAL_ID:
				return new ApplicationUIPackageEditPart(view);

			case ApplicationUIPackageNameEditPart.VISUAL_ID:
				return new ApplicationUIPackageNameEditPart(view);

			case StylesPackageEditPart.VISUAL_ID:
				return new StylesPackageEditPart(view);

			case StylesPackageNameEditPart.VISUAL_ID:
				return new StylesPackageNameEditPart(view);

			case ApplicationRecipesApplicationRecipesRecipesCompartmentEditPart.VISUAL_ID:
				return new ApplicationRecipesApplicationRecipesRecipesCompartmentEditPart(
						view);

			case ApplicationMappersApplicationMappersMappersCompartmentEditPart.VISUAL_ID:
				return new ApplicationMappersApplicationMappersMappersCompartmentEditPart(
						view);

			case ApplicationUILayerApplicationUILayerApplicationUIPackagesCompartmentEditPart.VISUAL_ID:
				return new ApplicationUILayerApplicationUILayerApplicationUIPackagesCompartmentEditPart(
						view);

			case ApplicationStyleApplicationStyleStylesPackageCompartmentEditPart.VISUAL_ID:
				return new ApplicationStyleApplicationStyleStylesPackageCompartmentEditPart(
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
