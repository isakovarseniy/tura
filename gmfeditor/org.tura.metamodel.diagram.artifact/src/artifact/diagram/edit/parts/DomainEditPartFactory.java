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

			case ModelQueryEditPart.VISUAL_ID:
				return new ModelQueryEditPart(view);

			case ModelQueryNameEditPart.VISUAL_ID:
				return new ModelQueryNameEditPart(view);

			case SpecifierEditPart.VISUAL_ID:
				return new SpecifierEditPart(view);

			case SpecifierNameEditPart.VISUAL_ID:
				return new SpecifierNameEditPart(view);

			case ArtifactArtifactConfigVariablesCompartmentEditPart.VISUAL_ID:
				return new ArtifactArtifactConfigVariablesCompartmentEditPart(
						view);

			case ArtifactArtifactModelQueryCompartmentEditPart.VISUAL_ID:
				return new ArtifactArtifactModelQueryCompartmentEditPart(view);

			case ArtifactArtifactSpecifiersCompartmentEditPart.VISUAL_ID:
				return new ArtifactArtifactSpecifiersCompartmentEditPart(view);

			case TypeExtensionEditPart.VISUAL_ID:
				return new TypeExtensionEditPart(view);

			case RelationEditPart.VISUAL_ID:
				return new RelationEditPart(view);

			case InfrastructureConnectionEditPart.VISUAL_ID:
				return new InfrastructureConnectionEditPart(view);

			case DeploymentComponentDeplymentComponentEditPart.VISUAL_ID:
				return new DeploymentComponentDeplymentComponentEditPart(view);

			case DeploymentComponentDeplymentComponentExternalLabelEditPart.VISUAL_ID:
				return new DeploymentComponentDeplymentComponentExternalLabelEditPart(
						view);

			case DeploymentStarStepFirstStepEditPart.VISUAL_ID:
				return new DeploymentStarStepFirstStepEditPart(view);

			case DeploymentStarStepFirstStepExternalLabelEditPart.VISUAL_ID:
				return new DeploymentStarStepFirstStepExternalLabelEditPart(
						view);

			case RecipeInfrastructuresEditPart.VISUAL_ID:
				return new RecipeInfrastructuresEditPart(view);

			case RecipeInfrastructuresExternalLabelEditPart.VISUAL_ID:
				return new RecipeInfrastructuresExternalLabelEditPart(view);

			case RecipeDeloymentEditPart.VISUAL_ID:
				return new RecipeDeloymentEditPart(view);

			case RecipeDeloymentExternalLabelEditPart.VISUAL_ID:
				return new RecipeDeloymentExternalLabelEditPart(view);

			case InfrastructureRecipeConfigEditPart.VISUAL_ID:
				return new InfrastructureRecipeConfigEditPart(view);

			case InfrastructureRecipeConfigExternalLabelEditPart.VISUAL_ID:
				return new InfrastructureRecipeConfigExternalLabelEditPart(view);

			case ConfigurationConfigExtensionEditPart.VISUAL_ID:
				return new ConfigurationConfigExtensionEditPart(view);

			case ConfigurationConfigExtensionExternalLabelEditPart.VISUAL_ID:
				return new ConfigurationConfigExtensionExternalLabelEditPart(
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
